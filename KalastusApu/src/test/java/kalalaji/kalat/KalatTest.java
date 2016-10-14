/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalat;

import aikapvm.SesonkiNyt;
import kalalaji.esiintyminen.*;
import kalalaji.kalastustapa.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class KalatTest {

    private KalastustapaYleinen haukiKalastus;
    private Esiintyminen haukiEsiintyminen;
    Esiintyminen es;
    KalastustapaYleinen kt;
    private SesonkiNyt sn = new SesonkiNyt();
    private String talviKalastus;
    private String kevatKalastus;
    private String kesaKalastus;
    private String syksyKalastus;
    private String talviEs;
    private String kevatEs;
    private String kesaEs;
    private String syksyEs;

    @Before
    public void setUp() {
        haukiKalastus = KalastustapaYleinen.HAUKI;
        haukiEsiintyminen = Esiintyminen.HAUKI;
        this.talviKalastus = haukiKalastus.getTalviKalastus();
        this.kevatKalastus = haukiKalastus.getKevatKalastus();
        this.kesaKalastus = haukiKalastus.getKesaKalastus();
        this.syksyKalastus = haukiKalastus.getSyksyKalastus();
        this.talviEs = haukiEsiintyminen.getTalviEsiintyminen();
        this.kevatEs = haukiEsiintyminen.getKevatEsiintyminen();
        this.kesaEs = haukiEsiintyminen.getKesaEsiintyminen();
        this.syksyEs = haukiEsiintyminen.getSyksyEsiintyminen();
    }

    @Test
    public void testValueOf() {
        assertEquals(haukiKalastus.getTalviKalastus(), this.talviKalastus);
        assertEquals(haukiKalastus.getKevatKalastus(), this.kevatKalastus);
        assertEquals(haukiKalastus.getKesaKalastus(), this.kesaKalastus);
        assertEquals(haukiKalastus.getSyksyKalastus(), this.syksyKalastus);
        assertEquals(haukiEsiintyminen.getTalviEsiintyminen(), this.talviEs);
        assertEquals(haukiEsiintyminen.getKevatEsiintyminen(), this.kevatEs);
        assertEquals(haukiEsiintyminen.getKesaEsiintyminen(), this.kesaEs);
        assertEquals(haukiEsiintyminen.getSyksyEsiintyminen(), this.syksyEs);
    }

    @Test
    public void testEsiintyySesonginMukaan() {
        String esm = haukiEsiintyminen.esiintyySesonginMukaan(haukiEsiintyminen, sn);
        assertEquals(esm, this.syksyEs);
    }

    @Test
    public void testKalastustapaSesonginMukaan() {
        String ksm = haukiKalastus.kalastusSesonginMukaan(haukiKalastus, sn);
        assertEquals(ksm, this.syksyKalastus);
    }

}
