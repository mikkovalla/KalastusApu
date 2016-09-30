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
public class SesonkiNytTest {

    private Kuukaudet kN;
    private Kuukausi kk;

    public SesonkiNytTest() {
        kk = new Kuukausi();
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetSesonki() {
        String sesonki = Kuukaudet.LOKAKUU.getKuukaudenSesonki();
        assertEquals(Kuukaudet.LOKAKUU.getKuukaudenSesonki(), sesonki);
    }
}
