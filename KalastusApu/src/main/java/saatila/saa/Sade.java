/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import saatila.saaEnum.Sateet;

/**
 *
 * @author mikko
 */
public class Sade {

    private Sateet sateet;

    public Sade(Sateet sateet) {
        this.sateet = sateet;
    }

    public void setSade(Sateet st) {
        if (st.equals(Sateet.LUMI) || st.equals(Sateet.VESI) || st.equals(Sateet.RÄNTÄ)) {
            this.sateet = st;
        }
    }

    public Sateet getSade() {
        return this.sateet;
    }

    @Override
    public String toString() {
        return this.sateet.toString();
    }
}
