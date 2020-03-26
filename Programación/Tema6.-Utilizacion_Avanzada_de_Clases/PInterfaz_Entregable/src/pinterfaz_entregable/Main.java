/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinterfaz_entregable;

import Utils.Utils;
import controllers.SerieController;
import controllers.VideojuegoController;
import models.*;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        int choice;
        SerieController sc = new SerieController();
        VideojuegoController vc = new VideojuegoController();
        System.out.println("Bienvenid@ al programa encargado de gestionar videojuegos y series:");
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Gestionar videojuegos");
            System.out.println("2. Gestionar series");
            System.out.println("0. Salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:

                    defaultMenu("videojuego", sc, vc);
                    break;
                case 2:

                    defaultMenu("serie", sc, vc);
                    break;
            }
        } while (choice != 0);
    }

    public static void defaultMenu(String tipoMenu, Object s, Object v) {
        Utils uts = new Utils();
        int choice;
        SerieController SerieControl = (SerieController) s;
        VideojuegoController VideojuegoControl = (VideojuegoController) v;
        do {
            System.out.println("Bienvenido al menu de " + tipoMenu);
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Insertar " + tipoMenu);
            System.out.println("2. Buscar " + tipoMenu);
            System.out.println("3. Ver " + tipoMenu + "s");
            System.out.println("4. Remplazar " + tipoMenu);
            System.out.println("0. Volver atrás");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    if (tipoMenu.equalsIgnoreCase("serie")) {

                        addMenu(tipoMenu, SerieControl, "add");

                    } else {

                        addMenu(tipoMenu, VideojuegoControl, "add");
                    }
                    break;
                case 2:

                    if (tipoMenu.equalsIgnoreCase("serie")) {
                        int serieChoice;
                        if (SerieControl.numberOfSeries() == 0) {
                            System.out.println("No se puede realizar la operacion, introduce primero datos");
                            break;
                        }
                        SerieControl.findSeries();
                        do {
                            System.out.print("Eleccion");
                            serieChoice = uts.getInt();
                        } while (serieChoice > SerieControl.numberOfSeries() || serieChoice < 0 || serieChoice != 0);
                        SerieControl.findSerieByKey((serieChoice));
                    } else {
                        if (VideojuegoControl.numberOfVideoGames() == 0) {
                            System.out.println("No se puede realizar la operacion, introduce primero datos");
                            break;
                        }
                        int videojuegoChoice;
                        if (tipoMenu.equalsIgnoreCase("serie")) {
                            SerieControl.findSeries();
                            do {
                                System.out.print("Eleccion");
                                videojuegoChoice = uts.getInt();
                            } while (videojuegoChoice > SerieControl.numberOfSeries() || videojuegoChoice < 0 || videojuegoChoice != 0);
                            SerieControl.findSerieByKey((videojuegoChoice));
                        }
                    }
                    break;
                case 3:
                    if (tipoMenu.equalsIgnoreCase("serie")) {
                        SerieControl.findSeries();
                    } else {
                        VideojuegoControl.findVideojuegos();
                    }
                    break;
                case 4:
                    if (tipoMenu.equalsIgnoreCase("serie")) {
                        if (SerieControl.numberOfSeries() == 0) {
                            System.out.println("No se puede realizar la operacion, introduce primero datos");
                            break;
                        }
                        addMenu(tipoMenu, s, "update");
                    } else {
                        if (VideojuegoControl.numberOfVideoGames() == 0) {
                            System.out.println("No se puede realizar la operacion, introduce primero datos");
                            break;
                        }
                        int videojuegoChoice;
                        if (tipoMenu.equalsIgnoreCase("serie")) {
                            SerieControl.findSeries();
                            do {
                                System.out.print("Eleccion");
                                videojuegoChoice = uts.getInt();
                            } while (videojuegoChoice > SerieControl.numberOfSeries() || videojuegoChoice < 0 || videojuegoChoice != 0);
                            SerieControl.findSerieByKey((videojuegoChoice));
                        }
                    }
                    break;

            }
        } while (choice != 0);
    }

    public static void addMenu(String tipoMenu, Object o, String str) {
        Utils uts = new Utils();
        String titulo, genero, autor;
        int numHoras;

        System.out.print("Introduce el titulo de " + tipoMenu + ": ");
        titulo = uts.getString();

        System.out.print("Introduce el genero de " + tipoMenu + ": ");
        genero = uts.getString();

        System.out.print("Introduce el autor/compañia de " + tipoMenu + ": ");
        autor = uts.getString();

        do {
            System.out.print("Introduce el numero de horas de " + tipoMenu + ": ");
            numHoras = uts.getInt();
        } while (numHoras < 0);

        if (str.equalsIgnoreCase("add")) {
            if (tipoMenu.equalsIgnoreCase("serie")) {
                SerieController SerieControl = (SerieController) o;
                SerieControl.addSerie(titulo, autor, numHoras, genero);
            } else {
                VideojuegoController VideojuegoControl = (VideojuegoController) o;
                VideojuegoControl.addSerie(titulo, autor, numHoras, genero);
            }
        } else {
            if (tipoMenu.equalsIgnoreCase("serie")) {
                int serieChoice;
                SerieController SerieControl = (SerieController) o;
                System.out.println("Porque serie quieres sustiuir: ");
                SerieControl.findSeries();
                do {
                    serieChoice = uts.getInt();
                } while (serieChoice > SerieControl.numberOfSeries() && serieChoice < 0 && serieChoice != 0);
                SerieControl.updateSerie(titulo, autor, numHoras, genero, serieChoice);
            } else {
                VideojuegoController VideojuegoControl = (VideojuegoController) o;
                int videojuegoChoice;
                SerieController SerieControl = (SerieController) o;
                System.out.println("Porque videojuego quieres sustiuir: ");
                SerieControl.findSeries();
                do {
                    videojuegoChoice = uts.getInt();
                } while (videojuegoChoice > VideojuegoControl.numberOfVideoGames() && videojuegoChoice < 0 && videojuegoChoice != 0);

                VideojuegoControl.updateVideoGame(titulo, autor, numHoras, genero, videojuegoChoice);
            }
        }
    }
}