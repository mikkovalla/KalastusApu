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
public enum Vesi {

    MERI("sinertävän vihreä", "kirkas vihertävä", "ruskean vihertävä", "tumman vihertävä"),
    JÄRVI("kirkas humuksinen", "likaisen humuksinen", "vihertävän humuksinen", "tumman humuksinen"),
    JOKI("kirkkaan humuksinen", "likaisen ruskean humuksinen", "ruskean vihertävä", "tumman humuksinen");

    private String savyTalvi;
    private String savyKevat;
    private String savyKesa;
    private String savySyksy;

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
