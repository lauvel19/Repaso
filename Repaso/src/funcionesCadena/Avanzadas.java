package funcionesCadena;

public class Avanzadas {
    public static void main(String[] args) {
        String cadena = "  Java, Python, C++, Ruby  ";

        String[] lenguajes = cadena.split(",");

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje.trim());
        }
    }
}
