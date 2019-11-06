/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *Realiza una clase minumeroque proporcione el doble, triple y cuádruple de un número proporcionando en un constructor 
 * (realiza un método para doble,otro para triple y otro para cuádruple). Haz que la clase tenga un método main y comprueba los distintos métodos.
 * @author Andres
 */
public class minumero {
     private double doble;
     private double triple;
     private double cuadruple;
    
    public static void main(String[] args){

       minumero mnum = new minumero(5,10,15);
       
       System.out.println(mnum.getDoble());
       System.out.println(mnum.getTriple());
       System.out.println(mnum.getCuadruple());
       
   }
    
   minumero(double calcDoble, double calcTriple, double calcCuadruple){
       doble = calcDoble(calcDoble);
       triple = calcTriple(calcTriple);
       cuadruple = calcCuadruple(calcCuadruple);
   }
   
   
   public double getDoble(){
       return doble;
   }
   public double getTriple(){
       return triple;
   }
   public double getCuadruple(){
       return cuadruple;
   }
   public double calcDoble(double numero){
       numero *=  2;
       
       return numero;
   }
   public double calcTriple(double numero){
       numero *= 3;
       
       return numero;
   }
   public double calcCuadruple(double numero){
       numero *= 4;
       
       return numero;
   }
}
