import java.util.Random;

public class Mäng2 {
    private static int mängijaX, mängijaY;
    private static final String käidud = "X";
    private static final String mängija = "P";

    public static void lisaMängija(String[][] kaart) {
        /**
         * Lisab mängija kaardile suvalisele positsioonile.
         * @param kaart antud kaart.
         */
        Random random = new Random();
        mängijaX = random.nextInt(kaart.length);
        mängijaY = random.nextInt(kaart[0].length);
        kaart[mängijaX][mängijaY] = mängija;
    }

    public static void liigutaMängijat(String[][] kaart, String suund) {
        /**
         * Kontrollib kas liikumine on sobiv (ei liigu üle kaardi piiride), ja kui kasutaja sisestus
         * on õige (w,s,a,d) siis liigutab mängijat ühe võrra soovitud suunas.
         * @param kaart antud kaart.
         * @param suund kasutaja sisestus (w,s,a,d)
         */
        int uusX = mängijaX, uusY = mängijaY;

        switch (suund) {
            case "w":
                uusX--;
                break;
            case "s":
                uusX++;
                break;
            case "a":
                uusY--;
                break;
            case "d":
                uusY++;
                break;
            default:
                System.out.println("Vale liikumine, sisesta: W/A/S/D.");
                return;
        }

        if (onSobivLiikumine(kaart, uusX, uusY)) {
            kaart[mängijaX][mängijaY] = käidud;
            mängijaX = uusX;
            mängijaY = uusY;
            kaart[mängijaX][mängijaY] = mängija;
        } else {
            System.out.println("Sinna ei saa liikuda!");
        }
    }

    public static boolean onSobivLiikumine(String[][] kaart, int x, int y) {
        /**
         * Kontrollib kas liikumine on sobiv (ei liigu üle kaardi piiride).
         * @param kaart antud kaart.
         * @param x suund vasakult-paremale
         * @param y suund ülevalt-alla
         * @return tagastab true, kui liikumine õige ja false, kui liikumine on vale.
         */
        return x >= 0 && x < kaart.length && y >= 0 && y < kaart[0].length;
    }
}