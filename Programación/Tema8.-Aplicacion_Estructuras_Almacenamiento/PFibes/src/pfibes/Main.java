/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfibes;

import Utils.AnularException;
import Utils.NoHayEntradasDisponibles;
import Utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import models.Entrada;
import models.EntradaEnum;

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
        Auxiliar aux = new Auxiliar();
        
        ArrayList<Entrada> nombre = new ArrayList<Entrada>();
        nombre.add(new Entrada());
        
        ArrayList<Entrada> usu = new ArrayList<Entrada>(nombre);
        usu.addAll(nombre);
        Iterator<Entrada> itusu = usu.iterator();
        
        while(itusu.hasNext()){
            itusu.next().getCodigo();
        }
        do {
            System.out.println("____________________________________________________");
            System.out.println("Bienvenid@ al programa de gestion de entradas:");
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Vender entrada.");
            System.out.println("2. Anular entrada..");
            System.out.println("3. Mostrar todas las entradas que ha comprado una misma persona.");
            System.out.println("4. Mostrar cuantas entradas VIP, de PALCO y RESERVADAS.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    try {
                        aux.venderEntrada();
                    } catch (NoHayEntradasDisponibles ex) {
                        System.out.println("No hay mas entradas disponibles de este tipo");
                    }
                    break;
                case 2:
                    try {
                        aux.anularEntrada();
                    } catch (AnularException ex) {
                        System.out.println("Tienes que vender entradas antes de poder anularlas...");
                    }
                    break;
                case 3:
                     try {
                        aux.mostrarEntradasPersona();
                    } catch (AnularException ex) {
                        System.out.println("Tienes que vender entradas para poder ver los usuarios...");
                    }
                    break;
                case 4:
                    aux.contarEntradas();
                    break;
            }
        } while (choice != 0);

    }
}
