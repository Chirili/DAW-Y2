/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.stream.Stream;

/**
 *
 * @author Andres
 */
public enum SizeEnum {
    PEQUEÑO(19, 10),
    MEDIANO(49, 50),
    GRANDE(79, 80),
    EXTRAGRANDE(80, 100);

    private int size;
    private int precio;

    SizeEnum(int size, int precio) {
        this.size = size;
        this.precio = precio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static Stream<SizeEnum> stream() {
        return Stream.of(SizeEnum.values());
    }
}
