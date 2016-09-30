/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.SesonkiNyt;

/**
 *
 * @author mikko
 */
public class AlueValinta implements Alue {

    private SesonkiNyt sn;
    private String vedenVari;
    private int vedenLampo;
    private int vedenKorkeus;
    private Vesi vesi;

    public AlueValinta(Vesi vesi, String vari, int lampo, int korkeus) {
        this.vesi = vesi;
        this.vedenVari = vari;
        this.vedenLampo = lampo;
        this.vedenKorkeus = korkeus;
    }

    @Override
    public String getAlue() {
        return this.vesi.name();
    }

    public void setVedenVari(String vari) {
        this.vedenVari = vari;
    }

    @Override
    public String vedenVari() {
        if (this.vedenVari.isEmpty()) {
            oletusVedenVari();
            return vedenVari();
        }
        return this.vedenVari;
    }

    public void setVedenLampo(int lampo) {
        try {
            if (lampo > 0) {
                this.vedenLampo = lampo;
            }
        } catch (Exception e) {
            System.out.println("Anna vedenlampo joka on yli 0 " + e);
        }
    }

    @Override
    public int vedenLampo() {
        return this.vedenLampo;
    }

    public void setVedenKorkeus(int korkeus) {
        this.vedenKorkeus = korkeus;
    }

    @Override
    public int vedenKorkeus() {
        return this.vedenKorkeus;
    }

    @Override
    public void oletusVedenVari() {
        setVedenVari(vesi.getSavySesonginMukaan(vesi, sn));
    }

    @Override
    public String toString() {
        if (this.vedenKorkeus >= 1) {
            return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " senttimetriä plussalla";
        } else if (this.vedenKorkeus <= -1) {
            return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " senttimetriä miinuksella";
        }
        return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " eli neutraali";
    }
}
