package Herencia;

class Vehiculo2 {
    String marca;
    String modelo;

    void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
    public class Main {
        public static void main(String[] args) {
            Vehiculo2 miVehiculo = new Coche2();
            miVehiculo.marca = "Toyota";
            miVehiculo.modelo = "Corolla";
            miVehiculo.mover();

            miVehiculo = new Moto();
            miVehiculo.marca = "Yamaha";
            miVehiculo.modelo = "MT-07";
            miVehiculo.mover();
        }
    }
}

class Coche2 extends Vehiculo2 {
    @Override
    void mover() {
        System.out.println("El coche " + marca + " " + modelo + " se está moviendo.");
    }
}

class Moto extends Vehiculo2 {
    @Override
    void mover() {
        System.out.println("La moto " + marca + " " + modelo + " se está moviendo.");
    }
}


