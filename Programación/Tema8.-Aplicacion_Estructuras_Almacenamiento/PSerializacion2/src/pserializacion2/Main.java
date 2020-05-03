/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pserializacion2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Ej8Serializable2.Matriculados;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File fichero = new File(System.getProperty("user.dir") + "\\matriculados.ddr");

        try {
            Matriculados matr = new Matriculados();
            ObjectInputStream ObjectIStream = new ObjectInputStream(new FileInputStream(fichero));


            
            matr.añadirMatriculados(ObjectIStream);

            System.out.println("Porcentaje de Benjamines: "+(matr.getMatriculados().stream().filter(matriculado -> matriculado.getCategoria().equalsIgnoreCase("BE")).count()*100)/matr.getMatriculados().size()+"%");
            System.out.println("Porcentaje de Alveines: "+(matr.getMatriculados().stream().filter(matriculado -> matriculado.getCategoria().equalsIgnoreCase("AL")).count()*100)/matr.getMatriculados().size()+"%");
            System.out.println("Porcentaje de Infantiles: "+(matr.getMatriculados().stream().filter(matriculado -> matriculado.getCategoria().equalsIgnoreCase("IN")).count()*100)/matr.getMatriculados().size()+"%");
            System.out.println("Porcentaje de Juveniles: "+(matr.getMatriculados().stream().filter(matriculado -> matriculado.getCategoria().equalsIgnoreCase("JV")).count()*100)/matr.getMatriculados().size()+"%");
            System.out.println("Porcentaje de Cadetes: "+(matr.getMatriculados().stream().filter(matriculado -> matriculado.getCategoria().equalsIgnoreCase("CD")).count()*100)/matr.getMatriculados().size()+"%");

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("fin");
        } catch (IOException e) {

        }
    }
}
