import javax.sql.rowset.serial.SQLInputImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
private Player[] playerList;
private int playerCount;
private int whoseTurn;
private Deck currentDeck;
private DiscardPile playingField;
private boolean gameRunning;



public Game(Player[] players, int playerNumber, Deck deck, DiscardPile playPile)throws IOException{
    playerCount = playerNumber;
    playerList = players;
    setStartTurn();
    currentDeck = deck;
    deck.shuffleDeck();
    playingField = playPile;
    playingField.startingCard(deck);
    gameRunning = true;
    gameMethod();
}

private void setStartTurn(){
    whoseTurn = 0;
}

private void nextTurn(){
if(whoseTurn == playerCount-1){
    setStartTurn();
}else{
    whoseTurn +=1;
}
}

private void checkIfWon(){
    if(playerList[whoseTurn].getCurrentHandSize() == 0){
        System.out.println("Player" + (whoseTurn+1) + " won! Pog");
        gameRunning = false;
    }
}

private void choseCard () throws IOException{
    System.out.println("Player"+ (whoseTurn+1) + " chose which Card to play");
    playerList[whoseTurn].showHand();
    String input = reader.readLine();
    playerList[whoseTurn].playCard(playerList[whoseTurn].currentHand[Integer.valueOf(input)-1], playingField);

}



private void takeAction()throws IOException {
    playingField.showPile();
    System.out.println("Player" + (whoseTurn+1) + " what do you want to do?");
    System.out.println("1) Play a Card  2)Draw a Card");

    String input = reader.readLine();
    switch(input){
        case "1":
            choseCard();
            break;
        case "2":
            playerList[whoseTurn].drawCard(currentDeck);
            break;
        default:
            System.out.println("This is not a valid choice, please chose again");
            takeAction();
}
    checkIfWon();
    nextTurn();

}


private void gameMethod()throws IOException{
    while(gameRunning){
        takeAction();
    }
}


}
