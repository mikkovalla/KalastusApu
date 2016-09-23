/*
Tämä Main luokka on luotu vain testiä varten
 */
package kalastusapuharkka.kalastusapu;

import aikapvm.Kuukausi;
import alue.AlueValinta;
import alue.Meri;
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
        System.out.println("Alue voi olla: Meri, Jarvi tai Joki.");

        Scanner sc = new Scanner(System.in);
        String mesta = sc.nextLine();
        System.out.println("Mikä on veden väri?");
        String vari = sc.nextLine();
        System.out.println("Mikä on veden lämpö? ");
        int lampo = Integer.parseInt(sc.nextLine());
        System.out.println("Mikä on veden korkeus? ");
        int korkeus = Integer.parseInt(sc.nextLine());

        AlueValinta av = new AlueValinta(mesta, vari, lampo, korkeus);
        System.out.println(kk.getKuukausi()); // tulostaa 9
        System.out.println(sn.getSesonki()); // tulostaa Syksy
        System.out.println(av.toString()); // tulostaa Meri, Järvi tai Joki riippuen käyttäjän syötteestä

        av.setVedenVari(""); // testaa oletus veden värin

        System.out.println(av.toString()); // tulostaa oletus veden värillä

        Meri meri = new Meri("meri", "", 11, -15); //Luo uuden meri olion annetuilla parametreillä

        System.out.println(meri.toString()); //tulostaa meri tiedot käyttäen yliluokan oletusvedenVari metodia

        meri.setVedenVari("punainen");
        meri.setVedenLampo(14);
        meri.setVedenKorkeus(-10);

        System.out.println(meri.toString()); //tulostaa meri olion tiedot uusilla parametreilla

    }
}
