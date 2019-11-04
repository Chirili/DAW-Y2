/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

import java.util.Scanner;

/**
 *Realiza un clase Temperatura, la cual convierta grados Celsius a Farenheir y viceversa. 
 * Para ello crea dos métodos doublé celsiusToFahrenheit(double) y doublé farenheitToCelsius(double).
 * @author usuario
 */
public class Temperatura {
    public void selectConverter(){
        Scanner sc = new Scanner(System.in);
        double tempChoice;
        
        System.out.println("1) Celsius a Fahrenheit");
        System.out.println("2) Fahrenheit a Celsius.");
        System.out.print("Elige uno de los dos conversores: ");
        int converterChoice = sc.nextInt();
        
        switch (converterChoice){
            case 1:
                System.out.print("Introduce una temperatura en Celsius para convertirla en Farenheit: ");
                tempChoice = sc.nextDouble();
                
            case 2:
                System.out.print("Introduce una temperatura en Farenheit para convertirla a Celsius: ");
                tempChoice = sc.nextDouble();
                System.out.println("El resultado de la conversión es igual a: "+fahrenheitToCelsius(tempChoice));
        }
    }
    public double fahrenheitToCelsius(double temp){
        double fahrenheit;
        
        fahrenheit = (temp - 32)/1.8;
        
        return fahrenheit;
    }
    public String toString(String prueba){
        return prueba;
    }
}
