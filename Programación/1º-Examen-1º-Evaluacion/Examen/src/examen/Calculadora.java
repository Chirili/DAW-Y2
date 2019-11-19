/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Andres Carmona Lozano
 */
public class Calculadora {

    /**
     * Metodo que recibe por parametros dos numeros, los suma y el valor de la
     * suma
     */
    public double suma(double num1, double num2) {
        double sum;
        sum = num1 + num2;
        return sum;
    }

    /**
     * Metodo que recibe por parametros dos numeros, los resta y el valor de la
     * resta
     */
    public double resta(double num1, double num2) {
        double rest;
        rest = num1 - num2;
        return rest;
    }

    /**
     * Metodo que recibe por parametros dos numeros, los multiplica y el valor
     * de la multiplicacion
     */
    public double multiplicacion(double num1, double num2) {
        double mult;
        mult = num1 * num2;
        return mult;
    }

    /**
     * Metodo que recibe por parametros dos numeros, los divide y el valor de la
     * division
     */
    public double division(double num1, double num2) {
        double div;
        div = num1 / num2;
        return div;
    }

    /**
     * Metodo que recibe por parametros la base y el exponentes, realiza la
     * potencia y retorna el resultado
     */
    public double potencia(double base, int exponente) {
        double pot;
        pot = Math.pow(base, exponente);
        return pot;
    }

    /**
     * Metodo que recibe por parametros un numero, realiza la raiz cuadrada y
     * devuelve el valor
     */
    public double raizCuadrada(double rnum) {
        double raiz;
        raiz = Math.sqrt(rnum);
        return raiz;
    }
}
