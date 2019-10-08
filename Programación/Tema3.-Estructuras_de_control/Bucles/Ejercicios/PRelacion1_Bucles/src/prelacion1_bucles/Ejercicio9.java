/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author usuario
 */
public class Ejercicio9 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Digits();
        System.out.print(str);
    }

    public String Digits() {

        int number, lnumber, contador = 0;

        System.out.print("Elige un numero para saber los digitos que tiene: ");
        number = uts.getInt();

        lnumber = number;

        for (int i = 0; i < lnumber;) {
            lnumber = lnumber / 10;
            contador++;

        }

        System.out.println("El numero elegido tiene la siguiente cantidad de digitos: " + contador);
        return "\n";
    }
}
