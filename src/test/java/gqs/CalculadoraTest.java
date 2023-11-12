package gqs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void doisSomaDoisEsperaQuatro() {
        Calculadora c = new Calculadora();
        assertEquals(4, c.SomaInteiros(2, 2));
    }

    @Test
    void tresSomaSeteEsperaDez() {
        Calculadora c = new Calculadora();
        assertTrue(c.SomaInteiros(3, 7)==10);

    }

    @Test
    void dezSubtraiSeteEsperaTres() {
        Calculadora c = new Calculadora();
        assertTrue(c.SubtraiInteiros(10, 7)==3);

    }

    @Test
    void seisMultiplicaNovaEsperaCinquentaQuatro() {
        Calculadora c = new Calculadora();
        assertTrue(c.MultiplicaInteiros(6, 9)==54);
    }

    @Test
    void vinteUmDivideSeteEsperaTres() {
        Calculadora c = new Calculadora();
        assertTrue(c.DividiInteiros(21, 7)==3);
    }

}