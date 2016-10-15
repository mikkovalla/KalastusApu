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
 * Kuukausi luokka.
 */
public class Kuukausi {

    private int kuukausi;

    /**
     * Kuukausi luokan konstruktori. Konstruktori luo kuukausi olion tämän
     * hetkisen kuukauden perusteella käyttämällä javan GregorianCalendar
     * luokkaa. This.kuukausi + 1 tarvitaan jotta saadaan oikea kuukauden numero
     *
     */
    public Kuukausi() {
        GregorianCalendar kk = new GregorianCalendar();
        this.kuukausi = kk.get(Calendar.MONTH);
        this.kuukausi = this.kuukausi + 1;
    }

    public int getKuukausi() {
        return this.kuukausi;
    }

    /**
     * Boolean Metodissa if lause tarkistaa että kk muuttuja on arvoväliltä 1 ja
     * 12.
     *
     * @param kk on int tyyppinen joka vastaa haluttua kuukautta.
     * @return true jos arvo on oikea ja aseta parametrinä saatu arvo. False jos
     * parametrinä annettu arvo on väärä.
     */
    public boolean setKuukausi(int kk) {
        if (kk > 12 || kk < 1) {
            return false;
        }
        this.kuukausi = kk;
        return true;
    }

    /**
     * Metodi käy läpi for loopilla Kuukaudet vakio arvot, ja if lause tarkistaa
     * minkä vakio arvon numero vastaa kuukausi luokan this.kuukausi arvoa.
     *
     * @return kuukaudetVakio vastaa Enum luokan Kuukaudet vakio arvoa.
     */
    public Kuukaudet getKuuNimi() {
        for (Kuukaudet kuukaudetVakio : Kuukaudet.values()) {
            if (kuukaudetVakio.getKuukausiNumero() == getKuukausi()) {
                return kuukaudetVakio;
            }
        }
        return null;
    }

    /**
     * toString metodi luokalle Kuukausi.
     *
     * @return kuukauden nimi ja numero.
     */
    @Override
    public String toString() {
        return "On " + getKuuNimi() + "(" + this.kuukausi + ")";
    }
}
