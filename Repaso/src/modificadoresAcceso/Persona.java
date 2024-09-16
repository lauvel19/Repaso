package modificadoresAcceso;

class Persona {
    public String nombre;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public class Main {
        public static void main(String[] args) {
            Persona persona = new Persona();
            persona.nombre = "Carlos";
            persona.saludar();
        }
    }
}