/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia_composicion2;

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
        Utils uts = new Utils();
        String pFactura;
        int choice = 0;
        int cAparatos = 0;
        int cTipo = 0;
        Factura fcT = new Factura();
        Factura facturaTelevisores[];
        Factura facturaEquipoSonido[];
        Tv arrayTelevisores[];
        Equipo arrayEquipoSonido[];

        do {
            //Preguntamos cuantos aparatos se han comprado
            System.out.print("Introduce la cantidad de aparatos comprados: ");
            cAparatos = uts.getInt();
            do {
                //Averiguamos cuantos cuantos son de tipo televisor condicionando al usuario
                System.out.print("Introduce cuantos son Televisores(El resto seran equipos de sonido): ");
                cTipo = uts.getInt();
                //Establecemos el array de televisores en el caso de que todos los televisores esten dentro de una factura
                arrayTelevisores = new Tv[cTipo];
                //Establecemos el array de equipos de sonido mientras que la cantidad de televisores sea menor a la cantidad de aparatos comprados
                if (cTipo < cAparatos) {
                    arrayEquipoSonido = new Equipo[(cAparatos - cTipo)];
                }
                do {
                    System.out.println("Bienvenido al menu de gestion de Facuras, que deseas hacer: ");
                    System.out.println("1. Introducir datos a los televisores.");
                    System.out.println("2. Introducir datos a los equipos de sonido.");
                    System.out.println("3. Ver la factura de los televisores.");
                    System.out.println("4. Ver la factura de los equipos de sonido.");
                    System.out.println("0. Salir.");
                    choice = uts.getInt();
                    switch (choice) {
                        case 1:

                            System.out.println("Atencion: si se escribe algo que no sea si, se entenderá como un NO.");
                            System.out.print("¿Estan todos los televisores en una misma factura?: ");
                            pFactura = uts.getString();
                            //Si todos los televisores estan dentro de la misma factura, tenemos un array de televisores, sino tenemos un array de facturas
                            if (pFactura.equalsIgnoreCase("si")) {
                                for (int i = 0; i < arrayTelevisores.length; i++) {

                                    if (arrayTelevisores[i] == null) {
                                        System.out.println("Televisor " + (i + 1));
                                        Tv tv1 = new Tv();
                                        tv1.capturarTv();
                                        arrayTelevisores[i] = tv1;
                                        System.out.print("Escribe si para salir, y cualquier otra cosa para continuar: ");
                                        pFactura = uts.getString();
                                        if (pFactura.equalsIgnoreCase("si")) {
                                            break;
                                        }
                                    }
                                }
                                do {
                                    System.out.print("¿Quieres aplicar algun descuento los televisores? Escribe si o no: ");
                                    pFactura = uts.getString();
                                    if (pFactura.equalsIgnoreCase("si")) {
                                        System.out.println("Elige a que televisores aplicar el descuento: ");
                                        int contador = 0;
                                        for (Tv televisor : arrayTelevisores) {
                                            if (televisor != null && televisor.isDecuentoAplicado() == false) {
                                                System.out.println(contador + 1 + ". " + televisor.getModelo());
                                                contador++;
                                            }
                                        }
                                        int dtv;
                                        do {
                                            System.out.print("Eleccion: ");
                                            dtv = uts.getInt();
                                        } while (dtv > arrayTelevisores.length || dtv <= 0);
                                        double descuento = fcT.capturarDescuento();
                                        arrayTelevisores[dtv - 1].calcularDesc(descuento);
                                    }

                                } while (!pFactura.equalsIgnoreCase("no"));
                                fcT.setcTv(arrayTelevisores);
                                System.out.println("Precio total de la factura: " + fcT.calcularTotal());

                            } else {
                                facturaTelevisores = new Factura[arrayTelevisores.length];
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                } while (choice != 0);
            } while (cTipo <= cAparatos);

        } while (cAparatos <= 0);
    }

}
