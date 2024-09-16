package Clases;

class cocheMetodo {
    String marca;
    String modelo;

    cocheMetodo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
