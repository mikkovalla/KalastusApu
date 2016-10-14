/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.saaliskalat;

import aikapvm.SesonkiNyt;

/**
 * Saaliskalat vakio luokka jossa esiintyy sesongin mukaiset saaliskalat.
 */
public enum Saaliskalat {

    HAUKI(//Talvi
            "Made, Siika, Taimen, Ahven, Särki, Lahna, Säyne, Sulkava.",
            //Kevät
            "Ahven, Lahna, Säyne, Siika, Särki, Sulkava, Hauki, Kuha, Silakka.",
            //Kesä
            "Ahven, Säyne, Särki, Sulkava, Silakka, Hauki.",
            //Syksy
            "Ahven, Salakka, Särki, Lahna, Säyne, Silakka.");

    private final String talvi;
    private final String kevat;
    private final String kesa;
    private final String syksy;

    /**
     * Vakio luokan konstruktori.
     *
     * @param talvi on saaliskalojen nimet talvella.
     * @param kevat on saaliskalojen nimet keväällä.
     * @param kesa on saaliskalojen nimet kesällä.
     * @param syksy on saaliskalojen nimet syksyllä.
     */
    Saaliskalat(String talvi, String kevat, String kesa, String syksy) {
        this.talvi = talvi;
        this.kevat = kevat;
        this.kesa = kesa;
        this.syksy = syksy;
    }

    public String getTalviSaalisKalat() {
        return this.talvi;
    }

    public String getKevatSaalisKalat() {
        return this.kevat;
    }

    public String getKesaSaalisKalat() {
        return this.kesa;
    }

    public String getSyksySaalisKalat() {
        return this.syksy;
    }

    /**
     *
     * Metodi hakee saaliskalat sesongin mukaan.
     *
     * @param saaliskalat saaliskalat vakio luokka.
     * @param sesonkinyt SesonkiNyt olio.
     * @return vakio arvon saalis sesongin mukkan String tyyppisenä.
     */
    public String saalisSesonginMukaan(Saaliskalat saaliskalat, SesonkiNyt sesonkinyt) {
        sesonkinyt = new SesonkiNyt();
        switch (sesonkinyt.getSesonki()) {
            case "TALVI":
                return saaliskalat.getTalviSaalisKalat();
            case "KEVÄT":
                return saaliskalat.getKevatSaalisKalat();
            case "KESÄ":
                return saaliskalat.getKesaSaalisKalat();
            case "SYKSY":
                return saaliskalat.getSyksySaalisKalat();
            default:
                return "Jotain meni pieleen.";
        }
    }

}
