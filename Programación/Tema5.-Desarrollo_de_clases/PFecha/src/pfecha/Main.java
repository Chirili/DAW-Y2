/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfecha;


/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.leer();
        if (f.bisiesto(f.getAño()) == true) {
            System.out.println("El año elegido es bisiesto");
        } else {
            System.out.println("El año elegido no es bisiesto");
        }
     System.out.println("La cantidad de dias del mes elegido es de: "+f.diasMes());
    }

}
