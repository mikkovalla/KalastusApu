/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalat;

import aikapvm.SesonkiNyt;
import kalalaji.esiintyminen.*;
import kalalaji.kalastustapa.*;

/**
 * Vakio luokka joka luo yhden olion joka sisältää esiintymisen sekä
 * kalastustavan sesongin mukaan.
 *
 */
public enum Kalat {
    //Lisättynä vain hauki jotta ohjelma pysyisi siedettävässä mittakaavassa tässä vaiheessa.
    //Ahven, Kuha, Taimen;
    Hauki(HaukiEsiintyminen.HAUKI, HaukiKalastus.HAUKI);

    private Esiintyminen es;
    private Kalastustapa kt;
    private SesonkiNyt sn = new SesonkiNyt();

    /**
     * Konstrukstori asettaa vakio arvolle sitä vastaavat parametrit.
     *
     * @param es on Esiintyminen rajapinta joka sisältää kaikki rajapinnan
     * toteuttavat luokat
     * @param kt on Kalastustapa rajapinta joka sisältää kaikki rajapinnan
     * toteuttavat luokat
     */
    Kalat(Esiintyminen es, Kalastustapa kt) {
        this.es = es;
        this.kt = kt;
    }

    /**
     * Metodi palauttaa vakio arvona annetun kalan esiintymisen sesongin mukaan.
     *
     * @return esiintyminen sesongin mukaan String tyyppisenä.
     */
    public String esiintyySesonginMukaan() {
        return es.esiintyySesonginMukaan(es, sn);
    }

    /**
     * Metodi hakee vakio kalaa koskevan kalastustavan.
     *
     * @return kalastus tapa sesongin mukaan String tyyppisenä.
     */
    public String kalastustapaSesonginMukaan() {
        return kt.kalastusSesonginMukaan(kt, sn);
    }
}
