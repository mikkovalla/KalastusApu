/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import saatila.saaEnum.Tuulensuunta;

/**
 *
 * @author mikko
 */
public class Tuuli {

    private Tuulensuunta suunta;
    private int nopeus;

    public Tuuli(Tuulensuunta suunta, int nopeus) {
        this.suunta = suunta;
        this.nopeus = nopeus;
    }

    public void setSuunta(Tuulensuunta suunta) {
        this.suunta = suunta;
    }

    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }

    public Tuulensuunta getSuunta() {
        return this.suunta;
    }

    public int getNopeus() {
        return this.nopeus;
    }

    @Override
    public String toString() {
        return "Tuulen suunta on " + this.suunta + " ja nopeus " + this.nopeus;
    }
}