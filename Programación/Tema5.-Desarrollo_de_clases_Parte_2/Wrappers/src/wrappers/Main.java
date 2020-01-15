/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers;

import models.*;
import Utils.Utils;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        
        Conversor cv = new Conversor(127);
        System.out.println(cv.getNumero("o"));
        System.out.println(cv.getNumero("h"));
        System.out.println(cv.getNumero("b"));

        Test t = new Test();
        t.Operaciones(3, 0);
        System.out.println("Resultado de la suma: " + t.getSuma());
        System.out.println("Resultado de la resta: " + t.getResta());
        System.out.println("Resultado de la multiplicacion: " + t.getMultiplicacion());
        System.out.println("Resultado de la division: " + t.getDivision());
        
        Numeros num = new Numeros();
        System.out.print("Introduce un numero para averiguar su ultima cifra: ");
        double number = uts.getDouble();
        num.averigua(number);
    }

}
