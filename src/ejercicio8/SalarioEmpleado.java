package ejercicio8;

public class SalarioEmpleado {
    public static class Empleado {
        private String nombre;
        private int horasTrabajadas;

        public Empleado(String nombre, int horasTrabajadas) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
        }

        public int calcularSalario() {
            int salario = 0;
            if (horasTrabajadas <= 10) {
                salario = horasTrabajadas * 30000;
            } else {
                salario = horasTrabajadas * 33000;
            }
            return salario;
        }

        public void mostrarMensajeSalario() {
            int salario = calcularSalario();
            System.out.println("Señor(a) " + nombre + ", el número de horas es " + horasTrabajadas + " y su salario equivale a $" + salario);
        }
    }
}

