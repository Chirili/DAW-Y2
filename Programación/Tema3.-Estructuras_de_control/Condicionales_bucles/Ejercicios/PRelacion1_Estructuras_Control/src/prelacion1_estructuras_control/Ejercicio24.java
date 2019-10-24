/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Ejercicio24 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = operations();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio24.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String operations() throws AWTException {
        
        
        double fnumber = 0, snumber = 0, aresult = 0, result = 0, count = 0;
        String choice = "";

        do {
            System.out.print("Calculadora java, introduce el primer numero: ");
            fnumber = uts.getDouble();
            uts.clearScreen();
            do {
                /*
                * Esta primera condicion se encarga de realizar las operaciones simples
                * Para abrir paso a la siguiente condicion la cual es mas completa
                */
                if (count == 0) {
                    System.out.print("Introduce el segundo numero para realizar la operacion: ");
                    snumber = uts.getDouble();

                    System.out.println("Que operacion quieres realizar: ");
                    System.out.print("S) Suma R) Resta P) Multiplicacion D) Division E) Salir: ");
                    choice = uts.getString();

                    switch (choice.toUpperCase()) {
                        case "S":
                            result = fnumber + snumber;
                            break;
                        case "R":
                            result = fnumber - snumber;
                            break;
                        case "P":
                            result = fnumber * snumber;
                            break;
                        case "D":
                            if (snumber == 0) {//Condicionamos la opcion de dividir entre 0 para que el usuario tenga que introducir un numero valido
                                do {
                                    System.out.print("No se puede dividir entre 0. Introduce un numero valido: ");
                                    snumber = uts.getDouble();
                                    if (snumber != 0) {
                                        result = (fnumber / snumber);
                                    }
                                } while (snumber == 0);
                            } else {
                                result = (fnumber / snumber);
                            }
                            break;
                        case "E":
                            choice = "e";
                            break;
                        default:
                            System.out.println("Error inesperado");

                    }
                    
                } else if (count >= 1) {

                    aresult += (result - aresult);//aresult se encarga de mostrar el resultado actual de las operaciones.
                    System.out.println("Resultado actual: " + aresult);

                    System.out.println("Que operacion quieres realizar: ");
                    System.out.print("S) Suma R) Resta P) Multiplicacion D) Division E) Salir: ");
                    choice = uts.getString();

                    System.out.print("Introduce otro numero para realizar la operacion: ");
                    snumber = uts.getDouble();

                    switch (choice.toUpperCase()) {
                        case "S":
                            result = aresult + snumber;
                            break;
                        case "R":
                            result = aresult - snumber;
                            break;
                        case "P":
                            result = aresult * snumber;
                            break;
                        case "D":
                            if (snumber == 0) {//Condicionamos la opcion de dividir entre 0 para que el usuario tenga que introducir un numero valido
                                do {
                                    System.out.print("No se puede dividir entre 0. Introduce un numero valido: ");
                                    snumber = uts.getDouble();
                                    if (snumber != 0) {
                                        result = (fnumber / snumber);
                                    }
                                } while (snumber == 0);
                            } else {
                                result = (fnumber / snumber);
                            }
                            break;
                        case "E":
                            choice = "e";
                            break;
                        default:

                    }
                }
                uts.clearScreen();

                count++;
            } while (!"e".equalsIgnoreCase(choice));

        } while (!"e".equalsIgnoreCase(choice));

        return "\n";
    }
}
