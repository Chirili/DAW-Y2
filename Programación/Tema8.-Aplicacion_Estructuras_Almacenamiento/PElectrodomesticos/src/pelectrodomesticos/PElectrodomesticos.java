/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelectrodomesticos;

import Utils.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import models.*;

/**
 *
 * @author Andres
 */
public class PElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>(9);

        int precios = 0;
        int precioTotal = 0;
        electrodomesticos.add(new Electrodomestico(350, "Azul", 'Z', 32));
        electrodomesticos.add(new Electrodomestico(200, "Verde", 'E', 70));
        electrodomesticos.add(new Lavadora(10, 178, "Amarillo", 'F', 40));
        electrodomesticos.add(new Electrodomestico(400, "Rojo", 'C', 46));
        electrodomesticos.add(new Lavadora(40, 150, "Blanco", 'B', 100));
        electrodomesticos.add(new Lavadora(25, 250, "Marron", 'D', 30));
        electrodomesticos.add(new Television(25, true, 260, "Amarillo", 'D', 25));
        electrodomesticos.add(new Lavadora(5, 143, "Azul", 'A', 15));
        electrodomesticos.add(new Television(40, true, 344, "Gris", 'B', 25));
        electrodomesticos.add(new Television(65, true, 530, "Negro", 'F', 25));

        for (int i = 0; i < electrodomesticos.size(); i++) {
            electrodomesticos.get(i).precioFinal();
        }
        ArrayList<Lavadora> lavadoras = new ArrayList(Arrays.asList(electrodomesticos.stream().filter(p -> p instanceof Lavadora).toArray()));
        
        ArrayList<Television> televisores = new ArrayList(Arrays.asList(electrodomesticos.stream().filter(p -> p instanceof Television).toArray()));
        electrodomesticos.removeIf(elec -> elec instanceof Television || elec instanceof Lavadora);

        System.out.println("----------------------------------------------------------");
        System.out.println("Lavadoras: ");
        for (int i = 0; i < lavadoras.size(); i++) {
            System.out.println("Lavadora " + i + ": " + lavadoras.get(i).getPrecio_base());
            precios += lavadoras.get(i).getPrecio_base();
        }
        System.out.println("Total: " + precios);
        
        precioTotal += precios;
        precios = 0;
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Televisores: ");
        for (int i = 0; i < lavadoras.size(); i++) {
            System.out.println("Televisor " + i + ": " + lavadoras.get(i).getPrecio_base());
            precios += lavadoras.get(i).getPrecio_base();
        }
        System.out.println("Total: " + precios);
        precioTotal += precios;
        precios = 0;
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Electrodomesticos: ");
        for (int i = 0; i < lavadoras.size(); i++) {
            System.out.println("Televisor " + i + ": " + lavadoras.get(i).getPrecio_base());
            precios += lavadoras.get(i).getPrecio_base();
        }
        System.out.println("Total: " + precios);
        precioTotal += precios;
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Precio total: "+precioTotal);
    }
}
