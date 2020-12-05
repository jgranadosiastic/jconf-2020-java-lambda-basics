package com.jgranados.basiclambdas.basic.before;

/**
 * BasicLambdas
 * @author jose - 04.12.2020 
 * @Title: MensajeHolaATodos
 * @Description: description
 *
 * Changes History
 */
public class EntregaMensajeHolaATodos implements ComportamientoDeEntregaDeMensaje {

    @Override
    public void entregarMensaje() {
        System.out.println("HOLA");
        System.out.println("A TODOS!!!");
    }

}
