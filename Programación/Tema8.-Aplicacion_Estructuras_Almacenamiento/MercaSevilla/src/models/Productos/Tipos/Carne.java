/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Productos.Tipos;

import Utils.Utils;
import models.Productos.Producto;

/**
 *
 * @author Andres
 */
public class Carne extends Producto {

    private static final int CODIGO_BASE = 1;
    private boolean pienso;
    private static int codigo = CODIGO_BASE;

    public Carne() {
        super();
        this.pienso = setPienso();
        añadirCarne();
    }

    public Carne(String nombre, double precio) {
        super(nombre, precio);
        this.pienso = setPienso();
        añadirCarne();
    }

    public Carne(String nombre, double precio, String categoria) {
        super(nombre, precio, categoria);
        this.pienso = setPienso();
        añadirCarne();
    }

    private void añadirCarne() {
        Carne.codigo++;
    }

    private boolean setPienso() {
        return (Utils.randomNumberBW12() != 1);
    }

    @Override
    public String showProduct() {
        return super.toString() + Carne.getCodigo() + " ha costado: " + this.getPrecio()
                + "\n" + ((isPienso()) ? "Es pienso" : "No es pienso");
    }

    public boolean isPienso() {
        return pienso;
    }

    public void setPienso(boolean pienso) {
        this.pienso = pienso;
    }

    public static int getCodigo() {
        return codigo;
    }
}
