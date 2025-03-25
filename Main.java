import java.util.*;
import java.io.*;

public class Main {
    private static final String failinimi = "Skoorid.txt";
    private static Map<String, Integer> skoorid = new HashMap<>();

    public static void main(String[] args) {
        laadiSkoorid(); // faili sisselugemine
        Scanner scanner = new Scanner(System.in); // skänneri ülesseadmine
        algus(); // mängu pealkirja kuvamine

        // valikumenüü kuvamine
        while (true) {
            System.out.println("Vali tegevus: 1 - Alusta mängu, 2 - Vaata skooritabelit, 3 - Välju");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    alustaMangu(scanner);
                    break;
                case 2:
                    kuvaSkoorid();
                    break;
                case 3:
                    System.out.println("Mäng lõpetatud.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Vale valik, proovi uuesti.");
            }
        }
    }

    // Prindib suurelt mängu pealkirja (pole kujundatud)
    public static void algus() {
        System.out.println("<Ardejaht>");
        System.out.println();
    }

    // rakustaseme valimine
    private static void alustaMangu(Scanner scanner) {
        System.out.println("Sisesta oma nimi:");
        String mangijaNimi = scanner.nextLine().trim();

        int korgeimSkoor = skoorid.getOrDefault(mangijaNimi, 0);
        System.out.println("Sinu senine kõrgeim skoor: " + korgeimSkoor);

        int valik;
        double[] kordajad = {1.0, 1.5, 2.0};

        // raskustaseme valimine
        do {
            System.out.println("Vali raskustase: 1 - Kerge, 2 - Keskmine, 3 - Raske");
            while (!scanner.hasNextInt()) {
                System.out.println("Palun sisesta vastva number!");
                scanner.next();
            }
            valik = scanner.nextInt();
        } while (valik < 1 || valik > 3);

        Maatriks mang;

        switch (valik) {
            case 1:
                mang = new Raskustase_1(kordajad[0]);
                break;
            case 2:
                mang = new Raskustase_2(kordajad[1]);
                break;
            case 3:
                mang = new Raskustase_3(kordajad[2]);
                break;
            default:
                mang = new Raskustase_1(kordajad[0]); // vaikeväärtus
        }

        mang.kuvaMaatriks();

        mang.manguTsukkel(scanner);

        /*
        // skoori kohahoidja
        int skoor = new Random().nextInt(100);
        System.out.println("Sinu skoor: " + skoor);
        uuendaSkoori(mangijaNimi, skoor);
        salvestaSkoor();
        */
    }

    // skooritabeli kuvamine
    private static void kuvaSkoorid() {
        System.out.println("Skooritabel:");
        for (Map.Entry<String, Integer> sissekanne : skoorid.entrySet()) {
            System.out.println(sissekanne.getKey() + " - " + sissekanne.getValue());
        }
    }

    // skooride sisselaadimine
    private static void laadiSkoorid() {
        try (BufferedReader br = new BufferedReader(new FileReader(failinimi))) {
            String rida;

            while ((rida = br.readLine()) != null) {
                String[] parts = rida.split(" ; ");
                if (parts.length == 2) {
                    skoorid.put(parts[0], Integer.parseInt(parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Skoorifaili ei leitud.");
        }
    }

    // skoori faili kirjutamine
    private static void salvestaSkoor() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(failinimi))) {
            for (Map.Entry<String, Integer> sisend : skoorid.entrySet()) {
                bw.write(sisend.getKey() + " ; " + sisend.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Tekkis viga skoorifaili salvestamisel.");
        }
    }

    // skoori värskendamine
    private static void uuendaSkoori(String mangijaNimi, int uusSkoor) {
        skoorid.put(mangijaNimi, Math.max(skoorid.getOrDefault(mangijaNimi, 0), uusSkoor));
    }

}