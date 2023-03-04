package net.belen.javadoc.avanzada;

import net.belen.javadoc.basica.Calculadora;
import net.belen.javadoc.basica.CalculadoraBasica;

/**
 * Implementación avanzada de la interfaz <code>CalculadoraExtendida</code>
 * @see CalculadoraBasica
 * @see Calculadora
 */
public class CalculadoraAvanzada extends CalculadoraBasica implements CalculadoraExtendida{

    @Override
    public int divisionEntera(int dividendo, int divisor) {
        return dividendo / divisor;
    }


    @Override
    public int resto(int dividendo, int divisor) {
        return dividendo % divisor;
    }


    @Override
    public double potencia(double base, double exponente) {
        double resultado = 1;
        for(int i = 0; i < exponente; i++)
            resultado *= base;
        return resultado;
    }

    /**
     * Método que sirve para parsear una cadena de caracteres a un número
     * @param stringToDouble pasea una cadena de caracteres String
     *
     */
    public double stringToDouble(String number) {
        return Double.parseDouble(number);
    }
}
