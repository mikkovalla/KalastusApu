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
import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import saatila.vakiot.Sateet;
import saatila.vakiot.Taivas;

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
     * Metodi luo String tyyppisen taulukon joka sisältää kuvien nimet.
     *
     * @param tiedostonNimi String tyyppinen haetun tiedoston nimi. Viittaa
     * kalan nimeen.
     * @return String taulukko joka sisältää kuvien nimet.
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
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

        /*URL url = Vieheet.class.getResource("/" + tiedostonNimi);
        //File file = new File(url.toURI());
        String[] nimet = file.list();
        return nimet;/*
         */
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
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     */
    public void naytaKuvat(int indeksi, JLabel label, String pilvet, String sade, String tiedostonNimi) throws URISyntaxException, IOException {
        tiedostonNimi = tiedostonNimi.toLowerCase();
        //ArrayList<String> kuvat = kuvatSaanMukaan(pilvet, sade, tiedostonNimi);
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
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     */
    public static ArrayList<String> kuvatSaanMukaan(String pilvet, String sade, String tiedosto) throws URISyntaxException, IOException {
        ArrayList<String> kuvat = new ArrayList<>();
        String[] kuvaa = haeTiedostojenNimet(tiedosto);
        for (String kuva : kuvaa) {
            if (kuva.contains(sade) || kuva.contains(pilvet)) {
                kuvat.add(kuva);
            }
        }
        return kuvat;
    }

    public static void main(String args[]) throws URISyntaxException, IOException {
        String tiedostonNimi = "hauki";
        for (String nimi : haeTiedostojenNimet(tiedostonNimi)) {
            System.out.println(nimi);

        }

        System.out.println("____________________________________");

        Pilvisyys pilvet = new Pilvisyys(Taivas.PILVINEN);
        Sade sade = new Sade(Sateet.VESI);
        String p = Taivas.PILVINEN.name().toLowerCase();
        String s = Sateet.VESI.name().toLowerCase();

        for (String kuva : kuvatSaanMukaan(p, s, tiedostonNimi)) {
            System.out.println(kuva);
        }
    }
}
