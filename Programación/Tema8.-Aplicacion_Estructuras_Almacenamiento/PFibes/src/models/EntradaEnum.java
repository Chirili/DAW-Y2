/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public enum EntradaEnum {

    VIP(1, "VIP", 20),
    PALCO(2, "PALCO", 40),
    RESERVADAS(3, "RESERVADAS", 10),
    GALLINERO(4, "GALLINERO", 500);

    private int codEntrada;
    private String tipoEntrada;
    private int maximoEntradas;

    EntradaEnum(int codEntrada, String tipoEntrada, int maximoEntradas) {
        this.codEntrada = codEntrada;
        this.tipoEntrada = tipoEntrada;
        this.maximoEntradas = maximoEntradas;
    }

    public int getCodEntrada() {
        return codEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public int getMaximoEntradas() {
        return maximoEntradas;
    }

}
