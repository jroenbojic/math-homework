public class MathHomework {
    // Example Java code to solve a mathematical problem

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i * product;
                product *= i;
            }
        }

        System.out.println("The sum of even numbers from 1 to 10 is: " + sum);
    }
}
