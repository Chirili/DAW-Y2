/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void capturarHora() {

        Utils uts = new Utils();
        boolean valida = false;
        do {
            System.out.print("Dime la hora: ");
            this.hora = uts.getInt();
            valida = (this.hora < 24) ? true : false;
            System.out.print("Dime los minutos: ");
            valida = (this.minuto < 60) ? true : false;
            System.out.print("Dime los segundos: ");
            valida = (this.segundo < 60) ? true : false;
        } while (valida != true);
    }
    
    public String printStandard() {
        return "La hora actual es: "+this.hora+":"+this.minuto;
    }
    
    public String printUniversal() {
        return "La hora actual es: "+this.hora+":"+this.minuto+":"+this.segundo;
    }
    

    public void establecerHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
