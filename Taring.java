import java.util.Random;

public class Taring {


    public static int veereta(int taringuteArv) {
        Random suvaline = new Random();
        int sum = 0;

        for (int i = 1; i <= taringuteArv; i++) {
            int veeretus = suvaline.nextInt(6) + 1;
            System.out.println("Täring " + i + ": " + veeretus);
            sum += veeretus;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return sum;
    }
}