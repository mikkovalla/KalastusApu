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
 *
 * @author mikko
 */
public class SaaNyt {

    private Pilvisyys pilvet;
    private Sade sade;
    private Tuuli tuuli;

    public SaaNyt(Pilvisyys pilvet, Sade sade, Tuuli tuuli) {
        this.pilvet = pilvet;
        this.sade = sade;
        this.tuuli = tuuli;
    }

    public void setSaaNyt(Pilvisyys p, Sade s, Tuuli t) {
        this.pilvet = p;
        this.sade = s;
        this.tuuli = t;
    }

    @Override
    public String toString() {
        return "Sää: \nPilvisyys: " + this.pilvet.toString() + "\nSade: " + this.sade.toString() + "\n" + this.tuuli.toString();
    }
}
