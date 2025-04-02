# OOP_projekt: "Räbaldunud Rändur"
projekti autorid: Joosep Tiger Tilgar, Lauri Laud


## Projekti kirjeldus
Tegime Dungeons and Dragons stiilis "Dungeon crawleri". Mängu alguses genereeritakse kompaktne ruudukujuline selgelt piiritletud minimaailm, kus mängija saab liikuda ringi ja teha otsuseid kasutades lihtsaid klahvikombinatsioone. Mängija saab valida liikumissuuna klahvidega A, S, W, D (üles, alla, paremale, vasakule), nagu tavaliselt arvutimängudes kombeks, ning ülesannete lahendamiseks ja menüüdes navigeerimiseks piisab üksnes numbrisisestustest vahemikus 1-5. Kui mängija liigub ühelt väljalt teisele, valitakse üks suvaliselt loodud sündmustest, mille mängija on kohustatud peale avastamist läbima. Sündmuste läbimiseks kasutasime jällegi Dungeons and Dragons stiilis täringuveeretusi: et sündmust läbida peab mängija saama kokku kas sihtarvu suvaliselt valitud vahemikus või kindla sümbolite kombinatsiooni. Kui mängija saab visates vajalikku tulemuse täringuid, siis ta saab juurde punkte või isegi elusid. Kui mängija aga ei saavuta vajalikku tulemust, siis kaotab ta puntke skoorist ja/või elusid. Mängijal on kokku 3 elu ja neid võib mängu jooksul juurde saada, kuid üle kolme elu ei saa mängijal kunagi olla. Mäng lõppeb kui mängija elud saavd otsa või kui mängija avastab maailmas iga seal leiduva sündmuse. Mängimiseks kasutusjuhendit vaja ei ole, sest mäng annab ise sisendite juures märku, mida mängija parasjagu sisestama peab.


## Klasside kirjeldused
- Main klass: Põhiklass, kus initsialiseeritakse mäng, loetakse ja salvestatakse andmed skoorifaili. Skoori faili loetakse projekti src kaustast Skoorid.txt ning pärast iga interakteeringut failiga kontrollitakse skooride õiget suurusepõhist järjestust ning vajadusel korrigeeritakse.

- Maatriks klass: Tegemist on ilmselt kõige tähtsama klassiga projektis. Klassis Maatriks luuakse maatriks, mis kujutab mängu minimaailma, samuti asub seal põhiline mängutsükkel, mis töötab kuni mängija elude lõppemise või mängu automaatse katkestuseni, mida saab teha sisestades liikumissuuna valimise hektel sisendväljale 'q'. Klassis genereeritakse korraga kaks maatriksit: kasutajale kuvatav ekraanimaatriks, kus avastamata ja juba avastatud välju tähistatakse vastavalt tähtedega "O" ja "X", ning peidetud süsteemimaatriks, mis genereeritakse raskustaseme valimisel vastavalt valitud raskusklassi kontuktori parameetritele (maatriksi järk ja sündmuste protsent kõigist väljadest).

- Raskusastmete klassid (3tk): Nagu äsja mainitud, määravad erinevad raskustaseme klassid, mis on maatriksi klassi alamklassideks, maatriksi järgu (5 - 7) ja seal sisalduvate sündmuste protsendi (50% - 70%), käivitades sündmused erinevate punktikordajatega (1 - 3). Lõime sellise süsteemi mängijate innustamiseks: mida raskem on raskusaste, seda suurem on risk, kuid seda suurem on ka potensiaalne punktikasum.

- Sundmused klass: Selles klassis on kõik sündmused nii need, mis vajavad kasutaja sisestustm kui ka need, mis on nii öelda täite sündmused, mis kasutaja siestust ei vaja.
  
- Taring klass: Sisaldab kahte erinevat täringuveeratamise metoodikat. Neist eimene põhineb sihtmärgi tabamise mehaanikal, mispuhul genereeritakse mängijale sihtvahemik, millest ei tohi täringute summa olla ei väiksem ega suurem (vahemiku arvutamisel võetakse arvesse täringute minimaalset ja maksimaalset kombinatsiooni, et mitte kogemeta genreerida vahemikku, mida pole täringute veeretamisel võimalik tabada). Nagu esimesel veeretusmehaanikal, on ka teisel meetodil võimalik kasutajal veeretada täringuid kokku kolm korda kuni õige tulemuse saamiseni. Nimelt kasutab teine meetod lauamängus "Mees, kes teadis ussisõnu" kasutatavat mehaanikat, kus mängijal on viis eri sümboliga täringut ning eesmärgiks on kolme veeretuse jooksul saada nõutud sümbolite kombinatsioon. See näeb välja umbes nii, et mängija veeretab täringuid, paneb kõrvale sümbolid, mis kuuluvad nõutud kombinatsiooni, ja veeretab ülejäänud täringuid uuesti korrates sama protsessi veel kaks korda. Selle täringumeetodi iseärasuseks on võimalus pääseda kaotusest põgenemise teel, saades täringusümbolitest kokku nõutud põgenemiskobinatsiooni, mis on alati võidukombinatsioonist lühem. Lisaks on kombinatsioonimeetodis võimalik kasutada kahte riskiheina sümbolit ükskõik mis teise sümboli asendamiseks, kulub raskmate kombinatsioonide puhul marjaks ära.


## Loomisrotsessi kirjeldus
Pärast mõnda nädalat mõtete kogumist tegime projetkiga ametlikult algust netikõne kaudu, kuna tol hetkel polnud meil võimalik näost näkku kohtuda. Rääkisime mis teha soovime, peegeldasime oma ideid ja panime paika algse plaani, kujundades vestluse käigus teineteiselt ideid põrgatades välja mängu visiooni ja üldise ülesehtiuse. Väljavõtted esmasest projekti kavast on esitatud siin sama dokumentsiooni all kuvatõmmistena. Seejärel panime algava nädala alguseks paika uue kohtumisaja, mil saaksime juba üheskoos oma esmaseid koodilõike katsetada. Kokku saades panime üksteise loodud koodid kokku, lihvisime bug'e, analüüsisime võimalikke kitsakohti ja seadsime paika edasised plaanid. Kõik edaspidise töö tegime mõlemad vaheldumisi distantsilt, kuna see oli ajahalduse ja arendusefektiivsuse mõttes kõige mõistlikum lahendus. Kõigepealt sai valmis mängu baas nagu klassid Main ja Maatriks (muidugi täiendasime ja tegime neis parandusi ka hiljem). Pärast mängutsüklite, liikumis- ja mängija-arvuti interaktsioonimehhaanika paika saamist keskendusime tängumehhaanikate paika panemisele, et saaks järmisena panna paika korrektsed sündmuste mallid, samuti sai korrektselt välja töötatud andmete faili salvestamine ja lugemine koos vajaliku sorteerimisega. Kui mäng juba töötas, lisasime üheskoos kõik eri sorti mehhaanikatega sündmused, et mängijal oleks mänguvälja põnev uudistada, ning lõpetuseks kujundasime pealkirja ja kohandasime programmi visuaalset poolt.


## Rühmaliikmete panus: 
### Lauri:
Tegin parnadusi main ja täringumeetodite klassis ja kui lisasin midagi siis pigem midagi väikest. Panin paika liikumismehaanika ja kirjutasin suurema osa sündmuseid, panustasin kõige rohkem klassides Maatriks, Sundmused ja raskustasemete klassides. Ajakulu arvan et võis jääda kuskile 16h kanti.

### Joosep:
Tegelesin põhiliselt täringumehhaanikate loomise ja andmete töötlemisega. Panin paika algsed programmitsüklid ja kaarditasin erinevate meetodite struktuuri, omavhaelised suhted ja nende algse loogika, mis said meie edaspidise arenduse lähtepunktiks. Samuti korrigeerisin programmi üldist vormistust ja struktuurset ühtsust. Ajakulu on hinnanguliselt samuti umbes 16-18h kandis.


## Murekohad
Suurim murekoht oli ilmselt tagantjärgi tagasivaadates koodide ühendamisel, mille tegemiseks oli vaja mitmeid osasid korduvalt muuta, katsetamisel läbi proovida ja seejärel uuesti vastavalt vajadusele kohandada. Kõige raskem oli panna algul paika programmi, selles sisalduvate klasside, meetodite ja tsüklite omavaheline töömehhaanika ning kuidas mingi osa töötab ja mida vaja veel kohandada.


## Hinnang tööle
### Lauri:
- Mina olen väga rahul. Suhteliselt huvitav ja äge asi sai lõpuks valmis.
### Joosep:
- Projekti erinevate osade ja detailide kokku panemine oli ilmselgelt kõige põnevam osa protsessit. Senise töö põhjal tuli samuti mitmeid uusi edasiarnedusmõtteid, kuidas mäng järgmisele tasmele viia.

## Programmi testimine
Peamiselt mängisime mängu ise korduvalt läbi, et testida parnadatud kohti ja vaadata et iga osa ikka töötaks. Kõige närvesöövam oli täringumehhanikate ja meetodite omavahelise suhtluse korraldmine.



![Screenshot 2025-04-02 200159](https://github.com/user-attachments/assets/a384f99e-0bdd-4cdb-ae3d-6f050929b849)
![Screenshot 2025-04-02 200214](https://github.com/user-attachments/assets/11c8c1e4-79c2-4592-912d-000021d20b3e)
