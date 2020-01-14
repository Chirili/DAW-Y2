/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcilindro;

import models.*;
import Utils.Utils;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double xv, yv, radio, altura;
        int uChoice;
        Utils uts = new Utils();

        System.out.println("Vamos a crear un cilindro:");
        System.out.println("Vamos a empezar por la posicion del mismo: ");

        System.out.print("Introduce el valor de X:  ");
        xv = uts.getDouble();

        System.out.print("Introduce el valor de Y: ");
        yv = uts.getDouble();

        Punto p = new Punto(xv, yv);

        System.out.println("El objeto punto esta creado vamos a hacer la base del cilindro: ");
        System.out.print("Introduce el radio del circulo: ");
        radio = uts.getDouble();

        Circulo cr = new Circulo(p, radio);

        System.out.println("Hemos acabado con la base del cilindro vamos a pasar a hacer el cilindro: ");
        System.out.print("Introduce la altura del cilindro: ");
        altura = uts.getDouble();

        Cilindro c = new Cilindro(cr, altura);

        do{
        System.out.println("Hecho el cilindro elije una de las siguientes opciones: ");
        System.out.println("1. Ver la posicion del cilindro.");
        System.out.println("2. Ver la base del cilindro.");
        System.out.println("3. Ver la altura del cilindro.");
        System.out.println("4. Mover el cilindro.");
        System.out.println("5. Calcular distancia de la abscisa.");
        System.out.println("0. Salir.");
        uChoice = uts.getInt();

        switch (uChoice) {
            case 1:
                System.out.println(p);
                break;
            case 2:
                System.out.println(cr);
                break;
            case 3:
                System.out.println(c);
                break;
            case 4:
                System.out.println("Para mover el cilindro necesitas introducir el valor de x e y, que quieres que se mueva: ");
                
                System.out.print("Introduce el valor de X:  ");
                xv = uts.getDouble();

                System.out.print("Introduce el valor de Y: ");
                yv = uts.getDouble();
                c.traslada(yv, yv);
                break;
            case 5:
                System.out.println("Para calcular la distancia de la abscisa necesito que introduzcas un valor X");
                System.out.print("Introduce el valor de X:  ");
                xv = uts.getDouble();
                
                Punto pa = new Punto(xv,0);
                
                System.out.println(p.distanciaAbscisa(pa));
                break;
        }
        }while(uChoice != 0);
    }

}
