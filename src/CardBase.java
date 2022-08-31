public class CardBase {
    private CardColours colour;
    private CardValues value;

    public CardBase(CardValues givenValue, CardColours givenColour){
        colour = givenColour;
        value = givenValue;
    }


    public void setColour(CardColours x){
        colour = x;
    }
    public CardColours getColour(){
        return colour;
    }
    public void setValue(CardValues x){
        value = x;
    }

    public CardValues getValue(){
        return value;
    }

    public void showCard(){
        System.out.println(value + "+" + colour);
    }
}
