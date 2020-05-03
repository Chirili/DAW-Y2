/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oposicion;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class opositor implements Serializable{

    private static final long serialVersionUID = 7937021192373906177L;

    private String nombre;
    private int codigo;
    private ArrayList<pruebas> lista_pruebas;

    public opositor() {
        this.nombre = "";
        this.codigo = 0;
        this.lista_pruebas = new ArrayList<pruebas>();
    }

    public opositor(String nombre, int codigo, ArrayList<pruebas> lista_pruebas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.lista_pruebas = lista_pruebas;
    }

    public void setNombreOposiciones(){
        String[] nombreOposicion = {"Correr","Nadar","Bicicleta","Fuerza","Salto"};
        for(int i = 0; i < this.getLista_pruebas().size(); i++){
            this.getLista_pruebas().get(i).setNombre(nombreOposicion[i]);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<pruebas> getLista_pruebas() {
        return lista_pruebas;
    }

    public void setLista_pruebas(ArrayList<pruebas> lista_pruebas) {
        this.lista_pruebas = lista_pruebas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
