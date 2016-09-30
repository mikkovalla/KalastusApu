/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.saa;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import saatila.saaEnum.Taivas;
import static saatila.saaEnum.Taivas.AURINKOINEN;
import static saatila.saaEnum.Taivas.PILVINEN;
import static saatila.saaEnum.Taivas.PUOLIPILVINEN;

/**
 *
 * @author mikko
 */
public class PilvisyysTest {

    private Taivas taivas;
    private Pilvisyys pilvet;

    @Before
    public void setUp() {
        pilvet = new Pilvisyys(PILVINEN);
    }

    @Test
    public void testGetPilvisyys() {
        assertEquals(pilvet.getPilvisyys(), PILVINEN);
    }

    @Test
    public void testSetPilvisyys() {
        Pilvisyys p = new Pilvisyys(AURINKOINEN);
        p.setPilvisyys(PUOLIPILVINEN);
        assertEquals(p.getPilvisyys(), PUOLIPILVINEN);
        assertEquals(pilvet.getPilvisyys(), PILVINEN);
    }
}
