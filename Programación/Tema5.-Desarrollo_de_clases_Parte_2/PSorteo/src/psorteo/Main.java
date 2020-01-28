/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psorteo;
import models.*;
/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dado d = new Dado();
        
        System.out.println("Resultado al del dado lanzado: "+d.lanzar());
        
        Moneda m = new Moneda();
        
        if(m.lanzar() == 0){
            System.out.println("Al lanzar la moneda ha salido cara");
        }else {
            System.out.println("Al lanzar la moneda ha salido cruz");
        }
    }
    
}
