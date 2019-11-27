/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andres
 */
public class Menu {
    private String menuTittle="";
    HashMap <Key, Integer> menu = new HashMap<>();
    ArrayList choices = new ArrayList();
    public void Menu(){
       
    }
    public void addMenuKey(String number, String name){
         Key k12 = new Key(number,name);
         menu.put(k12, 1);
    }
    public void addChoice(){
        
    }
    public void printMenu(){
        
    }
    public String getMenuTittle(){
        return this.menuTittle;
    }
    public void setMenuTittle(String tittle){
        this.menuTittle = tittle;
    }
}
