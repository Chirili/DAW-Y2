/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PRelacion1_Estructuras_Control_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice = 0, ej3Choice;
        Scanner sc = new Scanner(System.in);

        //Instancia de las clases
        Ejercicio1 ej1 = new Ejercicio1();
        Ejercicio2 ej2 = new Ejercicio2();
        Ejercicio3 ej3 = new Ejercicio3();
        Ejercicio6 ej6 = new Ejercicio6();
        Ejercicio7 ej7 = new Ejercicio7();
        minumero ej8 = new minumero();
        Prueba p = new Prueba();

        do {

            System.out.print("Elige un ejercicio para visualizar entre 1 y 8, 0 para salir: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ej1.whileLoop();
                    break;
                case 2:
                    ej2.printPairNumbers();
                    break;
                case 3:
                    choice = ej3.selectNumber();
                case 4:
                    System.out.println(p.prueba("asdfasdf"));
                    break;
                case 6:
                    int ej6Number;
                    System.out.print("Introduce un numero entero para transformarlo en numero romano: ");
                    ej6Number = sc.nextInt();
                    System.out.print(ej6.decimalToRomano(ej6Number));
                    break;
                case 7:
                    ej7.multiplesOfFive();
                    break;
                case 8:
                    int nChoice;
                    System.out.print("Introduce un numero con digitos pares para saber si es vampiro: ");
                    nChoice = sc.nextInt();
                    ej8.esVampiro(nChoice);
                    break;
            }

        } while (choice != 0);
    }

}
