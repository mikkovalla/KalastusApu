/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saatila.vakiot;

/**
 *
 * Enum luokka Tuulensuunta joka määrittää tuulen suunnat ilmansuuntien mukaan
 * vakioina. Int tyyppinen luokitus arvoa käytetään määrittäessä tuulensuunnan
 * maukainen kalastustapa.
 *
 * @see kalalaji.kalastustapa.KalastustapaSaanMukaan.
 */
public enum Tuulensuunta {
    POHJOINEN(1), KOILLINEN(1), ITA(1), KAAKKO(2), ETELA(2), LOUNAS(2), LANSI(2), LUODE(1);

    private final int luokitus;

    Tuulensuunta(int luokitus) {
        this.luokitus = luokitus;
    }

    public int getLuokitus() {
        return this.luokitus;
    }
}
