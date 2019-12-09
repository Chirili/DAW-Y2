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
    public void calcColor(){
        switch(this.color){
            case "Blanco":
                this.precio += 10;
                break;
            case "Rosa":
                this.precio += 15;
                break;
            case "Azul":
                this.precio += 25;
                break;
        }
    }
    public void calcPrice(){
        switch(this.modelo){
            case "Multifuncion 6332":
                this.precio = 59.90;
                break;
            case "Multifuncion 3720 WIFI e impresion movil":
                this.precio = 79.90;
                break;
            case "Multifuncion WIFI 3735 WIFI":
                this.precio = 69.90;
                break;
            case "Multifuncion Laser":
                this.precio = 179;
                break;
        }
    }
    public String toString(){
        System.out.println("Has elegido el modelo de impresora: "+this.modelo);
        System.out.println("El color seleccionado para la impresora es: "+this.color);
        return "El precio final de la impresora es de: "+this.precio+ " euros";
    }
}
