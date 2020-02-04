/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencias2;

import java.time.LocalDate;
import productos.*;
import productos.tipos.*;
import Utils.Utils;
import java.awt.AWTException;
import productos.tipos.congelados.*;

/**
 *
 * @author usuario
 */
public class TestHerencias3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Utils uts = new Utils();
        int choice;
        
        do {
            System.out.println("-----------------------------");
            System.out.println("Que quieres hacer: ");
            System.out.println("1. Ver productos frescos.");
            System.out.println("2. Ver productos refrigerados.");
            System.out.println("3. Ver productos congelados por agua.");
            System.out.println("4. Ver productos congelados por aire.");
            System.out.println("5. Ver productos congelados por nitrogeno.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            uts.clearScreen();
            switch (choice) {
                case 1:
                    ProductosFrescos pf1 = new ProductosFrescos(LocalDate.of(2020, 1, 29), "Suecia", LocalDate.of(2022, 2, 25), 443567);
                    ProductosFrescos pf2 = new ProductosFrescos(LocalDate.of(2018, 5, 11), "Francia", LocalDate.of(2020, 4, 3), 665125);
                    System.out.println("Productos frescos:");
                    System.out.println("-----------------------------");
                    System.out.println("Producto 1:");
                    System.out.println(pf1);
                    System.out.println("-----------------------------");
                    System.out.println("Producto 2:");
                    System.out.println(pf2);
                    break;
                case 2:
                    ProductosRefrigerados pr1 = new ProductosRefrigerados(665532,LocalDate.of(2017,6,7),5,"Japon",LocalDate.of(2019,7,28),67692);
                    ProductosRefrigerados pr2 = new ProductosRefrigerados(165486,LocalDate.of(2015,8,9),5,"China",LocalDate.of(2017,4,28),46876);
                    ProductosRefrigerados pr3 = new ProductosRefrigerados(168766,LocalDate.of(2023,2,14),5,"Antartida",LocalDate.of(2025,9,17),67692);
                    System.out.println("Productos refrigerados:");
                    System.out.println("-----------------------------");
                    System.out.println("Producto 1:");
                    System.out.println(pr1);
                    System.out.println("-----------------------------");
                    System.out.println("Producto 2:");
                    System.out.println(pr2);
                    System.out.println("-----------------------------");
                    System.out.println("Producto 3:");
                    System.out.println(pr3);
                    break;
                case 3:
                    PCongeladosAgua pca1 = new PCongeladosAgua(250,LocalDate.of(2014, 7, 18),"Rusia",10,LocalDate.of(2015, 1, 16),168468);
                    PCongeladosAgua pca2 = new PCongeladosAgua(100,LocalDate.of(2016, 9, 3),"Rusia",10,LocalDate.of(2015, 3, 17),268476);
                    System.out.println("Productos congelados por agua:");
                    System.out.println("-----------------------------");
                    System.out.println("Producto 1:");
                    System.out.println(pca1);
                    System.out.println("-----------------------------");
                    System.out.println("Producto 2:");
                    System.out.println(pca2);
                    break;
                case 4:
                    PCongeladosAire pcai1 = new PCongeladosAire(20,70,15,20,LocalDate.of(2017,5,4),"España",15,LocalDate.of(2019, 2, 10),146874);
                    PCongeladosAire pcai2 = new PCongeladosAire(50,40,10,30,LocalDate.of(2013,8,9),"España",15,LocalDate.of(2014, 11, 12),146874);
                    System.out.println("Productos congelados por aire:");
                    System.out.println("-----------------------------");
                    System.out.println("Producto 1:");
                    System.out.println(pcai1);
                    System.out.println("-----------------------------");
                    System.out.println("Producto 2:");
                    System.out.println(pcai2);
                    break;
                case 5:
                    //String metodoCongelacion, int tiempoExposicion, LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, LocalDate fechaCaducidad, int numeroLote
                    PCongeladosNitrogeno pcn1 = new PCongeladosNitrogeno("Congelacion bajo cero con nitrogeno",30,LocalDate.of(2020, 12, 15),"Estados Unidos",2,LocalDate.of(2024, 3, 24),165744);
                    System.out.println("Productos congelados por nitrogeno:");
                    System.out.println("-----------------------------");
                    System.out.println("Producto 1:");
                    System.out.println(pcn1);
                    break;
                    
            }
            
        } while (choice != 0);

    }

}
