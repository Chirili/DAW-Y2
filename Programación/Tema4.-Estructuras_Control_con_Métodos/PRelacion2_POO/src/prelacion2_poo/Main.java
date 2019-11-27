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
        Pajaro ej3 = new Pajaro();
        Satelite ej4 = new Satelite();
        Rebajas ej5 = new Rebajas();
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
                    String uchoice = null;
                    do {
                        System.out.print("Estamos en un coche introduce a para acelerar y f para frenar, cualquier letra para salir:");
                        uchoice = sc.next();

                        if (uchoice.equalsIgnoreCase("a")) {
                            int velocidad;
                            System.out.print("Cuanto quieres acelerar: ");
                            velocidad = sc.nextInt();
                            ej2.acelera(velocidad);

                            if (ej2.getVelocidadMarchaAtras() > ej2.getVelocidad()) {
                                System.out.println("Velocidad actual marcha atras: " + ej2.getVelocidadMarchaAtras());
                            }else
                            {
                                System.out.println("Velocidad actual: " + ej2.getVelocidad());
                            }
                        } else if (uchoice.equalsIgnoreCase("f")) {
                            int velocidad;
                            System.out.print("Cuanto quieres frenar: ");
                            velocidad = sc.nextInt();
                            ej2.frenar(velocidad);
                            System.out.println("Velocidad actual marcha atrás: " + ej2.getVelocidadMarchaAtras());
                        } else {
                            System.out.println("Error letra introducida no correcta");
                            break;
                        }
                    } while (!uchoice.equalsIgnoreCase("0"));
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
                    double originalPrice,
                     discountedPrice,
                     discount;
                    System.out.println("Vamos a calcular cuanto descuento se le ha aplicado a tu producto:");
                    System.out.print("Introduce el precio original del producto: ");
                    originalPrice = sc.nextDouble();
                    System.out.print("Introduce el precio del producto con el descuento: ");
                    discountedPrice = sc.nextDouble();
                    discount = ej5.descubrePorcentaje(originalPrice, discountedPrice);
                    System.out.println("El porcentaje de descuento aplicado al producto es un: " + discount + "%");
                case 8:
                //ej8.selectNumber();
            }

        } while (choice != 0);
    }

}
