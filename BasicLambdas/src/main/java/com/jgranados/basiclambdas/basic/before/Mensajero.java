package com.jgranados.basiclambdas.basic.before;

/**
 * BasicLambdas
 * @author jose - 04.12.2020 
 * @Title: Mensajero
 * @Description: description
 *
 * Changes History
 */
public class Mensajero {

    public void entregarMensaje(ComportamientoDeEntregaDeMensaje forma) {
        forma.entregarMensaje();
    }

    public static void main(String[] args) {

        Mensajero mensajero = new Mensajero();
        
        ComportamientoDeEntregaDeMensaje formaHolaMundo = 
                new EntregaMensajeHolaMundo();
        formaHolaMundo.entregarMensaje();
        
        ComportamientoDeEntregaDeMensaje formaHolaATodos = 
                new EntregaMensajeHolaATodos();
        
        
        
        mensajero.entregarMensaje(formaHolaMundo);
        mensajero.entregarMensaje(formaHolaATodos);
        
        ComportamientoDeEntregaDeMensaje unaLambda = () -> System.out.println("Hola Mundo!!");
        
        mensajero.entregarMensaje(unaLambda);
    }
}