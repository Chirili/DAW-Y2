/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblackfriday;

import Utils.Utils;

/**
 *
 * @author Andresito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uChoice;
        Utils uts = new Utils();
        BlackFriday bf = new BlackFriday();
        System.out.println("Bienvenido al black friday en impresoras:");
            System.out.println("A continuacion se te mostrarán distintos modelos de impresora,elige una:");
            System.out.println("1. Modelo Multifuncion 6332.");
            System.out.println("2. Modelo Multifuncion 3720 WIFI e impresion movil.");
            System.out.println("3. Modelo Multifuncion WIFI 3735 WIfI.");
            System.out.println("4. Modelo Multifuncion Laser.");
            System.out.println("4. Salir.");
            uChoice = uts.getInt();

    }

}
