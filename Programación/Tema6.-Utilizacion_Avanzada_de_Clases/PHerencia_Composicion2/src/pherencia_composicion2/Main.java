/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia_composicion2;

import models.*;
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
    public static void main(String[] args) throws AWTException {
        Utils uts = new Utils();
        String pFactura;
        int choice = 0;
        int tCDescuento = 0, tSDescuento = 0;
        int cAparatos = 0;
        int cTipo = 0;
        boolean arrayChecker = false;
        Factura fcT = new Factura();
        Factura facturaTelevisores[] = null;
        Factura facturaEquipoSonido[] = null;
        Tv arrayTelevisores[];
        Equipo arrayEquipoSonido[] = null;

        do {
            //Preguntamos cuantos aparatos se han comprado
            System.out.print("Introduce la cantidad de aparatos comprados: ");
            cAparatos = uts.getInt();
        } while (cAparatos <= 0 || choice != 0);
        do {
            //Averiguamos cuantos cuantos son de tipo televisor condicionando al usuario
            System.out.print("Introduce cuantos son Televisores(El resto seran equipos de sonido): ");
            cTipo = uts.getInt();
        } while (cTipo > cAparatos || choice != 0);
        //Establecemos el array de televisores en el caso de que todos los televisores esten dentro de una factura
        arrayTelevisores = new Tv[cTipo - 1];
        //Establecemos el array de equipos de sonido mientras que la cantidad de televisores sea menor a la cantidad de aparatos comprados
        if (cTipo < cAparatos) {
            arrayEquipoSonido = new Equipo[(cAparatos - cTipo)];
        }
        uts.clearScreen();
        do {
            System.out.println("Bienvenido al menu de gestion de Facturas, que deseas hacer: ");
            if (arrayTelevisores.length > 0) {
                System.out.println("1. Introducir datos a los televisores.");
                System.out.println("2. Ver la factura de los televisores.");
            }
            if (arrayEquipoSonido != null && arrayEquipoSonido.length >= 1) {
                System.out.println("3. Introducir datos a los equipos de sonido.");
                System.out.println("4. Ver la factura de los equipos de sonido.");
            }
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    uts.clearScreen();
                    System.out.println("Atencion: si se escribe algo que no sea si, se entenderá como un NO.");
                    System.out.print("¿Estan todos los televisores en una misma factura?: ");
                    pFactura = uts.getString();
                    //Si todos los televisores estan dentro de la misma factura, tenemos un array de televisores, sino tenemos un array de facturas
                    if (pFactura.equalsIgnoreCase("si")) {
                        //Vamos pidiendo los datos de los televisores mientras que no esten vacios por si el usuario quiere volver a seguir introduciendo datos
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
                                uts.clearScreen();
                            }
                        }
                        do {
                            uts.clearScreen();
                            int contador = 1;
                            for (Tv televisores : arrayTelevisores) {
                                if (televisores != null && televisores.isDecuentoAplicado() == true) {
                                    tCDescuento++;
                                }
                                if (televisores != null && televisores.isDecuentoAplicado() == false) {
                                    tSDescuento++;
                                }
                            }
                            if (tCDescuento == tSDescuento) {
                                System.out.println("No hay televisores a los que aplicar descuentos...");
                                break;
                            }
                            //Aplicamos el descuento mientras que el usuario quiera y este no esté ya aplicado al aparato
                            System.out.print("¿Quieres aplicar algun descuento los televisores? Escribe si o no: ");
                            pFactura = uts.getString();
                            if (pFactura.equalsIgnoreCase("si")) {
                                System.out.println("Elige a que televisores aplicar el descuento: ");
                                //Se pinta por pantalla los televisores a los que no se les haya aplicado descuento
                                for (Tv televisor : arrayTelevisores) {
                                    if (televisor != null && televisor.isDecuentoAplicado() == false) {
                                        System.out.println(contador + ". " + televisor.getModelo());
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
                                uts.clearScreen();
                            }

                        } while (!pFactura.equalsIgnoreCase("no"));
                        //Establecemos el array de televisores en el atributo correspondiente de la clase Factura para su posterior operacion
                        fcT.setcTv(arrayTelevisores);
                    } else {
                        //Si el usuario por el contrario lo que quiere tener es cada uno de los televisores en una factura, pues inicializamos el array de facturas
                        facturaTelevisores = new Factura[arrayTelevisores.length];
                        //Podria hacer que cada factura pudiera tener un array de televisores, pero no he podido por tiempo.
                        for (int i = 0; i < arrayTelevisores.length; i++) {
                            if (arrayTelevisores[i] == null) {
                                Factura fc1 = new Factura();
                                System.out.println("Factura " + (i + 1));
                                System.out.println("Numero de factura: " + fc1.getNumero());
                                fc1.capturarFacturaTv();
                                facturaTelevisores[i] = fc1;
                                System.out.print("Escribe si para salir, y cualquier otra cosa para continuar: ");
                                pFactura = uts.getString();
                                if (pFactura.equalsIgnoreCase("si")) {
                                    break;
                                }
                                uts.clearScreen();
                            }
                        }
                    }
                    break;
                case 3:
                    break;
                case 2:
                    uts.clearScreen();
                    for (Tv televisores : arrayTelevisores) {
                        if (televisores != null) {
                            if (facturaTelevisores == null) {
                                arrayChecker = true;
                            }
                        }
                    }
                    if (arrayChecker == false) {
                        System.out.println("Introduce datos en los televisores por favor.");
                        break;
                    }
                    if (facturaTelevisores == null) {
                        fcT.imprimirTelevisores();
                    }
                    break;
                case 4:
                    break;
            }
        } while (choice != 0);

    }

}
