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
public class Smartphone extends Producto {

    private boolean hasNFC;
    private int batteryCapacity;

    //Constructor por defecto
    public Smartphone() {
        super();
        this.hasNFC = false;
        this.batteryCapacity = 0;
    }
    
    /**
     * Constructor parametrizado
     * @param hasNFC
     * @param capacity 
     */
    public Smartphone(boolean hasNFC, int capacity) {
        super();
        this.hasNFC = hasNFC;
        this.batteryCapacity = capacity;
    }

    /**
     * Constructor parametrizado con los parametros de la clase padre
     * @param hasNFC
     * @param batteryCapacity
     * @param precio
     * @param color
     * @param modelo
     * @param proveedor 
     */
    public Smartphone(boolean hasNFC, int batteryCapacity, double precio, String color, String modelo, String proveedor) {
        super(precio, color, modelo, proveedor);
        this.hasNFC = hasNFC;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNFC"+((this.isHasNFC())? "Tiene NFC":"No tiene NFC")+
                "\nCapacidad de la bateria: "+this.getBatteryCapacity();
    }

    /**
     * Getters y setters de Smartphone
     * @return 
     */
    public boolean isHasNFC() {
        return hasNFC;
    }

    public void setHasNFC(boolean hasNFC) {
        this.hasNFC = hasNFC;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
}
