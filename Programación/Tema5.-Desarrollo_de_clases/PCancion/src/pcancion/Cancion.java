/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcancion;
import Utils.Utils;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    /**
     * Constructor con parametros
     * @param autor
     * @param titulo 
     */
    Cancion(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }
    /**
     * Constructor por defecto
     */
    Cancion(){
        this.autor = "";
        this.titulo = "";
    }
    /**
     * Setter de titulo
     * @param titulo 
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    /**
     * Setter de autor
     * @param autor 
     */
    public void setAutor(String autor){
        this.autor = autor;
    }
    /**
     * Getter de titulo
     * @return 
     */
    public String getTitulo(){
        return this.titulo;
    }
    /**
     * Getter de autor
     * @return 
     */
    public String getAutor(){
        return this.autor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String autorName, songTittle;
        Utils ut = new Utils();
        Cancion c1 = new Cancion();
        
        
        c1.setAutor("Pepe");
        c1.setTitulo("Pepe el de los palotes");
        
        System.out.println("Nombre de la cancion: "+c1.getTitulo());
        System.out.println("Nombre del autor: "+c1.getAutor());
        
        
        System.out.print("Introduce un nombre de la cancion: ");
        songTittle = ut.getString();
        
        System.out.print("Introduce el nombre del autor: ");
        autorName = ut.getString();
        
        Cancion c2 = new Cancion(autorName, songTittle);
        
        System.out.println("Nombre de la cancion elegida: "+c2.getTitulo());
        System.out.println("Nombre del autor de la cancion elegida: "+c2.getAutor());
        
    }
    
}
