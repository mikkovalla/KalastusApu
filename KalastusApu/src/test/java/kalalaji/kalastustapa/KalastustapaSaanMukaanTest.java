/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import saatila.vakiot.Tuulensuunta;

/**
 *
 * @author mikko
 */
public class KalastustapaSaanMukaanTest {

    private KalastustapaSaanMukaan hauki;
    private String rannassa;
    private String irtiRannasta;
    private String tyyni;
    private String tuulenPuoli;
    private String tyyniTuuliRaja;

    @Before
    public void setUp() {
        hauki = KalastustapaSaanMukaan.HAUKI;
        this.rannassa = "rannassa";
        this.irtiRannasta = "irti rannasta";
        this.tuulenPuoli = "tuulenpuolella";
        this.tyyni = "tyynessä";
        this.tyyniTuuliRaja = "tuulen ja tyynen rajalla";
    }

    @Test
    public void testKalastusTapaSaanMukaanTuulenNopeusJaSuuntaIf() {
        int nopeus = 5;
        Tuulensuunta suunta = Tuulensuunta.ITA;
        hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus);
        if (nopeus > 0 && nopeus <= 6) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tuulenPuoli);
        }
        nopeus = 11;
        if ((suunta.getLuokitus() == 2) && (nopeus >= 7 && nopeus <= 12)) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyniTuuliRaja);
        }
        nopeus = 14;
        suunta = Tuulensuunta.POHJOINEN;
        assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyni);
    }

    @Test
    public void testKalastusTapaSaanMukaanTuulenNopeusJaSuuntaElseIf() {
        int nopeus = 10;
        Tuulensuunta suunta = Tuulensuunta.ITA;
        hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus);
        if (nopeus > 0 && nopeus <= 6) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tuulenPuoli);
        } else if ((suunta.getLuokitus() == 2) && (nopeus >= 7 && nopeus <= 12)) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyniTuuliRaja);
        }
        assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyni);
    }

    @Test
    public void testKalastusTapaSaanMukaanTuulenNopeusJaSuuntaTyyni() {
        int nopeus = 13;
        Tuulensuunta suunta = Tuulensuunta.POHJOINEN;
        hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus);
        if (nopeus > 0 && nopeus <= 6) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tuulenPuoli);
        } else if ((suunta.getLuokitus() == 2) && (nopeus >= 7 && nopeus <= 12)) {
            assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyniTuuliRaja);
        }
        assertEquals(hauki.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(suunta, nopeus), this.tyyni);
    }

    @Test
    public void testKalastusTapaSaanMukaanVedenKorkeusPositiivinen() {
        int vedenKorkeusPos = 10;
        String tulos = (vedenKorkeusPos >= 0) ? this.irtiRannasta : this.rannassa;
        assertEquals(hauki.kalastusTapaSaanMukaanVedenKorkeus(vedenKorkeusPos), tulos);
    }

    @Test
    public void testKalastusTapaSaanMukaanVedenKorkeusNegatiivinen() {
        int vedenKorkeusNeg = -10;
        String tulos = (vedenKorkeusNeg >= 0) ? this.irtiRannasta : this.rannassa;
        assertEquals(hauki.kalastusTapaSaanMukaanVedenKorkeus(vedenKorkeusNeg), tulos);
    }

}
