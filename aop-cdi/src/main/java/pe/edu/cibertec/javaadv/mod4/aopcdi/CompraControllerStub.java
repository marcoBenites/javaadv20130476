/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.aopcdi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAVA-ADV
 */
public class CompraControllerStub implements CompraController {

    @Override
    @Log
    public boolean comprar(
            String tarjeta,
            Double monto,
            String concepto) {
        //Aspecto validacion de campos 
        if (tarjeta == null || tarjeta.trim().isEmpty()) {
            return false;
        }
        if (monto <= 0d) {
            return false;
        }
        if (concepto == null || concepto.trim().isEmpty()) {
            return false;
        }

        //ESTE PUEDE SER UN PROCESO DERIVADO A OTRO SISTEMA
        boolean result = true;
        return result;
    }
}
