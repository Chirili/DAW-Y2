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
public class Ejercicio7 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = multiplyOrSum();
        System.out.print(str);
    }

    public String multiplyOrSum() {

        double fnchoice, snchoice, tnchoice;

        System.out.println("Elige el valor de tres numeros, si es negativo se multiplicaran y sino se sumaran: ");
        System.out.print("Elige el valor del primer numero: ");
        fnchoice = uts.getDouble();

        System.out.print("Elige el valor del segundo numero: ");
        snchoice = uts.getDouble();

        System.out.print("Elige el valor del tercer numero: ");
        tnchoice = uts.getDouble();

        if (fnchoice < 0) {
            System.out.println("Se han multiplicado los numeros y el resultado es igual a: " + (fnchoice * snchoice * tnchoice));
        } else {
            System.out.println("Se han sumado los numeros y el resultado es igual a: " + (fnchoice + snchoice + tnchoice));
        }

        return "\n";
    }

}
