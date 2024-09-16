package Final;

final class Persona {
    public void saludar() {
        System.out.println("Hola, soy una persona.");
    }
// esta clase da error
    class Estudiante extends Persona {
        public void estudiar() {
            System.out.println("Estoy estudiando.");
        }
    }
}