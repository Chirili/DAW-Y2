/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_opcional;

/**
 *
 * @author Andrés
 */
public class Ejercicio6 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Radio();
        System.out.print(str);
    }

    public String Radio() {
        int radio = 3;
        double longitud;

        longitud = 2 * Math.PI * radio;

        System.out.print("La longitud del radio de 3 metros es igual a: " + longitud + " metros");
        return "\n";

    }
}
