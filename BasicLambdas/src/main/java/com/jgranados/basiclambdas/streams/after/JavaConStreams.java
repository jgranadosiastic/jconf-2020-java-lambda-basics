package com.jgranados.basiclambdas.streams.after;

import com.jgranados.basiclambdas.streams.TipoTransaccion;
import com.jgranados.basiclambdas.streams.Transaccion;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * BasicLambdas
 *
 * @author jose - 12.2020
 * @Title: JavaConStreams
 * @Description: description
 *
 * Changes History
 */
public class JavaConStreams {

    public static void main(String[] args) {
        List<Transaccion> transacciones = Stream.of(
                new Transaccion(TipoTransaccion.VENTA, "venta 1", 1000.0),
                new Transaccion(TipoTransaccion.VENTA, "venta 2", 4000.0),
                new Transaccion(TipoTransaccion.COMPRA, "compra 1", 20000.0),
                new Transaccion(TipoTransaccion.DEVOLUCION, "devolucion 1", 500.0)
        ).collect(Collectors.toList());

        List<Transaccion> ventas = transacciones
                .stream()
                .filter(transaccion -> TipoTransaccion.VENTA == transaccion.getTipo())
                .collect(Collectors.toList());

        // mas procesos
        // mostrar las ventas
        ventas
                .stream()
                .forEach(transaccion -> transaccion.imprimir());
    }
}
