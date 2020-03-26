/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plibreria;

import Utils.Utils;
import models.Libro;

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
        Libro lib = new Libro();
        lib.addBook("Don Quijote de la Mancha", "Miguel de Cervantes", "AN324234242ES", 400);
        lib.addBook("Don Quijote de la Mancha", "Miguel de Cervantes", "AN334234242ES", 350);
        lib.addBook("20 poemas de amor y una canción desesperada", " Pablo Neruda", "AN999333120ES", 45);
        lib.addBook("Harry Potter y la piedra filosofal", "J.K. Rowling", "AN000432753UK", 400);

        do {
            System.out.println("Bienvenid@ al programa de gestion de libros: ");
            System.out.println("1. Insertar libro.");
            System.out.println("2. Ver libros.");
            System.out.println("3. Eliminar libro.");
            System.out.println("4. Modificar libro.");
            System.out.println("5. Ver libro.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    Libro lib1 = new Libro();
                    lib1.capturar();
                    lib.addBook(lib1.getNombre(), lib.getAutor(), lib.getISBN(), lib.getNumPaginas());
                    break;
                case 2:
                    if (lib.getLibros().isEmpty()) {
                        System.out.println("Introduce libros antes de poder verlos...");
                    }
                    lib.showBooksByName();
                    break;
                case 3:
                    int libNumber;
                    if (lib.getLibros().isEmpty()) {
                        System.out.println("Introduce libros antes de poder operarlos...");
                    }
                    for (int i = 0; i < lib.getLibros().size(); i++) {
                        System.out.println((i + 1) + ". " + lib.getLibros().get(i).getNombre());
                    }
                    do {
                        System.out.print("Que libro quieres borrar: ");
                        libNumber = uts.getInt();

                    } while (libNumber < 1 || libNumber > lib.getLibros().size());
                    lib.rmBook(libNumber);
                    break;
                case 4:
                    if (lib.getLibros().isEmpty()) {
                        System.out.println("Introduce libros antes de poder modificarlos...");
                    }
                    for (int i = 0; i < lib.getLibros().size(); i++) {
                        System.out.println((i + 1) + ". " + lib.getLibros().get(i).getNombre());
                    }
                    System.out.println("Que libro quieres modificar: ");
                    do {
                        System.out.println("Que libro quieres modificar: ");
                        libNumber = uts.getInt();
                        break;
                    } while (libNumber < 1 || libNumber > lib.getLibros().size());
                    System.out.print("Introduce el titulo para cambiar: ");
                    String titulo = uts.getString();
                    lib.changeTitle(libNumber, titulo);
                    break;
                case 5:
                    int bookNumber;
                    if (lib.getLibros().isEmpty()) {
                        System.out.println("Introduce libros antes de poder verlos...");
                    }
                    for (int i = 0; i < lib.getLibros().size(); i++) {
                        System.out.println((i + 1) + ". " + lib.getLibros().get(i).getNombre());
                    }
                    do{
                        System.out.print("Que libro deseas ver: ");
                        bookNumber = uts.getInt();
                    }while(bookNumber < 1 || bookNumber > lib.getLibros().size());
                    lib.showBook(bookNumber-1);
                    break;
            }
        } while (choice != 0);
    }
}
