/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 * ¿Está correctamente definida la siguiente clase? ¿Compilará o habrá que
 * modificarla para poder generar el fichero.class?
 *
 * @author Andres
 */
public class Pajaro {
// La clase esta bien definida y se puede compilar sin problemas.
    //Metodo setter encargado de actualizar la edad del pajaro.

    public void setEdad(int e) {
        this.edad = e;
    }

    public void printEdad() {//Metodo encargado de imprimir por pantalla la edad del pajaro.
        System.out.println(edad);
    }

    public void setcolor(char c) {//Metodo setter encargado de actualizar el color del pajaro.
        this.color = c;
    }
    private char color;//Contiene el color del pajaro
    private int edad;// Contiene la edad del pajaro
}
