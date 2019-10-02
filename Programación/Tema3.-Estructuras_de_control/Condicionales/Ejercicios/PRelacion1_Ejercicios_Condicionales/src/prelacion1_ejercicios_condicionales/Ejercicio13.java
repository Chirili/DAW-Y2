/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

/**
 *
 * @author Andrés
 */
public class Ejercicio13 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numberOrder();
        System.out.print(str);
    }

    public String numberOrder() {

        int num1, num2, num3, aux;

        System.out.print("Elige el valor del primer numero:  ");
        num1 = uts.getInt();

        System.out.print("Elige el valor del segundo numero: ");
        num2 = uts.getInt();

        System.out.print("Elige el valor del tercer numero: ");
        num3 = uts.getInt();

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;

        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        System.out.println("Valor del numero 1: " + num1 + "\n Valor del numero 2:  " + num2 + "\n Valor del numero 3: " + num3);

        return "";
    }
}
