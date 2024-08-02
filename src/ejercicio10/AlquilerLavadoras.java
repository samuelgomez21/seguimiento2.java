package ejercicio10;

public class AlquilerLavadoras {
    private int tipoLavadora;
    private int horasAlquiler;


    public AlquilerLavadoras(int tipoLavadora, int horasAlquiler) {
        this.tipoLavadora = tipoLavadora;
        this.horasAlquiler = horasAlquiler;
    }


    public int calcularCostoAlquiler() {
        int costoTotal = 0;

        switch (tipoLavadora) {
            case 1:
                costoTotal = horasAlquiler * 4000;
                break;
            case 2:
                costoTotal = horasAlquiler * 3000;
                break;
            default:
                System.out.println("Opción no válida. Seleccione 1 o 2.");
                return 0;
        }

        if (horasAlquiler > 3) {
            double descuento = costoTotal * 0.03;
            costoTotal -= descuento;
            System.out.println("Se ha aplicado un descuento del 3% por alquilar más de 3 horas.");
        }

        return costoTotal;
    }
}

