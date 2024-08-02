package ejercicio14;

import java.util.Scanner;

public class CalculoAyudaAlcaldia {
    private String genero;
    private int edad;


    public CalculoAyudaAlcaldia(String genero, int edad) {
        this.genero = genero;
        this.edad = edad;
    }


    public int calcularAyuda() {
        int ayudaMensual = 0;

        if (genero.equalsIgnoreCase("F")) {
            if (edad > 50) {
                ayudaMensual = 120000;
            } else if (edad >= 30 && edad <= 50) {
                ayudaMensual = 100000;
            }
        } else if (genero.equalsIgnoreCase("M")) {
            ayudaMensual = 40000;
        }

        return ayudaMensual;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el género (F/M): ");
        String genero = scanner.nextLine().trim();


        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();


        CalculoAyudaAlcaldia calculo = new CalculoAyudaAlcaldia(genero, edad);


        int ayuda = calculo.calcularAyuda();
        System.out.println("La ayuda mensual es: " + ayuda);

        scanner.close();
    }
}
