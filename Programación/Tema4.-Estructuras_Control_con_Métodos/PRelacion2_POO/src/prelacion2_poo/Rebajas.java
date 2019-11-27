/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *  Crea una clase rebajas con un método descrubePorcentaje()
 *  que descubra el descuento aplicado en un producto. 
 *  El método recibe el precio original del producto y el rebajado y haya el porcentaje.
 * @author Andres
 */
public class Rebajas {

    int result = 0;//Contendra el valor final del descuento
    
    /*
    * Metodo que recibe por parametro dos valores, el precio original y el precio con el descuento
    * se realiza una operacion en la que se averigua el % de descuento aplicado y se devuelve el valor
    */
    public int descubrePorcentaje(double originalPrice, double discountedPrice) {

        this.result = (int) (100 - (discountedPrice * 100) / originalPrice);

        return result;
    }
}
