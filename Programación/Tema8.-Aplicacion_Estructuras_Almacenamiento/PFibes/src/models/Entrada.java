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
public class Entrada {

    private static int NUMERO_ENTRADA = 354;

    private int codigo;
    private String tipo;
    private String nif;
    private int numeroEntrada;

    //Constructor por defecto de Entrada
    public Entrada() {
        this.codigo = 0;
        this.tipo = "";
        this.nif = "";
        this.numeroEntrada = setNumEntrada();
    }

    //Constructor parametrizado de Entrada
    public Entrada(int cod, String tipoEntrada) {
        this.codigo = cod;
        this.tipo = tipoEntrada;
        this.nif = "";
        this.numeroEntrada = setNumEntrada();
    }

    //Metodo encargado de aumentar la cantidad del numero de entradas
    public int setNumEntrada() {
        NUMERO_ENTRADA++;
        return NUMERO_ENTRADA;
    }

    @Override
    public String toString() {
        return "Numero de entrada: " + this.getNumeroEntrada()
                + "\nCodigo de entrada: " + this.getCodigo()
                + "\nTipo de entrada: " + this.getTipo();
    }

    /**
     * Getters y setters de Entrada
     *
     * @return
     */
    public static int getNUMERO_ENTRADA() {
        return NUMERO_ENTRADA;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

}
