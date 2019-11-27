/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author Andres
 */
public class MilesConverter {
    private final double metersConverter  = 1609.344;
    private final double kilometersConverter  = 1609.344;
 
    /*
    *   Metodo para calcular los metros a partir de las millas
    */
    public void millasAMetros(double miles){
        double result;
        result = miles * this.metersConverter;
    }
    
    /*
    * Metodo para calcular los kilometros a partir de las millas
    */
    public void millasAKilometros(double miles){
        double result;
        result = miles * this.kilometersConverter;
    }
    
}
