/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

/**
 *
 * @author mikko
 */
public class AlueValinta implements Alue {

    private String paikka;

    public AlueValinta(String paikka) {
        this.paikka = paikka;
    }

    @Override
    public String getAlue() {
        return this.paikka;
    }

    @Override
    public String toString() {
        return this.paikka;
    }
}
