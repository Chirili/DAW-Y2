/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.stream.Stream;

/**
 *
 * @author Andres
 */
public enum Color {
    A("Azul"),
    N("Negro"),
    B("Blanco");
    
    private String color;
    
    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public Stream<Color> Stream(){
        return Stream.of(Color.values());
    }
}
