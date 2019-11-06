/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 * Realiza una clase finanzasque convierta dólares a euros y viceversa. Codifica
 * los métodos dolaresToeuros y eurosToDolares. Prueba que dicha clase funciona
 * correctamente haciendo conversiones entre euros y dólares. La clase tiene que
 * tener: 
 * Un constructor finanzas()por defecto el cual establecerá el cambio
 * Dólar-Euro en 1.36 
 * Un constructor finanzas(double), el cual permitirá
 * configurar el cambio Dólar-Euro.
 *
 * @author Andres
 */
public class Finanzas {

    private double dolarEuro;//Propiedad que se encarga de almacenar el valor de la conversion

    /*
    * Constructor de la clase Finanzas con el valor que añade el valor de la variable dolarEuro.
     */
    Finanzas() {
        this.dolarEuro = 1.36;
    }

    /*
    * Segundo constructor de la clase Finanzas al cual se le pasa un valor por parametro para realizar la conversion.
     */
    Finanzas(double conversion) {
        this.dolarEuro = conversion;
    }

    /*
    * Metodo encargado de hacer la conversion de dolares a euros.
     */
    public double dolaresToEuros(double dolares) {
        double euros;
        euros = dolares * this.dolarEuro;
        return euros;
    }

    /*
    * Metodo encargado de hacer la conversion de euros a dolares.
     */
    public double eurosToDolares(double euros) {
        double dolares;
        dolares = euros / this.dolarEuro;
        return dolares;
    }
}
