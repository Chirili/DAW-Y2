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

    /*
    * Recogemos el numero que ha introducido el usuario por teclado y lo condicionamos
    * en funcion de la longitud del numero se hara un calculo u otro
     */
    public void esVampiro(int nChoice) {
        //Variable encarga de recoger la cantidad de digitos que está formado el numero introducido
        nLength = (int) (Math.log10(nChoice) + 1);

        if (nLength == 4 || nLength == 6 || nLength == 8) {
            switch (nLength) {

                case 4:
                    calcHundredOfVampireNumbers(nChoice);
                    break;
                case 6:
                    calcThousandsOfVampireNumbers(nChoice);
                    break;
                case 8:
                    break;
                default:

            }
        } else {
            System.out.println("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos correcto");
        }
    }

    public int calcThousandsOfVampireNumbers(int nChoice) {
        int vector1 = 0,
                vector2 = 0,
                rvector1 = 0,
                rvector2 = 0,
                count = 0;
        boolean isVampire = false;
        Vector<Integer> firstVectorChoice = new Vector(2);
        Vector<Integer> secondVectorChoice = new Vector(2);
        int ifV1, ifV2, ifV3, isV1, isV2, isV3, resultf,resultv,compare;
        String sfV1, sfV2, sfV3, ssV1, ssV2, ssV3,vectorString1,vectorString2;
        vector1 = nChoice % 1000;
        vector2 = nChoice / 1000;

        for (int i = 0; i <= 2; i++) {

            rvector1 = vector1 % 10;
            vector1 = vector1 / 10;

            rvector2 = vector2 % 10;
            vector2 = vector2 / 10;

            firstVectorChoice.add(i, rvector1);
            secondVectorChoice.add(i, rvector2);

        }
        
        while (isVampire != false || count <= 5) {

            int a = 0, b = 1, c = 2;
            int d = 5, e = 4, f = 3;
            
            for(int i = 0; i<=2;i+=2){
                for(int j = 0;j<=2;j+=2){
                    
                    ifV1 =  firstVectorChoice.get(i);
                    ifV2 = firstVectorChoice.get(b);
                    ifV3 = firstVectorChoice.get(c);
                    
                    isV1 = secondVectorChoice.get(j);
                    isV2 = secondVectorChoice.get(j);
                    isV3 = secondVectorChoice.get(j);
                   
                    sfV1= String.valueOf(ifV1);
                    sfV2= String.valueOf(ifV2);
                    sfV3= String.valueOf(ifV3);
                    ssV1 = String.valueOf(isV1);
                    ssV2 = String.valueOf(isV2);
                    ssV3 = String.valueOf(isV3);
                    
                    vectorString1 = sfV1 + sfV2 + sfV3;
                    vectorString2 = ssV1 + ssV2 + ssV3;
                    
                    resultf = Integer.parseInt(vectorString1);
                    resultv = Integer.parseInt(vectorString2);
                    
                    compare = resultf * resultv;
                    
                    if(compare == nChoice){
                        isVampire = true;
                    }else {
                        isVampire = false;
                    }
                }
            }
            if (isVampire = true){
                System.out.println("El numero introducido es un numero vampiro.");
            }else {
                System.out.println("El numero itnroducido no es un numero vampiro.");
            }
        }
        return vector1;
    }

    /*
    * Este metodo calcula los numeros de 4 cifras, se encarga de multiplicar dos numeros de dos cifras
    * que son los colmillos del numero elegido, cuando encuentra que la multiplicacion de los numeros es
    * igual al numero introducido por teclado lo condiciona y lo pasa a otro metodo para calcular si de verdad
    * es vampiro o no.
     */
    public int calcHundredOfVampireNumbers(int nChoice) {
        boolean isVampire = false;
        int result = 0;
        for (int i = 10; i <= 99; i++) {

            if (isVampire == true) {//Si encuentra un numero vampiro salimos del bucle, ya que no me interesa seguir multiplicando
                break;
            }

            for (int j = 99; j >= 10; j--) {
                result = i * j;

                if (isVampire == true) {//Si encuentra un numero vampiro salimos del bucle, ya que no me interesa seguir multiplicando
                    break;
                }
                /* Si la multiplicacion entre i y j da como resultado igual al numero introducido puede ser un posible numero vampiro
                 *  asi que entramos en la condicion, dentro de esta condicion llamamos al metodo compareChoiceVampire
                 * para que nos diga si el numero es vampiro o no
                 */

                if (nChoice == result) {
                    //Si compareChoiceVampire devuelve true entonces tenemos un numero vampiro sino, no es vampiro
                    if (compareChoiceVampire(nChoice, i, j) == true) {
                        System.out.println("¡El numero introducido " + nChoice + " es un numero vampiro! ");
                        System.out.println("La multiplicacion de " + i + " y " + j + ", da como resultado: " + result);
                        isVampire = true;
                    } else {
                        System.out.println("El numero que has introducido no es un numero vampiro.");
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
    * true =  es vampiro
    * false = no es vampiro
     */
    public boolean compareChoiceVampire(int nChoice, int i, int j) {
        Vector userChoice = new Vector(8);
        Vector vampireNumber = new Vector(8);

        boolean areEquals = true;

        userChoice = calcNChoice(nChoice);
        vampireNumber = calcVampireNumber(i, j);

        for (int n = 0; n <= 8; n++) {
            if (userChoice.get(n) != vampireNumber.get(n)) {
                areEquals = false;
            }
        }

        if (areEquals) {
            return true;
        } else {
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
        * Vamos desmontando digito a digito el numero elegido por el usuario, conforme se va desmontando va entrando en el switch,
        * en el switch en cada case lo que se hace es recuperar el valor de dicha posicion(por ejemplo, si el primer numero de digits es igual a 1,
        * recuperamos el valor de la posicion que es igual a 1, lo incrementamos, y lo volvemos a meter, entonces en la posicion el numero será 2)
        * Con esto podemos comparar dos numeros y asi averiguar si son vampiros.
         */
        for (int n = 0; n <= 3; n++) {
            digits = nChoice % 10;
            nChoice = nChoice / 10;
            switch (digits) {
                case 0:
                    /*
                    * Entramos en la posicion del vector y recuperamos el valor dicha posicion
                    * incrementamos ese valor y lo volvemos a introducir en la posicion correspondiente
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
