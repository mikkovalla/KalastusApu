/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import saatila.saaenum.Taivas;

/**
 *
 * Pilvisyys luokka jonka ilmentymä pitää sisällään pilvisyyden riippuen Taivas
 Enum vakiosta.
 */
public class Pilvisyys {

    private Taivas taivas;

    public Pilvisyys(Taivas taivas) {
        this.taivas = taivas;
    }

    public Taivas getPilvisyys() {
        return this.taivas;
    }

    public void setPilvisyys(Taivas t) {
        this.taivas = t;
    }

    @Override
    public String toString() {
        return this.taivas.toString();
    }

}
