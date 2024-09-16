package ArrayList;
import java.util.ArrayList;

public class Enteros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Tamaño de la lista: " + numeros.size());

        numeros.remove(1);

        System.out.println("Contenido de la lista: " + numeros);
    }
}
