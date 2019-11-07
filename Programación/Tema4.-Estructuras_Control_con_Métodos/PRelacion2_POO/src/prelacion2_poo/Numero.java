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
public class Numero {
    private double numeroInterno;

    Numero(){
        this.numeroInterno = 0;
    }
    
    Numero(double initNumber){
        this.numeroInterno = initNumber;
    }
    
    public void aniade(double sumNumber){
        this.numeroInterno = sumNumber;
    }
    
    public void resta(double deductNumber){
        this.numeroInterno = deductNumber;
    }
    
    public double getValor(){
        return this.numeroInterno;
    }
    
    public double getDoble(){
        return this.numeroInterno*2;
    }
    
    public double getTriple(){
        return this.numeroInterno*3;
    }
    
    public void setNumero(double number){
        this.numeroInterno = number;
    }
}
