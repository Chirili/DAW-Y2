package plectura_teclado;


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {
    public static void conversorPesetas(){
        double euros;
        double pesetas = 166.387;
        double result;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige la cantidad de euros a convertir: ");
        euros = sn.nextInt();
        
        result = euros * pesetas;
        System.out.println("La conversión de la cantidad de euros elegida "+euros+" es la siguiente: "+result);
    }
}
