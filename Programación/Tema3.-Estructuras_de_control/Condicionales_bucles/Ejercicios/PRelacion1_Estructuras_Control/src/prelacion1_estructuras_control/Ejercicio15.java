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
public class Ejercicio15 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = calcCircleRadio();
        System.out.print(str);
    }

    public String calcCircleRadio() {

        double radio, length, area;

        System.out.print("Introduce el radio para la esfera para calcular su longitud y su area: ");
        radio = uts.getDouble();

        if (radio > 0) {
            length = 2 * (Math.PI * radio);
            area = Math.PI * Math.pow(radio, 2);

            System.out.println("La longitud de la esfera es la siguiente:" + length);
            System.out.println("El area de la esfera es la siguiente: " + area);
        } else {
            System.out.println("Numero introducido para el radio no valido.");
        }

        return "\n";
    }

}
