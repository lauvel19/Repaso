package Static;

public class Banco {
    static double saldoTotal = 0;

    static void mostrarSaldoTotal() {
        System.out.println("Saldo Total: " + saldoTotal);
    }

    public class Main {
        public static void main(String[] args) {
            Banco.saldoTotal = 1000.00;

            Banco.mostrarSaldoTotal();
        }
    }
}