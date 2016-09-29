/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mikko
 */
public class Kuukausi {

    private int kuukausi;
    private Kuukaudet k;

    public Kuukausi() {
        GregorianCalendar kk = new GregorianCalendar();
        this.kuukausi = kk.get(Calendar.MONTH);
        this.kuukausi = this.kuukausi + 1;
    }

    public int getKuukausi() {
        return this.kuukausi;
    }

    public void setKuukausi(int kk) {

        while (true) {
            if (kk <= 12 || kk >= 1) {
                this.kuukausi = kk;
                break;
            } else {
                System.out.println("Syötä kuukauden numero väliltä 1 ja 12.");
            }
        }
    }

    public Kuukaudet getKuuNimi() {
        for (Kuukaudet kN : Kuukaudet.values()) {
            if (kN.getKuukausiNumero() == getKuukausi()) {
                return kN;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "On " + getKuuNimi() + "(" + this.kuukausi + ")";
    }
}
