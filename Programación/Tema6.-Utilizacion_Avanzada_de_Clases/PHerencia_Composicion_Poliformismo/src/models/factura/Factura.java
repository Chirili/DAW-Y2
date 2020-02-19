/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.factura;
import Utils.Utils;
/**
 *
 * @author usuario
 */
public abstract class Factura {
    protected int numero;
    protected double pctDescuento;
    
    Factura(){
        this.numero = generateNumber();
        this.pctDescuento = 0;
    }
    
    private int generateNumber(){
        return (int) (Math.random()*100000);
    }

    public void capturar(){
        Utils uts = new Utils();
        
        System.out.println();
    }
    /**
     * Getters y setter de los atributos de Factura
     * @return 
     */     
    //He omitido el setFactura debido a que tengo un constructor que realiza dicho procedimiento.
    //Setter de numero omitido debido a que existe un metodo que lo genera
    public int getNumero() {
        return numero;
    }

    public double getPctDescuento() {
        return pctDescuento;
    }

    public void setPctDescuento(double pctDescuento) {
        this.pctDescuento = pctDescuento;
    }
    
    
}
