package Clases;

class Libro {
    String titulo;
    String autor;
    int numeroDePaginas;

    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
