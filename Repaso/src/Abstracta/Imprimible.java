package Abstracta;

interface Imprimible {
    void imprimir();
}

class Documento implements Imprimible {
    String texto;

    Documento(String texto) {
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento: " + texto);
    }
}

class Foto implements Imprimible {
    String resolucion;

    Foto(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo foto con resolución: " + resolucion);
    }

    public class Main {
        public static void main(String[] args) {
            Imprimible doc = new Documento("Informe de ventas");
            Imprimible foto = new Foto("1920x1080");

            doc.imprimir();
            foto.imprimir();
        }
    }

}
