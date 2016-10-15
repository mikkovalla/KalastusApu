/*
Tämä Main luokka on luotu vain testiä varten
 */
package logiikka;

import alue.AlueValinta;
import aikapvm.SesonkiNyt;
import static alue.Vesi.MERI;
import gui.KuvatTest;
import kalalaji.kalat.Kalat;
import saatila.logiikka.SaaNyt;
import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import saatila.saa.Tuuli;
import static saatila.vakiot.Sateet.POUTA;
import static saatila.vakiot.Sateet.VESITIHKU;
import static saatila.vakiot.Taivas.AURINKOINEN;
import static saatila.vakiot.Taivas.SUMUINEN;
import static saatila.vakiot.Tuulensuunta.*;

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
        AlueValinta av = new AlueValinta(MERI, "", 8, -30);
        Tuuli t = new Tuuli(POHJOINEN, 5);
        Pilvisyys p = new Pilvisyys(SUMUINEN);
        Sade s = new Sade(VESITIHKU);
        SaaNyt saa = new SaaNyt(p, s, t);

        System.out.println(sn.toString());
        System.out.println(av.toString());
        System.out.println(saa.getSaaNyt());
        System.out.println("");
        System.out.println("Kohde kala: " + Kalat.Hauki + "\n");
        System.out.println("Esiintyminen: \n" + Kalat.Hauki.esiintyySesonginMukaan() + "\n");
        System.out.println("Saaliskalat: \n" + Kalat.Hauki.saalisKalatSesonginMukaan() + "\n");
        System.out.println("Kalastustapa: \n" + Kalat.Hauki.kalastustapaSesonginMukaan() + "\n");
        System.out.println("Kalastustapa sään mukaan: \n" + Kalat.Hauki.kalastustapaSaanMukaan(t.getNopeus(), av.vedenKorkeus()));
        //KuvatTest kuvattest = new KuvatTest();

    }
}
