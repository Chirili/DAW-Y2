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
public class rebajas {
   public int descubrePorcentaje(double originalPrice, double discountedPrice){
       int result=0;
       
       result = (int)  (100 - (discountedPrice * 100) / originalPrice);
       
       return result;
   }
}
