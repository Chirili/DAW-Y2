/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Conversor {

    private int dato;

    public Conversor(int dato) {
        this.dato = dato;
    }

    public String getNumero(String letra) {

        switch (letra.toLowerCase()) {
            case "b":
                String numeroBinario = "";
                while (dato > 0) {
                    if (dato % 2 == 0) {
                        numeroBinario = "0" + numeroBinario;
                    } else {
                        numeroBinario = "1" + numeroBinario;
                    }
                    dato = (int) dato / 2;
                    return "Numero en binario: " + numeroBinario;
                }
                break;
            case "h":
                String hexadecimal = Integer.toHexString(dato);
                return "Numero en Hexadecimal: " + hexadecimal;
            case "o":
                String octal = Integer.toOctalString(dato);
                return "Numero en Octal: " + octal;
            default:
                return "error";
        }
        return "";
    }
}
