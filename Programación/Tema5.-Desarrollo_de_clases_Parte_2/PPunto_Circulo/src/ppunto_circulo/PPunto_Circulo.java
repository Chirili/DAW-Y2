/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppunto_circulo;
import models.*;
import Utils.Utils;
/**
 *
 * @author Andres
 */
public class PPunto_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        
        int choice=0;
        Punto p = new Punto();
        p.capturarPunto();
        Circulo c = new Circulo(p);
        c.capturarCirculo();
        do{
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Ver los datos del punto.");
            System.out.println("2. Ver los datos del circulo ");
            System.out.println("3. Ver el cuadrante del centro del circulo.");
            System.out.println("0. Salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch(choice){
                case 1:
                    System.out.println(p);
                    break;
                case 2:
                    System.out.println(c);
                    break;
                case 3:
                    int cuadrante;
                    cuadrante = (p.getX() < 0 && p.getY() > 0) ? 1: 
                            (p.getX() > 0 && p.getY() > 0) ? 2:
                            (p.getX() > 0 && p.getY()< 0) ? 3:4;
                    System.out.println("El centro del circulo se encuentra en el cuadrante "+cuadrante+".");
                    break;
            }
        }while(choice != 0);
        
    }
    
}
