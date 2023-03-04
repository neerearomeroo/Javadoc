package net.belen.javadoc.basica;

/**
 *@see Calculadora
 * Esta clase devuelve los resultados de las operaciones
 */
public class CalculadoraBasica implements Calculadora{

    @Override
    public double sumar(double a, double b) {
        return a+b;
    }


    @Override
    public double restar(double a, double b) {
        return a-b;
    }


    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }


    @Override
    public double dividir(double a, double b) {
        return a/b;
    }
}
