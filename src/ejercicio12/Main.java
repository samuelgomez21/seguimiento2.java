package ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el número de calificaciones: ");
        int numCalificaciones = scanner.nextInt();


        double[] calificaciones = new double[numCalificaciones];


        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida. Ingrese un número válido para la calificación " + (i + 1) + ": ");
                scanner.next();
            }
            calificaciones[i] = scanner.nextDouble();
        }


        CalificacionMaterias cm = new CalificacionMaterias(calificaciones);


        double promedio = cm.calcularPromedio();
        String calificacion = cm.determinarCalificacion();


        System.out.printf("El promedio de calificaciones es: %.2f%n", promedio);
        System.out.println("La calificación obtenida es: " + calificacion);


        scanner.close();
    }
}
