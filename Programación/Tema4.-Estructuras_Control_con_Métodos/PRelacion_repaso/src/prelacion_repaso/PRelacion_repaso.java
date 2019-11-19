/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion_repaso;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PRelacion_repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String uChoice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto:");
        
          uChoice = "Esto es una prueba";
        CountLetters ct = new CountLetters();
        System.out.println(uChoice);
        ct.countLetters();
    }
    
}
