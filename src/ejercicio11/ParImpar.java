package ejercicio11;

import java.util.Scanner;

public class ParImpar {
    private int numero;

    public ParImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        numero = sc.nextInt();
        this.numero = numero;

        if(numero % 2 == 0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        sc.close();

    }
    public static void main(String[] args) {
        ParImpar p = new ParImpar();}
}
