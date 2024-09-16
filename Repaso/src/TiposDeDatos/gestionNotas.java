package TiposDeDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class gestionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();


        System.out.println("Ingresa las calificaciones (escribe 'fin' para terminar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int nota = Integer.parseInt(input);
                notas.add(nota);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida, por favor ingresa un número.");
            }
        }

        if (!notas.isEmpty()) {
            int suma = 0;
            for (int nota : notas) {
                suma += nota;
            }
            double promedio = (double) suma / notas.size();

            System.out.println("El promedio es: " + promedio);
            if (promedio >= 60) {
                System.out.println("El estudiante ha aprobado.");
            } else {
                System.out.println("El estudiante no ha aprobado.");
            }
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }

        scanner.close();
    }
}
