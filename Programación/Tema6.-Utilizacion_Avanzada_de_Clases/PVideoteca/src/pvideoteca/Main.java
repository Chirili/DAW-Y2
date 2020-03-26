/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvideoteca;

import Utils.Utils;
import pvideoteca.Menu;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        Utils uts = new Utils();
        int choice;
        do {
            System.out.println("Bienvenid@ al menu de Videoteca que desea hacer: ");
            System.out.println("1. Añadir una pelicula nueva");
            System.out.println("2. Ver el numero de peliculas de las que dispone la videoteca");
            System.out.println("3. Buscar y mostrar todas las peliculas por nombre de pelicula");
            System.out.println("4. Buscar y mostrar todas las peliculas por nombre de director");
            System.out.println("5. Buscar y mostrar todas las peliculas por una tematica");
            System.out.println("6. Buscar y mostrar todas las peliculas que esten disponibles de una tematica concreta");
            System.out.println("7. Mostrar todas las peliculas");
            System.out.println("8. Descatalogar una pelicula");
            System.out.println("9. Salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    m.addPelicula();
                    break;
                case 2:
                    m.showFilms();
                    break;
                case 3:
                    m.showFilmsByName();
                    break;
                case 4:
                    m.showFilmsByDirector();
                    break;
                case 5:
                    m.showFilmsByTheme();
                    break;
                case 6:
                    m.sortFilmsByTheme();
                    break;
                case 7:
                    m.showAllFilms();
                    break;
                case 8:
                    m.uncatalogFilm();
                    break;
                case 9:
                    break;
                default:

            }
        } while (choice != 9);
    }
}
