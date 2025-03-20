import java.util.*;
public class MathHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int num1 = (int)(Math.random()*10)+1;
        int num2 = (int)(Math.random()*10)+1;
        System.out.println(name + ", please solve the following math problem:");
        System.out.print("What is " + num1 + " x " + num2 + "? ");
        int answer = sc.nextInt();
        if (answer == num1*num2) {
            System.out.println(name + ", that's correct!");
        } else {
            System.out.println(name + ", that's incorrect, the correct answer is " + num1*num2);
        }
    }
}