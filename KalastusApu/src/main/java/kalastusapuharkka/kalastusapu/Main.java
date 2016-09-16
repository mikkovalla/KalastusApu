/*
Tämä Main luokka on luotu vain testiä varten
 */
package kalastusapuharkka.kalastusapu;

import aikapvm.Kuukausi;
import alue.AlueValinta;
import java.util.Scanner;
import sesonki.SesonkiNyt;

/**
 *
 * @author mikko
 */
public class Main {

    //Testi Main luokka jolla testataan olioiden palauttamat arvot ennen logiikka luokkaa ja UI luokkaa
    public static void main(String[] args) {
        SesonkiNyt sn = new SesonkiNyt();
        Kuukausi kk = new Kuukausi();

        System.out.println("Anna alue missä kalastat: ");
        System.out.println("Alue voi olla: Meri, Järvi tai Joki.");
        Scanner sc = new Scanner(System.in);
        String mesta = sc.nextLine();
        AlueValinta av = new AlueValinta(mesta);

        System.out.println(kk.getKuukausi()); // tulostaa 9
        System.out.println(sn.getSesonki()); // tulostaa Syksy
        System.out.println(av.getAlue()); // tulostaa Meri, Järvi tai Joki riippuen käyttäjän syötteestä

    }
}
