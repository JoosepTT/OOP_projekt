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
            System.out.println("\nJäid seekord vastasele alla!");
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
            System.out.println("\nJäid seekord vastasele alla!");
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
            System.out.println("\nSisimas tahtsid sa nõiale vastu hakkata aga seekord jäi sul julgusest puudu.");
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
            System.out.println("\nSul läks varjualuse leidmisega liialt kaua aega ja su nahk kannatas happe vihma käes liiga kaua.");
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
            System.out.println("\nSa kaotasid mängus vanamehele.");
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
            System.out.println("\nSinusugune väike inimene ei saa kahe suure trolli vastu.");
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
            System.out.println("\nOma praeguses vormis on see võimatu, et sa vargale järgi jõuaksid. Peaksid rohkem trennile pühenduma.");
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
            System.out.println("\nSa ei olnud piisavalt kiire ja pidid kannatama paari luukerede rünnakut ennem, kui sa pääsesid.");
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
            System.out.println("\nSul puudus piisaval hulgal intelligentsi, et midagi võimalikult kiiresti välja mõelda.");
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
            System.out.println("\nSa ei julgenud vastu hakkata ja loovutasid osa oma kullast.");
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
            System.out.println("\nSee supp mille sa kokku keetsid ei sobi isegi põranda pesemiseks ja sa vigastasid ennast selle tegemise käigus.");
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
        System.out.println("Vastase võitmiseks pead oma võitlemisoskuse proovile panema.\n ");
        Thread.sleep(500);

        int tulemus = Taring.veereta(3);

        if (tulemus == 1) {
            System.out.println("\nSuutsid vastase alistada.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else {
            System.out.println("\nKaotasid vastasele haledalt.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_15(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'☘', '⚘', '☀', '✠'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nOled pakkimas lahti oma telki ning kuuled künka tagant tuttavaid hõikeid."); // sündmuse kirjeldus
        System.out.println("Jätsid oma varustuse ja tegemised katki ning läksid uurima, kes sind hüüab.");
        Thread.sleep(500);
        System.out.println("Teie pilgud kohtuvad, kuid on juba hilja: näed, et tegemist on teise rännumehega, kelle käest sa olid varastanud katla.");
        Thread.sleep(1500);
        System.out.print("Kättemaksujanulise matkaselli alistamiseks pead ta ilma oma varsutuse abi kasutmata maha murdma: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutsid rebida vastaselt toika ja ta oma enda relvaga läbi vemmeldada.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nSuutsid puude vahel põigates jälitaja maha raputada, kuid jäid oma varustusest ilma.");

        } else {
            System.out.println("\nVastane suutis su lukustada enda haardesse ja anda vastava karistuse.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_16(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'✜', '✜', '✜', '✠'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nSadas mitu päeva vihma ning su varustus sai läbimärjaks."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Päike on loojunud ja rohumaal kumab jahe udu. Külm õhk poeb vaikselt su kontidesse, kuna riided ei hoia enam sooja.");
        Thread.sleep(1500);
        System.out.print("Pead palvetama, kas sa oled hommikul veel elus või oled selleks ajaks juba alajahtunud: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutisid süüdata märjad puud ja teha lõkke, et end soojas hoida.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nÖö oli tuulevaikne ja suutsid märja lina vahel oma kehasoojust hoida, kuid hommikuks olid kopsupõletikus"); // põgenemisel ei kaota midagi, kuid punkte ka ei saa

        } else {
            System.out.println("\nÖösel tõusis tuul ja enam sa ei ärganud.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_17(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'☘', '☘', '☀', '☀'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nAitasid sõbralikel külameestel kaste kaubikusse laaduda, kui korraga ilmus teie ette korravalvuri sõiduk."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Korravalvur manitseb kõnnitee blokeerimise pärast ja küsib kõikide kohalviibijate dokumente, kuid avastab juhtumisi kastidest keelatud salakuba");
        Thread.sleep(1500);
        System.out.print("Pead võistlema teiste huligaanidega, et põgenemisbussis enne kiiret ärasõimist kohta saada: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nPanid ühele huligaanile jala ette ja said tema asemel kaubiku viimasele vabale istekohale.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nSuutsid teiste meeste paanika ja rapsimise varjus salaja põõsa taha peitu pugeda."); // põgenemisel ei kaota midagi, kuid punkte ka ei saa

        } else {
            System.out.println("\nAuto täitus kiiresti ja uksed löödi su näo ees järsult kinni. Korravalvur arreteeris su.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_18(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'✜', '★', '☀', '☀'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nJõuad vanasse varemetesse, kui järsku kuuled õhus müstilist sosinat."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Uudishimu sunnib sind hääle allikat otsima.");
        Thread.sleep(500);
        System.out.println("Sinu ette ilmub tume kogu – see on needuse all kannatav sõdalane.");
        Thread.sleep(1500);
        System.out.print("Ellujäämiseks pead temaga duelli pidama: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutsid needuse kanda temale tagasi ja pääsesid võitjana.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nSul õnnestus varjudes peitu pugeda."); // põgenemisel ei kaota midagi, kuid punkte ka ei saa

        } else {
            System.out.println("\nSõdalane neelas su hinge ja sa kaotasid väärtuslikku energiat.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_19(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'★', '✠', '☀', '✠'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nLeiad tee äärest vana kirstu, mis on pooleldi maasse vajunud."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Kui proovid seda avada, haaravad su käed järsku maagilised ketid kinni.");
        Thread.sleep(1500);
        System.out.print("Ahelatest vabastamiseks pead murdma ketil lausuva loitsu: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSuutsid loitsu murda ja kirst avanes, paljastades kulda ja väärisesemeid.");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nKettide jõud nõrgenes hetkeks ja sul õnnestus põgeneda, kuid sa ei saanud midagi väärtuslikku."); // põgenemisel ei kaota midagi, kuid punkte ka ei saa

        } else {
            System.out.println("\nLoits tugevnes ja sa tundsid oma jõudu hääbumas.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid " + võidupunktid * punktiKordaja + " punkti.");
            Thread.sleep(500);
            System.out.println(" - Kaotasid ühe elu.");
            Maatriks.elud -= 1;
            Maatriks.skoor -= võidupunktid * punktiKordaja;
        }
        Thread.sleep(500);
    }

    public void sundmus_20(int punktiKordaja) throws InterruptedException {
        int võidupunktid = 7;
        char[] nõutud = {'★', '☘', '☀', '⚘'};
        char[] alternatiiv = {'⚘', '⚘', '⚘'};

        System.out.println("\nKõnnid üle rippuva köiesilla, kui järsku üks planguke jalge all murdub."); // sündmuse kirjeldus
        Thread.sleep(500);
        System.out.println("Sa haarad instinktiivselt lähimast köiest kinni.");
        Thread.sleep(500);
        System.out.println("Kuid sild hakkab lagunema ja pead kiiresti tegutsema!");
        Thread.sleep(1500);
        System.out.print("Ellujäämiseks pead kiiresti haarama lähimast esemest: ");
        Thread.sleep(500);
        for (char sümbol : nõutud) {
            System.out.print("[" + sümbol + "] ");
        }

        int tulemus = Taring.veeretaSymbol(5, nõutud, alternatiiv);
        if (tulemus == 1) {
            System.out.println("\nSul õnnestus köiest kinni hoida ja üles ronida – oled pääsenud!");
            Thread.sleep(500);
            System.out.println("Said juurde " + võidupunktid * punktiKordaja + " punkti.");
            Maatriks.skoor += punktiKordaja * võidupunktid;

        } else if (tulemus == 2) {
            System.out.println("\nSuutsid üle noatera teisele poole jõuda, kuid oled kergelt viga saanud."); // põgenemisel ei kaota midagi, kuid punkte ka ei saa

        } else {
            System.out.println("\nKöis libises su käest ja sa kukkusid sügavikku.");
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
        juhusundmused.put("Leidsid varanduse! Said juurde mõned punktid.", new int[]{0, 3});
        juhusundmused.put("Komistasid ja kaotasid punkti.", new int[]{0, -2});
        juhusundmused.put("Said maagilise amuleti! Said juurde elusid ja punkte", new int[]{1, 3});
        juhusundmused.put("Kukkusid auku ja kulutasid palju aega välja kaevamisele. Kaotasid punkte.", new int[]{0, -3});
        juhusundmused.put("Puhkasid veidi oma jalgu ja siis liikusid edasi.", new int[]{0, 0});
        juhusundmused.put("Ehmatasid korraks, sest arvasid, et keegi jälitab sind. See oli kõigest sinu vari.", new int[]{0, 0});
        juhusundmused.put("Komistasid juurika otsa ja vigastasid end veidi.", new int[]{0, -3});
        juhusundmused.put("Leidsid peidetud ravipaki ja parandasid oma haavu.", new int[]{1, 0});
        juhusundmused.put("Kohtasid sõbralikku kaupmeest, kes andis sulle kingituse.", new int[]{0, 3});
        juhusundmused.put("Astusid lõksu ja kaotasid väärtuslikku aega.", new int[]{0, -4});
        juhusundmused.put("Avastasid iidse templi ja said selle saladustest inspiratsiooni.", new int[]{0, 2});
        juhusundmused.put("Sind ründas metsloom, kuid pääsesid napilt, kaotades elu.", new int[]{-1, 0});
        juhusundmused.put("Jõid allikast puhast vett ja tunned end värskena.", new int[]{0, 0});
        juhusundmused.put("Eksisid rajalt ja pidid tegema lisaringi.", new int[]{0, -4});
        juhusundmused.put("Aitasid hätta sattunud reisijat ja said tänutäheks mõned punktid.", new int[]{0, 2});
        juhusundmused.put("Leidsid maagilise relva, mis annab sulle jõudu!", new int[]{1, 1});

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
