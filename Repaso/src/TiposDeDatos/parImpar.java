package TiposDeDatos;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        String numeroCadena = scanner.nextLine();

        int numero = Integer.parseInt(numeroCadena);

        if(numero % 2 == 0){
            System.out.println("El número " + numero + "es par.");
        }else {
            System.out.println("El número " + numero + "es impar");
        }
        scanner.close();
    }
}
