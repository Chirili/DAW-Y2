/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *Realiza una clase finanzasque convierta dólares a euros y viceversa. Codifica los métodos dolaresToeuros y eurosToDolares. 
 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener:
 *          Un constructor finanzas()por defecto el cual establecerá el cambio Dólar-Euro en 1.36
 *          Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.
 * @author Andres
 */
public class finanzas {
    private double dolarEuro;
    
    finanzas(){
        dolarEuro = 1.36;
    }
    
    finanzas(double conversion){
        dolarEuro = conversion;
    }
    
    public double dolaresToEuros(double dolares){
        double euros;
        euros = dolares * dolarEuro;
        return euros;
    }
    
    public double eurosToDolares(double euros){
        double dolares;
        dolares = euros / dolarEuro;
        return dolares;
    }
}
