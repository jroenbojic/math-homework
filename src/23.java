import java.util.Random;

public class MathHomeworkSolver {
    private static final int MAX_POWER = 10;
    private static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(MAX_POWER);

        // Example: Find the square root of a given number
        if (number == 0 || number == MAX_POWER) {
            System.out.println("The square root of " + (double) number + " is not defined.");
            return;
        }

        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + (double) number + " is: " + squareRoot);

        // Example: Find the factorial of a given number
        if (number == 0 || number == MAX_POWER) {
            System.out.println("The factorial of 0 or " + (double) MAX_POWER + " is not defined.");
            return;
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + (double) number + " is: " + factorial);
    }
}
