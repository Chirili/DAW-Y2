/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    private int nChoice, nLength, dig1, dig2, dig3;
    private String result;

    public int selectNumber() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Por favor introduce un numero de tres cifras para saber si es un numero armstrong: ");
            nChoice = sc.nextInt();
            nLength = (int) (Math.log10(nChoice) + 1);
        } while (nLength != 3);
        return nChoice;
    }

    public int isAmstrongNumber(int nChoice) {
        
    }

    public printArmstrongNumber() {

    }
}
