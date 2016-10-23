/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.vieheet;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import kalalaji.kalat.Kalat;

/**
 * Vakio luokka jossa määritetään vieheiden värikartta saan ja veden värin
 * mukaan. Värikartta on haettu käytetyimmän ja parhaan värikartan mukaan
 * kullekkin kalalajille.
 *
 * HAUKI: http://www.nilsmaster.fi/varikartta
 */
public class Vieheet {

    private final Kalat kalaNimi;

    /**
     * Konstruktori.
     *
     * @param kalanimi Kalat kalanimi parametri.
     */
    public Vieheet(Kalat kalanimi) {
        this.kalaNimi = kalanimi;
    }

    /**
     * Metodi luo String tyyppisen taulukon joka sisältää kuvien nimet. Metodi
     * ei jostain syystä toimi JARissa vaikka tekstimuodossa palauttaakin oikeat
     * arvot.
     *
     * @param tiedostonNimi String tyyppinen haetun tiedoston nimi. Viittaa
     * kalan nimeen.
     * @return String taulukko joka sisältää kuvien nimet.
     * @throws java.net.URISyntaxException virhe
     * @throws java.io.IOException virhe
     */
    public static String[] haeTiedostojenNimet(String tiedostonNimi) throws URISyntaxException, IOException {
        String[] kuvaNimi = {};
        ArrayList<String> kk = new ArrayList<>();
        InputStream is = Vieheet.class.getResourceAsStream("/" + tiedostonNimi + "/");
        InputStreamReader isr = new InputStreamReader(is);
        try (BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                kk.add(line);
            }
        }
        kuvaNimi = kk.toArray(kuvaNimi);

        return kuvaNimi;
    }

    /**
     * Metodi näyttää kuvat parametriksi saadussa JLabel elementissä.
     *
     * @param indeksi kuvan indeksi.
     * @param label JLabel elementti mihin kuva näytetään.
     * @param pilvet Pilvisyys luokan arvo.
     * @param sade Sade luokan arvo.
     * @param tiedostonNimi Tiedosto josta kuvat haetaan.
     * @throws java.net.URISyntaxException virhe
     * @throws java.io.IOException virhe
     */
    public void naytaKuvat(int indeksi, JLabel label, String pilvet, String sade, String tiedostonNimi) throws URISyntaxException, IOException {
        tiedostonNimi = tiedostonNimi.toLowerCase();
        for (String kuvat1 : kuvatSaanMukaan(pilvet, sade, tiedostonNimi)) {
            kuvat1 = kuvatSaanMukaan(pilvet, sade, tiedostonNimi).get(indeksi);
            InputStream is = Vieheet.class.getResourceAsStream("/" + tiedostonNimi + "/" + kuvat1);
            Image image = ImageIO.read(is);
            label.setIcon(new ImageIcon(image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        }
    }

    /**
     * Metodi rakentaa Listan kuvista jotka vastaavat Saa ehtoja.
     *
     * @param pilvet käyttäjän valitsema pilvisyys.
     * @param sade käyttäjän valitsema sade.
     * @param tiedosto tiedoston nimi mistä haetaan.
     * @return listan joka sisältää parametreja vastaavat kuvat.
     * @throws java.net.URISyntaxException virhe
     * @throws java.io.IOException virhe
     */
    public static ArrayList<String> kuvatSaanMukaan(String pilvet, String sade, String tiedosto) throws URISyntaxException, IOException {
        ArrayList<String> kuvat = new ArrayList<>();
        ArrayList<String> nimet = new ArrayList<>();
        nimet.add("1.pilvinen.vesi.vesitihku.jpg");
        nimet.add("10.aurinkoinen.puolipilvinen.lumi.ranta.jpg");
        nimet.add("11.aurinkoinen.puolipilvinen.lumi.ranta.jpg");
        nimet.add("12.aurinkoinen.puolipilvinen.ranta.pouta.jpg");
        nimet.add("13.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("14.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("15.aurinkoinen.pouta.jpg");
        nimet.add("16.aurinkoinen.pouta.jpg");
        nimet.add("17.aurinkoinen.pouta.jpg");
        nimet.add("18.aurinkoinen.pouta.jpg");
        nimet.add("19.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("2.sumuinen.aurinkoinen.jpg");
        nimet.add("20.aurinkoinen.pouta.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("21.aurinkoinen.pouta.jpg");
        nimet.add("22.vesi.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("23.aurinkoinen.pouta.jpg");
        nimet.add("24.aurinkoinen.pouta.jpg");
        nimet.add("25.aurinkoinen.pouta.jpg");
        nimet.add("26.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("27.aurinkoinen.pouta.jpg");
        nimet.add("28.aurinkoinen.pouta.jpg");
        nimet.add("29.aurinkoinen.pouta.jpg");
        nimet.add("3.aurinkoinen.puolipilvinen.pilvinen.vesi.jpg");
        nimet.add("30.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("31.aurinkoinen.pouta.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("32.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("33.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("34.aurinkoinen.pouta.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("35.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("36.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("37.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("38.aurinkoinen.pouta.jpg");
        nimet.add("39.aurinkoinen.pouta.jpg");
        nimet.add("4.aurinkoinen.puolipilvinen.jpg");
        nimet.add("40.vesi.ranta.lumi.pilvinen.jpg");
        nimet.add("41.aurinkoinen.pouta.jpg");
        nimet.add("42.aurinkoinen.pouta.jpg");
        nimet.add("43.aurinkoinen.pouta.jpg");
        nimet.add("44.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("45.aurinkoinen.pouta.jpg");
        nimet.add("46.vesi.puolipilvinen.pilvinen.jpg");
        nimet.add("47.aurinkoinen.puolipilvinen.pouta.jpg");
        nimet.add("5.puolipilvinen.pilvinen.vesitihku.jpg");
        nimet.add("6.aurinkoinen.pouta.jpg");
        nimet.add("7.aurinkoinen.puolipilvinen.pouta.jpg");
        nimet.add("8.aurinkoinen.puolipilvinen.pilvinen.vesi.vesitihku.pouta.jpg");
        nimet.add("9.pilvinen.aurinkoinen.pouta.jpg");

        for (String kuva : nimet) {
            if (kuva.contains(sade) || kuva.contains(pilvet)) {
                kuvat.add(kuva);
            }
        }
        return kuvat;
    }
}
