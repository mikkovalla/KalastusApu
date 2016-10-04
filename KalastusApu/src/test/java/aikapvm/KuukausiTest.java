/*
 * Kuukausi luokka testit v1.0
 */
package aikapvm;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class KuukausiTest {

    private int kuukausi;
    Kuukausi k;
    GregorianCalendar kk;
    Kuukaudet kn;

    @Before
    public void setUp() {
        k = new Kuukausi();
        kk = new GregorianCalendar();
        this.kuukausi = kuukausi;
    }

    @Test
    public void konstruktoriPalauttaaKalenteriKuukaudenNumerona() {
        this.kuukausi = kk.get(Calendar.MONTH);
        assertEquals(this.kuukausi, 9); //testi syyskuussa
    }

    @Test
    public void konstruktoriAsettaaOikeanKuukauden() {
        this.kuukausi = kk.get(Calendar.MONTH);
        this.kuukausi = this.kuukausi + 1;
        assertEquals(this.kuukausi, 10);
    }

    @Test
    public void getKuukausiPalauttaaOikeanArvon() {
        assertEquals(k.getKuukausi(), 10);
    }

    @Test
    public void setKuukausiAsettaaUudenArvon() {
        k.setKuukausi(12);
        assertEquals(k.getKuukausi(), 12);
    }

    @Test
    public void setKuukausiEiVoiAsettaaVäärääArvoa() {
        k.setKuukausi(15);
        assertEquals(k.getKuukausi(), 10);
    }

    @Test
    public void getKuunNimiPalauttaaOikeanArvon() {
        String kn = k.getKuuNimi().name();
        assertEquals(k.getKuuNimi().toString(), kn);
    }

}
