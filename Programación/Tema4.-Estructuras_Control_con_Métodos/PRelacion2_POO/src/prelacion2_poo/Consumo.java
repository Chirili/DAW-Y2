/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author Andres
 */
public class Consumo {
    private double kms;
    private double Litros;
    private double vmed;
    private double pgas;
    private int time;
    private double consumoMedio;
    private double consumoEuros;
    
    Consumo(){
        this.kms=250;
        this.Litros=50;
        this.vmed= 80;
        this.pgas=1.200;
    }
    public int getTiempo(double travelKilometers){
        this.time = (int) (this.kms / this.vmed);
        return this.time;
    }
    
    public void consumoMedio(){
        this.consumoMedio = (this.Litros / this.kms) * 100;
    }
    
    public void consumoEuros(){
        this.consumoEuros = this.consumoMedio * this.pgas;
    }
    
    public void setKms(double kms){
        this.kms = kms;
    }
    public void setLitros(double liters){
        this.Litros = liters;
    }
    public void setVmed(double avgSpeed){
        this.vmed = avgSpeed;
    }
    public void setPgas(double gasPrice){
        this.pgas = gasPrice;
    }
}
