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
public class Ejercicio16 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
            String str = calcAreaVolumeSphere();
            System.out.print(str);
    }

    public String calcAreaVolumeSphere() {

        double radio, area, volume;

        System.out.println("Introduce al programa los datos necesarios para saber el area y el volumen de una esfera: ");
        System.out.print("Introduce el radio para calcular el area y el volumen de una esfera: ");
        radio = uts.getDouble();

        if (radio > 0) {
            area = 4 * Math.PI * Math.pow(radio, 2);
            volume = 4 / 3 * Math.PI * Math.pow(radio, 3);

            System.out.println("El area de la esfera con el radio introducido es igual a: " + area);
            System.out.println("El volumen de la esfera con el radio introducido es igual a: " + volume);
        } else {
            System.out.println("El numero que has introducido no es correcto. Vuelve a intentarlo.");
        }

        return "\n";
    }

}
