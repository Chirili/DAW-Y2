/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pserializacion3;

import Utils.Utils;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import oposicion.opositor;
import oposicion.pruebas;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int choice;
        File fichero = new File(System.getProperty("user.dir") + "\\Oposicion_Monitor.dat");

        ArrayList<opositor> opositores = new ArrayList<opositor>();
        do {
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Leer el fichero.");
            System.out.println("2. Mostrar contenido del fichero.");
            System.out.println("3. Visualizar numero de deportistas totales, con sus cantidad correspondientes de cada tipo.");
            System.out.println("0. Salir.");
            choice = Utils.getInt();

            switch (choice) {
                case 1:
                    try {
                        ObjectInputStream ObjectIStream = new ObjectInputStream(new FileInputStream(fichero));

                        while (true) {
                            opositor opo = (opositor) ObjectIStream.readObject();
                            opo.setNombreOposiciones();
                            opositores.add(opo);
                        }

                    } catch (ClassNotFoundException e) {

                    } catch (EOFException e) {

                    } catch (IOException e) {

                    }

                    break;
                case 2:
                    if (opositores.isEmpty()) {
                        System.out.println("");
                    }
                    for (int i = 0; i < opositores.size(); i++) {
                        System.out.println("Opositor numero " + (i + 1));
                        System.out.println("Nombre del opositor: " + opositores.get(i).getNombre() + "\nCodigo del opositor: " + opositores.get(i).getCodigo());
                        System.out.print("Resultados de las pruebas: ");
                        for (int j = 0; j < opositores.get(i).getLista_pruebas().size(); j++) {
                            System.out.print("| Nombre de la prueba: " + opositores.get(i).getLista_pruebas().get(j).getNombre() + ", Calificacion en la prueba: " + opositores.get(i).getLista_pruebas().get(j).getCalificacion() + " |");
                        }
                    }
                    break;
                case 3:
                    //"Correr","Nadar","Bicicleta","Fuerza","Salto"
                    String[][] datos = crearMatriz();
                    for (int i = 0; i < datos.length; i++) {
                        for (int j = 0; j < datos[i].length; j++) {
                            if (i == 0) {

                            } else if (i > 0 && j > 0) {
                                datos[i][j] = contarTipo(datos[i][0], datos[0][j], opositores);
                            }
                        }
                    }
                    pintarMatriz(datos);
                    break;
            }

        } while (choice != 0);
    }

    private static void pintarMatriz(String[][] datos) {
        for (int x = 0; x < datos.length; x++) {
            System.out.print("|");
            for (int y = 0; y < datos[x].length; y++) {
                System.out.print(datos[x][y]);
                if (y != datos[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }

    private static String contarTipo(String tipo, String calificacion, ArrayList<opositor> opos) {
        int contador = 0;
        for (int i = 0; i < opos.size(); i++) {
            for (int j = 0; j < opos.get(i).getLista_pruebas().size(); j++) {
                if (opos.get(i).getLista_pruebas().get(j).getNombre().equalsIgnoreCase(tipo) && opos.get(i).getLista_pruebas().get(j).getCalificacion().equalsIgnoreCase(calificacion)) {
                    contador++;
                }
            }
        }
        return String.valueOf(contador);
    }

    private static String[][] crearMatriz() {
        String[] tipos = {"Correr", "Nadar", "Bicicleta", "Fuerza", "Salto"};
        String[] calif = {"NL", "NA", "AT", "EX"};
        String[][] datos = new String[6][5];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (i == 0 && j == 0) {

                } else if (i == 0 && j > 0) {
                    datos[i][j] = calif[j - 1];
                }
                if (i > 0 && j == 0) {
                    datos[i][j] = tipos[i - 1];
                }
            }
        }
        return datos;
    }
}
