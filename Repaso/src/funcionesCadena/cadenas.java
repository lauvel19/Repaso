package funcionesCadena;
public class cadenas {
    public static void main(String[] args) {
        String cadena = "Aprender Java es divertido";

        int longitud = cadena.length();
        System.out.println("Longitud: " + longitud);

        String subcadena = cadena.substring(19);
        System.out.println("Subcadena: " + subcadena);

        String nuevaCadena = cadena.replace("Java", "Python");
        System.out.println("Cadena reemplazada: " + nuevaCadena);

        String mayusculas = nuevaCadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);
    }
}
