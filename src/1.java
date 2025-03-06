import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        int[] homework = new int[10];
        for (int i = 0; i < homework.length; i++) {
            homework[i] = generateMathProblem();
        }
        System.out.println(Arrays.toString(homework));
    }

    private static int generateMathProblem() {
        Random rand = new Random();
        return rand.nextInt(10) + 1; // Generate a random number between 1 and 10
    }
}
