/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnif;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba con el constructor con parametros
        Nif nif1 = new Nif(12345678);
        System.out.println(nif1.toString());

        Nif nif2 = new Nif();

        //Prueba con la entrada por teclado
        nif2.leer();
        System.out.println(nif2.toString());

    }

}
