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

    public String getTalviEsiintyminen();

    public String getKevatEsiintyminen();

    public String getKesaEsiintyminen();

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
