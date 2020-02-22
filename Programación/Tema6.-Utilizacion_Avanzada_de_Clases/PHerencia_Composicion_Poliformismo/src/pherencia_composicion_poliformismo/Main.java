/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia_composicion_poliformismo;

import models.aparato.*;
import models.aparato.tipos.*;
import models.factura.*;
import models.factura.tipos.*;
import Utils.Utils;
import java.awt.AWTException;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        int choice = 0;
        int numFactura = 0;
        Utils uts = new Utils();
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Comprar Equipo");
            System.out.println("2. Comprar IPod");
            System.out.println("3. Comprar Tv");
            System.out.println("0. Salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    if (menuFactura() == 1) {
                        FacturaEquipo fce1 = new FacturaEquipo();
                        fce1.capturar();
                        uts.clearScreen();
                        System.out.print(fce1);
                        Thread.sleep(1500);
                    } else {
                        System.out.println("Datos del equipo: ");
                        Equipo e1 = new Equipo();
                        e1.capturar();
                        uts.clearScreen();
                        do {
                            System.out.print("Introduce el numero de la factura: ");
                            numFactura = uts.getInt();
                        } while (String.valueOf(numFactura).length() > 8 || numFactura < 0);
                        FacturaEquipo fce1 = new FacturaEquipo(numFactura, e1, capturarDescuento());
                        System.out.println(fce1);
                    }
                    break;
                case 2:
                    if (menuFactura() == 1) {
                        FacturaIPod if1 = new FacturaIPod();
                        if1.capturar();
                        uts.clearScreen();
                        System.out.print(if1);
                        Thread.sleep(1500);
                    } else {
                        System.out.println("Datos del Ipod: ");
                        Ipod i1 = new Ipod();
                        i1.capturar();
                        uts.clearScreen();
                        do {
                            System.out.print("Introduce el numero de la factura: ");
                            numFactura = uts.getInt();
                        } while (String.valueOf(numFactura).length() > 8 || numFactura < 0);
                        FacturaIPod fi1 = new FacturaIPod(numFactura, i1, capturarDescuento());
                        System.out.println(fi1);
                    }
                    break;
                case 3:
                    if (menuFactura() == 1) {
                        FacturaTv tf1 = new FacturaTv();
                        tf1.capturar();
                        uts.clearScreen();
                        System.out.print(tf1);
                        Thread.sleep(1500);
                    } else {
                        System.out.println("Datos del Televisor: ");
                        Tv t1 = new Tv();
                        t1.capturar();
                        uts.clearScreen();
                        do {
                            System.out.print("Introduce el numero de la factura: ");
                            numFactura = uts.getInt();
                        } while (String.valueOf(numFactura).length() > 8 || numFactura < 0);
                        FacturaTv ft1 = new FacturaTv(numFactura, t1, capturarDescuento());
                        System.out.println(ft1);
                    }
                    break;
            }
        } while (choice != 0);

    }

    public static int menuFactura() {
        int choice = 0;
        Utils uts = new Utils();
        do {
            System.out.println("¿Que quieres hacer a continuacion?");
            System.out.println("1. Generar factura.");
            System.out.println("2. Crear factura.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    return 1;
            }
        } while (choice != 0);
    }

    public static double capturarDescuento() {
        Utils uts = new Utils();
        double pctDescuento;
        do {
            System.out.print("Introduce el % de descuento(Limitado hasta 60 %): ");
            pctDescuento = uts.getDouble();
        } while (pctDescuento < 0 || pctDescuento > 60);
        return pctDescuento;
    }
}
