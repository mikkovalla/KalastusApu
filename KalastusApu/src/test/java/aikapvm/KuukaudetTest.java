/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aikapvm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class KuukaudetTest {

    Kuukaudet kn;
    private int kuukausiNumero;
    private String sesonki;

    @Before
    public void setUp() {
    }

    @Test
    public void testKuukaudetValues() {
        Kuukaudet[] haettu = {kn.TAMMIKUU, kn.HELMIKUU, kn.MAALISKUU, kn.HUHTIKUU,
            kn.TOUKOKUU, kn.KESÄKUU, kn.HEINÄKUU, kn.ELOKUU,
            kn.SYYSKUU, kn.LOKAKUU, kn.MARRASKUU, kn.JOULUKUU};
        Kuukaudet[] haluttu = Kuukaudet.values();
        assertArrayEquals(haettu, haluttu);
    }

    @Test
    public void testGetKuukausiNumero() {
        assertEquals(Kuukaudet.TAMMIKUU.getKuukausiNumero(), 1);
        assertEquals(Kuukaudet.HELMIKUU.getKuukausiNumero(), 2);
        assertEquals(Kuukaudet.MAALISKUU.getKuukausiNumero(), 3);
        assertEquals(Kuukaudet.HUHTIKUU.getKuukausiNumero(), 4);
        assertEquals(Kuukaudet.TOUKOKUU.getKuukausiNumero(), 5);
        assertEquals(Kuukaudet.KESÄKUU.getKuukausiNumero(), 6);
        assertEquals(Kuukaudet.HEINÄKUU.getKuukausiNumero(), 7);
        assertEquals(Kuukaudet.ELOKUU.getKuukausiNumero(), 8);
        assertEquals(Kuukaudet.SYYSKUU.getKuukausiNumero(), 9);
        assertEquals(Kuukaudet.LOKAKUU.getKuukausiNumero(), 10);
        assertEquals(Kuukaudet.MARRASKUU.getKuukausiNumero(), 11);
        assertEquals(Kuukaudet.JOULUKUU.getKuukausiNumero(), 12);
    }

    @Test
    public void testGetKuukaudenSesonki() {
        assertEquals(Kuukaudet.JOULUKUU.getKuukaudenSesonki(), "TALVI");
        assertEquals(Kuukaudet.TAMMIKUU.getKuukaudenSesonki(), "TALVI");
        assertEquals(Kuukaudet.HELMIKUU.getKuukaudenSesonki(), "TALVI");
        assertEquals(Kuukaudet.MAALISKUU.getKuukaudenSesonki(), "KEVAT");
        assertEquals(Kuukaudet.HUHTIKUU.getKuukaudenSesonki(), "KEVAT");
        assertEquals(Kuukaudet.TOUKOKUU.getKuukaudenSesonki(), "KEVAT");
        assertEquals(Kuukaudet.KESÄKUU.getKuukaudenSesonki(), "KESA");
        assertEquals(Kuukaudet.HEINÄKUU.getKuukaudenSesonki(), "KESA");
        assertEquals(Kuukaudet.ELOKUU.getKuukaudenSesonki(), "KESA");
        assertEquals(Kuukaudet.SYYSKUU.getKuukaudenSesonki(), "SYKSY");
        assertEquals(Kuukaudet.LOKAKUU.getKuukaudenSesonki(), "SYKSY");
        assertEquals(Kuukaudet.MARRASKUU.getKuukaudenSesonki(), "SYKSY");
    }
}
