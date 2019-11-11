/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author Andres
 */
public class SecondCoche {
    private String marca;
    private String modelo;
    
    SecondCoche(){
        this.marca = "Ford";
        this.modelo = "XA";
    }
    SecondCoche(String modelo, String marca){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public static void main(String []args){
        SecondCoche c1 = new SecondCoche();
        SecondCoche c2 = new SecondCoche("B520", "BMW");
        
        System.out.println("Objeto uno:");
        System.out.println("Marca: "+c1.marca);
        System.out.println("Modelo: "+c1.modelo);
        
        System.out.println("Objeto dos:");
        System.out.println("Marca:"+c2.marca);
        System.out.println("Objeto dos:"+c2.modelo);
    }
}
