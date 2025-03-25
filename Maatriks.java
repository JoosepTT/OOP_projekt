import java.util.Random;
import java.util.Scanner;

public abstract class Maatriks {
    protected int size;
    protected int[][] andmeMaatriks;
    protected char[][] ekraaniMaatriks;
    protected int sundmusteProtsent;
    protected int asukohtX, asukohtY;
    protected int skoor = 0;
    protected int elud = 3;

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

    // mängutsükkel
    public void manguTsukkel(Scanner scanner) {
        while (elud > 0) {
            System.out.println("Hetkeskoor: " + skoor + "  Elud: " + "| ".repeat(elud));
            kuvaMaatriks();

            int eventNum = new Random().nextInt(3) + 1;
            executeEvent(eventNum);

            int sihtmark = new Random().nextInt(16) + 3;
            System.out.println("Sinu sihtmärk: " + sihtmark);

            System.out.println("Veereta täringuid (vajuta suvalist klahvi ja Enter)...");
            scanner.next();

            int summa = Taring.veereta(3);
            System.out.println("Kogusumma: " + summa);

            System.out.println("Kuhu soovid liikuda? (w - üles, s - alla, a - vasakule, d - paremale)");
            char liigu = scanner.next().charAt(0);
            liiguta(liigu);
        }
        System.out.println("Mäng läbi! Sinu lõppskoor: " + skoor);
    }

    public void liiguta(int sihtkoht) {

    }

    public abstract void executeEvent(int eventNum);

}