/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.kalastustapa;

import aikapvm.SesonkiNyt;

/**
 * Vakio luokka josta näkee Haukea koskevat kalastustavat.
 *
 */
public enum KalastustapaYleinen {

    HAUKI(
            //Talvi
            "Avovedessä:\n"
            + "-	Matalassa vedessä isoilla shädeillä hitaasti kelaamalla ja pitkillä pysäytyksillä.\n"
            + "-	Pinnassa kulkevilla jerkeillä hyvin matalassa pitkillä luiuilla ja pitkillä pysähdyksillä.\n"
            + "-	 Syvemmässä vedessä isoilla shädeillä jotka on painotettu 10 – 30 gramman painolla.\n"
            + "Jäällä:\n"
            + "-	Pilkkimällä aktiivisesti täkykalalla.\n"
            + "Ootto-ongella ja täkykalalla",
            //Kevät
            "Kutu-alueiden edusta:\n"
            + "-	Shädit painolla ja uppoavat jerkit.\n"
            + "-	Isot syvempi uintiset vaaput ja lusikat.\n"
            + "Kutu-alueen matalat kohdat:\n"
            + "-	Shallow rig shädi, pinta uintinen jerkki ja spinnerbait\n"
            + "Tynkäkaislikko:\n"
            + "-	Spinnerbait\n"
            + "Karikot ja vedenalaiset pakat:\n"
            + "-	Lusikka, painotettu shädi, uppoavat jerkit",
            //Kesä
            "Selkävedet ja suvannot:\n"
            + "-	Raskaasti painoitettu shädi\n"
            + "Kaislikot:\n"
            + "-	Lusikka, kevyesti painoitettu shädi, uppoava jerkki, spinnerbait\n"
            + "Karikot ja matalikot:\n"
            + "-	Lusikka, painotettu shädi, uppoava jerkki ja spinnerbait",
            //Syksy
            "Matalat salmet:\n"
            + "-	Shallow rig shädi, pinta uintinen jerkki ja spinnerbait\n"
            + "Kaislikot:\n"
            + "-	Lusikka, jerkki, shädi, spinnerbait");

    private final String kTalvi;
    private final String kKevat;
    private final String kKesa;
    private final String kSyksy;

    /**
     * Luokan konstruktori joka asettaa vakio arvolle parametrit.
     *
     * @param talvi on talvi kalastustavat String tyyppisenä.
     * @param kevat on kevät kalastustavat String tyyppisenä.
     * @param kesa on kesä kalastustavat String tyyppisenä.
     * @param syksy on syys kalastustavat String tyyppisenä.
     */
    KalastustapaYleinen(String talvi, String kevat, String kesa, String syksy) {
        this.kTalvi = talvi;
        this.kKevat = kevat;
        this.kKesa = kesa;
        this.kSyksy = syksy;
    }

    /**
     * Getteri.
     *
     * @return String arvo kTalvi.
     */
    public String getTalviKalastus() {
        return this.kTalvi;
    }

    /**
     * Getteri.
     *
     * @return String arvo kKevat.
     */
    public String getKevatKalastus() {
        return this.kKevat;
    }

    /**
     * Getteri.
     *
     * @return String arvo kKesa.
     */
    public String getKesaKalastus() {
        return this.kKesa;
    }

    /**
     * Getteri.
     *
     * @return String arvo kSyksy.
     */
    public String getSyksyKalastus() {
        return this.kSyksy;
    }

    /**
     * Metodi hakee kalastustavan sesongin mukaan.
     *
     * @param kalastustapa KalastustapaYleinen vakio luokka.
     * @param sesonkinyt SesonkiNyt olio.
     * @return vakio arvon kalastustapa sesongin mukkan String tyyppisenä.
     */
    public String kalastusSesonginMukaan(KalastustapaYleinen kalastustapa, SesonkiNyt sesonkinyt) {
        sesonkinyt = new SesonkiNyt();
        switch (sesonkinyt.getSesonki()) {
            case "TALVI":
                return kalastustapa.getTalviKalastus();
            case "KEVÄT":
                return kalastustapa.getKevatKalastus();
            case "KESÄ":
                return kalastustapa.getKesaKalastus();
            case "SYKSY":
                return kalastustapa.getSyksyKalastus();
            default:
                return "Jotain meni pieleen.";
        }
    }
}
