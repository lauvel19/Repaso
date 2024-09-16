package modificadoresAcceso;

class cuentaBancaria {
    private double saldo;

    public cuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No se puede retirar esa cantidad.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public class Main {
        public static void main(String[] args) {
            cuentaBancaria cuenta = new cuentaBancaria(500);
            cuenta.depositar(200);
            cuenta.retirar(100);
            cuenta.retirar(700);  // No permitirá realizar el retiro
        }
    }
}