/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import saatila.vakiot.Sateet;

/**
 *
 * Luokka Sade jonka ilmentymä sisältää Sateet Enum vakio arvon.
 */
public class Sade {

    private Sateet sateet;

    /**
     * Sade luokan konstruktori.
     *
     * @param sateet vakio arvo.
     * @see saatila.vakiot.Sateet.
     */
    public Sade(Sateet sateet) {
        this.sateet = sateet;
    }

    /**
     * setSade metodi. Testaa että parametri on oikea ehto lauseessa.
     *
     * @param st vakio arvo.
     */
    public void setSade(Sateet st) {
        if (st.equals(sateet.LUMI) || st.equals(sateet.VESI) || st.equals(sateet.RÄNTÄ)) {
            this.sateet = st;
        }
    }

    /**
     * getSade metodi. Metodi antaa sateen vakion.
     *
     * @return Sateet vkio arvon.
     */
    public Sateet getSade() {
        return this.sateet;
    }

    @Override
    public String toString() {
        return this.sateet.toString();
    }
}
