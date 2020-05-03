/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.stream.Stream;

/**
 *
 * @author Andres
 */
public enum PuestoEnum {
    A("Frutas Pepe", 1),
    B("La Mar de Cai", 2),
    C("Carnicas Molina", 3);

    private String nombre;
    private int identificador;

    PuestoEnum(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static Stream<PuestoEnum> PuestoStream() {
        return Stream.of(PuestoEnum.values());
    }
}
