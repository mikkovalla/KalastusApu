/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

import aikapvm.Kuukausi;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author mikko
 */
public class JokiTest {

    Joki joki;
    private String m = "joki";
    private String vari = "humuksinen";
    private int lampo = 12;
    private int korkeus = 155;

    @Before
    public void setUp() {
        joki = new Joki(m, vari, lampo, korkeus);
    }

    @Test
    public void konstruktoriAsettaaArvon() {
        String mm = "joki";
        String vari2 = "punainen";
        int lampo2 = 12;
        int korkeus2 = -10;
        joki = new Joki(mm, vari2, lampo2, korkeus2);
        assertEquals(joki.getAlue(), "joki");
    }

    @Test
    public void getAluePalauttaaOikeanArvon() {
        assertEquals(joki.getAlue(), "joki");
    }

    @Test
    public void testiSetVedenVari() {
        joki.setVedenVari("punainen");
        assertEquals(joki.vedenVari(), "punainen");
    }

    @Test
    public void testiSetVedenVariJosTyhja() {
        joki.setVedenVari("");
        joki.oletusVedenVari();
        assertEquals(joki.vedenVari(), "kirkas humuksinen");
    }

    @Test
    public void muutaOletusAsetettuVedenVari() {
        joki.setVedenVari("");
        joki.oletusVedenVari();
        joki.setVedenVari("sininen");
        assertEquals(joki.vedenVari(), "sininen");
    }

    @Test
    public void testVedenVariPalauttaaOikeanArvon() {
        assertEquals(joki.vedenVari(), vari);
    }

    @Test
    public void testVedenVariMuuttaaTyhjänArvonOletukseksiJaPalauttaaOikeanArvon() {
        vari = "";
        joki.oletusVedenVari();
        assertEquals(joki.vedenVari(), "kirkas humuksinen");
    }

    @Test
    public void testSetVedenLampoAsettaaPositiivisenArvon() {
        joki.setVedenLampo(15);
        assertEquals(joki.vedenLampo(), 15);
    }

    @Test
    public void testSetVedenLampoEiToimiNegatiivisellaArvolla() {
        joki.setVedenLampo(-2);
        assertEquals(false, false);
    }

    @Test
    public void testVedenLampoPalauttaaOikeanArvon() {
        joki.setVedenLampo(lampo);
        assertEquals(joki.vedenLampo(), lampo);
    }

    @Test
    public void testVedenLampoPalauttaaMuuttetunArvon() {
        joki.setVedenLampo(22);
        assertEquals(joki.vedenLampo(), 22);
    }

    @Test
    public void testSetVedenKorkeusAsettaaAnnetunArvon() {
        joki.setVedenKorkeus(12);
        assertEquals(joki.vedenKorkeus(), 12);
    }

    @Test
    public void testVedenKorkeusPalauttaaOikeanArvon() {
        assertEquals(joki.vedenKorkeus(), korkeus);
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvon() {
        joki.setVedenVari("");
        joki.oletusVedenVari();
        assertEquals(joki.vedenVari(), "kirkas humuksinen");
    }
}
