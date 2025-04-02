
import java.util.*;

public class Sundmused {
    Random võimalus = new Random();

    public void sundmus_1(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("\nKohtasid teel ootamatuid külalisi. Nüüd pead näitama oma oskusi!"); // sündmuse kirjeldus
        Thread.sleep(1500);
        System.out.println("Vastaste ülekavaldamiseks pead tabama sihtmärki:\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada, tubli töö!");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nJäid seekord vastasele alla!");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_2(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;
        char[] nõutud = {'✠', '☀', '✠'};
        char[] alternatiiv = {'⚘', '⚘'};

        System.out.println("\nKohtasid teel ootamatuid külalisi. Nüüd pead näitama oma oskusi!"); // sündmuse kirjeldus
        Thread.sleep(1500);
        System.out.print("Vastaste ülekavaldamiseks pead leidma järgmise kombinatsiooni: ");
        Thread.sleep(500);

        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        Thread.sleep(500);
        System.out.print("\nVastaste eest põgenemiseks pead saama kokku vajalikud vahendid: ");
        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada, tubli töö!");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            System.out.println("\nPõgenesid edukalt!");

        } else {
            System.out.print("\nJäid seekord vastasele alla!");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_3(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("\nJõudsid metsaäärse, väikese külakese lähedale."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Algul ei paista sulle midagi erilist silma aga järsku hakkavad kõik küla elanikud oma kodudesse põgenema.");
        Thread.sleep(500);
        System.out.println("Kuri nõid koos oma abilistega tuli metsast välja ja nõuab külaelanike ja ka sinu käest kulda.");
        Thread.sleep(1500);
        System.out.println("Nõiale vastu hakkamiseks pead sa oma julguse üles leidma:\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSa hakkasid nõiale vastu ja sinu valju häält kuuldes, põgenes ta tagasi metsa.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSisimas tahtsid sa nõiale vastu hakkata aga seekord jäi sul julgusest puudu.");
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_4(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("\nTaevast hakkas järsku sadama happe vihma, mis puutel sinu nahaga söövitas sind."); // sündmuse kirjeldus
        Thread.sleep(1500);
        System.out.println("Et vihma käest varjualust leida, pead sa kiiresti tegutsema:\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nLeidsid kiiresti ühe koopa, kus sa vihma sadu ära ootasid ja siis edasi liikusid.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSul läks varjualuse leidmisega liialt kaua aega ja su nahk kannatas happe vihma käes liiga kaua.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_5(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;
        char[] nõutud = {'★', '✜', '☘'};
        char[] alternatiiv = {'✠', '✠'};

        System.out.println("\nLeidsid oma teel ollas ühe väikese, veidi vildaka, kivist maja."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Mõtlesid et see on hea koht, kus puhata ja astusid maija sisse.");
        Thread.sleep(500);
        System.out.println("Majas kohtasid sa ühte küürakat vanameest, kes su endaga ühte mängu mängima kutsus.");
        Thread.sleep(1500);
        System.out.print("\nSelleks et vanameest mängus võita ja oma skoori mitte kaotada pead sa kokku saama järgmise kombinatsiooni: ");
        Thread.sleep(500);

        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        Thread.sleep(500);
        System.out.print("\nKuid sul on ka võimalus vanameest eksitada ja majast põgeneda, selleks on sul vaja saada: ");
        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nVõitsid vanameest mängus!");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            System.out.println("\nViisid vanamehe tähelepanu mujale ja põgenesid majast!");

        } else {
            System.out.print("\nSa kaotasid mängus vanamehele.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_6(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("\nKõndisid sa rahulikult mööda teed, peas mõtted mida sa endale õhtul süüa teed.");// sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Järsku märkasid sind 2 trolli, kes su teed nüüd takistavad.");
        Thread.sleep(1500);
        System.out.println("Trollidest möödapääsemiseks pead sa neid võitluses võitma:\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSuutsid ennast võitluses piisavalt kehtestada ja trollid põgenesid.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSinusugune väike inimene ei saa kahe suure trolli vastu.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_7(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;
        char[] nõutud = {'⚘', '☀', '⚘'};
        char[] alternatiiv = {'✜', '✜'};

        System.out.println("\nMöödusid teel ühest näiliselt tavalisest viljapõllust."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Mõni hetk hiljem jõudsid majani, mis kuulus selle põllu peremehele.");
        Thread.sleep(500);
        System.out.println("Põllu peremees, kiilas ja halli habemega mees, palus sinu käes abi viljapõldu rüüstavate pahalaste ära ajamiseks.");
        Thread.sleep(1500);
        System.out.print("Esimene võimalus on sul enda veetlevat karismat kasutada ja jutuga nad ära ajada: ");
        Thread.sleep(500);

        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }
        System.out.print("\nTeine võimalus on nad siit maapealt lihtsalt eemaldada: ");

        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSa suutsid pahalased oma jutuga ära ajada!");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            System.out.println("\nSa mõrtsukas tapsid nälgivad lapsed, kes viljapõllult omale süüa otsisid!");

        } else {
            System.out.println("\nSa unustasid karakteri generaatoris oma karismale punkte lisada ja sa ei suutnud vanameest aidata.");
            Thread.sleep(500);
            System.out.println("Lahkudes maja juurest sa komistasid ja lõid oma pea ära 'ouch'.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_8(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 5;
        char[] nõutud = {'☘', '✠', '⚘'};
        char[] alternatiiv = {'✠', '✠'};

        System.out.println("\nOlid just oma laagri platsi kokku pannud ja olid valmis teele asuma."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Järsku tuli sinu juurde üks segaduses ja hirmul minotaurus.");
        Thread.sleep(500);
        System.out.println("Ta palus, et sa aitaksid teda kodutee leidmisel.");
        Thread.sleep(1500);
        System.out.print("\nSelleks, et leida minotauruse kodu, pead sa ta maha rahustama ja oma dektektiivi oskuse proovile panema: ");
        Thread.sleep(500);

        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }
        System.out.print("\nSul on ka võimalus teda lihtsalt ignoreerida, kuid sellega kaasneb võimalus, et ta läheb närvi ja lööb sind. ");

        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nOlid edukas minotauruse kodu leidmises ja ta tasustas sind selle eest.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            int üksKolmest = võimalus.nextInt(3) + 1;

            if (üksKolmest == 2) {
                System.out.println("\nSa otsustasid seda tugevad ja võimast olevust ignoreerida, mis osutus olema väga halb otsus.");
                Thread.sleep(500);
                System.out.println(" - Kaotasid ühe elu.");
                Maatriks.elud -= 1;

            } else {
                System.out.println("\nSa otsustasid minotaurust ignoreerida ja sinu õnneks jättis ta su rahule.");
            }

        } else {
            System.out.println("\nSa ei olnud minotauruse abistamises edukas ja tegid asja hoopis hullemaks.");
            Thread.sleep(500);
            System.out.println("\nTa ründas sind ja siis suundus otsima järgmist abistajat.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_9(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 5;

        System.out.println("\nSa seisad keset ristmiku, käes kaart, ja üritad aru saada kuhu sa edasi liikuma pead."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Järsku tunned sa oma vöökohal liikumist ning kui tõstad oma pilgu kaardilt, et näha mis juhtus.");
        Thread.sleep(500);
        System.out.println("Näed sa enda ees jooksmas kapuutsiga olevust, kelle käes juhtub olema sinu kulla kott.");
        Thread.sleep(1500);
        System.out.println("\nSelleks et vargale järgi joosta ja oma kuld tagasi saada pead sa oma vastupidavuse proovile panema: ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nJooksid vargale järgi kiiremini kui Usain Bolt, võtsid tagasi oma kulla ja andsid vargale kaasa ka ühe muhu.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nOma praeguses vormis on see võimatu, et sa vargale järgi jõuaksid. Peaksid rohkem trennile pühenduma.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_10(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 5;

        System.out.println("\nSa kõnnid parasjagu keset pimedat surnuaeda."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Su tähelepanu püüab imelik heli.");
        Thread.sleep(500);
        System.out.println("Sinu ümber on hakkanud haudadest ennast välja kaevama luukered.");
        Thread.sleep(1500);
        System.out.println("\nSinu ainus võimalus on leida endale võimalikult kiiresti üks peidukoht: ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSa otsustasid ronida puu otsa lootes, et luukered ei märka sind ja see otsus päästis sind.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSa ei olnud piisavalt kiire ja pidid kannatama paari luukerede rünnakut ennem, kui sa pääsesid.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_11(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 3;

        System.out.println("\nSa kõnnid läbi paksu, pimeda ja uduga kaetud metsa."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Kuuled enda ümber vihma puudelehtedele langemas ja öökullide huikamist.");
        Thread.sleep(500);
        System.out.println("Järsku oled silmitsi suure ja musta karuga. Viimase asjana näed sa tema punaseid helendavaid silmi ennem, kui ta sinu poole sööstab.");
        Thread.sleep(1500);
        System.out.println("\nKaruga otsene võitlus on kasutu, nii et pead kiiresti mõtlema, kuidas sa sellest olukorrast pääsed: \n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSa mängisid surnut ja pärast sinu nuusutamist, karu lahkus.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSul puudus piisaval hulgal intelligentsi, et midagi võimalikult kiiresti välja mõelda.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
        }
        Thread.sleep(500);
    }

    public void sundmus_12(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 4;
        char[] nõutud = {'☀', '✜', '✠'};
        char[] alternatiiv = {'☘', '☘'};

        System.out.println("\nPuhkad hetkel ühes väikeses külas ja jood nende kõrtsis õlut."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Järsku ümbritsevad sind 5 meest, kes sinult kulda nõuavad.");
        Thread.sleep(1500);
        System.out.print("Sul on võimalus neile vastu hakkata ja loota, et teised kõrtsis olijad sind aitavad: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }
        System.out.print("\nNende tähelepanu hajutamiseks ja põgenemiseks: ");

        for (char sümbol : alternatiiv) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSa hakkasid bandiitidele vastu ja nad jätsid su rahule.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) { // põgenemisel ei kaota midagi, kuid punkte ka ei saa
            System.out.println("\nSa põgenesid kõrtsist.");

        } else {
            System.out.print("\nSa ei julgenud vastu hakkata ja loovutasid osa oma kullast.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_13(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 5;
        char[] nõutud = {'⚘', '⚘', '☀'};
        char[] alternatiiv = {'★', '★', '★', '★', '★'};

        System.out.println("\nOled oma laagri üles seadnud ja valmistud tulevaseks päevaks."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Avasid oma ravimtaimede koti ja sul on plaan teha omale üks tervendav jook.");
        Thread.sleep(1500);
        System.out.print("Selleks et jook tuleks sooviva toimega, pead sa oma alkeemia oskused tööle panema: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSa keetsid kokku joogi, mis tervendas su keha ja ka su vaimu.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println("Said ühe elu");

            if (Maatriks.elud == 3) Maatriks.skoor += punktiKordaja * võidupunktid;

            else Maatriks.elud += 1;
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nSee supp mille sa kokku keetsid ei sobi isegi põranda pesemiseks ja sa vigastasid ennast selle tegemise käigus.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_14(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 5;

        System.out.println("\nKõnnid mööda ühe suurema asula tänavaid, peas mõtted kuidas lisa raha teenida."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Sa leiad kuulutuse, kus pakutakse kulda areenil võitlemise eest.");
        Thread.sleep(500);
        System.out.println("Seisad keset areeni, silmad keskendunud vastasele sinu ees.");
        Thread.sleep(1500);
        System.out.println("Vastase võitmiseks pead oma võitlemis oskuse proovile panema.\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.print("\nKaotasid vastasele haledalt.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public static void juhusundmus() {
        Random suvaline = new Random();

        // Sündmuste map: võtmed on sündmuste kirjeldused, väärtusteks on {elukaotus, punktimuutus}
        Map<String, int[]> juhusundmused = new LinkedHashMap<>();
        juhusundmused.put("Said hammustada ja kaotasid elu.", new int[]{-1, -1});
        juhusundmused.put("Leidsid varanduse! Said juurde mõned punktid.", new int[]{0, 5});
        juhusundmused.put("Komistasid ja kaotasid punkti.", new int[]{0, -2});
        juhusundmused.put("Said maagilise amuleti! Said juurde alusid ja punkte", new int[]{1, 3});
        juhusundmused.put("Kukkusid auku ja kulutasid palju aega välja kaevamisele. Kaotasid punkte.", new int[]{0, 5});
        juhusundmused.put("Puhkasid veidi oma jalgu ja siis liikusid edasi.", new int[]{0, 0});
        juhusundmused.put("Ehmatasid korraks, sest arvasid, et keegi jälitab sind. See oli kõigest sinu vari.", new int[]{0, 0});

        // Valitakse suvaline sündmus
        List<String> võtmed = new ArrayList<>(juhusundmused.keySet());
        String valitudSündmus = võtmed.get(suvaline.nextInt(juhusundmused.size()));
        int[] väärtused = juhusundmused.get(valitudSündmus);

        // Meetodi väljakutse
        valjastaJuhuslik(valitudSündmus, väärtused);
    }

    public static void valjastaJuhuslik(String sündmus, int[] väärtused) {
        System.out.println(sündmus);
        if (väärtused[0] > 0 && Maatriks.elud == 3) Maatriks.skoor += väärtused[1];
        else Maatriks.elud += väärtused[0];
        Maatriks.skoor += väärtused[1];

        System.out.println("Mõju: Elud " + väärtused[0] + ", Skoor " + väärtused[1]);
    }
}
