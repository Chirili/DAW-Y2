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
public class Television extends Electrodomestico{
    
    private static final int PULGADAS_BASE = 20;
    
    
    private int pulgadas;
    private boolean hasTDT;
    
    //Constructor por defecto de Television
    public Television(){
        this.pulgadas = PULGADAS_BASE;
        this.hasTDT = false;
    }
    
    //Primer constructor parametrizado de Television
    public Television(int pulgadas, boolean hasTDT){
        this.pulgadas = PULGADAS_BASE;
        this.hasTDT = false;
    }

    //Segundo constructor parametrizado de Television
    public Television(int pulgadas, boolean hasTDT, int precio, double peso) {
        super(precio, peso);
        this.pulgadas = pulgadas;
        this.hasTDT = hasTDT;
    }

    //Tercer constructor parametrizado de Television
    public Television(int pulgadas, boolean hasTDT, int precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.pulgadas = pulgadas;
        this.hasTDT = hasTDT;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.hasTDT){
            super.setPrecio_base(super.getPrecio_base()+50);
        }
        if(this.pulgadas > 40){
            super.setPrecio_base((super.getPrecio_base()*30)/100);
        }
    }
    /**
     * Getters y setters de Television
     * @return 
     */
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isHasTDT() {
        return hasTDT;
    }

    public void setHasTDT(boolean hasTDT) {
        this.hasTDT = hasTDT;
    }
    
    
}
