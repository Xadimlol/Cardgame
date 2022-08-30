public class CardBase {
    private int colour;
    private int value;

    public CardBase(){
        colour = 0;
        value = 0;
    }


    public void setColour(int x){
        colour = x;
    }
    public int getColour(){
        return colour;
    }
    public void setValue(int x){
        value = x;
    }

    public int getValue(){
        return value;
    }
}
