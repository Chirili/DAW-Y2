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
    public static void main(String[] args) throws AWTException{
        
        Menu mainMenu = new Menu();
        
        mainMenu.setMenuTittle("Elije el ejercicio a visualizar");
        System.out.println(mainMenu.getMenuTittle());
        
        
            System.out.println("1. Entrega Paquetes.");
            System.out.println("2.Cancion");
            System.out.println("3. Salir");
            System.out.print("Eleccion: ");
            
    }
    
}
