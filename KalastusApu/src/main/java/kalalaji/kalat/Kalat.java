/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalat;

import aikapvm.SesonkiNyt;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import kalalaji.esiintyminen.*;
import kalalaji.kalastustapa.*;
import kalalaji.saaliskalat.*;
import saatila.saa.Tuuli;

/**
 * Vakio luokka joka luo yhden olion joka sisältää esiintymisen sekä
 * kalastustavan sesongin mukaan.
 *
 */
public enum Kalat {
    //Lisättynä vain hauki jotta ohjelma pysyisi siedettävässä mittakaavassa tässä vaiheessa.
    //esim Ahven, Kuha, Taimen;
    HAUKI(Esiintyminen.HAUKI, KalastustapaYleinen.HAUKI, Saaliskalat.HAUKI, KalastustapaSaanMukaan.HAUKI);

    private final Esiintyminen esiintyminen;
    private final KalastustapaYleinen kalastustapa;
    private final Saaliskalat saaliskalat;
    private final KalastustapaSaanMukaan kalastustapaSaanMukaan;
    private final SesonkiNyt sesonkinyt = new SesonkiNyt();

    /**
     * Konstrukstori asettaa vakio arvolle sitä vastaavat parametrit.
     *
     * @param es on Esiintyminen vakio luokka
     * @param kt on KalastustapaYleinen vakio luokka
     * @param sk on Saaliskalat vakio luokka
     * @param ksm on KalastustapaSaanMukaan vakio luokka
     */
    Kalat(Esiintyminen es, KalastustapaYleinen kt, Saaliskalat sk, KalastustapaSaanMukaan ksm) {
        this.esiintyminen = es;
        this.kalastustapa = kt;
        this.saaliskalat = sk;
        this.kalastustapaSaanMukaan = ksm;
    }

    /**
     * Metodi palauttaa vakio arvona annetun kalan esiintymisen sesongin mukaan.
     *
     * @return esiintyminen sesongin mukaan String tyyppisenä.
     */
    public String esiintyySesonginMukaan() {
        return esiintyminen.esiintyySesonginMukaan(esiintyminen, sesonkinyt);
    }

    /**
     * Metodi hakee vakio kalaa koskevan yleisen kalastustavan.
     *
     * @return kalastus tapa sesongin mukaan String tyyppisenä.
     */
    public String kalastustapaSesonginMukaan() {
        return kalastustapa.kalastusSesonginMukaan(kalastustapa, sesonkinyt);
    }

    /**
     * Metodi hakee vakio kalaa koskevat saaliskalat.
     *
     * @return saaliskalat sesongin mukaan String tyyppisenä.
     */
    public String saalisKalatSesonginMukaan() {
        return saaliskalat.saalisSesonginMukaan(saaliskalat, sesonkinyt);
    }

    /**
     * Metodi hakee vakio kalaa koskevan kalastustavan tuulen sekä
     * vedenkorkeuden mukaan.
     *
     * @param tuuli Tuuli luokan ilmentymä.
     * @param korkeus vedenkorkeus int tyyppisenä.
     * @return String typpisen vakio arvon metodin parametrien perusteella.
     */
    public String kalastustapaSaanMukaan(Tuuli tuuli, int korkeus) {
        return kalastustapaSaanMukaan.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(tuuli.getSuunta(), tuuli.getNopeus()) + " " + kalastustapaSaanMukaan.kalastusTapaSaanMukaanVedenKorkeus(korkeus);
    }
}
