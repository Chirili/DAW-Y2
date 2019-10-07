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
public class Ejercicio1 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
            String str = Test();
            System.out.print(str);
    }

    public String Test() {

        int i = 0x100;
        i >>>= 1;
        System.out.println(i);

        return "\n";
    }
    /*
    *Este programa mostrara por pantalla 128 ya que lo que hace es mover un 1 hacia la derecha.
    *Es decir, 256 en binario serian 11111111, si mueves un uno hacia la derecha quedaría de la siguiente manera: 01111111, que es 128 en binario.
    */
}
