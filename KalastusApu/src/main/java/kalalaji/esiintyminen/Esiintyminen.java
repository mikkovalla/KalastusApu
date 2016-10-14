/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalalaji.esiintyminen;

import aikapvm.SesonkiNyt;

/**
 * Vakio luokka josta selviää Haukien esiintymisalueet sesongin mukaan merellä.
 *
 * @author mikko
 */
public enum Esiintyminen {
    HAUKI("Talvella, hauki kuten muutkin kalat säästää energiaa,\n "
            + "ja syö yleisesti suurempia saaliskaloja. \n"
            + "Hauki esiintyy alkutalvesta hyvinkin matalassa vedessä saalistamassa säyneitä, \n"
            + "kuhia, ahvenia ja lahnoja. Keskitalvella hauet vetäytyvät syvemmälle, \n"
            + "yleisesti kutualueiden lähellä oleviin syvänteihin. \n"
            + "Lopputalvesta hauet taas alkavat siirtyä matalampaan veteen kutu-alueen ympärille, \n"
            + "ja aloittavat syömään enemmän saadakseen energiaa lähestyvää kutua varten. \n"
            + "Pääasialliset saaliskalat lopputalvesta ovat kudulle tulleet ahvenet, lahnat ja säyneet. \n"
            + "Talvella otollisin kalastusaika on valoisaan aikaan.\n", //Talvi essintyminen loppuu, Kevät alkaa
            "Alku keväällä alkaa hauen kutu, mutta juuri sitä ennen pääsääntöisesti isoimmat hauet tavoittaa 2-6 metrin syvyydestä \n"
            + "kutualueiden suulta jossa ne saalistavat ahnaasti säyneitä ja muita särkikaloja, \n"
            + "ja keskikokoiset hauet oleskelevat lähempänä rantaa. \n"
            + "Kudun aikana hauet eivät aktiivisesti syö.\n"
            + "Kevään edetessä kohti alkukesää, hauet aloittavat rankan ruokailun palauttaakseen kuntonsa kudun jälkeen. \n"
            + "Tällöin hauet löytää särkikalojen kutupaikoilta rantojen läheisyydestä, \n"
            + "sekä kuhien kutualueiden ympäriltä. Toisin kuin yleensä luullaan, \n"
            + "keväällä hauet liikkuvat hyvin paljon saaliskalojen perässä, \n"
            + "ja onkin yleistä saada lukuisia kaloja pieneltä alueelta. \n"
            + "Keväällä kalastus kannattaa aloittaa juuri ennen auringon nousua, \n"
            + "ja lopettaa vasta noin tunnin auringon laskun jälkeen. \n"
            + "Keväällä ei ole todettu olevan erityistä syöntiaikaa vaan hetkellisiä, \n"
            + "muutaman tunnin kestäviä syöntipiikkejä.\n", //Kevät esiintyminen loppuu, Kesä alkaa
            "Kesällä hauet hajaantuvat ja voivat liikkua pitkiäkin matkoja. \n"
            + "Tällöin suurimmat yksilöt esiintyvät pääsääntöisesti selkävesiltä, \n"
            + "syvempien lahtien edustoilta, sekä suvantojen reunoilta. \n"
            + "Sesongille tyypillistä on saada hyvinkin laihoja ja pitkiä kaloja rantojen läheisyydestä, \n"
            + "kun taas syvemmiltä selkävesiltä saadut kalat ovat lyhyitä ja paksuja. \n"
            + "Selkävesien ja suvantojen pohjassa olevat kummut (tai ’pakat’) \n"
            + "ja niiden ympäristöt ovat potentiaalisimpia ison hauen paikkoja. \n"
            + "Rantojen lähellä kalat oleskelevat paikoissa missä on yleensä ainakin hieman virtausta.\n", //Kesä esiintyminen loppuu, Syksy alkaa
            "Loppukesällä ja alkusyksyllä, hauet alkavat siirtyä lähemmäs rantoja, \n"
            + "ja niitä löytää kasvavissa määrin salmien suulta mihin salakat, ahvenet ja särkikalat alkavat parveutua. \n"
            + "Hauet voivat olla syvässäkin vedessä, ja onkin tyypillistä nähdä kaikuluotaimessa suuria parvia pikkukalaa \n"
            + "ja niiden alla isoja yksittäisiä kaikuja. Tämä sesonki jatkuu Marraskuun loppuun asti, \n"
            + "ja mitä myöhempään sesongissa mennään, sitä lähemmäs rantoja ja matalampaan veteen kalat siirtyvät. \n"
            + "Toinen tyypillisyys syys sesongissa on löytää pienempiä sekä keskikokoisia haukia salmista, \n"
            + "tai saarten/luotojen/ kivikoiden rannoista hyvinkin matalasta vedestä. \n"); //Syksy esiintyminen loppu

    private final String talvi;
    private final String kevat;
    private final String kesa;
    private final String syksy;

    /**
     * Luokan konstruktorissa määritetään vakio esiintymiset
     *
     * @param esTalvi on talvi esiintyminen String tyyppisenä
     * @param esKevat on Kevät esiintyminen String tyyppisenä
     * @param esKesa on Kesä esiintyminen String tyyppisenä
     * @param esSyksy on Syys esiintyminen String tyyppisenä
     */
    Esiintyminen(String esTalvi, String esKevat, String esKesa, String esSyksy) {
        this.talvi = esTalvi;
        this.kevat = esKevat;
        this.kesa = esKesa;
        this.syksy = esSyksy;
    }

    public String getTalviEsiintyminen() {
        return this.talvi;
    }

    public String getKevatEsiintyminen() {
        return this.kevat;
    }

    public String getKesaEsiintyminen() {
        return this.kesa;
    }

    public String getSyksyEsiintyminen() {
        return this.syksy;
    }

    /**
     * Metodi vakion määrittelemän kalan esiintymisen hakuun sesongin mukaan.
     *
     * @param esiintyminen Esiintyminen vakio luokka.
     * @param sesonkinyt SesonkiNyt olio.
     * @return Vakio arvon esiintymisen sesongin mukaan String tyyppisenä.
     */
    public String esiintyySesonginMukaan(Esiintyminen esiintyminen, SesonkiNyt sesonkinyt) {
        sesonkinyt = new SesonkiNyt();
        switch (sesonkinyt.getSesonki()) {
            case "TALVI":
                return esiintyminen.getTalviEsiintyminen();
            case "KEVÄT":
                return esiintyminen.getKevatEsiintyminen();
            case "KESÄ":
                return esiintyminen.getKesaEsiintyminen();
            case "SYKSY":
                return esiintyminen.getSyksyEsiintyminen();
            default:
                return "Jotain meni pieleen.";
        }
    }
}
