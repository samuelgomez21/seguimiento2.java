package ejercicio13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Ingrese el tercer número: ");
            double numero3 = scanner.nextDouble();


            MayorDeTresNumeros mtn = new MayorDeTresNumeros(numero1, numero2, numero3);


            double mayor = mtn.encontrarMayor();
            System.out.println("El número mayor es: " + mayor);

        } catch (Exception e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}
