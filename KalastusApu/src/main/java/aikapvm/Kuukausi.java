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
        kuukausi = kk.get(Calendar.MONTH);
        kuukausi = kuukausi + 1;
    }

    public int getKuukausi() {
        return kuukausi;
    }

    /*public static void main(String[] args) {

        Kuukausi kk = new Kuukausi();
        kk.getKuukausi();

    }*/
}