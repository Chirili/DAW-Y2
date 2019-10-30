/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.lang.reflect.Array;
import java.util.Vector;

/**
 *
 * @author usuario
 */
public class minumero {

    private int nLength;
    private boolean isVampire = false;

    /*
    * Pasamos el numero que el usuario introduzca lo condicionamos para que sea par
    * si la condicion se cumple se lo pasamos al metodo que corresponda para hacer
    * los calculos correspondientes
     */
    public void esVampiro(int nChoice) {

        nLength = (int) (Math.log10(nChoice) + 1);

        if (nLength == 4 || nLength == 6 || nLength == 8) {
            switch (nLength) {

                case 4:
                    calcHundredOfVampireNumbers(nChoice);
                    break;
                case 6:
                    break;
                case 8:
                    break;
                default:

            }
        } else {
            System.out.println("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos correcto");
        }
    }

    /*
    * Este metodo se encarga de coger los numeros de 4 cifras y multiplicarlos hasta encontrar
    * la multiplicacion que sea igual al numero introducido por teclado, 
    * cuando la encuentra la pasa  al metodo compareChoiceVampire que se encarga de comprobar
    * si son iguales los numeros
     */
    public int calcHundredOfVampireNumbers(int nChoice) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {

            if (isVampire == true) {//Si encuentra un numero vampiro salimos del bucle
                break;
            }
            for (int j = 99; j >= 10; j--) {
                result = i * j;
                /* Si la multiplicacion entre i y j da como es igual al numero introducido puede ser un posible numero vampiro
                    asi que entramos en la condicion
                */
                if (nChoice == result) {
                    //Si compareChoiceVampire devuelve true entonces tenemos un numero vampiro sino no es vampiro
                    if (compareChoiceVampire(nChoice, i, j) == true) {
                        System.out.println("El numero introducido " + nChoice + " es un numero vampiro: ");
                        System.out.println("La multiplicacion de " + i + " y " + j + ", da como resultado: " + result);
                        isVampire = true;
                    }else {
                        System.out.println("No es un numero vampiro");
                        isVampire = true;
                    }
                }
            }
        }
        return result;
    }
    
    /*
    * Este metodo pasa los valores de las variables a los metodos calcNChoice y calcVampireNumber
    * cuando recibe los vectores de esos metodos, los recorre comparandolos, y devuelve un valor booleano
    * true = vampiro
    * false = no es vampiro
    */
    public boolean compareChoiceVampire(int nChoice, int i, int j) {
        Vector userChoice = new Vector(8);
        Vector vampireNumber = new Vector(8);

        boolean areEquals = true;
        
        userChoice = calcNChoice(nChoice);
        vampireNumber = calcVampireNumber(i, j);
        
        for (int n = 0; n <=8;n++){
            if (userChoice.get(n) != vampireNumber.get(n)){
                areEquals=false;
            }
        }
        
        if (areEquals){
            return true;
        }else {
            return false;
        }
    }

    public Vector calcNChoice(int nChoice) {

        int digits, elements;
        Vector cChoice = new Vector(8);//Declaracion del vector que tendra los numeros del 0 al 9

        //Añadimos al vector los nueve numeros
        for (int i = 0; i <= 9; i++) {
            cChoice.add(i);
        }
        /*
        * Vamos desmontando el numero elegido por el usuario luego en cada case lo que se hace es:
        *  recuperar en una variable de tipo entero el valor de la posicion de dicho vector y aumentarla en uno
        * para despues comparar este vector con el vector del numero vampiro
         */
        for (int n = 0; n <= 3; n++) {
            digits = nChoice % 10;
            nChoice = nChoice / 10;
            switch (digits) {
                case 0:
                    /*
                    * Entramos en la posicion del vector y recuperamos el valor dicha posicion
                    * incrementamos ese valor y lo volvemos a introducir en la posicion del vector
                     */
                    elements = (int) cChoice.elementAt(0);
                    elements++;
                    cChoice.set(0, elements);
                    break;
                case 1:
                    elements = (int) cChoice.elementAt(1);
                    elements++;
                    cChoice.set(1, elements);
                    break;
                case 2:
                    elements = (int) cChoice.elementAt(2);
                    elements++;
                    cChoice.set(2, elements);
                    break;
                case 3:
                    elements = (int) cChoice.elementAt(3);
                    elements++;
                    cChoice.set(3, elements);
                    break;
                case 4:
                    elements = (int) cChoice.elementAt(4);
                    elements++;
                    cChoice.set(4, elements);
                    break;
                case 5:
                    elements = (int) cChoice.elementAt(5);
                    elements++;
                    cChoice.set(5, elements);
                    break;
                case 6:
                    elements = (int) cChoice.elementAt(6);
                    elements++;
                    cChoice.set(6, elements);
                    break;
                case 7:
                    elements = (int) cChoice.elementAt(7);
                    elements++;
                    cChoice.set(7, elements);
                    break;
                case 8:
                    elements = (int) cChoice.elementAt(8);
                    elements++;
                    cChoice.set(8, elements);
                    break;
                case 9:
                    elements = (int) cChoice.elementAt(9);
                    elements++;
                    cChoice.set(9, elements);
                    break;
            }
        }
        return cChoice;
    }

    public Vector calcVampireNumber(int i, int j) {

        int digits, elements, finalNumber;
        String number1, number2, result;
        Vector cVampire = new Vector(8);
        
        for (int n = 0; n <= 9; n++) {
            cVampire.add(n);
        }
        /*
        * Queremos ver el vector del numero vampiro encontrado para mas tarde compararlo con el vector de
        * la eleccion del usuario, asi que tenemos que unir los dos numeros i y j en uno para poder hacerlo
         */
        number1 = String.valueOf(i);
        number2 = String.valueOf(j);
        result = number1 + number2;

        finalNumber = Integer.parseInt(result);

        for (int n = 0; n <= 3; n++) {
            digits = finalNumber % 10;
            finalNumber = finalNumber / 10;
            switch (digits) {
                case 0:
                    /*
                    * Entramos en la posicion del vector y recuperamos el valor dicha posicion
                    * incrementamos ese valor y lo volvemos a introducir en la posicion del vector
                     */
                    elements = (int) cVampire.elementAt(0);
                    elements++;
                    cVampire.set(0, elements);
                    break;
                case 1:
                    elements = (int) cVampire.elementAt(1);
                    elements++;
                    cVampire.set(1, elements);
                    break;
                case 2:
                    elements = (int) cVampire.elementAt(2);
                    elements++;
                    cVampire.set(2, elements);
                    break;
                case 3:
                    elements = (int) cVampire.elementAt(3);
                    elements++;
                    cVampire.set(3, elements);
                    break;
                case 4:
                    elements = (int) cVampire.elementAt(4);
                    elements++;
                    cVampire.set(4, elements);
                    break;
                case 5:
                    elements = (int) cVampire.elementAt(5);
                    elements++;
                    cVampire.set(5, elements);
                    break;
                case 6:
                    elements = (int) cVampire.elementAt(6);
                    elements++;
                    cVampire.set(6, elements);
                    break;
                case 7:
                    elements = (int) cVampire.elementAt(7);
                    elements++;
                    cVampire.set(7, elements);
                    break;
                case 8:
                    elements = (int) cVampire.elementAt(8);
                    elements++;
                    cVampire.set(8, elements);
                    break;
                case 9:
                    elements = (int) cVampire.elementAt(9);
                    elements++;
                    cVampire.set(9, elements);
                    break;
            }
        }

        return cVampire;
    }
}
