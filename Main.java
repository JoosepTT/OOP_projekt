import java.util.*;
import java.io.*;

public class Main {
    private static final String failinimi = "src/Skoorid.txt";
    private static Map<String, Integer> skoorid = new LinkedHashMap<>(); // linkedhashmap on sõnastik, mis sisaldab nime võtme ja skoori selle väärtusena. Linked tähendab, et elementide järjekord jäetakse meelde, mis võimaldab elemente edaspidi väärtuste järgi sorteerida.

    public static void main(String[] args) throws InterruptedException {
        laadiSkoorid(); // faili sisselugemine
        Scanner scanner = new Scanner(System.in); // skänneri ülesseadmine
        algus(); // mängu pealkirja kuvamine

        // valikumenüü kuvamine
        while (true) {
            System.out.print("Vali tegevus (1 - Alusta mängu, 2 - Vaata skooritabelit, 3 - Välju): ");
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
                    salvestaSkoor();
                    scanner.close();
                    return;
                default:
                    System.out.println("Vale valik, proovi uuesti.");
            }
        }
    }

    // Prindib suurelt mängu pealkirja
    public static void algus() throws InterruptedException {
        String[] pealkiri = {
                "║                                                                                                         ",
                "║                                                                                                         ",
                "║            ██╗  ██╗                                                                                     ",
                "║  ██████╗    █████╗   ██████╗    █████╗   ██╗       ██████╗   ██╗   ██╗  ███╗   ██╗  ██╗   ██╗  ██████╗  ",
                "║  ██╔══██╗  ██╔══██╗  ██╔══██╗  ██╔══██╗  ██║       ██╔══██╗  ██║   ██║  ████╗  ██║  ██║   ██║  ██╔══██╗ ",
                "║  ██████╔╝  ███████║  ███████║  ███████║  ██║       ██║  ██║  ██║   ██║  ██╔██╗ ██║  ██║   ██║  ██║  ██║ ",
                "║  ██╔══██╗  ██╔══██║  ██╔══██║  ██╔══██║  ██║       ██║  ██║  ██║   ██║  ██║╚██╗██║  ██║   ██║  ██║  ██║ ",
                "║  ██║  ██║  ██║  ██║  ██████╔╝  ██║  ██║  ███████╗  ██████╔╝  ╚██████╔╝  ██║ ╚████║  ╚██████╔╝  ██████╔╝ ",
                "║  ╚═╝  ╚═╝  ╚═╝  ╚═╝  ╚═════╝   ╚═╝  ╚═╝  ╚══════╝  ╚═════╝    ╚═════╝   ╚═╝  ╚═══╝   ╚═════╝   ╚═════╝  ",
                "║                                                                                   ",
                "║                               ██╗  ██╗                                            ",
                "║                     ██████╗    █████╗   ███╗   ██╗  ██████╗   ██╗   ██╗  ██████╗  ",
                "║                     ██╔══██╗  ██╔══██╗  ████╗  ██║  ██╔══██╗  ██║   ██║  ██╔══██╗ ",
                "║                     ██████╔╝  ███████║  ██╔██╗ ██║  ██║  ██║  ██║   ██║  ██████╔╝ ",
                "║                     ██╔══██╗  ██╔══██║  ██║╚██╗██║  ██║  ██║  ██║   ██║  ██╔══██╗ ",
                "║                     ██║  ██║  ██║  ██║  ██║ ╚████║  ██████╔╝  ╚██████╔╝  ██║  ██║ ",
                "║                     ╚═╝  ╚═╝  ╚═╝  ╚═╝  ╚═╝  ╚═══╝  ╚═════╝    ╚═════╝   ╚═╝  ╚═╝ ",
                "║                                                                                   "
        };

        for (String rida : pealkiri) {
            System.out.println(rida);
            Thread.sleep(100);
        }

        System.out.print("╚");
        int reapikkus = 70;
        for (int i = 0; i < reapikkus; i++) {
            System.out.print("═");
            Thread.sleep(5);
        }
        System.out.println();
    }

    // rakustaseme valimine
    private static void alustaMangu(Scanner scanner) throws InterruptedException {
        System.out.print("Sisesta oma nimi: ");
        String mangijaNimi = scanner.nextLine().trim();
        int korgeimSkoor = 0;

        // mängija olemasolu kontrollimine
        if (skoorid.containsKey(mangijaNimi)) {
            korgeimSkoor = skoorid.getOrDefault(mangijaNimi, 0);
            System.out.println("Sinu senine kõrgeim skoor: " + korgeimSkoor);
        }

        // raskustaseme valimine
        int valik;
        double[] kordajad = {1.0, 1.5, 2.0}; // skoorikordajad raskustasemete jaoks

        do {
            System.out.print("Vali raskustase (1 - Kerge, 2 - Keskmine, 3 - Raske): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Palun sisesta vastav number!");
                scanner.next();
            }
            valik = scanner.nextInt();
        } while (valik < 1 || valik > 3);

        // mängu alustamine vastavalt raskustasemele
        Maatriks mang;

        switch (valik) {
            case 1:
                mang = new Raskustase_1();
                break;
            case 2:
                mang = new Raskustase_2();
                break;
            case 3:
                mang = new Raskustase_3();
                break;
            default:
                mang = new Raskustase_1(); // vaikeväärtus
        }

        System.out.println("\nTere tulemast mängulauale!\n");
        mang.manguTsukkel(scanner, mangijaNimi);
    }

    // skooritabeli kuvamine
    private static void kuvaSkoorid() {
        System.out.println("\nSkooritabel: ══════════════════════════════");

        int number = 1;
        for (Map.Entry<String, Integer> sissekanne : skoorid.entrySet()) {
            System.out.println(number + ". " + sissekanne.getKey() + " - " + sissekanne.getValue());
            number++;
        }
        System.out.println("═══════════════════════════════════════════\n");
    }

    // nimede skooride järgi järjestamine
    private static void sorteeriSkoorid() {
        List<Map.Entry<String, Integer>> sorteeritud = new ArrayList<>(skoorid.entrySet());
        sorteeritud.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Väärtuste järgi kahanevas järjekorras

        // Uuendame skooride kaarti, et hoida sorteeritud järjekorda
        skoorid.clear();
        for (Map.Entry<String, Integer> entry : sorteeritud) {
            skoorid.put(entry.getKey(), entry.getValue());
        }
    }

    // skooride sisselaadimine
    private static void laadiSkoorid() {
        Map<String, Integer> sorteerimata = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(failinimi))) {
            String rida;

            while ((rida = br.readLine()) != null) {
                String[] osad = rida.split(" ; ");
                if (osad.length == 2) {
                    sorteerimata.put(osad[0], Integer.parseInt(osad[1]));
                }
            }

        } catch (IOException e) {
            System.out.println("Skoorifaili ei leitud.");
        }

        skoorid.putAll(sorteerimata); // Esmalt laadime skoorid isendivälja, et teine meetod saaks neid kasutada
        sorteeriSkoorid();  // Seejärel sorteerime need
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
    protected static void uuendaSkoori(String mangijaNimi, int uusSkoor) {
        int kõrgemSkoor = Math.max(skoorid.getOrDefault(mangijaNimi, 0), uusSkoor); // kui uus skoor on suurem kui praegune, siis uuendatakse mängija skoori
        skoorid.put(mangijaNimi, kõrgemSkoor);
    }

}
