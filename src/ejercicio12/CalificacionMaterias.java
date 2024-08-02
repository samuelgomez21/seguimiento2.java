package ejercicio12;

import java.util.Scanner;

public class CalificacionMaterias {
    private double[] calificaciones;


    public CalificacionMaterias(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }


    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }


    public String determinarCalificacion() {
        double promedio = calcularPromedio();
        if (promedio >= 0 && promedio < 6) {
            return "Mala";
        } else if (promedio >= 6 && promedio <= 8) {
            return "Buena";
        } else if (promedio > 8 && promedio <= 10) {
            return "Excelente";
        } else {
            return "Promedio fuera de rango";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de calificaciones: ");
        int numCalificaciones = sc.nextInt();
        double[] calificaciones = new double[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {
            System.out.println("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }


        CalificacionMaterias cm = new CalificacionMaterias(calificaciones);


        double promedio = cm.calcularPromedio();
        String calificacion = cm.determinarCalificacion();

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);

        sc.close();
    }
}
