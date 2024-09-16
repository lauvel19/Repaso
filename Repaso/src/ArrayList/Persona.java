package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }


    public class Main {
        public static void main(String[] args) {
            ArrayList<Persona> personas = new ArrayList<>();
            personas.add(new Persona("Ana", 22));
            personas.add(new Persona("Luis", 30));
            personas.add(new Persona("Carlos", 25));
            personas.add(new Persona("Sofia", 20));

            Collections.sort(personas, new Comparator<Persona>() {
                @Override
                public int compare(Persona p1, Persona p2) {
                    return Integer.compare(p1.edad, p2.edad);
                }
            });

            System.out.println("Personas ordenadas por edad:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }
}