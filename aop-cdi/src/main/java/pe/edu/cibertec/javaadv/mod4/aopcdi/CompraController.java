/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.aopcdi;

/**
 *
 * @author JAVA-ADV
 */
public interface CompraController {

    /**
     *
     *
     * @param tarjeta
     * @param monto
     * @param concepto
     * @return
     */
    public boolean comprar(
            String tarjeta,
            Double monto,
            String concepto);
}
