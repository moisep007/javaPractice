package org.moises.hogar;

import org.moises.jardin.*;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Moises");
        persona.setApellido("Perez");

        Perro perro = new Perro();
        System.out.println(persona.getNombre() + " " + persona.getApellido());

        System.out.println(persona.tirarPiedra(perro));
    }
}
