package TiposDeDatos;

import java.util.ArrayList;

public class autoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int suma = 0;
        for(Integer numero : numeros){
            suma += numero;
        }
        System.out.println("La suma de los números es" + suma);
    }
}
