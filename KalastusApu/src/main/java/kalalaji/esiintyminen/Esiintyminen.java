/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.esiintyminen;

import aikapvm.SesonkiNyt;

/**
 * Esiintyminen rajapinta jossa määritetään pakkauksessa kalalaji.esiintyminen
 * olevien luokkien toteuttamat metodit. Rajapintaa käytetään myös selventämään
 * pakkauksen luokkien olioiden toimintaa sekä perinnöllisyyttä, ja helpottamaan
 * uusien lajien lissämistä ohjelmaan.
 *
 */
public interface Esiintyminen {

    /**
     * Rajapinnan metodi joka palauttaa kalan talvisen esiintymisen.
     *
     * @return talven esiintyminen String tyyppisenä.
     */
    public String getTalviEsiintyminen();

    /**
     * Rajapinnan metodi joka palauttaa kalan kevään esiintymisen.
     *
     * @return kevään esiintyminen String tyyppisenä.
     */
    public String getKevatEsiintyminen();

    /**
     * Rajapinnan metodi joka palauttaa kalan kesän esiintymisen.
     *
     * @return kesän esiintyminen String tyyppisenä.
     */
    public String getKesaEsiintyminen();

    /**
     * Rajapinnan metodi joka palauttaa kalan syksy esiintymisen.
     *
     * @return syksy esiintyminen String tyyppisenä.
     */
    public String getSyksyEsiintyminen();

    /**
     * Metodi palauttaa tiedon string tyyppisenä missä haluttu laji esiintyy
     * sesongin mukaan.
     *
     * @param es on Esiintyminen rajapinnan ilmentymä joka sisältää kaikki
     * rajapinnan toteuttavat luokat.
     * @param sn SesonkiNyt olio joka määrittää ajankohtaisen sesongin.
     * @return palauttaa kalalajin ennalta sesongin mukaan määritellyn
     * esiintymisalueiden kuvauksen String tyyppisenä.
     */
    public String esiintyySesonginMukaan(Esiintyminen es, SesonkiNyt sn);
}
