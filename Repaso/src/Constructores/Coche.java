package Constructores;

class Coche {
    String modelo;
    int año;

    Coche() {
        modelo = "Desconocido";
        año = 2024;
    }

    Coche(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Año: " + año);
    }

    public class Main {
        public static void main(String[] args) {
            Coche coche1 = new Coche();
            Coche coche2 = new Coche("Ford", 2021);

            coche1.mostrarInfo();
            coche2.mostrarInfo();
        }
    }
}