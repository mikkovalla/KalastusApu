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

        System.out.println(kk.getKuukausi()); // tulostaa 9
        System.out.println(sn.getSesonki()); // tulostaa Syksy
        System.out.println(av.toString()); // Tulostaa aluevalinta kohtaiset tiedot oletus veden värillä ja tiedolla MERI

        AlueValinta avJarvi = new AlueValinta(JÄRVI, "", 12, 0);
        System.out.println(avJarvi.toString()); // tulostaa olion järvi parametrilla oletus veden värillä
        avJarvi.setVedenVari("maitokahvi"); // testaa vedenväri setteri        
        System.out.println(avJarvi.toString()); //tulostaa setterin asettamalla veden värillä

        System.out.println(kk.getKuukausi());
        System.out.println(kk.toString());
        System.out.println(sn.toString());

        System.out.println(sn.getSesonki());

        System.out.println(Kuukaudet.KESÄKUU.getKuukaudenSesonki());

    }
}
