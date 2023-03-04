package net.belen.javadoc.basica;

/**
 * Contrato de las operaciones sumar, restar, 
 * multilicar y dividir. 
 */
public interface Calculadora {


    /**
     * @return sumar devuelve la suma
     */
    double sumar(double a, double b);

    /**
     * @return restar devuelve la resta
     */
    double restar(double a, double b);

    /**
     * @return multiplicar devuelve la multiplicación
     */
    double multiplicar(double a, double b);

    /**
     * @return dividir devuelve la división
     */
    double dividir(double a, double b);

}
