/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Productos.Tipos;

import models.Productos.Producto;
import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Pescado extends Producto {

    private static final int CODIGO_BASE = 1;
    private boolean piscifactoria;
    private static int codigo = CODIGO_BASE;

    public Pescado() {
        super();
        this.piscifactoria = setPiscifactoria();
        añadirPescados();
    }

    public Pescado(String nombre, double precio) {
        super(nombre, precio);
        this.piscifactoria = setPiscifactoria();
        añadirPescados();
    }

    public Pescado(String nombre, double precio, String categoria) {
        super(nombre, precio, categoria);
        this.piscifactoria = setPiscifactoria();
        añadirPescados();
    }

    private void añadirPescados() {
        Pescado.codigo++;
    }

    private boolean setPiscifactoria() {
        return (Utils.randomNumberBW12() != 1);
    }

    @Override
    public String showProduct() {
        return super.toString() + Pescado.getCodigo() + " ha costado: " + this.getPrecio()
                + "\n" + ((isPiscifactoria()) ? "Criado en Piscifactoria" : "No criado en Piscifactoria");
    }

    public boolean isPiscifactoria() {
        return piscifactoria;
    }

    public void setPiscifactoria(boolean piscifactoria) {
        this.piscifactoria = piscifactoria;
    }

    public static int getCodigo() {
        return codigo;
    }
}
