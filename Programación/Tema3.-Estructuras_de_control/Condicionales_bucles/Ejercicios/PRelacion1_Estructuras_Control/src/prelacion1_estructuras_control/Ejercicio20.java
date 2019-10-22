/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author usuario
 */
public class Ejercicio20 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = calcPrice();
        System.out.print(str);
    }
    
    public String calcPrice(){
        
        double price,discount;
        
        System.out.print("Porfavor introduce el importe bruto: ");
        price = uts.getDouble();
        
        if (price > 20000){
            discount = 1.21*(0.85*price);
            
            System.out.println("El resultado neto con un 15% de descuento de la factura es igual a: "+discount);
        }else{
            price = price * 1.21;
            System.out.println("El resultado neto de la factura es igual a: "+price);
        }
        
        
        return "\n";
    }
}
