package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {

    private final AreaCalculator calculator = new AreaCalculator();

    @Test
    void testCalcularAreaCirculo() {
        assertEquals(Math.PI * 4, calculator.calcularAreaCirculo(2), 0.0001);
        assertEquals(0, calculator.calcularAreaCirculo(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.calcularAreaCirculo(-1));
    }

    @Test
    void testCalcularAreaCuadrado() {
        assertEquals(9, calculator.calcularAreaCuadrado(3), 0.0001);
        assertEquals(0, calculator.calcularAreaCuadrado(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.calcularAreaCuadrado(-1));
    }

    @Test
    void testCalcularAreaRectangulo() {
        assertEquals(20, calculator.calcularAreaRectangulo(4, 5), 0.0001);
        assertEquals(0, calculator.calcularAreaRectangulo(0, 5), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.calcularAreaRectangulo(-1, 5));
    }

    @Test
    void testCalcularAreaTriangulo() {
        assertEquals(10, calculator.calcularAreaTriangulo(4, 5), 0.0001);
        assertEquals(0, calculator.calcularAreaTriangulo(0, 5), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.calcularAreaTriangulo(-1, 5));
    }
}
