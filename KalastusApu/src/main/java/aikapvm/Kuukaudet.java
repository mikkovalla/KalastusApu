/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

/**
 *
 * @author mikko
 */
public enum Kuukaudet {

    TAMMIKUU(1, "TALVI"), HELMIKUU(2, "TALVI"), MAALISKUU(3, "KEVÄT"),
    HUHTIKUU(4, "KEVÄT"), TOUKOKUU(5, "KEVÄT"), KESÄKUU(6, "KESÄ"), HEINÄKUU(7, "KESÄ"),
    ELOKUU(8, "KESÄ"), SYYSKUU(9, "SYKSY"), LOKAKUU(10, "SYKSY"), MARRASKUU(11, "SYKSY"), JOULUKUU(12, "TALVI");

    private int kuukausiNumero;
    private String sesonki;

    Kuukaudet(int kn, String sesonki) {
        this.kuukausiNumero = kn;
        this.sesonki = sesonki;
    }

    public int getKuukausiNumero() {
        return this.kuukausiNumero;
    }

    public String getKuukaudenSesonki() {
        return this.sesonki;
    }
}
