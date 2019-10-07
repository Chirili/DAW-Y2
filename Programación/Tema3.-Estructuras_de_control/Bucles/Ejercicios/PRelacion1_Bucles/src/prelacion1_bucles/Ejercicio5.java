/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio5 implements Iejercicios {

    public void toExecute() {
        String str = subtractionOfTwentyW();
        System.out.print(str);
    }

    public String subtractionOfTwentyW() {

        
        System.out.println("Mostrar los numero del 320 al 160 con bucle while restando 20:  "); 
        
        int i = 320;

        while (i >= 160) {
            System.out.println(i);
            i -= 20;
        }

        return "\n";
    }
}
