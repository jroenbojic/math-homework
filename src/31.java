public class MathHomework {
    public static void main(String[] args) {
        // Randomly generate two integers between 1 and 10
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        System.out.println("You have chosen the numbers " + num1 + " and " + num2);
        
        // Add the two numbers together
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            System.out.println("The sum is an even number.");
        } else {
            System.out.println("The sum is an odd number.");
        }
    }
}
