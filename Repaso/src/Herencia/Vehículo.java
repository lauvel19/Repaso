package Herencia;

class Vehiculo {
    String marca;
    String modelo;

    void mover() {
        System.out.println("El vehículo " + marca + " " + modelo + " se está moviendo.");
    }
}

class Coche extends Vehiculo {
    void tocarBocina() {
        System.out.println("El coche " + marca + " " + modelo + " está tocando la bocina.");

    class Main {
        public static void main(String[] args) {
            Coche2 coche = new Coche2();
            coche.marca = "Toyota";
            coche.modelo = "Corolla";
            coche.mover();
            coche.tocarBocina();
        }
    }
}}