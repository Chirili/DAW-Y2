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

    //Constructor por defecto de Factura
    public Factura() {
        this.numero = generateNumber();
        this.pctDescuento = 0;
    }

    //Constructor parametrizado de Factura
    public Factura(int numeroFactura, double pctDescuento) {
        this.numero = numeroFactura;
        this.pctDescuento = pctDescuento;
    }

    //Metodo encargado de generar un numero aleatorio para cada factura
    private int generateNumber() {
        return (int) (Math.random() * 100000);
    }

    //Metodo encargado de recoger todos los datos relacionados con la Factura
    public void capturar() {
        Utils uts = new Utils();

        do {
            System.out.print("Introduce el numero de factura: ");
            this.numero = uts.getInt();
        } while (String.valueOf(this.numero).length() > 8 || this.numero < 0);
    }

    //Metodo encargado de capturar el descuento
    public void capturarDescuento() {
        Utils uts = new Utils();
        do {
            System.out.print("Introduce el % de descuento(Limitado hasta 60 %): ");
            this.pctDescuento = uts.getDouble();
        } while (this.pctDescuento < 0 || this.pctDescuento > 60);
    }

    @Override
    public String toString() {
        return "Numero de factura: " + this.numero
                + "\nCantidad de descuento: " + this.pctDescuento;
    }

    /**
     * Getters y setter de los atributos de Factura
     *
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
