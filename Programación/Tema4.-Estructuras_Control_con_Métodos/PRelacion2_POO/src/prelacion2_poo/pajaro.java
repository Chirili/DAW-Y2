/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *  ¿Está correctamente definida la siguiente clase?
 * ¿Compilará o habrá que modificarla para poder generar el fichero.class?
 * @author Andres
 */
public class pajaro {
// La clase esta bien definida y se puede compilar sin problemas
    public void setEdad(int e) {
        edad = e;
    }

    public void printEdad() {
        System.out.println(edad);
    }

    public void setcolor(char c) {
        color = c;
    }
    private char color ;
    private int edad ;
}
