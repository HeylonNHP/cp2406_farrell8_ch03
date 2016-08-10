/**
 * Created by Heylon2 on 10/08/2016.
 */
import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.printf("Input number 1 ");
        int number1 = inputDevice.nextInt();
        System.out.printf("Input number 2 ");
        int number2 = inputDevice.nextInt();

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
