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
public class MeriTest {

    Meri meri;
    private String m = "meri";
    private String vari = "sininen";
    private int lampo = 10;
    private int korkeus = 0;

    @Before
    public void setUp() {
        meri = new Meri(m, vari, lampo, korkeus);
    }

    @Test
    public void konstruktoriAsettaaArvon() {
        String mm = "meri";
        String vari2 = "sininen";
        int lampo2 = 12;
        int korkeus2 = -10;
        meri = new Meri(mm, vari2, lampo2, korkeus2);
        assertEquals(meri.getAlue(), "meri");
    }

    @Test
    public void getAluePalauttaaOikeanArvon() {
        assertEquals(meri.getAlue(), "meri");
    }

    @Test
    public void testiSetVedenVari() {
        meri.setVedenVari("punainen");
        assertEquals(meri.vedenVari(), "punainen");
    }

    @Test
    public void testiSetVedenVariJosTyhja() {
        meri.setVedenVari("");
        meri.oletusVedenVari();
        assertEquals(meri.vedenVari(), "vihertävä");
    }

    @Test
    public void muutaOletusAsetettuVedenVari() {
        meri.setVedenVari("");
        meri.oletusVedenVari();
        meri.setVedenVari("sininen");
        assertEquals(meri.vedenVari(), "sininen");
    }

    @Test
    public void testVedenVariPalauttaaOikeanArvon() {
        assertEquals(meri.vedenVari(), vari);
    }

    @Test
    public void testVedenVariMuuttaaTyhjänArvonOletukseksiJaPalauttaaOikeanArvon() {
        vari = "";
        meri.oletusVedenVari();
        assertEquals(meri.vedenVari(), "vihertävä");
    }

    @Test
    public void testSetVedenLampoAsettaaPositiivisenArvon() {
        meri.setVedenLampo(15);
        assertEquals(meri.vedenLampo(), 15);
    }

    @Test
    public void testSetVedenLampoEiToimiNegatiivisellaArvolla() {
        meri.setVedenLampo(-2);
        assertEquals(false, false);
    }

    @Test
    public void testVedenLampoPalauttaaOikeanArvon() {
        meri.setVedenLampo(lampo);
        assertEquals(meri.vedenLampo(), lampo);
    }

    @Test
    public void testVedenLampoPalauttaaMuuttetunArvon() {
        meri.setVedenLampo(22);
        assertEquals(meri.vedenLampo(), 22);
    }

    @Test
    public void testSetVedenKorkeusAsettaaAnnetunArvon() {
        meri.setVedenKorkeus(12);
        assertEquals(meri.vedenKorkeus(), 12);
    }

    @Test
    public void testVedenKorkeusPalauttaaOikeanArvon() {
        assertEquals(meri.vedenKorkeus(), korkeus);
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvon() {
        meri.setVedenVari("");
        meri.oletusVedenVari();
        assertEquals(meri.vedenVari(), "vihertävä");
    }

}
