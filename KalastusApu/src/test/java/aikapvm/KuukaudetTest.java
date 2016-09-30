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
        assertEquals(Kuukaudet.SYYSKUU.getKuukausiNumero(), 9);
    }

    @Test
    public void testGetKuukaudenSesonki() {
        assertEquals(Kuukaudet.TAMMIKUU.getKuukaudenSesonki(), "TALVI");
    }
}
