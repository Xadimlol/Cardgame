import javax.swing.*;
import java.util.concurrent.ArrayBlockingQueue;

public enum CardValues {
    two,
    three,
    four,
    five,
    six,
    seven,
    eight,
    nine,
    ten,
    jack,
    queen,
    king,
    ace;


    public static CardValues valueFromInteger(int x){
        switch(x){
            case 0:
                return two;

            case 1:
                return three;

            case 2:
                return four;

            case 3:
                return five;

            case 4:
                return six;

            case 5:
                return seven;

            case 6:
                return eight;

            case 7:
                return nine;

            case 8:
                return ten;

            case 9:
                return jack;

            case 10:
                return queen;

            case 11:
                return king;

            case 12:
                return ace;
        }
        return null;
    }
}
