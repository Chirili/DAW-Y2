/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblackfriday;
import Utils.Utils;

/**
 *
 * @author Andresito
 */
public class BlackFriday {
    private String tamaño;
    private String color;
    private String modelo;
    private double precio;
    
    BlackFriday(){
        this.tamaño="";
        this.color="Negro";
        this.modelo="";
        this.precio=0;
    }
    BlackFriday(String modelo){
        this.tamaño = "";
        this.color = "Negro";
        this.modelo = modelo;
        this.precio = 0;
    }
    BlackFriday(BlackFriday bf){
        this.tamaño = bf.tamaño;
        this.color=bf.color;
        this.modelo=bf.modelo;
        this.precio=bf.precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void defaultMenu(){
        Utils uts = new Utils();
        int menuChoice;
        do{
        System.out.println("1. Ver precio.");
        System.out.println("2. Ver colores disponibles.");
        System.out.println("3. Comprar.");
        System.out.println("0. Salir.");
        menuChoice = uts.getInt();
        switch(menuChoice){
            case 1:
                System.out.println("Precio de la impresora: "+getPrecio());
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
        }
        }while(menuChoice > 3);
    }
    public void menuBuy(){
        
    }
}
