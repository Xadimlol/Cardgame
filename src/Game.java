public class Game {
    private int handSize;
    private int whoseTurn;
    private CardBase currentCard;
    private GameRules rule;

    public Game(){
    handSize = 6;
    whoseTurn = 1;
    currentCard = new CardBase(CardValues.two,CardColours.club);
    rule = new GameRules();
    }

    public void cardPlayed(CardBase playedCard){
        if(rule.doesMatch(playedCard,currentCard)){
            currentCard = playedCard;
        }else{
            System.out.println("you cant play this card");
        }
    }
}
