/*
Tämä Main luokka on luotu vain testiä varten
 */
package logiikka;

import aikapvm.Kuukaudet;
import aikapvm.Kuukausi;
import alue.AlueValinta;
import aikapvm.SesonkiNyt;
import static alue.Vesi.JÄRVI;
import static alue.Vesi.MERI;
import saatila.logiikka.SaaNyt;
import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import static saatila.vakiot.Tuulensuunta.ETELÄ;
import saatila.saa.Tuuli;
import static saatila.vakiot.Sateet.POUTA;
import static saatila.vakiot.Taivas.AURINKOINEN;

/**
 *
 * @author mikko
 */
public class Main {

    //Testi Main luokka jolla testataan olioiden palauttamat arvot ennen logiikka luokkaa ja UI luokkaa
    public static void main(String[] args) {

        SesonkiNyt sn = new SesonkiNyt();
        Kuukausi kk = new Kuukausi();
        AlueValinta av = new AlueValinta(MERI, "", 15, 10);
        Tuuli t = new Tuuli(ETELÄ, 5);
        Pilvisyys p = new Pilvisyys(AURINKOINEN);
        Sade s = new Sade(POUTA);
        SaaNyt saa = new SaaNyt(p, s, t);

        System.out.println(sn.toString() + "\n" + av.toString() + "\n" + saa.toString());
    }
}
