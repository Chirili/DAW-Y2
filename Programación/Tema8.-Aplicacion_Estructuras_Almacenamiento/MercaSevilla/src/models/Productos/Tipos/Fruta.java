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
public class Fruta extends Producto {

    private static final int CODIGO_BASE = 1;
    private boolean ecologica;
    private static int codigo = CODIGO_BASE;

    public Fruta() {
        super();
        this.ecologica = setEcologica();
        añadirPescados();
    }

    public Fruta(String nombre, double precio) {
        super(nombre, precio);
        this.ecologica = setEcologica();
        añadirPescados();
    }

    public Fruta(String nombre, double precio, String categoria) {
        super(nombre, precio, categoria);
        this.ecologica = setEcologica();
        añadirPescados();
    }

    private void añadirPescados() {
        Fruta.codigo++;
    }

    private boolean setEcologica() {
        return (Utils.randomNumberBW12() != 1);
    }

    @Override
    public String showProduct() {
        return super.toString() + Fruta.getCodigo() + " ha costado: " + this.getPrecio()
                + "\n" + ((isEcologica()) ? "Es ecologico" : "No es ecologico");
    }

    public boolean isEcologica() {
        return ecologica;
    }

    public void setEcologica(boolean ecologica) {
        this.ecologica = ecologica;
    }

    public static int getCodigo() {
        return codigo;
    }
}
