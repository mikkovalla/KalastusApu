/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.logiikka;

import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import saatila.saa.Tuuli;

/**
 * Luokan SaaNyt tarkoitus on kerätä yhteen luokan ilmentymään säätilaa koskevat
 * tiedot.
 */
public class SaaNyt {

    private Pilvisyys pilvet;
    private Sade sade;
    private Tuuli tuuli;

    /**
     * Konstruktori luo ajankohtaisen sää olion käyttäjän antamilla vakio
     * arvoilla.
     *
     * @param pilvet vakio arvo.
     * @see saatila.saa.Pilvisyys.
     *
     * @param sade vakio arvo.
     * @see saatila.saa.Sade.
     *
     * @param tuuli vakio arvo.
     * @see saatila.saa.Tuuli.
     */
    public SaaNyt(Pilvisyys pilvet, Sade sade, Tuuli tuuli) {
        this.pilvet = pilvet;
        this.sade = sade;
        this.tuuli = tuuli;
    }

    /**
     * SaaNyt setteri joka asettaa uudet käyttäjän antamat vakio arvot.
     *
     * @param p vakio arvo.
     * @see saatila.saa.Pilvisyys.
     *
     * @param s vakio arvo.
     * @see saatila.saa.Sade.
     *
     * @param t vakio arvo.
     * @see saatila.saa.Tuuli.
     */
    public void setSaaNyt(Pilvisyys p, Sade s, Tuuli t) {
        this.pilvet = p;
        this.sade = s;
        this.tuuli = t;
    }

    public String getSaaNyt() {
        return this.pilvet + " " + this.sade + " " + this.tuuli.getSuunta() + " " + this.tuuli.getNopeus();
    }

    public Pilvisyys getPilvet() {
        return this.pilvet;
    }

    public Sade getSade() {
        return this.sade;
    }

    public Tuuli getTuuli() {
        return this.tuuli;
    }

    @Override
    public String toString() {
        return "Sää: \nPilvisyys: " + this.pilvet.toString() + "\nSade: " + this.sade.toString() + "\n" + this.tuuli.toString();
    }
}
