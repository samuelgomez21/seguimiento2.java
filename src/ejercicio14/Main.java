package ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el género de la persona (M para masculino, F para femenino):");
        String genero = scanner.nextLine().trim().toUpperCase();


        while (!genero.equals("M") && !genero.equals("F")) {
            System.out.println("Género inválido. Ingrese M para masculino o F para femenino:");
            genero = scanner.nextLine().trim().toUpperCase();
        }


        System.out.println("Ingrese la edad de la persona:");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese una edad válida:");
            scanner.next();
        }
        int edad = scanner.nextInt();


        CalculoAyudaAlcaldia calculo = new CalculoAyudaAlcaldia(genero, edad);


        int ayudaMensual = calculo.calcularAyuda();
        if (ayudaMensual > 0) {
            System.out.println("El valor recibido mensualmente por ayuda de la alcaldía es: $" + ayudaMensual);
        } else {
            System.out.println("No corresponde recibir ayuda según los criterios ingresados.");
        }


        scanner.close();
    }
}
