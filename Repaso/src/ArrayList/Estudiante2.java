package ArrayList;

import java.util.ArrayList;

/*class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

class Curso {
    String nombre;
    ArrayList<Estudiante> estudiantes;

    Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    void añadirEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante añadido: " + estudiante);
        } else {
            System.out.println("El estudiante ya está en el curso.");
        }
    }

    void eliminarEstudiante(Estudiante estudiante) {
        if (estudiantes.remove(estudiante)) {
            System.out.println("Estudiante eliminado: " + estudiante);
        } else {
            System.out.println("El estudiante no está en el curso.");
        }
    }

    void listarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación Java");
        Estudiante ana = new Estudiante("Ana", 22);
        Estudiante luis = new Estudiante("Luis", 24);

        curso.añadirEstudiante(ana);
        curso.añadirEstudiante(luis);
        curso.añadirEstudiante(ana);

        curso.listarEstudiantes();

        curso.eliminarEstudiante(luis);
        curso.listarEstudiantes();
    }
}
*/