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

    public Kuukausi() {
        GregorianCalendar kk = new GregorianCalendar();
        this.kuukausi = kk.get(Calendar.MONTH);
        this.kuukausi = this.kuukausi + 1;
    }

    public int getKuukausi() {
        return kuukausi;
    }

    public void setKuukausi(int kk) {
        this.kuukausi = kk;
    }
}
