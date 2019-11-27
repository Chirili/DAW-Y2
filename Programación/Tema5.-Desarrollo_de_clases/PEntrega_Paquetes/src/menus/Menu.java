/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.ArrayList;
import java.util.HashMap;
import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Menu {

    private String menuTittle = "";
    HashMap<Key, Object> menu = new HashMap<>();
    ArrayList choices = new ArrayList();
    
    public void addMenuKey(String number, String name) {
        Key k12 = new Key(number, name);
        menu.put(k12, 1);
    }
    
    public void addChoice(String choice) {
        choices.add(choice);
    }

    public void printChoices() {
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + 1 + ". " + choices.get(i));
        }
    }
    
    /**
     * Metodo que se encarga de validar la eleccion del usuario
     */
    public void menuScan() {
        Utils uts = new Utils();
        int userChoice;
        boolean rightChoice = false;
        do {
            System.out.print("Eleccion: ");
            userChoice = uts.getInt();
            if (userChoice <= choices.size() && userChoice > 0) {
                rightChoice = true;
            }else {
                System.out.println("Eleccion incorrecta vuelve a intentarlo");
            }
        } while (rightChoice != true);
    }

    
    public String getMenuTittle() {
        return this.menuTittle;
    }

    public void setMenuTittle(String tittle) {
        this.menuTittle = tittle;
    }
}
