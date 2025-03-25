import java.util.Random;
import java.util.Scanner;

public abstract class Maatriks {
    protected int size;
    protected int[][] andmeMaatriks;
    protected char[][] ekraaniMaatriks;
    protected int sundmusteProtsent;
    protected static int asukohtX;
    protected static int asukohtY;
    protected int skoor = 0;
    protected int elud = 3;
    private static final char mängija = 'M';
    private static final char käidud = 'X';

    public Maatriks(int size, int sundmusteProtsent) {
        this.size = size;
        this.sundmusteProtsent = sundmusteProtsent;
        this.andmeMaatriks = new int[size][size];
        this.ekraaniMaatriks = new char[size][size];
        looMaatriks();
    }

    // maatriksi loomine (avaliku ja salajase)
    public void looMaatriks() {
        Random suvaline = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                andmeMaatriks[i][j] = (suvaline.nextInt(100) < sundmusteProtsent) ? 1 : 0;
                ekraaniMaatriks[i][j] = 'O';
            }
        }

        asukohtX = suvaline.nextInt(size);
        asukohtY = suvaline.nextInt(size);
        ekraaniMaatriks[asukohtX][asukohtY] = 'M';

    }

    // kasutajale maatiksi kuvamine
    public void kuvaMaatriks() {
        for (char[] rida : ekraaniMaatriks) {
            for (char element : rida) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public void kuvaMaatriks2() {
        for (int[] rida : andmeMaatriks) {
            for (int element : rida) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // mängutsükkel
    public void manguTsukkel(Scanner scanner) {
        while (elud > 0) {
            System.out.println("Hetkeskoor: " + skoor + "  Elud: " + "| ".repeat(elud));
            kuvaMaatriks();
            System.out.println();
            kuvaMaatriks2();

            if (andmeMaatriks[asukohtX][asukohtY] == 1 && ekraaniMaatriks[asukohtX][asukohtY] == 'M') {
                andmeMaatriks[asukohtX][asukohtY] = 0;
                int eventNum = new Random().nextInt(4) + 1;
                executeEvent(eventNum);
            }

            System.out.println("Kuhu soovid liikuda? (w - üles, s - alla, a - vasakule, d - paremale)");
            char liigu = scanner.next().charAt(0);
            if (liigu == 'q') {
                System.out.println("Mäng läbi!");
                break;
            }
            liiguta(ekraaniMaatriks, liigu);
        }
        System.out.println("Mäng läbi! Sinu lõppskoor: " + skoor);
    }

    public static void liiguta(char[][] kaart, char suund) {
        /**
         * Kontrollib kas liikumine on sobiv (ei liigu üle kaardi piiride), ja kui kasutaja sisestus
         * on õige (w,s,a,d) siis liigutab mängijat ühe võrra soovitud suunas.
         * @param kaart antud kaart.
         * @param suund kasutaja sisestus (w,s,a,d)
         */
        int uusX = asukohtX, uusY = asukohtY;

        switch (suund) {
            case 'w':
                uusX--;
                break;
            case 's':
                uusX++;
                break;
            case 'a':
                uusY--;
                break;
            case 'd':
                uusY++;
                break;
            default:
                System.out.println("Vale liikumine, sisesta: W/A/S/D.");
                return;
        }

        if (onSobivLiikumine(kaart, uusX, uusY)) {
            kaart[asukohtX][asukohtY] = käidud;
            asukohtX = uusX;
            asukohtY = uusY;
            kaart[asukohtX][asukohtY] = mängija;
        } else {
            System.out.println("Sinna ei saa liikuda!");
        }
    }

    public static boolean onSobivLiikumine(char[][] kaart, int x, int y) {
        /**
         * Kontrollib kas liikumine on sobiv (ei liigu üle kaardi piiride).
         * @param kaart antud kaart.
         * @param x suund vasakult-paremale
         * @param y suund ülevalt-alla
         * @return tagastab true, kui liikumine õige ja false, kui liikumine on vale.
         */
        return x >= 0 && x < kaart.length && y >= 0 && y < kaart[0].length;
    }

    public abstract void executeEvent(int eventNum);

}