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
public class Ejercicio5 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numbersHigherEquals();
        System.out.print(str);
    }

    public String numbersHigherEquals() {

        double fnchoice, snchoice;

        System.out.println("Introduce el valor de dos numeros para poder decirte cual es mayor o si son iguales: ");
        System.out.print("Elige el valor del primer numero: ");
        fnchoice = uts.getDouble();

        System.out.print("Elige el valor del segundo numero: ");
        snchoice = uts.getDouble();

        if (fnchoice > snchoice) {
            System.out.println("El primer numero introducido " + fnchoice + " es mayor que el segundo numero introducido " + snchoice);
        } else if (fnchoice == snchoice) {
            System.out.println("El primer numero introducido " + fnchoice + " es igual que el segundo numero introducido " + snchoice);
        } else {
            System.out.println("El segundo numero introducido " + snchoice + " es mayor que el primer numero introducido" + fnchoice);
        }

        return "\n";
    }
}
