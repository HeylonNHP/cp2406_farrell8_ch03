/**
 * Created by Heylon2 on 9/08/2016.
 */
public class NumbersDemo {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 5318008;

        displayTwiceTheNumber(number1);
        displayNumberPlusFive(number1);
        displayNumberSquared(number1);

        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number2);
        displayNumberSquared(number2);
    }
    public static void displayTwiceTheNumber(int input){
        System.out.println(input + " multiplied by 2 is " + input*2);
    }
    public static void displayNumberPlusFive(int input){
        System.out.println(input + " plus five is " + (input+5));
    }
    public static void displayNumberSquared(int input){
        System.out.println(input + " squared is " + (long) Math.pow(input,2));
    }
}
