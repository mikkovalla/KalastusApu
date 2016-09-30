/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

/**
 * @author mikko
 */
public class SesonkiNyt {

    private Kuukaudet kN;
    private Kuukausi kk;

    public SesonkiNyt() {
        kk = new Kuukausi();
    }

    public String getSesonki() {
        return kk.getKuuNimi().getKuukaudenSesonki();
    }

    @Override
    public String toString() {
        if (!getSesonki().equals("TALVI") || !getSesonki().equals("KEVÄT")) {
            return kk.toString() + ", eli nyt on " + getSesonki() + "n sesonki.";
        }
        return kk.toString() + ", eli nyt on " + getSesonki() + " sesonki.";
    }
}
