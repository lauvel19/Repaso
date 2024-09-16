package Herencia;

class Vehiculo3 {
    String marca;
    String modelo;

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}

class Coche3 extends Vehiculo {
    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo;
    }
}

class Moto3 extends Vehiculo {
    @Override
    public String toString() {
        return "Moto: " + marca + " " + modelo;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        coche.marca = "Toyota";
        coche.modelo = "Corolla";
        System.out.println(coche);

        Vehiculo moto = new Moto3();
        moto.marca = "Yamaha";
        moto.modelo = "MT-07";
        System.out.println(moto);
    }
}
