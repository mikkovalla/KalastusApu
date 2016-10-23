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
    private SesonkiNyt sesonki;

    public SesonkiNytTest() {
        kk = new Kuukausi();
    }

    @Before
    public void setUp() {
        sesonki = new SesonkiNyt();
    }

    @Test
    public void testGetSesonki() {
        String test = Kuukaudet.LOKAKUU.getKuukaudenSesonki();
        assertEquals(Kuukaudet.LOKAKUU.getKuukaudenSesonki(), test);
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
        assertEquals(Kuukaudet.JOULUKUU.getKuukaudenSesonki(), "TALVI");
    }

    @Test
    public void testToStringMuut() {
        assertEquals(sesonki.toString(), kk.toString() + ", eli nyt on " + sesonki.getSesonki() + "n sesonki.");
    }

    @Test
    public void testToStringKevat() {
        String kevatSesonki = Kuukaudet.HUHTIKUU.getKuukaudenSesonki();
        Kuukausi ku = new Kuukausi();
        ku.setKuukausi(4);
        assertEquals(ku.toString() + ", eli nyt on " + kevatSesonki + " sesonki.", ku.toString() + ", eli nyt on KEVAT sesonki.");
    }

    @Test
    public void testToStringTalvi() {
        String talviSesonki = Kuukaudet.JOULUKUU.getKuukaudenSesonki();
        Kuukausi ku = new Kuukausi();
        ku.setKuukausi(12);

        assertEquals(ku.toString() + ", eli nyt on " + talviSesonki + " sesonki.", ku.toString() + ", eli nyt on TALVI sesonki.");
    }
}
