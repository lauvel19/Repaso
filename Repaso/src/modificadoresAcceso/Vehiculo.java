package modificadoresAcceso;

class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    class Coche extends Vehiculo {
        public Coche() {
            super("Automóvil");
        }

        public void mostrarTipo() {
            System.out.println("Tipo de vehículo: " + tipo);
        }
    }

    public class Main {
        public void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.mostrarTipo();
        }
    }
}