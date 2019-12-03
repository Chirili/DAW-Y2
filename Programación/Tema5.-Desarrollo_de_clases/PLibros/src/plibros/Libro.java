/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plibros;

/**
 *
 * @author Andres
 */
public class Libro implements Cloneable {

    private String tituloLibro;
    private String nombreAutor;
    private int numeroEjemplaresLibro;
    private int numeroEjemplaresPrestados;

    /**
     * Constructor por defecto
     */
    Libro() {
        this.tituloLibro = "";
        this.nombreAutor = "";
        this.numeroEjemplaresLibro = 0;
        this.numeroEjemplaresLibro = 0;
    }

    /**
     * Constructor con parametros
     * @param nombreAutor
     * @param tituloLibro
     * @param numeroEjemplaresLibro
     * @param numeroEjemplaresPrestados 
     */
    Libro(String nombreAutor, String tituloLibro, int numeroEjemplaresLibro, int numeroEjemplaresPrestados) {
        this.tituloLibro = tituloLibro;
        this.nombreAutor = nombreAutor;
        this.numeroEjemplaresLibro = numeroEjemplaresLibro;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    /**
     * Constructor copia
     * @param lc 
     */
    Libro(final Libro lc) {
        this.tituloLibro = lc.tituloLibro;
        this.nombreAutor = lc.nombreAutor;
        this.numeroEjemplaresLibro = lc.numeroEjemplaresLibro;
        this.numeroEjemplaresPrestados = lc.numeroEjemplaresPrestados;
    }

    
    /**
     * Getter del titulo del libro
     * @return 
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Setter del titulo del video
     * @param tituloLibro 
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
/**
 * Getter del nombre del autor
 * @return 
 */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Setter del nombre del autor
     * @param nombreAutor 
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Getter del numero de ejemplares
     * @return 
     */
    public int getNumeroEjemplaresLibro() {
        return numeroEjemplaresLibro;
    }

    /**
     * Setter del numero de ejemplares
     * @param numeroEjemplaresLibro 
     */
    public void setNumeroEjemplaresLibro(int numeroEjemplaresLibro) {
        this.numeroEjemplaresLibro = numeroEjemplaresLibro;
    }

    /**
     * Getter de la cantidad de ejemplares prestados
     * @return 
     */
    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    /**
     * Setter del numero de ejemplares prestados
     * @param numeroEjemplaresPrestados 
     */
    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    /**
     * Metodo prestamo que devuelve false cuando no se pueden prestar mas libros
     * @return 
     */
    public boolean prestamo() {
        if ((numeroEjemplaresLibro - numeroEjemplaresPrestados)<= 0) {
            return false;
        } else {
            numeroEjemplaresLibro--;
            numeroEjemplaresPrestados++;
            return true;
        }
    }

    /**
     * Metodo devolucion que devuelve false si no se pueden devolver mas libros
     * @return 
     */
    public boolean devolucion() {
        if (numeroEjemplaresPrestados == 0) {
            return false;
        }else {
            numeroEjemplaresPrestados --;
            numeroEjemplaresLibro ++;
            return true;
        }
    }

    /**
     * Metodo cloneable
     * @return 
     */
    public Object clone() {
        Object obj = null;
        try {
            obj = (Libro) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    /**
     * Metodo toString para imprimir los atributos de la clase
     * @return 
     */
    @Override
    public String toString() {
        System.out.println("Nombre del autor: " + getNombreAutor());
        System.out.println("Nombre del libro: " + getTituloLibro());
        System.out.println("Numeros de ejemplares: " + getNumeroEjemplaresLibro());
        return "Numeros de ejemplares prestados: " + getNumeroEjemplaresPrestados();
    }

}
