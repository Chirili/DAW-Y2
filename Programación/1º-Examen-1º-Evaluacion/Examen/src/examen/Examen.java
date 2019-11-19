/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Andres Carmona Lozano
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uChoice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Calcular numero binario");
        System.out.println("1.Comprobar direccion de correo electronico");
        System.out.println("3. Calculadora");
        System.out.print("Elige el ejercicio a visualizar:");
            try {
                uChoice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor introduce un numero valido.");
            }
        switch (uChoice) {
            case 1:
                int cbChoice = 0;
                CambioDeBase cb = new CambioDeBase();
                System.out.print("Elige un numero para convertirlo a binario:");
                try{
                cbChoice = sc.nextInt();
                }catch(Exception e){
                    System.out.println("Por favor introduce un numero valido.");
                }
                cb.cambioBase(cbChoice);
                System.out.println("El numero " + cbChoice + " en binario es igual a: " + cb.getNumberoBinario());
                break;
            case 2:
                ComprobarCorreo cc = new ComprobarCorreo();
                String correo;
                System.out.print("Escribe tu correo electronico:");
                correo = sc.next();
                cc.checkEmail(correo);
                cc.checkIfValid();
                break;
            case 3:
                int calcChoice,
                 exponente;
                double num1,
                 num2,
                 base;
                Calculadora c = new Calculadora();
                System.out.println("Emulador de calculadora.");
                System.out.println("Elige una opción:");
                System.out.println("1.-Operaciones basicas");
                System.out.println("2.-Operaciones complejas");
                System.out.println("3.-Salir");
                calcChoice = sc.nextInt();
                if (calcChoice == 1) {
                    String basicChoice;
                    System.out.println(" Has elegido las operaciones basicas:");
                    System.out.println("a.-Suma");
                    System.out.println("b.-Resta");
                    System.out.println("c.-Multiplicacion");
                    System.out.println("d.-Division");
                    System.out.println("Eleccion: ");
                    basicChoice = sc.next();
                    switch (basicChoice) {
                        case "a":
                            System.out.print("Elige el primer numero para sumar: ");
                            num1 = sc.nextDouble();
                            System.out.print("Elige el segundo numero para sumar: ");
                            num2 = sc.nextDouble();
                            System.out.println("El resultado de la suma es igual a: " + c.suma(num1, num2));
                            break;
                        case "b":
                            System.out.print("Elige el primer numero para restar: ");
                            num1 = sc.nextDouble();
                            System.out.print("Elige el segundo numero para restar: ");
                            num2 = sc.nextDouble();
                            System.out.println("El resultado de la resta es igual a: " + c.resta(num1, num2));
                            break;
                        case "c":
                            System.out.print("Elige el primer numero para multiplicar: ");
                            num1 = sc.nextDouble();
                            System.out.print("Elige el segundo numero para multiplicar: ");
                            num2 = sc.nextDouble();
                            System.out.println("El resultado de la multiplicacion es igual a: " + c.multiplicacion(num1, num2));
                            break;
                        case "d":
                            System.out.print("Elige el primer numero para dividir: ");
                            num1 = sc.nextDouble();
                            System.out.print("Elige el segundo numero para dividir: ");
                            num2 = sc.nextDouble();
                            System.out.println("El resultado de la divisiones igual a: " + c.division(num1, num2));
                            break;
                        default:

                    }
                } else if (calcChoice == 2) {
                    String cChoice;
                    System.out.println(" Has elegido las operaciones basicas:");
                    System.out.println("a.-Potencia");
                    System.out.println("b.-Raiz Cuadrada");
                    System.out.println("Eleccion: ");
                    cChoice = sc.next();
                    switch (cChoice) {
                        case "a":
                            System.out.print("Elige la base para realizar la potencia: ");
                            base = sc.nextDouble();
                            System.out.print("Elige el exponente al que se eleva la potencia: ");
                            exponente = sc.nextInt();
                            System.out.println("El resultado de la potencia es igual a: " + c.potencia(base, exponente));
                            break;
                        case "b":
                            System.out.print("Elige el numero a realizar la raiz cuadrada: ");
                            num1 = sc.nextDouble();
                            System.out.println("El resultado de la resta es igual a: " + c.raizCuadrada(num1));
                            break;
                        default:

                    }
                } else if (calcChoice == 3) {

                }
                break;
            default:

        }
    }

}
