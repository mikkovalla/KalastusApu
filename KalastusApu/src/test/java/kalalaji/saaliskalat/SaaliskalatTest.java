/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.saaliskalat;

import aikapvm.SesonkiNyt;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mikko
 */
public class SaaliskalatTest {

    private String talvi;
    private String kevat;
    private String kesa;
    private String syksy;
    Saaliskalat saalis;

    @Before
    public void setUp() {
        saalis = Saaliskalat.HAUKI;
        this.talvi = "Made, Siika, Taimen, Ahven, Särki, Lahna, Säyne, Sulkava.";
        this.kevat = "Ahven, Lahna, Säyne, Siika, Särki, Sulkava, Hauki, Kuha, Silakka.";
        this.kesa = "Ahven, Säyne, Särki, Sulkava, Silakka, Hauki.";
        this.syksy = "Ahven, Salakka, Särki, Lahna, Säyne, Silakka.";
    }

    @Test
    public void testGetTalviSaalisKalat() {
        assertEquals(saalis.getTalviSaalisKalat(), this.talvi);
    }

    @Test
    public void testGetKevatSaalisKalat() {
        assertEquals(saalis.getKevatSaalisKalat(), this.kevat);
    }

    @Test
    public void testGetKesaSaalisKalat() {
        assertEquals(saalis.getKesaSaalisKalat(), this.kesa);
    }

    @Test
    public void testGetSyksySaalisKalat() {
        assertEquals(saalis.getSyksySaalisKalat(), this.syksy);
    }

    @Test
    public void testSaalisSesonginMukaan() {
        SesonkiNyt sesonkinyt = new SesonkiNyt();
        String sesonginMukaan = saalis.saalisSesonginMukaan(Saaliskalat.HAUKI, sesonkinyt);
        assertEquals(sesonginMukaan, this.syksy);
    }

}
