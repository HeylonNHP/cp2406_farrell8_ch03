import java.util.Scanner;

public class Insurance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's the current year? ");
        int currentYear = Integer.parseInt(input.nextLine());
        System.out.print("What's your birth year? ");
        int birthYear = Integer.parseInt(input.nextLine());

        String output = String.format("Your insurance premium is: %s", calculatePremium(currentYear,birthYear));
        System.out.println(output);
    }

    private static int calculatePremium(int currentYear, int birthYear){
        int userAge = currentYear - birthYear;
        int userAgeDecade = userAge / 10;
        int premium = (userAgeDecade + 15) * 20;
        return premium;
    }
}
