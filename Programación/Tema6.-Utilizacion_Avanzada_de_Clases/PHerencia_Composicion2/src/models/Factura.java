/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author usuario
 */
public class Factura {

    private int numero;
    private Tv televisor;
    private Equipo equipoSonido;
    private double pctDescuento;
    private double total;
    private Tv cTv[];
    private Equipo cEquipoSonido[];

    //Constructor por defecto de Factura
    public Factura() {
        this.numero = generateNumero();
        this.pctDescuento = 0;
    }

    public void setFactTv(int numero, Tv televisor, double pctDescuento) {
        this.numero = numero;
        this.televisor = televisor;
        this.pctDescuento = pctDescuento;
    }

    public void setFactEquipo(int numero, Equipo equipoSonido, double pctDescuento) {
        this.numero = numero;
        this.equipoSonido = equipoSonido;
        this.pctDescuento = pctDescuento;
    }

    public void capturarFacturaTv() {
        televisor.capturarTv();
    }

    public void capturarFacturaEquipoSonido() {
        equipoSonido.capturarEquipo();
    }

    public double calcularTotal() {
        for (Tv televisores : cTv) {
            if (televisores != null) {
                this.total += televisores.getPrecio();
            }
        }
        return this.total;
    }

    ;

    public double capturarDescuento() {
        Utils uts = new Utils();
        do {
            System.out.print("Dime la cantidad en % de descuento a aplicar: ");
            this.pctDescuento = uts.getDouble();
        } while (this.pctDescuento <= 0 || this.pctDescuento > 100);
        return this.pctDescuento;
    }

    public String imprimirFacturaTelevisores() {
        return "Numero de factura: " + this.numero + "\nCantidad de televisores comprados: " + cTv.length;
    }

    private int generateNumero() {
        return (int) Math.random() * 10000;
    }

    /**
     * Getters y setters de Factura
     *
     * @return
     */
    public Tv[] getcTv() {
        return cTv;
    }

    public void setcTv(Tv[] cTv) {
        this.cTv = cTv;
    }

    public Equipo[] getcEquipoSonido() {
        return cEquipoSonido;
    }

    public void setcEquipoSonido(Equipo[] cEquipoSonido) {
        this.cEquipoSonido = cEquipoSonido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPctDescuento() {
        return pctDescuento;
    }

    public void setPctDescuento(double pctDescuento) {
        this.pctDescuento = pctDescuento;
    }

}
