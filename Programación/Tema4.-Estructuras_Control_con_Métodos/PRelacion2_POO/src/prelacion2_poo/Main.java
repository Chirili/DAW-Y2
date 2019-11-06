/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice = 0, ej3Choice;
        Scanner sc = new Scanner(System.in);

        //Instancia de las clases
        Temperatura tmp = new Temperatura();
        Coche ej2 = new Coche();
        pajaro ej3 = new pajaro();
        satelite ej4 = new satelite();
        rebajas ej5 = new rebajas();
        //Ejercicio6 ej6 = new Ejercicio6();
        //Ejercicio7 ej7 = new Ejercicio7();
        //minumero ej8 = new minumero();
        //Prueba p = new Prueba();

        do {

            System.out.print("Elige un ejercicio para visualizar entre 1 y 14, 0 para salir: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   tmp.selectConverter();
                    break;
                case 2:
                     System.out.println(ej2.getVelocidad());
                    break;
                case 3:
                    ej3.setEdad(20);
                    ej3.setcolor('R');
                    ej3.printEdad();
                    break;
                case 4:
                    ej4.setPosicion(10.3, 50.4, 60.3);
                    ej4.printPosicion();
                    break;
                case 5:
                    double originalPrice,discountedPrice,discount;
                    System.out.println("Vamos a calcular cuanto descuento se le ha aplicado a tu producto:");
                    System.out.print("Introduce el precio original del producto: ");
                    originalPrice = sc.nextDouble();
                    System.out.print("Introduce el precio del producto con el descuento: ");
                    discountedPrice = sc.nextDouble();
                    discount = ej5.descubrePorcentaje(originalPrice, discountedPrice);
                    System.out.println("El porcentaje de descuento aplicado al producto es un: "+discount+"%");
                case 8:
                    //ej8.selectNumber();
            }

        } while (choice != 0);
    }

}
