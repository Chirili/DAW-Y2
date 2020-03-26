/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvideoteca;

import models.*;
import Utils.Utils;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Menu {

    private Almacen almacen;

    //Constructor por defecto de Menu
    public Menu() {
        this.almacen = new Almacen();
    }

    //Metodo encargado de añadir peliculas
    public void addPelicula() {
        Utils uts = new Utils();
        String nombrePelicula, director, tematica;
        int duracion;

        System.out.print("Dime el nombre de la pelicula: ");
        nombrePelicula = uts.getString();
        System.out.print("Dime el nombre del director: ");
        director = uts.getString();
        System.out.print("Dime la tematica de la pelicula: ");
        tematica = uts.getString();
        do {
            System.out.print("Dime la duracion de la pelicula: ");
            duracion = uts.getInt();
        } while (duracion <= 1800);
        Pelicula p = new Pelicula(nombrePelicula, director, tematica, duracion);
        this.almacen.addFilm(p);
    }

    //Muestra el numero de peliculas
    public void showFilms() {
        int count = 0;
        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).isDisponible()) {
                count++;
            }
        }
        System.out.println("Numero de peliculas disponibles: " + count);
    }

    //Muestra las peliculas por nombre
    public void showFilmsByName() {
        Utils uts = new Utils();
        int choice;

        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();

        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getNombrePelicula());
        }

        do {
            System.out.print("¿Que pelicula quieres ver?Escoge un numero: ");
            choice = uts.getInt();
        } while (choice < 1 && choice > peliculas.size());

        if (peliculas.get(choice - 1).isDisponible()) {
            System.out.println(peliculas.get(choice - 1).toString());
        } else {
            System.out.println("La pelicula no se encuentra actualmente disponible...");
        }
    }

    //Muestra las peliculas por director
    public void showFilmsByDirector() {
        Utils uts = new Utils();
        int choice;

        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();

        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getDirector());
        }

        do {
            System.out.print("¿Que pelicula quieres ver?Escoge un numero: ");
            choice = uts.getInt();
        } while (choice < 1 && choice > peliculas.size());

        if (peliculas.get(choice - 1).isDisponible()) {
            System.out.println(peliculas.get(choice - 1).toString());
        } else {
            System.out.println("La pelicula no se encuentra actualmente disponible...");
        }
    }

    //Muestra las peliculas por tema
    public void showFilmsByTheme() {
        Utils uts = new Utils();
        int choice;

        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();

        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getTematica());
        }

        do {
            System.out.print("¿Que pelicula quieres ver?Escoge un numero: ");
            choice = uts.getInt();
        } while (choice < 1 && choice > peliculas.size());

        if (peliculas.get(choice - 1).isDisponible()) {
            System.out.println(peliculas.get(choice - 1).toString());
        } else {
            System.out.println("La pelicula no se encuentra actualmente disponible...");
        }
    }

    //Metodo encargado de buscar las peliculas en el almacen en funcion de lo que quiera el usuario
    public void sortFilmsByTheme() {
        String theme;
        boolean hasTheme = false;
        Utils uts = new Utils();
        int choice;

        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();

        System.out.print("Elige la tematica de la pelicula: ");
        theme = uts.getString();

        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getTematica().contains(theme)) {
                System.out.println((i + 1) + ". " + peliculas.get(i).toString());
                hasTheme = true;
            }
        }
        
        if (hasTheme = true) {
        } else {
            System.out.println("No existen peliculas de la tematica: " + theme);
        }
    }

    //Metodo encargado de descatalogar Peliculas
    public void uncatalogFilm() {
        Utils uts = new Utils();
        int choice;

        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).isDisponible()) {
                System.out.println((i + 1) + ". " + peliculas.get(i).getNombrePelicula());
            }
        }
        do {
            System.out.print("¿Que pelicula quieres ver?Escoge un numero: ");
            choice = uts.getInt();
        } while (choice < 1 && choice > peliculas.size());

        peliculas.get(choice - 1).setDisponible(false);
    }

    //Muestra todas las peliculas siempre y cuando esten disponibles y no hayan sido descatalogadas
    public void showAllFilms() {
        ArrayList<Pelicula> peliculas = this.almacen.getPeliculas();

        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).isDisponible()) {
                System.out.println((i + 1) + ". " + peliculas.get(i).toString());
            }
        }
    }
}
