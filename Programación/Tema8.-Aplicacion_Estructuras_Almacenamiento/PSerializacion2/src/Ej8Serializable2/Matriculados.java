/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8Serializable2;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Matriculados implements Serializable {

    private static final long serialVersionUID = -2359478674453086042L;

    private int código;
    private String nombre;
    private String categoria;
    private ArrayList<Matriculados> matriculados;

    public Matriculados() {
        this.código = 0;
        this.nombre = "";
        this.categoria = "";
        this.matriculados = new ArrayList<Matriculados>();
    }

    public Matriculados(int codigo, String nombre, String categoria) {
        this.código = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.matriculados = new ArrayList<Matriculados>();
    }

    public void añadirMatriculados(ObjectInputStream ObjectIStream) throws IOException, ClassNotFoundException {
        try {
            while (true) {

                Matriculados matr = (Matriculados) ObjectIStream.readObject();
                matriculados.add(matr);

            }
        } catch (EOFException ex) {
            System.out.println("FIN");
        }
    }

    public ArrayList<Matriculados> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(ArrayList<Matriculados> matriculados) {
        this.matriculados = matriculados;
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public int getCodigo() {
        return código;
    }

    public void setCodigo(int codigo) {
        this.código = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
