/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Libro {

    private String nombre;
    private String ISBN;
    private String autor;
    private int numPaginas;
    private ArrayList<Libro> libros;

    //Constructor por defecto de Libro
    public Libro() {
        this.nombre = "";
        this.ISBN = "";
        this.autor = "";
        this.numPaginas = 0;
        this.libros = new ArrayList<Libro>();
    }

    //Constructor parametrizado de Libro
    public Libro(String nombre, String autor, String ISBN, int numPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        this.libros = new ArrayList<Libro>();
    }

    /**
     * Metodo encargado de añadir un Libro al ArrayList de libros
     *
     * @param titulo
     * @param autor
     * @param ISBN
     * @param numeroPaginas
     */
    public void addBook(String titulo, String autor, String ISBN, int numeroPaginas) {
        Libro lib = new Libro(titulo, autor, ISBN, numeroPaginas);
        this.libros.add(lib);
    }

    /**
     * Metodo encargado de recibir y borrar el libro en funcion del numero de
     * posicion del Libro que se desea borrar.
     *
     * @param bookNumber
     */
    public void rmBook(int bookNumber) {
        this.libros.remove(bookNumber);
    }

    /**
     * Metodo encargado de cambiar el titulo del libro que se desea modificar.
     * En funcion del numero de la posicion del libro
     *
     * @param bookNumber
     * @param titulo
     */
    public void changeTitle(int bookNumber, String titulo) {
        this.libros.get(bookNumber).setNombre(titulo);
    }

    /**
     * Muestra los libros por nombre
     */
    public void showBooksByName() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i).getNombre());
        }
    }

    /**
     * Muestra toda la informacion de un libro concreto
     *
     * @param bookNumber
     */
    public void showBook(int bookNumber) {
        System.out.println(libros.get(bookNumber).toString());
    }

    //Metodo encargado de capturar los datos necesarios para los libros
    public void capturar() {
        Utils uts = new Utils();
        System.out.print("Introduce el nombre del libro: ");
        this.setNombre(uts.getString());
        System.out.print("Introduce el ISBN del libro: ");
        this.setISBN(uts.getString());
        System.out.print("Nombre del autor del libro");
        this.setAutor(uts.getString());
        System.out.print("Introduce le numero de paginas: ");
        this.setNumPaginas(uts.getInt());
    }

    @Override
    public String toString() {
        return "Titulo del libro: " + this.getNombre()
                + "\nNombre del autor del libro: " + this.getAutor()
                + "\nISBN: " + this.getISBN()
                + "\nNumero de paginas del libro: " + this.getNumPaginas();
    }

    /**
     * Getters y setters de Libro
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

}
