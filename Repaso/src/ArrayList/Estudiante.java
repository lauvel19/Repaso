package ArrayList;

import java.util.ArrayList;

class Estudiante {
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
        estudiantes.add(estudiante);
    }

    void listarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}

/*public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación Java");
        curso.añadirEstudiante(new Estudiante("Ana", 22));
        curso.añadirEstudiante(new Estudiante("Luis", 24));

        curso.listarEstudiantes();
    }
}*/

