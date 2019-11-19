/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Andres Carmona Lozano
 */
public class CambioDeBase {

    /*
    *   Propiedad que contiene el resultado del valor binario
     */
    private String lastBinary = "";

    public void cambioBase(int num) {
        char reverse;
        String numeroBinario = "";
        /*
        *   Este bucle for se encarga de realizar las operaciones con el numero introducido por parametro
        *   y concatenar letras a la propiedad de la clase
         */
        for (int i = 1; i <= 8; i++) {
            if ((num % 2) == 0) {
                numeroBinario += 0;
                num /= 2;
            } else {
                numeroBinario += 1;
                num /= 2;
            }
        }
        /*
        *    El bucle for anterior devuelve el numero binario pero al reves, asi que este bucle for
        *   le vuelve a dar la vuelta
        */
        for (int i = 7; i >= 0; i--) {
            reverse = numeroBinario.charAt(i);
            lastBinary += String.valueOf(reverse);

        }
    }
    /**
     *  getter de la propiedad lastBinary
     */
    public String getNumberoBinario() {
        return lastBinary;
    }
}
