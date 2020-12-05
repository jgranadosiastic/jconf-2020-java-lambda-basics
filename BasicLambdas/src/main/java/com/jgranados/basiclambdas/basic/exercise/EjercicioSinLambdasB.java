package com.jgranados.basiclambdas.basic.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jose
 */
public class EjercicioSinLambdasB {

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
        //imprimirTodos(personas);
        imprimirConCondicion(personas, new Condicion() {
            @Override
            public boolean evaluar(Persona p) {
                return true;
            }
        });
        
        System.out.println("Solo con C:");
        
        // imprimir con letra c
        //imprimirConLetraC(personas);
        imprimirConCondicion(personas, new Condicion() {
            @Override
            public boolean evaluar(Persona p) {
                return p.getApellido().startsWith("C");
            }
        });
        
        System.out.println("Solo con G:");
        
        imprimirConCondicion(personas, new Condicion() {
            @Override
            public boolean evaluar(Persona p) {
                return p.getApellido().startsWith("G");
            }
        });
        
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
    
    public static void imprimirConCondicion(List<Persona> personas, Condicion condicion) {
        for (Persona persona : personas) {
            if (condicion.evaluar(persona)) {
                System.out.println(persona);
            }
        }
    }
    
    interface Condicion {
        boolean evaluar(Persona p);
    }
}
