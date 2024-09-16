package Abstracta;

interface Imprimible2 {
    void imprimir();

    default void prepararImpresion() {
        System.out.println("Preparando para impresión...");
    }
}

class Documento2 implements Imprimible2 {
    String texto;

    Documento2(String texto) {
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento: " + texto);
    }
}

class Foto2 implements Imprimible2 {
    String resolucion;

    Foto2(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo foto con resolución: " + resolucion);
    }
}

/* public class Main {
    public static void main(String[] args) {
        Imprimible doc = new Documento("Informe de ventas");
        Imprimible foto = new Foto("1920x1080");

        doc.prepararImpresion();
        doc.imprimir();          +

        foto.prepararImpresion();
        foto.imprimir();
    }
}*/
