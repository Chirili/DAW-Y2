/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import Utils.Utils;
import models.ConversorBilletes;
/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Utils uts = new Utils();
        ConversorBilletes cb = new ConversorBilletes();
        do {
        System.out.println("Elige una opcion: ");
        System.out.println("1. Ingresar dinero. ");
        System.out.println("2. Ver dinero actual. ");
        System.out.println("3. Convertir a billetes. ");
        System.out.println("0. Salir. ");
        System.out.print("Eleccion: ");
        choice = uts.getInt();
        switch(choice){
            case 1:
                System.out.println("Cantidad de euros a ingresar: ");
                int euros = uts.getInt();
                cb.setEuros(euros);
                break;
            case 2:
                System.out.println("Dinero actual: "+cb.getEuros());
                break;
            case 3:
                cb.convertirBilletes();
        }
        }while(choice != 0);
    }
    
}
