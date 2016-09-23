/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.Kuukausi;

/**
 *
 * @author mikko
 */
public class AlueValinta implements Alue {

    private String paikka;
    private String vedenVari;
    private int vedenLampo;
    private int vedenKorkeus;

    public AlueValinta(String paikka, String vari, int lampo, int korkeus) {
        this.paikka = paikka;
        this.vedenVari = vari;
        this.vedenLampo = lampo;
        this.vedenKorkeus = korkeus;
    }

    @Override
    public String getAlue() {
        return this.paikka;
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
    public String toString() {
        if (this.vedenKorkeus >= 1) {
            return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " senttimetriä plussalla";
        } else if (this.vedenKorkeus <= -1) {
            return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " senttimetriä miinuksella";
        }
        return "Alue on " + getAlue() + ", veden vari on " + vedenVari() + ", vedenlampö on " + vedenLampo() + ", ja vedenkorkeus on " + vedenKorkeus() + " eli neutraali";
    }

    @Override
    public void oletusVedenVari() {
        Kuukausi kk = new Kuukausi();

        if (this.paikka.equalsIgnoreCase("meri")) {
            if (kk.getKuukausi() >= 1 || kk.getKuukausi() <= 2) {
                setVedenVari("sinertävä");
            }
            if (kk.getKuukausi() >= 3 || kk.getKuukausi() <= 5) {
                setVedenVari("vihertävä");
            }
            if (kk.getKuukausi() >= 6 || kk.getKuukausi() <= 8) {
                setVedenVari("vihreä");
            }
            if (kk.getKuukausi() >= 9 || kk.getKuukausi() <= 12) {
                setVedenVari("vihertävä");
            }
        } else if (this.paikka.equalsIgnoreCase("jarvi")) {
            if (kk.getKuukausi() >= 1 || kk.getKuukausi() <= 2) {
                setVedenVari("kirkas ruskea");
            }
            if (kk.getKuukausi() >= 3 || kk.getKuukausi() <= 5) {
                setVedenVari("sinertävän ruskea");
            }
            if (kk.getKuukausi() >= 6 || kk.getKuukausi() <= 8) {
                setVedenVari("humuksen ruskea");
            }
            if (kk.getKuukausi() >= 9 || kk.getKuukausi() <= 12) {
                setVedenVari("vihertävä ruskea");
            }
        } else if (this.paikka.equalsIgnoreCase("joki")) {
            if (kk.getKuukausi() >= 1 || kk.getKuukausi() <= 2) {
                setVedenVari("kirkas humuksinen");
            }
            if (kk.getKuukausi() >= 3 || kk.getKuukausi() <= 5) {
                setVedenVari("likainen ruskea");
            }
            if (kk.getKuukausi() >= 6 || kk.getKuukausi() <= 8) {
                setVedenVari("humuksinen");
            }
            if (kk.getKuukausi() >= 9 || kk.getKuukausi() <= 12) {
                setVedenVari("kirkas humuksinen");
            }
        }
    }
}
