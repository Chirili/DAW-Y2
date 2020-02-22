/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.factura.tipos;

import models.aparato.tipos.Equipo;
import models.factura.Factura;

/**
 *
 * @author usuario
 */
public class FacturaEquipo extends Factura {

    private Equipo articulo;

    //Constructor por defecto de FacturaEquipo
    public FacturaEquipo() {
        super();
        this.articulo = new Equipo();
    }

    //Constructor parametrizado de FacturaEquipo
    public FacturaEquipo(int numFactura, Equipo e1, double pctDescuento) {
        super(numFactura, pctDescuento);
        this.articulo = e1;
    }

    //Metodo encargado de capturar los datos de descuento y del Equipo
    public void capturar() {
        super.capturarDescuento();
        articulo.capturar();
    }

    @Override
    public String toString() {
        return "Factura del equipo: \n" + super.toString() + "\nDescuento: " + articulo.calcularDesc(pctDescuento) + "\n" + articulo.toString() + "\n";
    }

    /**
     * Getters y setters de FacturaEquipo
     *
     * @return
     */
    public Equipo getArticulo() {
        return articulo;
    }

    public void setArticulo(Equipo articulo) {
        this.articulo = articulo;
    }

}
