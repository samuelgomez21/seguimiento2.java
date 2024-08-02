package ejercicio13;

public class MayorDeTresNumeros {
    private double numero1;
    private double numero2;
    private double numero3;


    public MayorDeTresNumeros(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }


    public double encontrarMayor() {
        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        return mayor;
    }

    public static void main(String[] args) {

        MayorDeTresNumeros mtn = new MayorDeTresNumeros(10, 20, 15);


        double mayor = mtn.encontrarMayor();
        System.out.println("El mayor de los tres números es: " + mayor);
    }
}
