package Final;

class Rectangulo {
    public final int LADOS = 4;

    public void mostrarLados() {
        System.out.println("Un rectángulo tiene " + LADOS + " lados.");
    }

    public void cambiarLados() {
        // Esto genera un error porque no se puede cambiar el valor de un atributo final
        LADOS = 5;
    }

    public class Main {
        public static void main(String[] args) {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.mostrarLados();
        }
    }
}