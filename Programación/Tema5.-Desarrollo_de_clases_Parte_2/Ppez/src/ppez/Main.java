/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppez;

import models.*;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pescado p = new Pescado("Pepito");
        Pescado p2 = (Pescado) p.clone();

        System.out.println(p.getNombre());

        if (p.equals(p2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        Pescado p3 = new Pescado("Pescaito");
        System.out.println("Numero de pescados actuales: " + p3.getNumPeces());

        if (p.equals(p3)) {
            System.out.println("El pez: " + p.getNombre() + "y el pez " + p3.getNombre() + " son iguales");
        } else {
            System.out.println("El pez: " + p.getNombre() + " y el pez " + p3.getNombre() + " no son iguales");
        }

        Pescado p4 = new Pescado(p3);
        System.out.println("Numero de pescados actuales: " + p.getNumPeces());
        System.out.println("Nombre del ultimo pescado: "+p4.getNombre());
    }

}
