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
public class Ejercicio9 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = shopDiscount();
        System.out.print(str);
    }

    public String shopDiscount() {
        double amount, totalDiscount;
        String month;

        System.out.println("Tienes que introducir el importe y el mes en el que se realizo la compra para calcular el descuento: ");
        System.out.print("Elige el importe de la compra: ");

        amount = uts.getDouble();

        System.out.print("Ahora elige el mes en el que realizaste la compra: ");
        month = uts.getString();

        if (month.equalsIgnoreCase("octubre")) {

            totalDiscount = amount * 0.85;
            System.out.println("Felicidades, en este mes se le ha aplicado un 15% de descuento en su importe total.");
            System.out.println("Importe total de la compra con el descuento: " + totalDiscount);
        } else {
            System.out.println("Que mala suerte en este mes no se le aplico ningun descuento.");
            System.out.println("Importe total de la compra: " + amount);
        }

        return "\n";
    }
}
