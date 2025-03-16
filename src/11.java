import java.util.Random;
public class RandomNumber {
    public static int generateRandom(int max) {
        Random r = new Random();
        return r.nextInt(max);
    }
}