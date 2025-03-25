import java.util.Scanner;

public class Main2 {
    private static final int kõrgus = 7, laius = 7;

    public static void main(String[] args) {
        String[][] kaart = Maatriks2.genereeriMaatriks(kõrgus, laius);
        Mäng2.lisaMängija(kaart);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Maatriks2.prindiMaatriks(kaart);
            System.out.print("Liigu (WASD): ");
            String sisestus = scanner.nextLine().toLowerCase();

            if (sisestus.equals("q")) {
                System.out.println("Mäng läbi!");
                break;
            }

            Mäng2.liigutaMängijat(kaart, sisestus);
        }
        scanner.close();
    }
}
