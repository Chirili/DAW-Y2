/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public class Lavadora extends Electrodomestico {

    private static final int CARGA_BASE = 5;

    private int carga;

    //Constructor por defecto de Lavadora
    public Lavadora() {
        super();
        this.carga = this.CARGA_BASE;
    }

    //Constructor parametrizado de Lavadora
    public Lavadora(int carga) {
        this.carga = carga;
    }

    //Constructor parametrizado de Lavadora y Electrodomestico
    public Lavadora(int carga, int precio, double peso) {
        super(precio, peso);
        this.carga = carga;
    }

    /**
     *Metodo encargado de añadir precio adicional a la lavadora
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga > 30){
            super.setPrecio_base(super.getPrecio_base()+30);
        }
        
    }
    
    //Constructor parametrizado 2 de Lavadora y Electrodomestico
    public Lavadora(int carga, int precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
    }

    //Getters de carga
    public int getCarga() {
        return this.carga;
    }
    public int getPrecio_base(){
        return super.getPrecio_base();
    }
}
