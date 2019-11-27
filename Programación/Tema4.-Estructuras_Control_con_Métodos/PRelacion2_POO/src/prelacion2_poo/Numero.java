/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 * 8.-Realiza una clase númeroque almacene un número entero y tenga las
 * siguientes características:
 *  Constructor por defecto que inicializa a 0 el número interno.
 *  Constructor que inicializa el número interno
 *  Método aniade que permite sumarle un número al valor interno
 *  Método resta que resta un número al valor interno
 *  Método getValor. Devuelve el valor interno
 *  Método  getDoble. Devuelve el doble del valor interno
 *  Método getTriple. Devuelve el  triple del valor interno
 *  Método setNumero. Inicializa de nuevo el valor  interno
 *
 * @author Andres
 */
public class Numero {

    private double numeroInterno;

    Numero() {
        this.numeroInterno = 0;
    }

    Numero(double initNumber) {
        this.numeroInterno = initNumber;
    }

    /*
    *   Metodo que suma a la propiedad numeroInterno el valor pasado por parametro
    */
    public void aniade(double sumNumber) {
        this.numeroInterno += sumNumber;
    }

    /*
    *   Metodo que resta a la propiedad numeroInterno el valor pasado por parametro
    */
    public void resta(double deductNumber) {
        this.numeroInterno -= deductNumber;
    }

    //getValor retorna el valor de la propiedad numeroInterno
    public double getValor() {
        return this.numeroInterno;
    }

    //getDoble retorna el valor de la propiedad numeroInterno multiplicado por 2
    public double getDoble() {
        return this.numeroInterno * 2;
    }

    //getDoble retorna el valor de la propiedad numeroInterno multiplicado por 3
    public double getTriple() {
        return this.numeroInterno * 3;
    }

    public void setNumero(double number) {
        this.numeroInterno = number;
    }
}
