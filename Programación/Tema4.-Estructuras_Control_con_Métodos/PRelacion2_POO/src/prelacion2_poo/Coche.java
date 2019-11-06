/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

import java.util.Scanner;

/**
 *  
 * @author Andres
 */
public class Coche {
    private int velocidad;
    Coche(){
        velocidad = 0;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public void acelera(int mas){
        velocidad += mas;
    }
    public void frenar(int menos){
        velocidad -= menos;
    }
}
