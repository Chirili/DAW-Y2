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

    /**
     * Propiedades de la clase
     */
    private String tamaño;
    private String color;
    private String modelo;
    private double precio;

    /**
     * Constructor por defecto
     */
    BlackFriday() {
        this.tamaño = "";
        this.color = "Negro";
        this.modelo = "";
        this.precio = 0;
    }

    /**
     * Constructor copia
     *
     * @param bf
     */
    BlackFriday(BlackFriday bf) {
        this.tamaño = bf.tamaño;
        this.color = bf.color;
        this.modelo = bf.modelo;
        this.precio = bf.precio;
    }

    /**
     * Getter de tamaño
     *
     * @return
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Setter de tamaño
     *
     * @param tamaño
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Getter de color
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter de color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter de modelo
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter de modelo
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter de precio
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter de precio
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * calcColor, se encarga de sumar a la propiedad precio el valor del color
     * elegido
     */
    public void calcColor() {
        switch (this.color) {
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

    /**
     * calcPrice se encarga de añadir el valor inicial de cada impresora
     */
    public void calcPrice() {
        switch (this.modelo) {
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

    /**
     * Metodo tostring para imprimir por pantalla las propiedades de la clase
     *
     * @return
     */
    @Override
    public String toString() {
        System.out.println("Has elegido el modelo de impresora: " + this.modelo);
        System.out.println("El color seleccionado para la impresora es: " + this.color);
        return "El precio final de la impresora es de: " + this.precio + " euros";
    }
}
