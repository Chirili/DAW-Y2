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
public class Minumero {
     private double doble;
     private double triple;
     private double cuadruple;
    
    public static void main(String[] args){

       Minumero mnum = new Minumero(5,10,15);
       
       System.out.println(mnum.getDoble());
       System.out.println(mnum.getTriple());
       System.out.println(mnum.getCuadruple());
       
   }
    /*
    * Constructor de Minumero que recibe 3 valores por parametro y se lo pasa a los metodos para realizar las operaciones.
    */
   Minumero(double calcDoble, double calcTriple, double calcCuadruple){
       this.doble = calcDoble(calcDoble);
       this.triple = calcTriple(calcTriple);
       this.cuadruple = calcCuadruple(calcCuadruple);
   }
   
   /*
   * Getters para devolver los valores
   */
   public double getDoble(){
       return this.doble;
   }
   public double getTriple(){
       return this.triple;
   }
   public double getCuadruple(){
       return this.cuadruple;
   }
   
   /*
   * Metodos que se encargan de calcular los valores correspondientes
   */
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
