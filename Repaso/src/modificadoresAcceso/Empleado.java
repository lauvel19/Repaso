package modificadoresAcceso;

public class Empleado {
    private double salario;

    public Empleado(double salarioInicial) {
        salario = salarioInicial;
    }

    public double getSalario() {
        return salario;
    }

    public class Main {
        public static void main(String[] args) {
            Empleado empleado = new Empleado(3000);
            System.out.println("Salario: " + empleado.getSalario());
        }
    }
}