import java.util.Arrays;

public class Maatriks2 {

    public static String[][] genereeriMaatriks(int n, int m) {
        /**
         * Loob maatriksi antud parameetrite suuruses, kus kõik elemendid on sümbol 'O'.
         * @param n maatriksi kõrgus.
         * @param m maatriksi laius.
         */
        String[][] massiiv = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                massiiv[i][j] = "O";
            }
        }
        return massiiv;
    }

    public static void prindiMaatriks(String[][] maatriks) {
        for (String[] rida : maatriks) {
            System.out.println(Arrays.toString(rida));
        }
    }

}
