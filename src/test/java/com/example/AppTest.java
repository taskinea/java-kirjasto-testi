package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void laskimenArvoAlussaNolla() {
        App laskin = new App();
        assertEquals(0, laskin.getArvo());
    }

    @Test
    public void arvoViisiKunSummataanViisi() {
        App laskin = new App();
        laskin.summa(5);
        assertEquals(5, laskin.getArvo());
    }

    @Test
    public void arvoMiinusKaksiKunErotetaanKaksi() {
        App laskin = new App();
        laskin.erotus(2);
        assertEquals(-2, laskin.getArvo());
    }

}
