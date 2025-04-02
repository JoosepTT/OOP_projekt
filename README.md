# OOP_projekt
Joosep Tiger Tilgar, Lauri Laud

Kirjeldus : Tegime Dungeons and Dragons stiilis "Dungeon crawleri". Mäng ise töötab nii, et mängu alguses genereeritakse mängu maailm, kus siis mängija hakkab oma sisestustega liikuma. Mängija saab anda sisenditeks liikumis suuna (üles, alla, paremale, vasakule). Kui ta liigub ühelt kohalt teisele on valitakse suvaliselt loodud sündmuste juurest üks, mille mängija peab läbima. Sündmuste läbimiseks kasutame ka Dungeons and Dragons stiilis täringu veeretusi. Et mingist sündmusest läbida peab mängija kokku saama, kas suvaliselt valitud vahemikus arvu või peab ta saama kokku kindled sümbolid. Sündmustel on 2-3 lahendit. Kui mängija saavutab vajalikku tulemuse täringuid visates siis ta saab juurde skoori või isegi elusid. Kui ta ei täida vajalikku tulemust siis ta kaotab skoori ja/või elusid. Mängijal on kokku 3 elu. Mäng lõppeb kui mängija elud otsa saavad või kui mängija käib ära igal kohal mängu maailmas. Kasutusjuhendit vaja vist ei ole, sest mäng ise annab sisendite juures märku, mida mängija parasjagu sisestama peab.

Klasside kirjeldused:
Main klass: Põhiklass, kus initsialiseeritakse mäng, loetakse ja salvestatakse skoori faili. Skoori faili loetakse projekti src kaustast Skoorid.txt
Maatriks klass: ilmselt kõige tähtsam klass meie projektis. Selles tehakse ära maatriksi ehk maailma loomine, tava mängu tsükkel asub seal, mis töötab nii kaua kui elud saavad otsa või mängija ise selle katkestab sisestades 'q' ja selles klassis toimub ka maailmas liikumine.
Raskusastmete klassid 3tk: Need klassid annavad maatriks klassile, maatriksi suuruse (5 - 7) ja ka sündmuste protsendi (50 - 70). Ja ka käivitavad sündmused erinevate kordajatega (1- 3).
Sundmused klass: Selles klassis on kõik sündmused nii need, mis vajavad kasutaja sisestustm kui ka need, mis on nii öelda täite sündmused, mis kasutaja siestust ei vaja.
Taring klass: Selles klassis toimub kõik täringuga seotuv. Veeretatakse number ja ka sümbol täringuid. 

Projekti tegemise protsessi kirjeldus: tegime üks nädalavahetus arvutis kõne, sest Lauri oli Pärnus ja ei saanud kohapeal kokku saada. Rääkisime mis teha soovime ja panime algse plaani paika. Lisan algse plaani kritseldused siia faili alla. Panime paika ka, millal kohtume ja et teeme mõlemad sellel nädalavahetusel midagi juba ära. Siis teisipäeval saime kokku ja panime üksteise loodud koodid kokku, lihvisime buge ja seatsime järgmised plaanid.
Kõigepealt sai meil valmis baas nagu klass main ja maatriks (muidugi tegime neis parandusi hiljem ja lisasime meetodeid), siis sai valmis täring ja kui juba mäng töötas siis lisasime sündmused, et mängus ka teha midagi oleks.

Rühmaliikmete panus: Lauri - Main ja täringu klassis tegin parandusi ja kui lisasin midagi siis pigem midagi väikest. Maatriks, sundmused ja raskustasemete klassides panustasin rohkem, ajakulu arvan et võis jääda kuskile 16h kanti.

Tegemise mured: Üks murekoht oli koodide ühendamisel. Ühendamisel oli vaja mitmeid osasid muuta ja katsetamise läbi proovida, kuidas mingi osa töötab ja mida vaja veel muuta on.

Hinnang tööle: Lauri - Mina olen väga rahul. Suhteliselt huvitav ja äge asi sai lõpuks valmis.

Programmi testimine: Peamiselt mängisime ise mängu läbi, et vaadata et iga osa ikka töötaks


![Screenshot 2025-04-02 200159](https://github.com/user-attachments/assets/a384f99e-0bdd-4cdb-ae3d-6f050929b849)
![Screenshot 2025-04-02 200214](https://github.com/user-attachments/assets/11c8c1e4-79c2-4592-912d-000021d20b3e)
