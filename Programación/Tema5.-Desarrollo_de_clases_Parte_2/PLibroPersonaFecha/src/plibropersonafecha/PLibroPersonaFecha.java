/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plibropersonafecha;

import models.*;

/**
 *
 * @author Andres
 */
public class PLibroPersonaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona autor = new Persona("Daniel", "Liang", "Y.");
        Fecha fechaEdicion = new Fecha("Lunes","Noviembre",2001,16);
        Place lugar = new Place("USA", "Prentice Hall, New Jersey");
        Book b = new Book("Introduction to Java Programming",autor,"0-13-031997-X",784,3,fechaEdicion,lugar);
        System.out.println(b);
    }

}
