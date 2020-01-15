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
public class Numeros {
    public void averigua(double numero){
        Double num = new Double(numero);
        System.out.println("La ultima cifra del numero introducido es igual a: "+ (num.intValue()%10));
    }
}
