import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1 ");
        double one = Double.parseDouble(input.nextLine());
        System.out.print("Input number 2 ");
        double two = Double.parseDouble(input.nextLine());
        computePercent(one,two);
    }

    private static void computePercent(double number1, double number2){
        double percentage = number1 / number2;
        String output = String.format("%s is %s%% of %s", number1, Math.round(percentage*100), number2);
        System.out.println(output);
    }
}
