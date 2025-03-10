import java.util.Random;
public class RandomMathHomework{
public static void main(String[] args){
int number = new Random().nextInt(100); //Generate a random number between 0 and 99
System.out.println("The math homework for the week is:");
System.out.println("What is " + number + " times 2?");
}
}