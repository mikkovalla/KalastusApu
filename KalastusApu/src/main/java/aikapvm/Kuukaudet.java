/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

/**
 *
 * Kuukaudet Enum luokka tarjoaa Kuukaudet vakio arvoina, sekä kuukauden numeron
 * ja Sesongin nimen. Tämä selventää huomattavasti kuukauden hakua ja sesongin
 * hakua kuukauden perusteella.
 */
public enum Kuukaudet {

    TAMMIKUU(1, "TALVI"), HELMIKUU(2, "TALVI"), MAALISKUU(3, "KEVÄT"),
    HUHTIKUU(4, "KEVÄT"), TOUKOKUU(5, "KEVÄT"), KESÄKUU(6, "KESÄ"), HEINÄKUU(7, "KESÄ"),
    ELOKUU(8, "KESÄ"), SYYSKUU(9, "SYKSY"), LOKAKUU(10, "SYKSY"), MARRASKUU(11, "SYKSY"), JOULUKUU(12, "TALVI");

    private int kuukausiNumero;
    private String sesonki;

    /**
     *
     * @param kn on kuukauden numero joka asettaa kullekkin kuukauden arvolle
     * tätä vastaavan numerollisen arvon.
     * @param sesonki on String tyyppinen ja kertoo mikä sesonki vallitsee
     * tietyn kuukauden aikana.
     *
     * Kuukaudet Enum luokan konstruktori.
     */
    Kuukaudet(int kn, String sesonki) {
        this.kuukausiNumero = kn;
        this.sesonki = sesonki;
    }

    /**
     *
     * Metodi palauttaa kuukauden numeron int tyyppisenä.
     */
    public int getKuukausiNumero() {
        return this.kuukausiNumero;
    }

    /**
     *
     * Metodi palauttaa kuukauden sesongin String muodossa.
     */
    public String getKuukaudenSesonki() {
        return this.sesonki;
    }
}
