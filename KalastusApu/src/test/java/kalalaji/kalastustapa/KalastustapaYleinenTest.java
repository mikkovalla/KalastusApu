/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import aikapvm.SesonkiNyt;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KalastustapaYleinenTest {

    private KalastustapaYleinen hauki;
    private final SesonkiNyt sn = new SesonkiNyt();
    private String talvi;
    private String kevat;
    private String kesa;
    private String syksy;

    @Before
    public void setUp() {
        hauki = KalastustapaYleinen.HAUKI;
        this.talvi = "Avovedessä:\n"
                + "-	Matalassa vedessä isoilla shädeillä hitaasti kelaamalla ja pitkillä pysäytyksillä.\n"
                + "-	Pinnassa kulkevilla jerkeillä hyvin matalassa pitkillä luiuilla ja pitkillä pysähdyksillä.\n"
                + "-	 Syvemmässä vedessä isoilla shädeillä jotka on painotettu 10 – 30 gramman painolla.\n"
                + "Jäällä:\n"
                + "-	Pilkkimällä aktiivisesti täkykalalla.\n"
                + "Ootto-ongella ja täkykalalla";
        this.kevat = "Kutu-alueiden edusta:\n"
                + "-	Shädit painolla ja uppoavat jerkit.\n"
                + "-	Isot syvempi uintiset vaaput ja lusikat.\n"
                + "Kutu-alueen matalat kohdat:\n"
                + "-	Shallow rig shädi, pinta uintinen jerkki ja spinnerbait\n"
                + "Tynkäkaislikko:\n"
                + "-	Spinnerbait\n"
                + "Karikot ja vedenalaiset pakat:\n"
                + "-	Lusikka, painotettu shädi, uppoavat jerkit";
        this.kesa = "Selkävedet ja suvannot:\n"
                + "-	Raskaasti painoitettu shädi\n"
                + "Kaislikot:\n"
                + "-	Lusikka, kevyesti painoitettu shädi, uppoava jerkki, spinnerbait\n"
                + "Karikot ja matalikot:\n"
                + "-	Lusikka, painotettu shädi, uppoava jerkki ja spinnerbait";
        this.syksy = "Matalat salmet:\n"
                + "-	Shallow rig shädi, pinta uintinen jerkki ja spinnerbait\n"
                + "Kaislikot:\n"
                + "-	Lusikka, jerkki, shädi, spinnerbait";
    }

    @Test
    public void testGetTalviKalastus() {
        assertEquals(hauki.getTalviKalastus(), this.talvi);
    }

    @Test
    public void testGetKevatKalastus() {
        assertEquals(hauki.getKevatKalastus(), this.kevat);
    }

    @Test
    public void testGetKesaKalastus() {
        assertEquals(hauki.getKesaKalastus(), this.kesa);
    }

    @Test
    public void testGetSyksyKalastus() {
        assertEquals(hauki.getSyksyKalastus(), this.syksy);
    }

    @Test
    public void testKalastusSesonginMukaan() {
        String k = hauki.kalastusSesonginMukaan(hauki, sn);
        assertEquals(k, this.syksy);
        if (sn.getSesonki().equals("TALVI")) {
            assertEquals(k, this.talvi);
        }
        if (sn.getSesonki().equals("KEVAT")) {
            assertEquals(k, this.kevat);
        }
        if (sn.getSesonki().equals("KESA")) {
            assertEquals(k, this.kesa);
        }
    }

}
