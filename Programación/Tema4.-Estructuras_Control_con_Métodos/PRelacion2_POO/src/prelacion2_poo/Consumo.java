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
        this.kms=0;
        this.Litros=0;
        this.vmed= 0;
        this.pgas=0;
    }

     /*
    *   Constructor de consumo que inicializa las propiedades de la clase
    *   con los valores recibidos por parametro
     */
    Consumo(double kms, double Litros, double vmed, double pgas) {
        this.kms = kms;
        this.Litros = Litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    
    
    public int getTiempo(double travelKilometers) {
        this.time = (int) (this.kms / this.vmed);
        return this.time;
    }
    public double getKms(){
        return kms;
    }
    public double getLitros(){
        return Litros;
    }
    public double getPgas(){
        return pgas;
    }
    public double getVmed(){
        return vmed;
    }
    public double getConsumoMedio(){
        return consumoMedio;
    }
    public double getConsumoEuros(){
        return consumoEuros;
    }
    public void consumoMedio(){
        this.consumoMedio = (this.Litros / this.kms) * 100;
    }

    public void consumoEuros() {
        this.consumoEuros = this.consumoMedio * this.pgas;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public void setLitros(double liters) {
        this.Litros = liters;
    }

    public void setVmed(double avgSpeed) {
        this.vmed = avgSpeed;
    }

    public void setPgas(double gasPrice) {
        this.pgas = gasPrice;
    }
}
