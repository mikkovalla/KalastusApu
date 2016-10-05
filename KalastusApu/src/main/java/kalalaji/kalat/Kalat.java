/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalat;

import aikapvm.SesonkiNyt;
import kalalaji.esiintyminen.*;
import kalalaji.kalastustapa.*;

/**
 *
 * @author mikko
 */
public enum Kalat {
    //Lisättynä vain hauki jotta ohjelma pysyisi siedettävässä mittakaavassa tässä vaiheessa.
    //Ahven, Kuha, Taimen;
    Hauki(HaukiEsiintyminen.HAUKI);

    private Esiintyminen es;
    private Kalastustapa kt;
    private SesonkiNyt sn = new SesonkiNyt();

    Kalat(Esiintyminen es) {
        this.es = es;
    }

    public String esiintyySesonginMukaan() {
        return es.esiintyySesonginMukaan(es, sn);
    }
}
