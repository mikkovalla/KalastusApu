/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

/**
 * Sesonki nyt luokka jonka luoma ilmentymä on tämän hetkinen sesonki.
 */
public class SesonkiNyt {

    private Kuukaudet kN;
    private Kuukausi kk;

    /**
     * Luokan konstruktorissa luodaan uusi Kuukausi luokan ilmentymä
     */
    public SesonkiNyt() {
        kk = new Kuukausi();
    }

    /**
     * Metodi hakee Kuukausi luokan ilmentymä metodillä kuukauden sesongin.
     *
     * @return palauttaa kuukauden sesongin String tyyppisenä.
     */
    public String getSesonki() {
        return kk.getKuuNimi().getKuukaudenSesonki();
    }

    /**
     * SesonkiNyt luokan toString metodi
     *
     * @return ehdon mukaan kuukausi sekä sesonki missä sesongin nimeen on
     * liitetty 'n' kirjain ellei sesonki ole TALVI tai KEVÄT.
     */
    @Override
    public String toString() {
        if (!getSesonki().equals("TALVI") || !getSesonki().equals("KEVÄT")) {
            return kk.toString() + ", eli nyt on " + getSesonki() + "n sesonki.";
        }
        return kk.toString() + ", eli nyt on " + getSesonki() + " sesonki.";
    }
}
