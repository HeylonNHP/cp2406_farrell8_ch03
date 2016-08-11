/**
 * Created by Heylon2 on 10/08/2016.
 */
import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.printf("What's your name? ");
        String name = inputDevice.nextLine();
        System.out.printf("What's your GPA? ");
        float gradePointAverage = inputDevice.nextFloat();
        displayBookstoreCredit(name, gradePointAverage);
    }
    public static void displayBookstoreCredit(String name,float gradePointAverage){
        int bookstoreCredit = (int)(gradePointAverage * 10);
        System.out.println("Congratulations " + name + ", you have been awarded $" + bookstoreCredit +
                " for achieving a GPA of " + gradePointAverage);

    }
}
