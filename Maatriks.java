
import java.util.Random;
import java.util.Scanner;

public abstract class Maatriks {
    protected int size;
    protected int[][] andmeMaatriks;
    protected char[][] ekraaniMaatriks;
    protected int sundmusteProtsent;
    protected static int asukohtX;
    protected static int asukohtY;
    protected static int skoor = 0;
    protected static int elud = 3;
    protected int eludMax = 3;
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

    // mängutsükkel
    public void manguTsukkel(Scanner scanner, String mangijaNimi) throws InterruptedException {
        while (elud > 0) {
            System.out.println("══════════════════════════════════════════════════════════════════════════════════");
            Thread.sleep(500);
            System.out.println("Hetkeskoor: " + skoor + "  Elud: " + "♥ ".repeat(elud) + "♡".repeat(eludMax - elud) + "\n");
            System.out.println("Avastamata sündmuste arv: " + sündmusteArv());
            Thread.sleep(500);
            kuvaMaatriks();
            System.out.println();

            if (kasMängOnLäbi()) {
                System.out.println("Kõik kohad on avastatud! Mäng läbi!");
                break;
            }

            System.out.println("Kuhu soovid liikuda? (w - üles, s - alla, a - vasakule, d - paremale) või vajuta q - mängu lõpetamiseks");
            char liigu = scanner.next().charAt(0);
            if (liigu == 'q') {
                System.out.println("\nMäng läbi! Sinu lõppskoor: " + skoor);
                Main.uuendaSkoori(mangijaNimi, skoor);
                break;
            }
            liiguta(ekraaniMaatriks, liigu);
            System.out.println("══════════════════════════════════════════════════════════════════════════════════");

            // sündmus käivitatakse, kui mängija asukohal on märgitud peidetud maatriskis "1" ehk sündmus
            if (andmeMaatriks[asukohtX][asukohtY] == 1 && ekraaniMaatriks[asukohtX][asukohtY] == 'M') {
                andmeMaatriks[asukohtX][asukohtY] = 2;
                int eventNum = new Random().nextInt(14) + 1;
                executeEvent(eventNum);
            } else if (andmeMaatriks[asukohtX][asukohtY] == 0 && ekraaniMaatriks[asukohtX][asukohtY] == 'M') {
                andmeMaatriks[asukohtX][asukohtY] = 2;
                Sundmused.juhusundmus();
            }
            System.out.println();

        }
        System.out.println("\nMäng läbi! Sinu lõppskoor: " + skoor);
        Main.uuendaSkoori(mangijaNimi, skoor);
        elud = 3;
    }

    private boolean kasMängOnLäbi() {
        // kontrollib mängulaual olevate mittekäidud kohtade arvu
        int mitteX = 0;
        for (char[] rida : ekraaniMaatriks) {
            for (char element : rida) {
                if (element != 'X') {
                    mitteX++;
                }
            }
        }
        return mitteX == 1;
    }

    private int sündmusteArv(){
        int arv = 0;
        for(int[] rida : andmeMaatriks) {
            for(int element : rida) {
                if (element == 1) {
                    arv++;
                }
            }
        }
        return arv;
    }

    public static void liiguta(char[][] kaart, char suund) {
        //Liigutab mängijat sisestatud suunas
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
        // kontrollib, kas liikumine jääb kaardi mõõtmete sisse
        return x >= 0 && x < kaart.length && y >= 0 && y < kaart[0].length;
    }

    // meetod sobiva sündmuse käivitamiseks
    public abstract void executeEvent(int eventNum) throws InterruptedException;

}
