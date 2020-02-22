/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.factura.tipos;

import models.aparato.tipos.Ipod;
import models.factura.Factura;

/**
 *
 * @author usuario
 */
public class FacturaIPod extends Factura {

    private Ipod articulo;

    //Constructor por defecto de FacturaIPod
    public FacturaIPod() {
        super();
        this.articulo = new Ipod();
    }

    //Constructor parametrizado de FacturaIPod
    public FacturaIPod(int numFactura, Ipod i1, double pctDescuento) {
        super(numFactura, pctDescuento);
        this.articulo = i1;
    }

    //Metodo encargado de capturar los datos del descuento y del Ipod
    public void capturar() {
        super.capturarDescuento();
        articulo.capturar();
    }

    @Override
    public String toString() {
        return "Factura del IPod: \n" + super.toString() + "\nDescuento: " + articulo.calcularDesc(pctDescuento) + "\n" + articulo.toString() + "\n";
    }

    /**
     * Getters y setters de FacturaIPod
     *
     * @return
     */
    public Ipod getArticulo() {
        return articulo;
    }

    public void setArticulo(Ipod articulo) {
        this.articulo = articulo;
    }

}
