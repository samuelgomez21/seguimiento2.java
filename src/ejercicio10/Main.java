package ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tipo de lavadora (1 o 2): ");
        int tipoLavadora = scanner.nextInt();


        System.out.print("Ingrese el número de horas de alquiler: ");
        int horasAlquiler = scanner.nextInt();


        AlquilerLavadoras alquiler = new AlquilerLavadoras(tipoLavadora, horasAlquiler);


        int costo = alquiler.calcularCostoAlquiler();
        if (costo > 0) {
            System.out.println("El costo total del alquiler es: $" + costo);
        }


        scanner.close();
    }
}
