/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plibropersonafecha;

import java.awt.AWTException;
import models.*;

/**
 *
 * @author Andres
 */
public class PLibroPersonaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Book b = new Book();
        b.getData();
        System.out.println(b);
    }

}
