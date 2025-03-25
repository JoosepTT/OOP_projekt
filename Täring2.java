import java.util.Random;

public class Täring2 {
    public static int veeretaTäringut() {
        Random täring = new Random();
        return täring.nextInt(24) + 1;
    }
}
