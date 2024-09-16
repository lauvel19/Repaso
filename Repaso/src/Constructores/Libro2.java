package Constructores;
class Libro2 {
    String titulo;
    String autor;

    Libro2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    Libro2(String titulo) {
        this(titulo, "Desconocido");
    }

    void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

    public class Main {
        public static void main(String[] args) {
            Libro libro1 = new Libro("1984", "George Orwell");
            Libro libro2 = new Libro("Libro sin autor");

            libro1.mostrarInfo();
            libro2.mostrarInfo();
        }
    }
}