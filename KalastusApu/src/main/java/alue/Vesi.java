/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.SesonkiNyt;

/**
 *
 * Vesi Enum luokka joka asettaa vakio arvot MERI, JOKI ja JÄRVI, sekä niille
 * sesongin mukaiset oletus veden värit.
 */
public enum Vesi {

    MERI("sinertävän vihreä", "kirkas vihertävä", "ruskean vihertävä", "tumman vihertävä"),
    JÄRVI("kirkas humuksinen", "likaisen humuksinen", "vihertävän humuksinen", "tumman humuksinen"),
    JOKI("kirkkaan humuksinen", "likaisen ruskean humuksinen", "ruskean vihertävä", "tumman humuksinen");

    private String savyTalvi;
    private String savyKevat;
    private String savyKesa;
    private String savySyksy;

    /**
     * Konstruktori joka asettaa Vakio arvolle oletusvedenvärit.
     *
     * @param savyTalvi asettaa String tyyppisenä oletus veden värin Talvi
     * sesongille.
     * @param savyKevat asettaa String tyyppisen oletus veden värin Kevät
     * sesongille.
     * @param savyKesa asettaa String tyyppisen oletus vedenvärin Kesä
     * sesongille.
     * @param savySyksy asettaa String tyyppisen oletus vedenvärin Syys
     * sesongille.
     */
    Vesi(String savyTalvi, String savyKevat, String savyKesa, String savySyksy) {
        this.savyTalvi = savyTalvi;
        this.savyKevat = savyKevat;
        this.savyKesa = savyKesa;
        this.savySyksy = savySyksy;
    }

    public String getSavyTalvi() {
        return this.savyTalvi;
    }

    public String getSavyKevat() {
        return this.savyKevat;
    }

    public String getSavyKesa() {
        return this.savyKesa;
    }

    public String getSavySyksy() {
        return this.savySyksy;
    }

    /**
     * Metodi palauttaa vakio arvolle annetun oletus vedenvärin sesongista
     * riippuen. Sesonki tulee SesonkiNyt luokan ilmentymästä sn, ja Vesi luokan
     * vakio arvo Vesi vesi arvosta. Metodi saa nämä parametreina.
     *
     * @param vesi on Enum luokan Vesi vakio
     * @param sn SesonkiNyt luokan ilmentymä
     * @return palauttaa vesi vakion metodin mukaisen string tyyppisen vedenväri
     * arvon joka vastaa SesonkiNyt määrittelemää sesonkia.
     */
    public String getSavySesonginMukaan(Vesi vesi, SesonkiNyt sn) {
        sn = new SesonkiNyt();
        switch (sn.getSesonki()) {
            case "TALVI":
                return vesi.getSavyTalvi();
            case "KEVÄT":
                return vesi.getSavyKevat();
            case "KESÄ":
                return vesi.getSavyKesa();
            case "SYKSY":
                return vesi.getSavySyksy();
            default:
                return "Veden sävyä ei voitu antaa";
        }
    }
}
