/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import saatila.saaEnum.Sateet;
import static saatila.saaEnum.Sateet.LUMI;
import static saatila.saaEnum.Sateet.VESI;

/**
 *
 * @author mikko
 */
public class SadeTest {

    private Sateet st;
    private Sade s;

    @Before
    public void setUp() {
        s = new Sade(VESI);
    }

    @Test
    public void testSetSade() {
        s.setSade(LUMI);
        assertEquals(s.getSade(), LUMI);
    }

    @Test
    public void testGetSade() {
        assertEquals(s.getSade(), VESI);
    }

}
