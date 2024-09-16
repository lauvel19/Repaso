package Clases;

public class mainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.numeroDePaginas = 417;

        Libro libro2 = new Libro();
        libro2.titulo = "El principito";
        libro2.autor = "Antoine de Saint-Exupéry";
        libro2.numeroDePaginas = 96;

        Libro libro3 = new Libro();
        libro3.titulo = "Don Quijote de la Mancha";
        libro3.autor = "Miguel de Cervantes";
        libro3.numeroDePaginas = 863;

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
    }
}
