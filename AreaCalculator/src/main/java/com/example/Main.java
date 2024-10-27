package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculadora = new AreaCalculator();
        int opcion;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + calculadora.calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + calculadora.calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaR = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + calculadora.calcularAreaRectangulo(baseR, alturaR));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaT = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + calculadora.calcularAreaTriangulo(baseT, alturaT));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
