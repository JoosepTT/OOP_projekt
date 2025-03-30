import java.util.*;

public class Raskustase_1 extends Maatriks {
    private double punktiKordaja = 0;

    public Raskustase_1(double punktiKordaja) {
        super(5, 50);
        this.punktiKordaja = punktiKordaja;
    }

    public void executeEvent(int eventNum) throws InterruptedException {
        switch (eventNum) {
            case 1: sundmus_1(); break;
            case 2: sundmus_2(); break;
            case 3: sundmus_3(); break;
        }
    }

    public static void juhusundmus() {
        Random suvaline = new Random();

        // Sündmuste map: võtmed on sündmuste kirjeldused, väärtusteks on {elukaotus, punktimuutus}
        Map<String, int[]> juhusundmused = new LinkedHashMap<>();
        juhusundmused.put("Said hamustada ja kaotasid elu!", new int[] {-1, -1});
        juhusundmused.put("Leidsid varanduse! Punkte lisatud!", new int[] {0, 5});
        juhusundmused.put("Komistasid ja kaotasid mõned punktid.", new int[] {0, -2});
        juhusundmused.put("Said maagilise amuleti! Elusid ja punkte lisatud!", new int[] {1, 3});

        // Valitakse suvaline sündmus
        List<String> võtmed = new ArrayList<>(juhusundmused.keySet());
        String valitudSündmus = võtmed.get(suvaline.nextInt(juhusundmused.size()));
        int[] väärtused = juhusundmused.get(valitudSündmus);

        // Meetodi väljakutse
        valjastaJuhuslik(valitudSündmus, väärtused);
    }

    public static void valjastaJuhuslik(String sündmus, int[] väärtused) {
        System.out.println(sündmus);
        System.out.println("Mõju: Elud " + väärtused[0] + ", Punktid " + väärtused[1]);
    }

    public void sundmus_1() throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("Kohtasid teel ootamatuid külalisi. Nüüd pead näitama oma oskusi!"); // sündmuse kirjeldus
        Thread.sleep(1500);
        System.out.println("Vastaste ülekavaldamiseks pead tabama sihtmärki: ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada, tubli töö!");
            Maatriks.skoor += punktiKordaja * võidupunktid;
        } else {
            System.out.print("\nJäid seekord vastasele alla!");
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
    }

    public void sundmus_2() throws InterruptedException {
        int võidupunktid = 3;
        char[] nõutud = {'✠', '☀', '✠'};
        char[] alternatiiv = {'⚘', '⚘'};

        System.out.println("Kohtasid teel ootamatuid külalisi. Nüüd pead näitama oma oskusi!"); // sündmuse kirjeldus
        Thread.sleep(1500);
        System.out.print("Vastaste ülekavaldamiseks pead leidma järgmise kombinatsiooni: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }
        System.out.print("\nVastaste eest põgenemiseks pead saama kokku vajalikud vahendid: ");
        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada, tubli töö!");
            Maatriks.skoor += punktiKordaja * võidupunktid;
        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            System.out.println("\nPõgenesid edukalt!");
        } else {
            System.out.print("\nJäid seekord vastasele alla!");
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
    }

    public String sundmus_3() {
        String vastus = "...";

        return vastus;
    }
}
