/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import saatila.saa.Tuuli;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static saatila.vakiot.Tuulensuunta.ETELA;
import static saatila.vakiot.Tuulensuunta.LOUNAS;
import static saatila.vakiot.Tuulensuunta.POHJOINEN;

/**
 *
 * @author mikko
 */
public class TuuliTest {

    private Tuuli tuuli;

    @Before
    public void setUp() {
        tuuli = new Tuuli(ETELA, 10);
    }

    @Test
    public void konstruktoriAsettaaAnnetutParametrit() {
        Tuuli t = new Tuuli(POHJOINEN, 2);
        assertEquals(t.getNopeus(), 2);
        assertEquals(t.getSuunta(), POHJOINEN);
    }

    @Test
    public void testSetSuunta() {
        tuuli.setSuunta(LOUNAS);
        assertEquals(tuuli.getSuunta(), LOUNAS);
    }

    @Test
    public void testSetNopeus() {
        tuuli.setNopeus(12);
        assertEquals(tuuli.getNopeus(), 12);
    }

    @Test
    public void testGetSuunta() {
        assertEquals(tuuli.getSuunta(), ETELA);
    }

    @Test
    public void testGetNopeus() {
        assertEquals(tuuli.getNopeus(), 10);
    }
}
