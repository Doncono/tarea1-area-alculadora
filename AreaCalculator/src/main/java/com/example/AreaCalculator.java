package com.example;

public class AreaCalculator {

    public double calcularAreaCirculo(double radio) {
        if (radio < 0) throw new IllegalArgumentException("El radio no puede ser negativo");
        return Math.PI * radio * radio;
    }

    public double calcularAreaCuadrado(double lado) {
        if (lado < 0) throw new IllegalArgumentException("El lado no puede ser negativo");
        return lado * lado;
    }

    public double calcularAreaRectangulo(double base, double altura) {
        if (base < 0 || altura < 0) throw new IllegalArgumentException("Las dimensiones no pueden ser negativas");
        return base * altura;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) throw new IllegalArgumentException("Las dimensiones no pueden ser negativas");
        return (base * altura) / 2;
    }
}
