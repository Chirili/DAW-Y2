/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.factura.tipos;

import models.aparato.tipos.Tv;
import models.factura.Factura;

/**
 *
 * @author usuario
 */
public class FacturaTv extends Factura {

    private Tv articulo;

    //Constructor por defecto de FacturaTv
    public FacturaTv() {
        super();
        this.articulo = new Tv();
    }

    //Constructor parametrizado de FacturaTv
    public FacturaTv(int numFactura, Tv t1, double pctDescuento) {
        super(numFactura, pctDescuento);
        this.articulo = t1;
    }

    //Metodo encargado de capturar los datos del descuento y de Tv
    public void capturar() {
        super.capturarDescuento();
        articulo.capturar();
    }

    @Override
    public String toString() {
        return "Factura del televisor: \n" + super.toString() + "\nDescuento: " + articulo.calcularDesc(pctDescuento) + "\n" + articulo.toString() + "\n";
    }

    /**
     * Getters y setters de FacturaIPod
     *
     * @return
     */
    public Tv getArticulo() {
        return articulo;
    }

    public void setArticulo(Tv articulo) {
        this.articulo = articulo;
    }
}
