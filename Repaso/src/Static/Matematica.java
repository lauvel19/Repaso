package Static;
public class Matematica {
    static boolean esPar(int numero) { // Método static
        return numero % 2 == 0;
    }


    public class Main {
        public static void main(String[] args) {
            System.out.println("6 es par: " + Matematica.esPar(6)); // true
            System.out.println("7 es par: " + Matematica.esPar(7)); // false
        }
    }
}