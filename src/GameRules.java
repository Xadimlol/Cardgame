public class GameRules {

    public static boolean doesMatch(CardBase card1, CardBase card2){
        if(card1.getColour() == card2.getColour() || card1.getValue() == card2.getValue()){
            return true;
        }else{
            return false;
        }
    }
}
