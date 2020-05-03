/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.ColorEnum;
import Utils.ConsumoEnum;
import Utils.*;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;

/**
 *
 * @author Andres
 */
public class Electrodomestico {

    private static final int PRECIO_BASE = 100;

    private int precio;
    private String color;
    private char consumo_energetico;
    private double peso;

    //Constructor por defecto de Electrodomestico
    public Electrodomestico() {
        this.precio = this.PRECIO_BASE;
        this.color = this.comprobarColor(ColorEnum.BLANCO.getColor());
        this.consumo_energetico = this.comprobarConsumoEnergetico('F');
        this.peso = peso;
    }

    //Constructor parametrizado con el precio y peso de Electrodomestico
    public Electrodomestico(int precio, double peso) {
        this.precio = precio;
        this.color = this.comprobarColor(ColorEnum.BLANCO.getColor());
        this.consumo_energetico = this.comprobarConsumoEnergetico('F');
        this.peso = peso;
    }

    //Constructor parametrizado con todos los atributos
    public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;
        this.color = this.comprobarColor(color);
        this.consumo_energetico = this.comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }
    
    

    /**
     * Metodo encargado de comprobar que la letra es correcta, si no lo es
     * devuelve un valor por defecto
     *
     * @param consumo
     * @return
     */
    private char comprobarConsumoEnergetico(char consumo) {
        return (ConsumoEnum.stream().anyMatch(p -> p.getConsumo() == consumo) ? consumo : ConsumoEnum.F.getConsumo());
    }

    /**
     * Metodo encargado de comprobar que el color es correcto, si no lo es
     * devuelve un valor por defecto
     *
     * @param color
     * @return
     */
    private String comprobarColor(String color) {
        return (ColorEnum.stream().anyMatch(c -> c.getColor().equalsIgnoreCase(color)) ? color.toUpperCase() : ColorEnum.BLANCO.getColor());
    }

    public void precioFinal() {
        this.precio += ConsumoEnum.stream().filter(p -> p.getConsumo() == this.consumo_energetico).findAny().get().getPrecio();
        //Si el tamaño introducido es mas grande que el tamaño maximo del Enum le asigno el maximo valor del Enum
        //Sino se le aplicara los valores correspondientes a ese tamaño
        //Con esta sentencia me olvido de tener que modificar el metodo en un futuro y solo modificar el enum
        //Principio de Abierto/Cerrado: las clases, metodos y funciones, tienen que estar abiertos para su extension, pero cerrados para su modificacion
        if (this.peso > SizeEnum.stream().max(Comparator.comparing(SizeEnum::getSize)).get().getSize()) {
            this.precio += SizeEnum.stream().max(Comparator.comparing(SizeEnum::getSize)).get().getPrecio();
        } else {
            this.precio += SizeEnum.stream().filter(p -> p.getSize() > this.peso).findFirst().get().getPrecio();
        }
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public int getPrecio_base() {
        return precio;
    }

    public void setPrecio_base(int precio_base) {
        this.precio = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
