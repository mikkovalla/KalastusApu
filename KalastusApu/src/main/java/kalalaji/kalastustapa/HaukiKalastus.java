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
public enum HaukiKalastus implements Kalastustapa {

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

    private String kTalvi;
    private String kKevat;
    private String kKesa;
    private String kSyksy;

    /**
     * Luokan konstruktori joka asettaa vakio arvolle parametrit.
     *
     * @param talvi on talvi kalastustavat String tyyppisenä.
     * @param kevat on kevät kalastustavat String tyyppisenä.
     * @param kesa on kesä kalastustavat String tyyppisenä.
     * @param syksy on syys kalastustavat String tyyppisenä.
     */
    HaukiKalastus(String talvi, String kevat, String kesa, String syksy) {
        this.kTalvi = talvi;
        this.kKevat = kevat;
        this.kKesa = kesa;
        this.kSyksy = syksy;
    }

    @Override
    public String getTalviKalastus() {
        return this.kTalvi;
    }

    @Override
    public String getKevatKalastus() {
        return this.kKevat;
    }

    @Override
    public String getKesaKalastus() {
        return this.kKesa;
    }

    @Override
    public String getSyksyKalastus() {
        return this.kSyksy;
    }

    /**
     * Metodi hakee kalastustavan sesongin mukaan.
     *
     * @param kt Kalastustapa rajapinta.
     * @param sn SesonkiNyt olio.
     * @return vakio arvon kalastustapa sesongin mukkan String tyyppisenä.
     */
    @Override
    public String kalastusSesonginMukaan(Kalastustapa kt, SesonkiNyt sn) {
        sn = new SesonkiNyt();
        switch (sn.getSesonki()) {
            case "TALVI":
                return kt.getTalviKalastus();
            case "KEVÄT":
                return kt.getKevatKalastus();
            case "KESÄ":
                return kt.getKesaKalastus();
            case "SYKSY":
                return kt.getSyksyKalastus();
            default:
                return "Jotain meni pieleen.";
        }
    }
}
