/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentrega_paquetes;
import Utils.*;
import java.awt.AWTException;
import menus.*;
//import Ejercicios.*;
/**
 *
 * @author Andres
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Sumar sm = new Sumar();
        Potenciar pt = new Potenciar();
        
        System.out.println("Resultado de la suma: "+sm.sumar(1, 1));
        System.out.println("Resultado de la potencia: "+pt.potenciar(2, 3));
        
    }
    
}
