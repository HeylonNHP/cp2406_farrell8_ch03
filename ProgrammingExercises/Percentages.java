public class Percentages {
    public static void main(String[] args){
        double one = 10;
        double two = 69;
        computePercent(one,two);
    }

    private static void computePercent(double number1, double number2){
        double percentage = number1 / number2;
        String output = String.format("%s is %s%% of %s", number1, Math.round(percentage*100), number2);
        System.out.println(output);
    }
}
