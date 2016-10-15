# Aihe:

KalastusApu on ohjelma jonka avulla käyttäjä löytää sopivan vieheen värin riippuen
vuodenajasta, säästä, kalalajista sekä alueesta jolla kalastaa. Viehe suositus perustuu sesonkiin,
saaliskaloihin, sekä käyttäjän syöttämiin sääolosuhteisiin.

Uistimien valinta pohjautuu tekijän omaan kokemukseen, oppaiden sekä limnologi ystävän vinkkeihin.

##Huomioitavaa:

Alueiden oletus vedenväri perustuu meren sesongin mukaisissa väreissä Espoon edustaan ja Saaristomereen, järven oletus veden väri perustuu Saimaan vesitöön ja joen oletus veden väri perustuu keski-suomen reittikoskien yleiseen värisävyyn.

Huomioitakoon että esimerkiksi Uudellamaalla Vantaanjoen vesi on hyvin savimaista johtuen maanviljelys painotteisesta valuma-alueesta, kun taas Karjaanjoen vesi (Karkkila) on taas kirkaan teen väristä vaikka molempien jokien lähtö kohdat ovat melkein samalla korkeudella Riihimäen paikkeilla.

Alkuun ohjelmassa on valittavana vain Hauki, ja pääpaino alueena on meri.

## Käyttäjät:
* Kalastaja

## Käyttö

Käyttäjä käyttää ohjelmaa seuraavanlaisesti:

1. Hän valitsee missä ja mitä kalastaa
2. Ohjelma hakee päivämäärän jonka perusteella se määrittelee vallitsevan sesongin ja kuukauden
3. Käyttäjä syöttää vallitsevat sääolosuhteet
4. Ohjelma esittää käyttäjälle viehe suositukset, esiintymis tietoa, kalastustavat, sekä tietoa saaliskaloista

## Luokkakaavio

![Luokkakaavio päivitetty](https://github.com/mikkovalla/KalastusApu/blob/master/dokumentaatio/kalastusApu_luokkakaavio.png)

## Sekvenssikaavio

![Sekvenssikaavio](https://github.com/mikkovalla/KalastusApu/blob/master/dokumentaatio/sekvenssi_kaaviot.png)

## Ohjelman Rakenne

Pakkaus aikapvm pitää sisällään Enum luokan Kuukaudet, luokan Kuukausi, ja luokan SesonkiNyt. SesonkiNyt luokan ilmentymä pitää sisällään ajankohtaisen sesongin Kuukausi luokan ilmentymän antaman arvon mukaan.

Pakkaus alue sisältää Enum luokan Vesi ja Rajapinnan Alue, joita käytetään luokassa AlueValinta luomaan ilmentymä kalastusalueesta.

Pakkaus saa sisältää pakkauksen vakiot jossa on Enum luokat joissa määritetään sää olosuhteita koskevat vakio arvot, pakkauksen saa jonka luokat luovat ilmentymät ja tarjoavat metodit Enum vakioiden käyttöön, sekä pakkaus logiikka minkä sisältämä luokka SaaNyt luo ilmentymän ajankohtaisesta saa tilasta.

Pakkaus kalalaji sisältää kalaa koskevat pakkaukset sekä luokat, joissa määritetään esiintyminen, kalastustavat, vieheet sekä saaliskalat, ja vakio luokka Kalat luo ilmentymän kalasta joka sisältää haluttua kalalajia koskevat tiedot.

Viimeisenä ja keskeisimpänä on GUI joka luo käyttöliittymän. 
