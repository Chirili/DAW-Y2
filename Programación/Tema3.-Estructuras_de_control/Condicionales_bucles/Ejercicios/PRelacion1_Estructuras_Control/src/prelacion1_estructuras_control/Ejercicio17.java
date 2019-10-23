/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author Andres
 */
public class Ejercicio17 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = calcSphereVolume();
        System.out.print(str);
    }

    public String calcSphereVolume() {

        double radio, result;

        System.out.println("Introduce el radio de una esfera y te diré el volumen de la misma: ");
        radio = uts.getDouble();
        if (radio > 0) {
            result = 4 / 3 * Math.PI * Math.pow(radio, 3);
            System.out.println("El volumen de la esfera con el radio introducido es igual a: " + result);
        } else {
            System.out.println("El numero introducido para el radio no es correcto vuelve a intentarlo.");
        }

        return "\n";
    }

}
