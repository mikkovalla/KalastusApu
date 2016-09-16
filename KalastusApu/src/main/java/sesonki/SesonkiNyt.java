/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesonki;

import aikapvm.Kuukausi;
import java.util.Date;

/**
 * @author mikko
 */
public class SesonkiNyt implements Sesonki {

    Kuukausi k;
    private String sesonki;

    public SesonkiNyt() {
        sesonki = this.sesonki;
        k = new Kuukausi();
    }

    @Override
    public String getSesonki() {
        if (k.getKuukausi() == 1) {
            this.sesonki = "Talvi";
        }
        if (k.getKuukausi() == 2) {
            this.sesonki = "Talvi";
        }
        if (k.getKuukausi() == 3) {
            this.sesonki = "Kevät";
        }
        if (k.getKuukausi() == 4) {
            this.sesonki = "Kevät";
        }
        if (k.getKuukausi() == 5) {
            this.sesonki = "Kevät";
        }
        if (k.getKuukausi() == 6) {
            this.sesonki = "Kesä";
        }
        if (k.getKuukausi() == 7) {
            this.sesonki = "Kesä";
        }
        if (k.getKuukausi() == 8) {
            this.sesonki = "Kesä";
        }
        if (k.getKuukausi() == 9) {
            this.sesonki = "Syksy";
        }
        if (k.getKuukausi() == 10) {
            this.sesonki = "Syksy";
        }
        if (k.getKuukausi() == 11) {
            this.sesonki = "Syksy";
        }
        if (k.getKuukausi() == 12) {
            this.sesonki = "Talvi";
        }
        return this.sesonki;
    }
}
