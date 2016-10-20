/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import saatila.vakiot.Tuulensuunta;

/**
 * Vakio luokka jossa määritetään kalastustapa vedenkorkeuden ja tuulen suunnan
 * sekä nopeuden mukaan.
 */
public enum KalastustapaSaanMukaan {
    HAUKI("rannassa",
            "irti rannasta",
            "tyynessä",
            "tuulenpuolella",
            "tuulen ja tyynen rajalla");

    private final String rannassa;
    private final String irtiRannasta;
    private final String tyyni;
    private final String tuulenPuoli;
    private final String tyyniTuuliRaja;

    /**
     * Vakio luokan konstruktori.
     *
     * @param rannassa String tyyppinen vakion arvo
     * @param irtiRannasta String tyyppinen vakion arvo
     * @param tyyni String tyyppinen vakion arvo
     * @param tuulenPuoli String tyyppinen vakion arvo
     * @param tyyniTuuliRaja String tyyppinen vakion arvo
     */
    private KalastustapaSaanMukaan(String rannassa, String irtiRannasta, String tyyni, String tuulenPuoli, String tyyniTuuliRaja) {
        this.rannassa = rannassa;
        this.irtiRannasta = irtiRannasta;
        this.tyyni = tyyni;
        this.tuulenPuoli = tuulenPuoli;
        this.tyyniTuuliRaja = tyyniTuuliRaja;
    }

    /**
     * Luokan metodi jossa tuulensuunta vakio arvon perusteella määritetään
     * kalastustapa. Oletuksena aina tuulee.
     *
     * @param suunta Tuulensuunta vakio arvo.
     * @param nopeus tuulen nopeus int tyyppisneä.
     * @return String tyyppisenä ehdon ja parametrin mukainen merkkijono
     */
    public String kalastusTapaSaanMukaanTuulenNopeusJaSuunta(Tuulensuunta suunta, int nopeus) {
        if (nopeus > 0 && nopeus <= 6) {
            return this.tuulenPuoli;
        } else if ((suunta.getLuokitus() == 2) && (nopeus >= 7 && nopeus <= 12)) {
            return this.tyyniTuuliRaja;
        }
        return this.tyyni;
    }

    /**
     * Luokan metodi jossa vedenkorkeuden arvon perusteella määritetään
     * kalastustapa. Ternary operaatio. Nyrkkisääntönä on että mitä matalammalla
     * vesi on, sitä lähempää rantaa kalat löytyvät.
     *
     * @param korkeus on vedenkorkeus int tyyppisenä.
     * @return ternary ehto lauseen perusteella parametriin perustuen vakion
     * String arvo.
     */
    public String kalastusTapaSaanMukaanVedenKorkeus(int korkeus) {
        return (korkeus >= 0) ? this.irtiRannasta : this.rannassa;
    }
}
