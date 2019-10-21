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
public class Ejercicio6 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = greaterNumbers();
        System.out.print(str);
    }

    public String greaterNumbers() {

        double fnchoice, snchoice, tnchoice;
        int nswitch = 0;

        System.out.println("Elige el valor de tres numeros y te diré cual es el mayor y cual es el menor: ");
        System.out.print("Elige el valor del primer numero: ");
        fnchoice = uts.getDouble();

        System.out.print("Elige el valor del segundo numero: ");
        snchoice = uts.getDouble();

        System.out.print("Elige el valor del tercer numero: ");
        tnchoice = uts.getDouble();

        if (fnchoice > snchoice && fnchoice > tnchoice) {
            nswitch = 1;
        } else if (snchoice > fnchoice && snchoice > tnchoice) {
            nswitch = 2;
        } else if (tnchoice > fnchoice && tnchoice > snchoice) {
            nswitch = 3;
        }

        switch (nswitch) {
            case 1:
                System.out.println("El primer numero introducido es el mayor de los tres.");
                break;
            case 2:
                System.out.println("El segundo numero introducido es el mayor de los tres.");
                break;
            case 3:
                System.out.println("El tercer numero introducido es el mayor de los tres.");
                break;
            default:

        }

        return "\n";
    }
}
