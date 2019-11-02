/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author usuario
 */
public class minumero {
    /*
    * Explicacion:
    * Este programa se encarga de averiguar si un numero introducido por teclado es vampiro.
    * El programa tiene una limitacion de hasta 8 digitos ya que el limite de digitos de la variable int es de 10
    * Solo funciona hasta los 8 digitos ya que con 8 digitos las combinaciones posibles son 40.320 y con 10 son
    * 3.628.800.
    */
    private int numberLength=5;
    private int numberChoice;
    private boolean isVampire = false;
    private int index = 0;
    private int finalArr1[] = new int[0];

    /*
     * Este metodo recoge por teclado un numero introducido por el usuario y lo condiciona
     * de tal modo que solo pueda introducir 4,6 y 8. Después de eso se le pasa un id al siguiente metodo.
     */
    public void selectNumber() {
        Scanner sc = new Scanner(System.in);
        int id;//Variable que va contener un id para el numero que se introduzca en funcion de su tamaño.

        do {
            System.out.print("Introduce un numero par que sea 4, 6 u 8, para saber si es vampiro o no: ");
            numberChoice = sc.nextInt();
            //Variable encarga de recoger la cantidad de digitos que está formado el numero introducido
            numberLength = (int) (Math.log10(numberChoice) + 1);
            //Mientras que el numero tenga 4, 6 u 8 cifras y no sea impar entrara en la condicion.
            if ((numberLength % 2) == 0 && numberLength > 3) {
                switch (numberLength) {
                    /*
                    * En funcion del numero de digitos introducido se le pasa al metodo correspondiente
                    * el valor de la variable nChoice que contiene el numero introucido por usuario y el
                    * id correspondiente.
                    */
                    case 4:
                        esVampiro(id = 4, numberChoice);
                        break;
                    case 6:
                        esVampiro(id = 6, numberChoice);
                        break;
                    case 8:
                        esVampiro(id = 8, numberChoice);
                        break;
                    default:
                }
            } else {
                System.out.println("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos par.");
            }
        } while ((numberLength % 2)!= 0);
    }

    public int esVampiro(int id, int numberChoice) {
        int possibilities = 2;//Variable que contendra todas las posibilidades de combinaciones
        int temp = 0, result = 0, tusk1 = 0, tusk2 = 0;
        /*
        * Este bucle se encarga de calcular la cantidad de posibles combinaciones con el numero introducido.
        * ya que utiliza el valor del id pasado por parametro para condicionarlo. Ej: numero de 4 cifras es igual a:
        * 2*3*4 = 24 posibles combinaciones distintas
        */
        for (int i = 3; i <= id; i++) {
            possibilities *= i;
        }

        /*
        * Rellenamos el array con ceros por si el usuario quiere volver a intentarlo y establecemos el index a 0,
        * tambien establecemos el array que contendra todas las posibilidades con su tamaño respectivo
        */
        Arrays.fill(finalArr1, 0);

        index = 0;

        finalArr1 = Arrays.copyOf(finalArr1, possibilities);


        int vampireArr1[] = new int[id];//Array temporal que se encarga de almacenar todos los numeros por separado.

        
        int vector1 = 0;

        // Este bucle recibe un colmillo y va separando digito a digito y lo va añadiendo al array declarado anteriormente
        temp = numberChoice;
        for (int i = 0; i < id; i++) {
            vector1 = temp % 10;
            temp = temp / 10;
            vampireArr1[i] = vector1;

        }
        //Le pasamos al metodo permute el arra
        calcCombinations(vampireArr1, 0, 1);
        
        for (int i = 0; i < possibilities; i++) {
            /*
            * Si isVampire es igual que true nos salimos del bucle porque no necesitamos seguir calculando
            * numeros.
            */
            if(isVampire == true){break;}
            /*
            * Dentro del switch en funcion del id dividimos el numero entre 2, cada parte la metemos en una variable
            * que esas partes serian los colmillos, los multiplicamos y si el resultaado es igual al introducido por
            * teclado el numero es Vampiro y nos salimos del bucle.
            */
            switch (id) {
                case 4:
                    tusk1 = finalArr1[i] % 100;
                    tusk2 = finalArr1[i] / 100;
                    result = tusk1 * tusk2;
                    if (result == numberChoice){isVampire=true;break;}
                break;
                case 6:
                    tusk1 = finalArr1[i] % 1000;
                    tusk2 = finalArr1[i] / 1000;
                    result = tusk1 * tusk2;
                    if (result == numberChoice){isVampire=true;break;} 
                case 8:
                    tusk1 = finalArr1[i] % 1000;
                    tusk2 = finalArr1[i] / 1000;
                    result = tusk1 * tusk2;
                    if (result == numberChoice){isVampire=true;break;}     
            }
        }
        
        if (result == numberChoice){
            System.out.println("El numero introducido es vampiro.");
            System.out.println("La multiplicacion del valor del primer colmillo: "+tusk1+" y del segundo colmillo: "+tusk2+" dan como resultado: "+result);
        }else {
            System.out.println("El numero que has introducido no es vampiro");
        }
        return 0;
    }
    /*
    * Este metodo se encarga de calcular todas las posibles combinaciones de un numero determinado de numeros
    * y meter todas esas combinaciones dentro de un array para despues calcularlo
    */
    public void calcCombinations(int[] array, int arrayIndex, int id) {

        String concat, result = "";
        int finalResult;
        
        if (arrayIndex == array.length) {
            /*
            * Este bucle for coge los numeros devueltos por el bucle que esta en la condicion else
            * los transforma en int y los concatena para formar el numero, justo debajo esa cadena
            * de caracteres se transforma en int y ese numero se añade al array final
            */
            for (int i = 0; i < array.length; i++) {
                concat = String.valueOf(array[i]);
                result += concat;
            }
                finalResult = Integer.parseInt(result);
                finalArr1[index] = finalResult;
                index++;
        } else {
            /*
            * Este bucle es el encargado de calcular las combinaciones.
            */
            for (int i = arrayIndex; i < array.length; i++) {

                int temp = array[arrayIndex];
                array[arrayIndex] = array[i];
                array[i] = temp;

                calcCombinations(array, arrayIndex + 1, id);

                temp = array[arrayIndex];
                array[arrayIndex] = array[i];
                array[i] = temp;

            }
        }
    }
}
