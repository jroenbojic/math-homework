import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation: (+, -, *, /)");
        String operation = scanner.next();

        double result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("You can't divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);
    }
}
