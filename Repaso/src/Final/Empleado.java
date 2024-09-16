package Final;

class Empleado {
    public final void trabajar() {
        System.out.println("El empleado está trabajando.");
    }

    class Gerente extends Empleado {
        // Esto genera un error porque no se puede sobrescribir un método final
        public void trabajar() {
            System.out.println("El gerente está trabajando.");
        }
    }
}