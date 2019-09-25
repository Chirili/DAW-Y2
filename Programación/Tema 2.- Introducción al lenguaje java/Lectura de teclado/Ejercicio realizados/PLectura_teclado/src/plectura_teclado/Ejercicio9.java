/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plectura_teclado;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio9 {
    public static void volumenCono(){
        System.out.println("Calculo del volumen de un cono: ");
        int radio;
        int altura;
        int volumen;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige el radio del cono: ");
        radio = sn.nextInt();
        System.out.print("Elige la altura del cono: ");
        altura = sn.nextInt();
        
        volumen = (altura*radio)/3;
        System.out.println("El volumen del cono con radio "+radio+" y altura "+altura+" es el siguiente: "+volumen);
    }
}
