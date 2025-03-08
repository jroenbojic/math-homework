import java.util.Random;

public class MathHomework {
  public static void main(String[] args) {
    // Generate a random number between 1 and 10
    Random rand = new Random();
    int num = rand.nextInt(10) + 1;

    // Print the random number to the console
    System.out.println("Random number: " + num);
  }
}
