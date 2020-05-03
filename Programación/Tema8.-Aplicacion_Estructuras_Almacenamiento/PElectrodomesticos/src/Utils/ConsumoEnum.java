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
public enum ConsumoEnum {
    A('A',100),
    B('B',80),
    C('C',60),
    D('D',50),
    E('E',30),
    F('F',10);

    
    private char consumo;
    private int precio;
    ConsumoEnum(char consumo,int precio) {
        this.precio = precio;
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public static Stream<ConsumoEnum> stream() {
        return Stream.of(ConsumoEnum.values());
    }
}
