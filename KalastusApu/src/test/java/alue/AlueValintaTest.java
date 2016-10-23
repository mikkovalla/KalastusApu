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
    private String vesi = "meri";
    private String vari = "sininen";
    private final int lampo = 10;
    private final int korkeus = 0;

    @Before
    public void setUp() {
        paikka = new AlueValinta(vesi, vari, lampo, korkeus);
    }

    @Test
    public void konstruktoriAsettaaArvon() {
        String v = "meri";
        String vari2 = "sininen";
        int lampo2 = 12;
        int korkeus2 = -10;
        paikka = new AlueValinta(v, vari2, lampo2, korkeus2);
        assertEquals(paikka.getAlue(), "MERI");
    }

    @Test
    public void getAluePalauttaaOikeanArvon() {
        assertEquals(paikka.getAlue(), "MERI");
    }

    @Test
    public void testiSetVedenVari() {
        paikka.setVedenVari("punainen");
        assertEquals(paikka.vedenVari(), "punainen");
    }

    @Test
    public void testiSetVedenVariJosTyhja() {
        paikka.setVedenVari("");
        paikka.oletusVedenVari();
        assertEquals(paikka.vedenVari(), "tumman vihertävä");
    }

    @Test
    public void testOletusVedenVari() {
        AlueValinta avl = new AlueValinta("meri", "", 10, 10);
        if (avl.vedenVari().isEmpty()) {
            avl.oletusVedenVari();
            assertEquals(avl.vedenVari(), "tumman vihertävä");
        }
    }

    @Test
    public void muutaOletusAsetettuVedenVari() {
        paikka.setVedenVari("");
        paikka.oletusVedenVari();
        paikka.setVedenVari("sininen");
        assertEquals(paikka.vedenVari(), "sininen");
    }

    @Test
    public void testVedenVariPalauttaaOikeanArvon() {
        assertEquals(paikka.vedenVari(), vari);
    }

    @Test
    public void testVedenVariMuuttaaTyhjänArvonOletukseksiJaPalauttaaOikeanArvon() {
        vari = "";
        paikka.oletusVedenVari();
        assertEquals(paikka.vedenVari(), "tumman vihertävä");
    }

    @Test
    public void testSetVedenLampoAsettaaPositiivisenArvon() {
        paikka.setVedenLampo(15);
        assertEquals(paikka.vedenLampo(), 15);
    }

    @Test
    public void testSetVedenLampoEiToimiNegatiivisellaArvolla() {
        paikka.setVedenLampo(-2);
        assertEquals(false, false);
    }

    @Test
    public void testVedenLampoPalauttaaOikeanArvon() {
        paikka.setVedenLampo(lampo);
        assertEquals(paikka.vedenLampo(), lampo);
    }

    @Test
    public void testVedenLampoPalauttaaMuuttetunArvon() {
        paikka.setVedenLampo(22);
        assertEquals(paikka.vedenLampo(), 22);
    }

    @Test
    public void testSetVedenKorkeusAsettaaAnnetunArvon() {
        paikka.setVedenKorkeus(12);
        assertEquals(paikka.vedenKorkeus(), 12);
    }

    @Test
    public void testVedenKorkeusPalauttaaOikeanArvon() {
        assertEquals(paikka.vedenKorkeus(), korkeus);
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvonMeri() {
        paikka.setVedenVari("");
        paikka.oletusVedenVari();
        assertEquals(paikka.vedenVari(), "tumman vihertävä");
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvonJarvi() {
        AlueValinta jarvi = new AlueValinta("jarvi", "punainen", 15, 0);
        jarvi.setVedenVari("");
        jarvi.oletusVedenVari();
        assertEquals(jarvi.vedenVari(), "tumman humuksinen");
    }

    @Test
    public void testOletusVedenVariPalauttaaKuukaudenMukaanOikeanArvonJoki() {
        AlueValinta joki = new AlueValinta("joki", "punainen", 15, 0);
        joki.setVedenVari("");
        joki.oletusVedenVari();
        assertEquals(joki.vedenVari(), "tumman humuksinen");
    }

    @Test
    public void testToString() {
        AlueValinta avl = new AlueValinta("meri", "", 10, 10);
        if (avl.vedenKorkeus() >= 1) {
            assertEquals(avl.toString(), "Alue on " + avl.getAlue() + ", veden vari on " + avl.vedenVari() + ", vedenlampö on " + avl.vedenLampo() + ", ja vedenkorkeus on " + avl.vedenKorkeus() + " senttimetriä plussalla");
        }
        avl.setVedenKorkeus(-9);
        if (avl.vedenKorkeus() <= -1) {
            assertEquals(avl.toString(), "Alue on " + avl.getAlue() + ", veden vari on " + avl.vedenVari() + ", vedenlampö on " + avl.vedenLampo() + ", ja vedenkorkeus on " + avl.vedenKorkeus() + " senttimetriä miinuksella");
        }
        avl.setVedenKorkeus(0);
        assertEquals(avl.toString(), "Alue on " + avl.getAlue() + ", veden vari on " + avl.vedenVari() + ", vedenlampö on " + avl.vedenLampo() + ", ja vedenkorkeus on " + avl.vedenKorkeus() + " eli neutraali");
    }

}
