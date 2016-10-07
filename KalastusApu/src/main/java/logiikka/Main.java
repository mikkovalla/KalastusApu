/*
Tämä Main luokka on luotu vain testiä varten
 */
package logiikka;

import alue.AlueValinta;
import aikapvm.SesonkiNyt;
import static alue.Vesi.MERI;
import kalalaji.kalat.Kalat;
import saatila.logiikka.SaaNyt;
import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import static saatila.vakiot.Tuulensuunta.ETELÄ;
import saatila.saa.Tuuli;
import static saatila.vakiot.Sateet.POUTA;
import static saatila.vakiot.Taivas.AURINKOINEN;

/**
 * Main luokka missä testataan ja tarkastetaan olioiden palauttamia tietoja.
 */
public class Main {

    //Testi Main luokka jolla testataan olioiden palauttamat arvot ennen logiikka luokkaa ja UI luokkaa
    /**
     * Main luokan päämetodi.
     *
     * @param args testiin.
     */
    public static void main(String[] args) {
        /**
         * Olio testaus tähän alle.
         */
        SesonkiNyt sn = new SesonkiNyt();
        AlueValinta av = new AlueValinta(MERI, "", 15, 10);
        Tuuli t = new Tuuli(ETELÄ, 5);
        Pilvisyys p = new Pilvisyys(AURINKOINEN);
        Sade s = new Sade(POUTA);
        SaaNyt saa = new SaaNyt(p, s, t);

        System.out.println(sn.toString() + "\n" + av.toString() + "\n" + saa.toString() + "\n");
        System.out.println("Kohde kala: " + Kalat.Hauki + "\n");
        System.out.println("Esiintyminen: \n" + Kalat.Hauki.esiintyySesonginMukaan());
        System.out.println("Kalastustapa: \n" + Kalat.Hauki.kalastustapaSesonginMukaan());
    }
}
