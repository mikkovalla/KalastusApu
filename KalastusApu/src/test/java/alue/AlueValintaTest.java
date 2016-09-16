/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class AlueValintaTest {

    AlueValinta paikka;

    @Before
    public void setUp() {
        paikka = new AlueValinta("meri");
    }

    @Test
    public void konstruktoriAsettaaArvon() {
        String m = "meri";
        paikka = new AlueValinta(m);
        assertEquals(paikka.getAlue(), "meri");
    }

    @Test
    public void getAluePalauttaaOikeanArvon() {
        assertEquals(paikka.toString(), "meri");
    }

}
