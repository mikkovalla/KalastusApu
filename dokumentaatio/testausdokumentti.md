# Testaus dokumentaatio

## JUnit

Kaikki muut paitsi Vieheet.java ja Ui.java ovat JUnit testien alaisuudessa.
Kalat.java luokan testit epäonnistuivat enkä saanut niitä toimimaan oikein.

Vieheet.java sisältää metodit jotka liittyvät käyttöliittymään, ja toimivat
vieheiden näyttämiseen parametrien perusteella.

## Teksti ja toissijainen paketointi testit

Testasin metodien palauttamat String arvot main testi luokassa. Erikoinen ongelma muodostui
kun JAR paketoinnin jälkeen, kuvat eivät näkyneet mutta tiedoston nimi tulostui oikein.
Kuvat sain näkymään JAR:issa hieman tyhmällä tavalla kova koodamalla kuvien nimet ja lisäämällä ne ArrayList listaan.

Käyttöliittymän toiminnot testasin kokeilemalla jokaista kenttää eri arvoilla. Käyttöliittymään on lisätty JDialog jos käyttäjä yrittää syöttää kirjaimen numeron sijasta. Tein näin koska Try/Catch eikä Throws Exception(e) eivät suostuneet toimimaan JAR:issa.

Parametrien mukaiset kuvat palauttava metodin testasin käyttöliittymässä muuttamalla parametrejä sekä vertaamalla näkyviä kuvia niiden nimiiin. Näin pystyin näkemään että ehtolauseen contains() metodin tuottama filterointi toimi oikein, ja oikeat kuvat lisättiin listaan. 
