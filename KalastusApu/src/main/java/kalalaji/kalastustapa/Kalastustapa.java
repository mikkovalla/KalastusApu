/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import aikapvm.SesonkiNyt;

/**
 * Kalastustapa rajapinta jossa määritetään pakkauksessa kalalaji.kalastustapa
 * olevien luokkien toteuttamat metodit. Rajapintaa käytetään myös selventämään
 * pakkauksen luokkien olioiden toimintaa sekä perinnöllisyyttä, ja helpottamaan
 * uusien lajien lissämistä ohjelmaan.
 *
 */
public interface Kalastustapa {

    /**
     * Rajapinnan metodi joka palauttaa kalalajin talvi kalastus metodit.
     *
     * @return talvi kalastustapa String tyyppisenä.
     */
    public String getTalviKalastus();

    /**
     * Rajapinnan metodi joka palauttaa kalalajin kevät kalastus metodit.
     *
     * @return kevät kalastustapa String tyyppisenä.
     */
    public String getKevatKalastus();

    /**
     * Rajapinnan metodi joka palauttaa kalalajin kesä kalastus metodit.
     *
     * @return kesä kalastustapa String tyyppisenä.
     */
    public String getKesaKalastus();

    /**
     * Rajapinnan metodi joka palauttaa kalalajin syksy kalastus metodit.
     *
     * @return syksy kalastustapa String tyyppisenä.
     */
    public String getSyksyKalastus();

    /**
     * Metodi palauttaa tiedon string tyyppisenä missä haluttu laji esiintyy
     * sesongin mukaan.
     *
     * @param kt on Kalastustapa rajapinnan ilmentymä joka sisältää kaikki
     * rajapinnan toteuttavat luokat.
     * @param sn SesonkiNyt olio joka määrittää ajankohtaisen sesongin.
     * @return palauttaa kalalajin ennalta sesongin mukaan määritellyn
     * kalastustavan kuvauksen String tyyppisenä.
     */
    public String kalastusSesonginMukaan(Kalastustapa kt, SesonkiNyt sn);
}
