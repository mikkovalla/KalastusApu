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
public class Meri extends AlueValinta {

    private final String paikka;
    private String vedenVari;
    private int lampotila;
    private int vedenKorkeus;

    public Meri(String paikka, String vari, int lampo, int korkeus) {
        super(paikka, vari, lampo, korkeus);
        this.paikka = "Meri";
        this.vedenVari = vari;
        this.lampotila = lampo;
        this.vedenKorkeus = korkeus;
    }

    @Override
    public void setVedenVari(String vari) {
        this.vedenVari = vari;
    }

    @Override
    public void setVedenLampo(int lampo) {
        this.lampotila = lampo;
    }

    @Override
    public void setVedenKorkeus(int korkeus) {
        this.vedenKorkeus = korkeus;
    }

    @Override
    public String vedenVari() {
        if (this.vedenVari.isEmpty()) {
            super.vedenVari();
            return vedenVari();
        }
        return this.vedenVari;
    }

    @Override
    public int vedenLampo() {
        return this.lampotila;
    }

    @Override
    public int vedenKorkeus() {
        return this.vedenKorkeus;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
