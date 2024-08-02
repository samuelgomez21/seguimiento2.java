package ejercicio9;

import java.util.Scanner;

public class DeterminarPositivoNegativo {

    private int numero;

    public DeterminarPositivoNegativo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        numero = sc.nextInt();

        if(numero >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static void main(String[] args) {
        new DeterminarPositivoNegativo();
    }

}
