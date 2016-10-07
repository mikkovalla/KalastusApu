/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alue;

/**
 *
 * Alue rajapinta.
 */
public interface Alue {

    /**
     * Rajapinnan metodi.
     *
     * @return palauttaa Alueen nimen string tyyppisenä.
     */
    public String getAlue();

    /**
     * Rajapinnan metodi.
     *
     * @return palauttaa vedenVarin String tyyppisenä.
     */
    public String vedenVari();

    /**
     * Rajapinnan metodi vedenlämmön saamiseksi.
     *
     * @return palauttaa vedenlämmön lukeman int tyyppisenä.
     */
    public int vedenLampo();

    /**
     * Rajapinnan metodi vedenkorkeuden saamiseksi.
     *
     * @return palauttaa vedenkorkeuden arvon int tyyppisenä.
     */
    public int vedenKorkeus();

    /**
     * Rajapinnan metodi joka asettaa oletus vedenvärin jos vedenväriä ei anneta
     * konstruktorissa.
     */
    public void oletusVedenVari();
}
