package ArrayList;

import java.util.ArrayList;

public class Estudiantes {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Carlos");
        estudiantes.add("Sofia");

        System.out.println("Nombres de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("Nombres en orden inverso:");
        for (int i = estudiantes.size() - 1; i >= 0; i--) {
            System.out.println(estudiantes.get(i));
        }
    }
}
