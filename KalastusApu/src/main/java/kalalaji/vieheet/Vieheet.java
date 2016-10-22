/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.vieheet;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import kalalaji.kalat.Kalat;
import static kalalaji.kalat.Kalat.*;

/**
 * Vakio luokka jossa määritetään vieheiden värikartta saan ja veden värin
 * mukaan. Värikartta on haettu käytetyimmän ja parhaan värikartan mukaan
 * kullekkin kalalajille.
 *
 * @see HAUKI: http://www.nilsmaster.fi/varikartta
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
     */
    public String[] haeKuvat(String tiedostonNimi) {
        File file;
        tiedostonNimi = tiedostonNimi.toLowerCase();
        file = new File(getClass().getResource("/" + tiedostonNimi).getFile());
        String[] kuvat = file.list();
        Arrays.sort(kuvat);
        return kuvat;
    }

    /**
     * Metodi näyttää kuvat parametriksi saadussa JLabel elementissä.
     *
     * @param indeksi kuvan indeksi.
     * @param label JLabel elementti mihin kuva näytetään.
     * @param pilvet Pilvisyys luokan arvo.
     * @param sade Sade luokan arvo.
     * @param tiedostonNimi Tiedosto josta kuvat haetaan.
     */
    public void naytaKuvat(int indeksi, JLabel label, String pilvet, String sade, String tiedostonNimi) {
        tiedostonNimi = tiedostonNimi.toLowerCase();
        //String[] kuvat = kuvatSaanMukaan(pilvet, sade, tiedostonNimi);
        ArrayList<String> kuvat = kuvatSaanMukaan(pilvet, sade, tiedostonNimi);
        for (int i = 0; i < kuvat.size(); i++) {
            String kuvaa = kuvat.get(indeksi);
            ImageIcon kuvake = new ImageIcon(getClass().getResource("/" + tiedostonNimi + "/" + kuvaa));
            Image kuva = kuvake.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(kuva));
        }
    }

    /**
     * Metodi rakentaa Listan kuvista jotka vastaavat Saa ehtoja.
     *
     * @param pilvet käyttäjän valitsema pilvisyys.
     * @param sade käyttäjän valitsema sade.
     * @param tiedosto tiedoston nimi mistä haetaan.
     * @return listan joka sisältää parametreja vastaavat kuvat.
     */
    public ArrayList<String> kuvatSaanMukaan(String pilvet, String sade, String tiedosto) {
        ArrayList<String> kuvat = new ArrayList<>();
        String[] k = haeKuvat(tiedosto);
        for (String kuva : k) {
            if (kuva.contains(sade) || kuva.contains(pilvet)) {
                kuvat.add(kuva);
            }
        }
        return kuvat;
    }
}
