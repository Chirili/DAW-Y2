/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjarraexcepciones;

import java.util.Scanner;
import models.Jarra;
import models.JarraException;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Cuanto quieres rellenar la jarraA: ");
            int rjarraa = sc.nextInt();

            System.out.print("Cuanto quieres rellenar la jarrab: ");
            int rjarrab = sc.nextInt();

            Jarra jarraA = new Jarra(rjarraa);
            Jarra jarraB = new Jarra(rjarrab);
            jarraA.llena();
            jarraB.vacia();
            System.out.println("JA " + jarraA.toString());
            System.out.println("JB " + jarraB.toString());
            jarraB.llenaDesde(jarraA);
            jarraA.llena();
            jarraB.llenaDesde(jarraA);
            jarraB.vacia();
            jarraB.llenaDesde(jarraA);
            jarraA.llena();
            jarraB.llenaDesde(jarraA);
            System.out.println("JA " + jarraA.toString());
            System.out.println("JB " + jarraB.toString());
        }catch(JarraException e){
            System.out.println("ERROR: Algun parametro no es numero ");
        }catch (NumberFormatException e) {
            System.out.println("ERROR:  Algun  parametro  no  es  un numero");
        }catch(RuntimeException e){
            System.out.println("ERROR:  Algun parametro  no  es  un numero");
        }
    }
}
