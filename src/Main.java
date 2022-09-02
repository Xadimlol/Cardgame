import java.util.Collections;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException  {
    CardBase card = new CardBase(CardValues.three, CardColours.club);
    CardBase card2 = new CardBase(CardValues.three, CardColours.diamond);
    Deck deck = new Deck(52,"wayne");
    DiscardPile playpile = new DiscardPile();
    Player kevin = new Player(10, deck);
    Player sven = new Player(10, deck);
    Player bennet = new Player(10, deck);
    Player[] playerList = new Player[3];
    playerList[0] = kevin;
    playerList[1] = bennet;
    playerList[2] = sven;
    Game game = new Game(playerList,3,deck,playpile);







    }
}
