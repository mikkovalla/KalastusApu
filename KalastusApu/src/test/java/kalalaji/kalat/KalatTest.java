/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalat;

import aikapvm.SesonkiNyt;
import alue.AlueValinta;
import kalalaji.esiintyminen.*;
import kalalaji.kalastustapa.*;
import kalalaji.saaliskalat.Saaliskalat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import saatila.saa.Tuuli;
import saatila.vakiot.Tuulensuunta;

/**
 *
 * @author mikko
 */
public class KalatTest {

    private KalastustapaYleinen haukiKalastus;
    private KalastustapaSaanMukaan kalastusSaanMukaan;
    private Esiintyminen haukiEsiintyminen;
    Esiintyminen es;
    KalastustapaYleinen kt;
    Saaliskalat saalis;
    Tuuli tuuli;
    AlueValinta alue;
    private SesonkiNyt sn = new SesonkiNyt();
    private String talviKalastus;
    private String kevatKalastus;
    private String kesaKalastus;
    private String syksyKalastus;
    private String talviEs;
    private String kevatEs;
    private String kesaEs;
    private String syksyEs;

    @Before
    public void setUp() {
        alue = new AlueValinta("meri", "", 14, 10);
        tuuli = new Tuuli(Tuulensuunta.ETELA, 10);
        haukiKalastus = KalastustapaYleinen.HAUKI;
        haukiEsiintyminen = Esiintyminen.HAUKI;
        saalis = Saaliskalat.HAUKI;
        kalastusSaanMukaan = KalastustapaSaanMukaan.HAUKI;
        this.talviKalastus = haukiKalastus.getTalviKalastus();
        this.kevatKalastus = haukiKalastus.getKevatKalastus();
        this.kesaKalastus = haukiKalastus.getKesaKalastus();
        this.syksyKalastus = haukiKalastus.getSyksyKalastus();
        this.talviEs = haukiEsiintyminen.getTalviEsiintyminen();
        this.kevatEs = haukiEsiintyminen.getKevatEsiintyminen();
        this.kesaEs = haukiEsiintyminen.getKesaEsiintyminen();
        this.syksyEs = haukiEsiintyminen.getSyksyEsiintyminen();
    }

    @Test
    public void testEsiintyySesonginMukaan() {
        String esm = haukiEsiintyminen.esiintyySesonginMukaan(Esiintyminen.HAUKI, sn);
        assertEquals(esm, this.syksyEs);
    }

    @Test
    public void testKalastustapaSesonginMukaan() {
        String ksm = haukiKalastus.kalastusSesonginMukaan(KalastustapaYleinen.HAUKI, sn);
        assertEquals(ksm, this.syksyKalastus);
    }

    @Test
    public void testSaalisKalatSesonginMukaan() {
        assertEquals(saalis.saalisSesonginMukaan(Saaliskalat.HAUKI, sn), "Ahven, Salakka, Särki, Lahna, Säyne, Silakka.");
    }

    @Test
    public void testKalastustapaSaanMukaan() {
        assertEquals(kalastusSaanMukaan.kalastusTapaSaanMukaanTuulenNopeusJaSuunta(tuuli.getSuunta(), tuuli.getNopeus())
                + " " + kalastusSaanMukaan.kalastusTapaSaanMukaanVedenKorkeus(alue.vedenKorkeus()), "tuulen ja tyynen rajalla irti rannasta");
    }

}
