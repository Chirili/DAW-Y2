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
public class Ejercicio8 {
    public static void salarioSemanal(){
        System.out.println("Calculo del salario semanal de un trabajador: ");
        int base_horas;
        int coste = 12;
        int pago;
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Escribe la cantidad de horas semanales trabajadas: ");
        base_horas = sn.nextInt();
        
        pago = base_horas * 12;
        System.out.println("El pago total semanal del trabajados es el siguiente: "+pago);
    }
    
}
