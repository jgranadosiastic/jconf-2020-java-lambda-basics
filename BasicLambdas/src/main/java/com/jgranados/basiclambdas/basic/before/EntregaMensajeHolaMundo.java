package com.jgranados.basiclambdas.basic.before;

/**
 * BasicLambdas
 * @author jose - 04.12.2020 
 * @Title: MensajeHolaMundo
 * @Description: description
 *
 * Changes History
 */
public class EntregaMensajeHolaMundo implements ComportamientoDeEntregaDeMensaje {

    @Override
    public void entregarMensaje() {
        System.out.println("Hola Mundo!!");
    }


}