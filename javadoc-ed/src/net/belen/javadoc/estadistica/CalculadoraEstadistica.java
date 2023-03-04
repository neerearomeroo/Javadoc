package net.belen.javadoc.estadistica;

import net.belen.javadoc.avanzada.CalculadoraExtendida;

public interface CalculadoraEstadistica extends CalculadoraExtendida {

    double media(double ...argumentos);

    double max(double ...argumentos);

    /**
     * @return min Devuelve el mínimo.
     */
    double min(double ...argumentos);



}
