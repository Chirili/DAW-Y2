/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

/**
 * Realiza una clase con un método decimalToRomano que trasnforme número en formato decimal a números en formato romano
 * @author usuario
 */
public class Ejercicio6 {

    private String numbers;
    /*
    * El numero que se introduzca entrara en el bucle do while
    * e ira condicionandose de modo que se vayan concatenando letras y en
    * funcion de la letra se iran restando esa cantidad que corresponda.
    */
    public String decimalToRomano(int nChoice) {
        numbers = "";
        do {
            if (nChoice >= 1000) {
                numbers += "M";
                nChoice -= 1000;
            } else if (nChoice >= 500) {
                numbers += "D";
                nChoice -= 500;
            } else if (nChoice >= 100) {
                numbers += "C";
                nChoice -= 100;
            } else if (nChoice >= 50) {
                numbers += "L";
                nChoice -= 50;
            } else if (nChoice >= 10) {
                numbers += "X";
                nChoice -= 10;
            } else if (nChoice == 9) {
                numbers += "IX";
                nChoice -= 9;
            } else if (nChoice >= 5) {
                numbers += "V";
                nChoice -= 5;
            } else if (nChoice == 4) {
                numbers += "IV";
                nChoice -= 4;
            } else if (nChoice <= 3) {
                numbers += "I";
                nChoice--;
            }
        } while (nChoice != 0);

        return numbers + "\n";
    }
}
