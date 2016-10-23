/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.Kuukaudet;
import aikapvm.Kuukausi;
import aikapvm.SesonkiNyt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class VesiTest {

    public VesiTest() {
    }

    @Test
    public void testGetSavyTalvi() {
        assertEquals(Vesi.MERI.getSavyTalvi(), "sinertävän vihreä");
        assertEquals(Vesi.JOKI.getSavyTalvi(), "kirkkaan humuksinen");
        assertEquals(Vesi.JARVI.getSavyTalvi(), "kirkas humuksinen");
    }

    @Test
    public void testGetSavyKevat() {
        assertEquals(Vesi.MERI.getSavyKevat(), "kirkas vihertävä");
        assertEquals(Vesi.JOKI.getSavyKevat(), "likaisen ruskean humuksinen");
        assertEquals(Vesi.JARVI.getSavyKevat(), "likaisen humuksinen");
    }

    @Test
    public void testGetSavyKesa() {
        assertEquals(Vesi.MERI.getSavyKesa(), "ruskean vihertävä");
        assertEquals(Vesi.JOKI.getSavyKesa(), "ruskean vihertävä");
        assertEquals(Vesi.JARVI.getSavyKesa(), "vihertävän humuksinen");
    }

    @Test
    public void testGetSavySyksy() {
        assertEquals(Vesi.MERI.getSavySyksy(), "tumman vihertävä");
        assertEquals(Vesi.JOKI.getSavySyksy(), "tumman humuksinen");
        assertEquals(Vesi.JARVI.getSavySyksy(), "tumman humuksinen");
    }

    @Test
    public void testGetSavySesonginMukaan() {
        System.out.println("getSavySesonginMukaan");
        Vesi vesiMeri = Vesi.MERI;
        Vesi vesiJarvi = Vesi.JARVI;
        Vesi vesiJoki = Vesi.JOKI;
        SesonkiNyt sn = new SesonkiNyt();

        assertEquals(vesiMeri.getSavySesonginMukaan(vesiMeri, sn), Vesi.MERI.getSavySyksy());
        assertEquals(vesiJarvi.getSavySesonginMukaan(vesiJarvi, sn), Vesi.JARVI.getSavySyksy());
        assertEquals(vesiJoki.getSavySesonginMukaan(vesiJoki, sn), Vesi.JOKI.getSavySyksy());

    }

    @Test
    public void testGetSavySwitchCaseTalvi() {
        SesonkiNyt sesonkinyt = new SesonkiNyt();
        switch (sesonkinyt.getSesonki()) {
            case "TALVI":
                assertEquals(Vesi.MERI.getSavyTalvi(), "sinertävän vihreä");
            case "KEVAT":
                assertEquals(Vesi.MERI.getSavyKevat(), "kirkas vihertävä");
            case "KESA":
                assertEquals(Vesi.MERI.getSavyKesa(), "ruskean vihertävä");
            case "SYKSY":
                assertEquals(Vesi.MERI.getSavySyksy(), "tumman vihertävä");
            default:
                assertEquals("Veden sävyä ei voitu antaa", "Veden sävyä ei voitu antaa");
        }
    }
}
