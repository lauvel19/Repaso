package estructurasControl;

import java.util.Scanner;

public class numeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Has ingresado un número negativo.");
        scanner.close();
    }
}

