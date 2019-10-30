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
public class Main {

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
        Ejercicio4 ej4 = new Ejercicio4();
        Ejercicio5 ej5 = new Ejercicio5();
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
                    int ej3Number;
                    ej3Number = ej3.selectNumber();
                    System.out.println(ej3.isAmstrongNumber(ej3Number));
                    break;
                case 4:
                    int a,b,c;
                    System.out.println("Por favor introduce el valor para las variables a, b y c: ");
                    System.out.print("Introduce el valor de la variable a: ");
                    a = sc.nextInt();
                    System.out.print("Introduce el valor de la variable b: ");
                    b = sc.nextInt();
                    System.out.print("Introduce el valor de la variable a: ");
                    c = sc.nextInt();
                    System.out.print(ej4.compareValues(a, b, c));
                    break;
                case 5:
                    int day,month,year;
                    System.out.println("Introduce tu fecha de nacimiento para sabe cual es tu numero de la suerte");
                    System.out.print("Dia de nacimiento: ");
                    day = sc.nextInt();
                    System.out.print("Mes de nacimiento(en numeros): ");
                    month = sc.nextInt();
                    System.out.print("Año de nacimiento: ");
                    year = sc.nextInt();
                    
                    System.out.print(ej5.calcLuckyNumber(day, month, year));
                case 8:
                    ej8.selectNumber();
            }

        } while (choice != 0);
    }

}
