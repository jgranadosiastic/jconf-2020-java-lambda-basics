package com.jgranados.basiclambdas.basic.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jose
 */
public class EjercicioLambdasConLambdas {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Jose", "Granados", 25),
                new Persona("Mariajose", "Cerna", 42),
                new Persona("Lilian", "Peña", 32),
                new Persona("Mario", "Cano", 47),
                new Persona("Juan", "Lopez", 15)
        );
        
        // ordenar de forma ascendente en base al apellido
        Collections.sort(personas, (Persona p1, Persona p2) -> p1.getApellido().compareToIgnoreCase(p2.getApellido()));
        
        // imprimir todos
        //imprimirTodos(personas);
        imprimirConCondicion(personas, p -> true);
        
        System.out.println("Solo con C:");
        
        // imprimir con letra c
        //imprimirConLetraC(personas);
        imprimirConCondicion(personas, p ->  p.getApellido().startsWith("C"));
        
        System.out.println("Solo con G:");
        
        imprimirConCondicion(personas, p -> p.getApellido().startsWith("G"));
        
    }
    
    public static void imprimirConCondicion(List<Persona> personas, Predicate<Persona> condicion) {
        for (Persona persona : personas) {
            if (condicion.test(persona)) {
                System.out.println(persona);
            }
        }
    }
    
    
    
    interface Condicion {
        boolean evaluar(Persona p);
    }
    
    
    interface algoMas {
        boolean otraCosa(Persona p);
    }
}
