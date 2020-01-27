/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Utils.Utils;
import models.Persona;

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

        //Persona 1
        Persona p1 = new Persona();
        p1.setAltura(1.50);
        p1.setPeso(70);
        p1.setEdad(30);
        p1.setNombre("Pepe");
        
        System.out.println("Informacion de la primera persona: ");
        System.out.println(p1);

        System.out.println("----------------------------------");
        //Persona 2
        System.out.print("Dime el nombre de la persona: ");
        String nombre = uts.getString();
        System.out.print("Dime la edad de la persona: ");
        int edad = uts.getInt();
        System.out.print("Dime el sexo de la persona. Introduce H para hombre y M para mujer: ");
        String sexo = uts.getString();
        
        
        Persona p2 = new Persona(nombre, edad, sexo.toUpperCase().charAt(0));

        System.out.print("Dime el peso de la persona: ");
        int peso = uts.getInt();
        p2.setPeso(peso);

        System.out.print("Dime la altura de la persona: ");
        double altura = uts.getDouble();
        p2.setAltura(altura);

        System.out.println("Datos de la persona creada: ");
        System.out.println(p2);
        
        System.out.println("----------------------------------");
        //Persona 3
        Persona p3 = new Persona("Manola", 55, 'M', 70, 1.90);
        System.out.println("Informacion de la tercera persona: ");
        System.out.println(p3);

        System.out.println("----------------------------------");
        //Persona 4
        Persona p4 = (Persona) p3.clone();
        System.out.println("Informacion de la cuarta persona: ");
        System.out.println(p4);
        switch(p4.calcularImc()){
            case -1:
                System.out.println("Te encuentras por debajo de tu peso ideal. Porfavor considera comer un poco mas.");
                break;
            case 0:
                System.out.println("Te encuentras en tu peso ideal. Felicidades");
                break;
            case 1:
                System.out.println("Te encuentras por encima de tu peso idea. Porfavor considera hacer una dieta y ejercicio.");
                break;
        }
        if(p4.esMayorDeEdad()){
            System.out.print("La persona es mayor de edad.");
        }else {
            System.out.print("La persona no es mayor de edad.");
        }
    }

}
