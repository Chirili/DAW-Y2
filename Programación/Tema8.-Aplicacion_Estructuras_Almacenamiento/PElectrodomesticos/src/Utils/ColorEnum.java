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
public enum ColorEnum {

    BLANCO("Blanco"),
    NEGRO("Negro"),
    AZUL("Azul"),
    GRIS("Gris"),
    ROJO("Rojo");

    private String color;

    ColorEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static Stream<ColorEnum> stream() {
        return Stream.of(ColorEnum.values());
    }
}
