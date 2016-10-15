/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.vieheet;

import java.io.File;
import javax.swing.ImageIcon;
import kalalaji.kalat.Kalat;
import saatila.logiikka.SaaNyt;

/**
 * Vakio luokka jossa määritetään vieheiden värikartta saan ja veden värin
 * mukaan. Värikartta on haettu käytetyimmän ja parhaan värikartan mukaan
 * kullekkin kalalajille.
 *
 * @see HAUKI: http://www.nilsmaster.fi/varikartta
 */
public class Vieheet {

    private String[] vieheKuvat;
    private final Kalat kalaNimi;
    private ImageIcon kuva;

    /**
     * Konstruktori.
     *
     * @param kalanimi Kalat kalanimi parametri.
     */
    public Vieheet(Kalat kalanimi) {
        this.kalaNimi = kalanimi;
    }

    private String[] haeVieheKuvat() {
        File kansio = new File(getClass().getResource("/hauki").getFile());
        vieheKuvat = kansio.list();
        return vieheKuvat;
    }

    /**
     * Metodi.
     *
     * @param saanyt parametri.
     * @param indeksi parametri.
     * @return viehe kuva.
     */
    public ImageIcon naytaVieheKuva(SaaNyt saanyt, int indeksi) {
        String[] kuvat = haeVieheKuvat();
        String kuvanNimi = kuvat[indeksi];
        //if (kuvanNimi.contains(saanyt.getPilvet().getPilvisyys().name()) || kuvanNimi.contains(saanyt.getSade().getSade().name())) {
        this.kuva = new ImageIcon(getClass().getResource("/hauki/" + kuvanNimi));
        return this.kuva;
        //}
        //return this.kuva;
    }
}
