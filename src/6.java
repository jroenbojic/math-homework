
import java.util.Random;
class RandomMath {
public static void main(String[] args) {
Random rand = new Random();
// Generate a random number between 1 and 10
int num1 = rand.nextInt(10) + 1;
// Generate a random operator (+, -, *, /)
char op = "+-*/".charAt(rand.nextInt("+-*/".length()));
// Generate a second random number between 1 and 10
int num2 = rand.nextInt(10) + 1;
System.out.println(num1 + " " + op + " " + num2);
}
}