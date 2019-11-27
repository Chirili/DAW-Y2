/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import Utils.*;
import java.awt.AWTException;

/**
 *
 * @author Andres
 */
public class MenuMain {

    public void menu() throws AWTException {

        Utils u = new Utils();
        int uChoice, num1, num2;
        boolean getOut = false;
        do {
            
            uChoice = u.getInt();
            u.clearScreen();
            switch (uChoice) {
                case 1:
                    do {

                        System.out.println("¿Que quieres realizar?");
                        System.out.println("1. Suma");
                        System.out.println("2. Potencia");
                        System.out.println("3. Volver a la eleccion de ejercicio");
                        System.out.println("4. Salir del programa");
                        System.out.print("Eleccion: ");
                        uChoice = u.getInt();
                        u.clearScreen();
                        switch (uChoice) {
                            case 1:
                                Sumar sm = new Sumar();
                                System.out.println("Has elegido la suma, vas a tener que elegir dos numeros para sumarlos:");
                                System.out.print("Valor del primer numero: ");
                                num1 = u.getInt();
                                System.out.print("Valor del segundo numero: ");
                                num2 = u.getInt();

                                System.out.println("Resultado: ");
                                System.out.println(num1 + " + " + num2 + " = " + sm.sumar(num1, num2));

                                break;
                            case 2:
                                Potenciar pt = new Potenciar();
                                System.out.println("Has elegido la potencia, bas a tener que escoger primero la base y despues el exponente: ");
                                System.out.print("Valor de la base:");
                                num1 = u.getInt();
                                System.out.print("Valor del exponente: ");
                                num2 = u.getInt();

                                System.out.println("Resultado");
                                System.out.println("La base " + num1 + " elevado a " + num2 + " es igual a: " + pt.potenciar(num1, num2));
                                break;
                            case 3:
                                getOut = true;
                                uChoice += 1;
                                break;
                            case 4:
                                uChoice = 3;
                                break;
                            default:
                                System.out.println("Error al procesar su solicitud. Intentelo de nuevo.");
                        }
                        if (getOut == true) {
                            break;
                        }
                    } while (uChoice != 3);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error al procesar el ejercicio");
            }
        } while (uChoice != 3);
    }
}
