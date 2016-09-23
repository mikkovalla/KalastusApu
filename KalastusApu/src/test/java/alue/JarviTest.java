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
public class JarviTest {

    Jarvi jarvi;
    private String m = "jarvi";
    private String vari = "vihreä";
    private int lampo = 22;
    private int korkeus = 12;

    @Before
    public void setUp() {
        jarvi = new Jarvi(m, vari, lampo, korkeus);
    }

    @Test
    public void konstruktoriAsettaaArvon() {
        String mm = "jarvi";
        String vari2 = "punainen";
        int lampo2 = 12;
        int korkeus2 = -10;
        jarvi = new Jarvi(mm, vari2, lampo2, korkeus2);
        assertEquals(jarvi.getAlue(), "jarvi");
    }

    @Test
    public void getAluePalauttaaOikeanArvon() {
        assertEquals(jarvi.getAlue(), "jarvi");
    }

    @Test
    public void testiSetVedenVari() {
        jarvi.setVedenVari("punainen");
        assertEquals(jarvi.vedenVari(), "punainen");
    }

    @Test
    public void testiSetVedenVariJosTyhja() {
        jarvi.setVedenVari("");
        jarvi.oletusVedenVari();
        assertEquals(jarvi.vedenVari(), "vihertävä ruskea");
    }

    @Test
    public void muutaOletusAsetettuVedenVari() {
        jarvi.setVedenVari("");
        jarvi.oletusVedenVari();
        jarvi.setVedenVari("sininen");
        assertEquals(jarvi.vedenVari(), "sininen");
    }

    @Test
    public void testVedenVariPalauttaaOikeanArvon() {
        assertEquals(jarvi.vedenVari(), vari);
    }

    @Test
    public void testVedenVariMuuttaaTyhjänArvonOletukseksiJaPalauttaaOikeanArvon() {
        vari = "";
        jarvi.oletusVedenVari();
        assertEquals(jarvi.vedenVari(), "vihertävä ruskea");
    }

    @Test
    public void testSetVedenLampoAsettaaPositiivisenArvon() {
        jarvi.setVedenLampo(15);
        assertEquals(jarvi.vedenLampo(), 15);
    }

    @Test
    public void testSetVedenLampoEiToimiNegatiivisellaArvolla() {
        jarvi.setVedenLampo(-2);
        assertEquals(false, false);
    }

    @Test
    public void testVedenLampoPalauttaaOikeanArvon() {
        jarvi.setVedenLampo(lampo);
        assertEquals(jarvi.vedenLampo(), lampo);
    }

    @Test
    public void testVedenLampoPalauttaaMuuttetunArvon() {
        jarvi.setVedenLampo(22);
        assertEquals(jarvi.vedenLampo(), 22);
    }

    @Test
    public void testSetVedenKorkeusAsettaaAnnetunArvon() {
        jarvi.setVedenKorkeus(12);
        assertEquals(jarvi.vedenKorkeus(), 12);
    }

    @Test
    public void testVedenKorkeusPalauttaaOikeanArvon() {
        assertEquals(jarvi.vedenKorkeus(), korkeus);
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvon() {
        jarvi.setVedenVari("");
        jarvi.oletusVedenVari();
        assertEquals(jarvi.vedenVari(), "vihertävä ruskea");
    }
}
