/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.esiintyminen;

import aikapvm.SesonkiNyt;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class HaukiEsiintyminenTest {

    private HaukiEsiintyminen hauki;
    private SesonkiNyt sn = new SesonkiNyt();
    private String talvi;
    private String kevat;
    private String kesa;
    private String syksy;

    @Before
    public void setUp() {

        hauki = HaukiEsiintyminen.HAUKI;
        this.talvi = hauki.getTalviEsiintyminen();
        this.kevat = hauki.getKevatEsiintyminen();
        this.kesa = hauki.getKesaEsiintyminen();
        this.syksy = hauki.getSyksyEsiintyminen();
    }

    @Test
    public void testGetTalviEsiintyminen() {
        assertEquals(hauki.getTalviEsiintyminen(), this.talvi);
    }

    @Test
    public void testGetKevatEsiintyminen() {
        assertEquals(hauki.getKevatEsiintyminen(), this.kevat);
    }

    @Test
    public void testGetKesaEsiintyminen() {
        assertEquals(hauki.getKesaEsiintyminen(), this.kesa);
    }

    @Test
    public void testGetSyksyEsiintyminen() {
        assertEquals(hauki.getSyksyEsiintyminen(), this.syksy);
    }

    @Test
    public void testEsiintyySesonginMukaan() {
        String esiintyy = hauki.esiintyySesonginMukaan(hauki, sn);
        assertEquals(esiintyy, this.syksy);
    }

}
