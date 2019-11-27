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
        
        mainMenu.setMenuTittle("Elije el ejercicio a visualizar, puedes elegir tanto el numero como el nombre:");
        System.out.println(mainMenu.getMenuTittle());
        mainMenu.addChoice("Entrega Paquetes.");
        mainMenu.addChoice("Cancion.");
        mainMenu.addChoice("Salir.");
        mainMenu.printChoices();
        mainMenu.menuScan();
        mainMenu.addMenuKey("1","Entrega Paquetes");
        mainMenu.addMenuKey("2","Cancion");
        mainMenu.addMenuKey("3","Salir");
        
    }
    
}
