package Final;

class Calculadora {
    public int multiplicar(final int a, final int b) {
        // a = 10;  // Esto da un error
        return a * b;
    }

    public class Main {
        public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            System.out.println("Resultado: " + calc.multiplicar(5, 3));
        }
    }
}
