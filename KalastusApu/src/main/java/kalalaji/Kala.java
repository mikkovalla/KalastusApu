/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji;

import aikapvm.SesonkiNyt;

/**
 *
 * @author mikko
 */
public class Kala implements Kalalaji {

    SesonkiNyt sn;
    private String laji;
    private String esiintyy;

    public Kala(String laji) {
        this.laji = laji;
        this.esiintyy = "";
        sn = new SesonkiNyt();
    }

    @Override
    public void setLaji(String laji) {
        this.laji = laji;
    }

    @Override
    public String getLaji() {
        return this.laji;
    }

    @Override
    public void setEsiintyminen(String es) {
        this.esiintyy = es;
    }

    @Override
    public String getEsiintyminen() {
        return this.esiintyy;
    }

    @Override
    public String toString() {
        return this.laji + " vuodenaikaan " + sn.getSesonki() + " esiintyy seuraavilla alueilla " + this.esiintyy;
    }

}
