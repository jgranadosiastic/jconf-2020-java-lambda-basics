package com.jgranados.basiclambdas.basic.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jose
 */
public class EjercicioSinLambdasA {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Jose", "Granados", 25),
                new Persona("Mariajose", "Cerna", 42),
                new Persona("Lilian", "Peña", 32),
                new Persona("Mario", "Cano", 47),
                new Persona("Juan", "Lopez", 15)
        );
        
        // ordenar de forma ascendente en base al apellido
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getApellido().compareToIgnoreCase(o2.getApellido());
            }
        });
        
        // imprimir todos
        imprimirTodos(personas);
        
        System.out.println("Solo con C:");
        
        // imprimir con letra c
        imprimirConLetraC(personas);
        
    }
    
    
    public static void imprimirTodos(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
    public static void imprimirConLetraC(List<Persona> personas) {
        for (Persona persona : personas) {
            if (persona.getApellido().startsWith("C")) {
                System.out.println(persona);
            }
        }
    }
    
}
