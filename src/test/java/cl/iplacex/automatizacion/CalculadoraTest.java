package cl.iplacex.automatizacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba Unitaria: Suma basica de enteros positivos")
    public void testSumaPositivos() {
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 + 3 deberia ser 8");
    }

    @Test
    @DisplayName("Prueba Unitaria: Resta basica de enteros")
    public void testRestaPositivos() {
        int resultado = calculadora.mantenerResta(10, 4);
        assertEquals(6, resultado, "La resta de 10 - 4 deberia ser 6");
    }
}
