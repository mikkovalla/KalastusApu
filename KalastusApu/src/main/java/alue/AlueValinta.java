/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.SesonkiNyt;

/**
 *
 * AlueValinta luokka joka toteuttaa Alue rajapinnan.
 */
public class AlueValinta implements Alue {

    private SesonkiNyt sn;
    private String vedenVari;
    private int vedenLampo;
    private int vedenKorkeus;
    private Vesi vesi;

    /**
     * Konstruktori luo alueen ilmentymän.
     *
     * @param vesi on Enum luokka Vesi vakio arvo.
     * @param vari käyttäjän valitsema tai oletus vedenväri.
     * @param lampo käyttäjän asettama veden lämpö.
     * @param korkeus käyttäjän asettama vedenkorkeus.
     */
    public AlueValinta(String vesi, String vari, int lampo, int korkeus) {
        this.vesi = getVesiVakio(vesi);
        this.vedenVari = vari;
        this.vedenLampo = lampo;
        this.vedenKorkeus = korkeus;
    }

    /**
     * Rajapinnasta peritty metodi joka ylikirjoitetaan.
     *
     * @return palauttaa Vesi Enum vakio arvon string tyyppisenä .name() metodin
     * kautta.
     */
    @Override
    public String getAlue() {
        return this.vesi.name();
    }

    public void setVedenVari(String vari) {
        this.vedenVari = vari;
    }

    /**
     * Rajapinnasta peritty metodi joka on ylikirjoitettu. Metodissa
     * tarkistetaan jos konstruktorissa annettu arvo väri on tyhjä, niin
     * asetetaan väriksi oletus veden väri.
     *
     * @return palauttaa ehdosta riippuen joko oletus vedenvärin tai
     * konstruktorissa asetetun vedenvärin string tyyppisenä.
     */
    @Override
    public String vedenVari() {
        if (this.vedenVari.isEmpty()) {
            oletusVedenVari();
            return vedenVari();
        }
        return this.vedenVari;
    }

    /**
     * Metodi tarkistaa onko parametri sallittu lämpö arvo, ja joko asettaa sen
     * tai antaa virhe ilmoituksen.
     *
     * @param lampo asettaa vedenlämmöksi parametrinä syötetyn int tyyppisen
     * arvon jos se on ehto lauseessa sallittu arvo.
     */
    public void setVedenLampo(int lampo) {
        if (lampo > 0) {
            this.vedenLampo = lampo;
        } else {
            this.vedenLampo = 14;
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

    /**
     * Rajapinnasta peritty ylikirjoitettu metodi joka asettaa oletusveden
     * värin. setVedenVari metodi saa parametrinä Vesi Enum luokan metodin.
     */
    @Override
    public void oletusVedenVari() {
        setVedenVari(vesi.getSavySesonginMukaan(vesi, sn));
    }

    /**
     * Metodi joka palauttaa string parametristä Enum vastaavan arvon.
     *
     * @param vesi String tyyppinen parametri.
     * @return Enum vakio arvo.
     */
    public static Vesi getVesiVakio(String vesi) {
        switch (vesi.toUpperCase()) {
            case "MERI":
                return Vesi.MERI;
            case "JARVI":
                return Vesi.JARVI;
            case "JOKI":
                return Vesi.JOKI;
            default:
                return Vesi.MERI;
        }
    }

    /**
     * toString metodi.
     *
     * @return palauttaa veden korkeuden mukaan alue kohtaiset tiedot.
     */
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
