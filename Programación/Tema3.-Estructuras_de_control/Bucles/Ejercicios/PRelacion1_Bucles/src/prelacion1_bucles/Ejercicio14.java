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
public class Ejercicio14 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = mathPow();
        System.out.print(str);
    }

    public String mathPow() {

        double base, result;
        int exponent;

        do {
            System.out.print("Porfavor dame una base para realizar el cálculo: ");
            base = uts.getDouble();

            System.out.print("Porfavor dame un exponente: ");
            exponent = uts.getInt();
            if (exponent < 0){
                System.out.print("Error no se puede realizar la operación, prueba a introducir un exponente positivo y entero.");
            }
        } while (exponent <= 0);

        result = Math.pow(base, exponent);
        System.out.println("La potencia con base  "+base+" y exponente "+exponent+" da como resultado: "+result);

        return "\n";

    }

}
