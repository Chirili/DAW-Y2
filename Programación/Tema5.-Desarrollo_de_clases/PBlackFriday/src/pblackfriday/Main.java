/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblackfriday;

import Utils.Utils;

/**
 *
 * @author Andresito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uChoice;
        String selectColor;
        Utils uts = new Utils();
        BlackFriday bf = new BlackFriday();
        do {
            System.out.println("Bienvenido al black friday en impresoras:");
            System.out.println("A continuacion se te mostrarán distintos modelos de impresora,elige una:");
            System.out.println("1. Modelo Multifuncion 6332.");
            System.out.println("2. Modelo Multifuncion 3720 WIFI e impresion movil.");
            System.out.println("3. Modelo Multifuncion WIFI 3735 WIFI.");
            System.out.println("4. Modelo Multifuncion Laser.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            uChoice = uts.getInt();

            switch (uChoice) {
                case 1:
                    bf.setModelo("Multifuncion 6332");
                    break;
                case 2:
                    bf.setModelo("Multifuncion 3720 WIFI e impresion movil");
                    break;
                case 3:
                    bf.setModelo("Multifuncion WIFI 3735 WIFI");
                    break;
                case 4:
                    bf.setModelo("Multifuncion Laser");
                    break;
                case 0:
                    break;
            }
        } while (uChoice > 4);
        if (uChoice > 0) {
            bf.calcPrice();
            System.out.println(bf.getPrecio());
            System.out.println("Por defecto las impresoras tienen el color negro:");
            do {
                System.out.print("¿Deseas cambiarle el color:? Si o no: ");
                selectColor = uts.getString();
            } while (!selectColor.equalsIgnoreCase("si") && !selectColor.equalsIgnoreCase("no"));
            if (selectColor.equalsIgnoreCase("si")) {
                System.out.println("Debes recordar que el cambio de color de la impresora, conlleva a un incremento en el precio final. ");
                do {
                    System.out.println("Te muestro los colores disponibles: ");
                    System.out.println("1. Blanco.");
                    System.out.println("2. Azul.");
                    System.out.println("3. Rosa.");
                    System.out.println("0. Salir.");
                    System.out.print("Eleccion: ");
                    uChoice = uts.getInt();
                    switch (uChoice) {
                        case 1:
                            bf.setColor("Blanco");
                            break;
                        case 2:
                            bf.setColor("Azul");
                            break;
                        case 3:
                            bf.setColor("Rosa");
                            break;
                        case 0:
                            break;
                    }
                } while (uChoice > 3);
                bf.calcColor();
                System.out.println(bf.toString());
            } else {
                System.out.println(bf.toString());
            }
        }
        else {
            System.out.println("Adios...");
        }
    }
}
