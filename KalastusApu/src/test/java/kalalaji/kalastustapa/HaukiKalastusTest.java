/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import aikapvm.SesonkiNyt;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HaukiKalastusTest {

    private KalastustapaYleinen hauki;
    private final SesonkiNyt sn = new SesonkiNyt();
    private String talvi;
    private String kevat;
    private String kesa;
    private String syksy;

    @Before
    public void setUp() {
        hauki = KalastustapaYleinen.HAUKI;
        this.talvi = hauki.getTalviKalastus();
        this.kevat = hauki.getKevatKalastus();
        this.kesa = hauki.getKesaKalastus();
        this.syksy = hauki.getSyksyKalastus();
    }

    @Test
    public void testGetTalviKalastus() {
        assertEquals(hauki.getTalviKalastus(), this.talvi);
    }

    @Test
    public void testGetKevatKalastus() {
        assertEquals(hauki.getKevatKalastus(), this.kevat);
    }

    @Test
    public void testGetKesaKalastus() {
        assertEquals(hauki.getKesaKalastus(), this.kesa);
    }

    @Test
    public void testGetSyksyKalastus() {
        assertEquals(hauki.getSyksyKalastus(), this.syksy);
    }

    @Test
    public void testKalastusSesonginMukaan() {
        String k = hauki.kalastusSesonginMukaan(hauki, sn);
        assertEquals(k, this.syksy);
    }

}
