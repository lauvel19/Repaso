package Constructores;

class Libro {
    String titulo;
    String autor;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
    }

    void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

    public class Main {
        public static void main(String[] args) {
            Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
            Libro libro2 = new Libro("Libro sin autor");

            libro1.mostrarInfo();
            libro2.mostrarInfo();
        }
    }
}