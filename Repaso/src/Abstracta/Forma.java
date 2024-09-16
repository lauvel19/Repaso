package Abstracta;

abstract class Forma {
    abstract double calcularArea();

    public class Main {
        public static void main(String[] args) {
            Forma cuadrado = new Cuadrado(4);
            Forma circulo = new Circulo(3);

            System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
            System.out.println("Área del círculo: " + circulo.calcularArea());
        }
    }

}

class Cuadrado extends Forma {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Forma {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
