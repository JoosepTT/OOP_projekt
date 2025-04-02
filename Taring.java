
import java.util.*;

public class Taring {

    public static int veereta(int taringuteArv) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random suvaline = new Random();
        int minSumma = taringuteArv; // minimaalne täringutel saadav summa
        int maxSumma = taringuteArv * 6; // maksimaalne täringutel saadav summa

        // Genereeritakse sihtvahemik
        int aluminePiir = suvaline.nextInt((maxSumma - minSumma) / 2) + minSumma;
        int üleminePiir = suvaline.nextInt((maxSumma - aluminePiir) / 2) + (aluminePiir + 1);

        int veeretuskordadeArv = 3;
        System.out.println("Sinu eesmärk on saada summa vahemikus (" + aluminePiir + " - " + üleminePiir + ").");
        System.out.println("Sul on " + veeretuskordadeArv + " võimalust valida õiged täringud!");

        // esmane veeretamine
        List<Integer> täringud = new ArrayList<>();
        for (int i = 0; i < taringuteArv; i++) {
            int veeretus = suvaline.nextInt(6) + 1;
            täringud.add(veeretus);
        }

        for (int kord = 1; kord <= veeretuskordadeArv; kord++) {
            System.out.println("\nVeeretus (" + kord + "/3)");
            Thread.sleep(500);
            kuvaTäringud(täringud);

            // Küsitakse, kas kasutaja tahab täringuid uuesti veeretada
            System.out.print("Sisesta täringute numbrid, mida uuesti veeretada (tühjaks jätmisel jäävad kõik samaks, sisesta tühikutega numbrid, nt: 1 3): ");
            String sisend = scanner.nextLine().trim();

            if (!sisend.isEmpty()) {
                String[] numbrid = sisend.split("\\s+");
                for (String num : numbrid) {
                    try {
                        int indeks = Integer.parseInt(num) - 1;
                        if (indeks >= 0 && indeks < täringud.size()) {
                            int veeretus = suvaline.nextInt(6) + 1;
                            täringud.set(indeks, veeretus);
                        } else {
                            System.out.println("Vigane number: " + num);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Sisestasid vale formaadiga numbri: " + num);
                    }
                }
            }

            kuvaTäringud(täringud);

            // Kontrollime, kas summa on sobivas vahemikus
            int summa = täringud.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Täringute summa: " + summa);

            if (summa >= aluminePiir && summa <= üleminePiir) {
                System.out.println("Õnnestus! Summa on õiges vahemikus (" + aluminePiir + " - " + üleminePiir + ")");
                return 1;
            } else if (kord < veeretuskordadeArv) {
                System.out.println("Summa ei sobi. Proovi veel!");
            }
        }

        System.out.println("\nEi õnnestunud! Summa jäi valesse vahemikku.");
        return -1;
    }

    private static void kuvaTäringud(List<Integer> täringud) throws InterruptedException {
        System.out.print("Täringud: ");
        for (int i = 0; i < täringud.size(); i++) {
            System.out.print("[" + täringud.get(i) + "] ");
            Thread.sleep(500);
        }
        System.out.println();
    }


    public static int veeretaSymbol(int taringuteArv, char[] nõutud, char[] alternatiiv) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random suvaline = new Random();
        int veeretusi = 3;

        char[] sümbolid = {'✠', '✜', '⚘', '☘', '☀', '★'};
        List<Character> lahendid = new ArrayList<>(); // siin hoitakse kasutaja väljavalitud sümboleid

        System.out.println("\nSaad veeretada täringuid " + veeretusi + " korda!");
        for (int i = 0; i < veeretusi; i++) {
            System.out.print("\n(" + (i + 1) + "/3) ");
            Thread.sleep(500);

            if (!lahendid.isEmpty()) {
                System.out.print("Juba kogutud sümbolid: ");
                for (char sümbol : lahendid) {
                    System.out.print("[" + sümbol + "] ");
                }
            }

            System.out.print("Vajuta Enter täringute veeretamiseks...");
            scanner.nextLine(); // kasutajasisend täringute veeretamiseks

            List<Character> summa = new ArrayList<>();

            // veeretatakse täringuid
            for (int j = 0; j < taringuteArv - lahendid.size(); j++) {
                char juhuslik = sümbolid[suvaline.nextInt(sümbolid.length)];
                summa.add(juhuslik);
            }

            // Kasutajale tulemuste kuvamine
            System.out.println("Millised võtad, millised jätad? (sisesta tühikutega numbrid, nt: 1 3)");
            for (int j = 0; j < summa.size(); j++) {
                System.out.print("[" + summa.get(j) + "] ");
                Thread.sleep(500);
            }

            String otsus = scanner.nextLine().trim(); // kasutaja sisestab valitud täringute järjekorranumbrid

            if (!otsus.isEmpty()) {
                String[] osad = otsus.split("\\s+"); // jagatakse tühikute põhjal

                for (String s : osad) {
                    try {
                        int indeks = Integer.parseInt(s) - 1;
                        if (indeks >= 0 && indeks < summa.size()) {
                            lahendid.add(summa.get(indeks)); // Salvestatakse valitud sümbolid
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vigane sisend: " + s);
                    }
                }
            }

            // Kontrollime pärast iga veeretust
            if (sisaldabKõiki(lahendid, nõutud) || kasTalismanAsendab(lahendid, nõutud)) {
                return 1;
            }
            if (sisaldabKõiki(lahendid, alternatiiv) || kasTalismanAsendab(lahendid, alternatiiv)) {
                System.out.print("Kas soovid põgeneda, see on hetkel võimalik? (jah/ei)");
                String vastus = scanner.nextLine().trim().toLowerCase();
                if (vastus.equals("jah")) {
                    return 2;
                }
            }
        }
        return -1;
    }

    // Abimeetod char[] teisendamiseks List<Character>-iks
    private static boolean sisaldabKõiki(List<Character> lahendid, char[] nõutud) {
        List<Character> temp = new ArrayList<>(lahendid);
        for (char c : nõutud) {
            if (!temp.remove((Character) c)) { // Eemaldame ainult esimese leitud esinemise
                return false;
            }
        }
        return true;
    }

    private static boolean kasTalismanAsendab(List<Character> lahendid, char[] kombinatsioon) {
        List<Character> temp = new ArrayList<>(lahendid);
        int puudu = 0;
        for (char c : kombinatsioon) {
            if (!temp.remove((Character) c)) {
                puudu++;
            }
        }
        if (puudu == 1 && Collections.frequency(lahendid, '☘') >= 2) {
            System.out.println("Sul on kaks [☘] sümbolit! Kas soovid neid kasutada puuduoleva sümboli asendamiseks? (jah/ei)");
            Scanner scanner = new Scanner(System.in);
            String vastus = scanner.nextLine().trim().toLowerCase();
            return vastus.equals("jah") || vastus.equals("j");
        }
        return false;
    }
}
