/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

import java.util.Scanner;

/**
 * Realiza un clase Temperatura, la cual convierta grados Celsius a Farenheir y
 * viceversa. Para ello crea dos metodos double celsiusToFahrenheit(double) y
 * double farenheitToCelsius(double).
 *
 * @author usuario
 */
public class Temperatura {

    public void selectConverter() {
        Scanner sc = new Scanner(System.in);
        double temp;
        final double fahrenTemp1 = 0;
        final double fahrenTemp2 = 40;
        final double fahrenTemp3 = 70;
        final double celsiTemp1 = 0;
        final double celsiTemp2 = 15;
        final double celsiTemp3 = 20;
        
        /*
        * Con el bucle for vamos recorriendo el array y le vamos pasando cada uno de los resultados al metodo correspondiente
        * para que nos devuelva una temperatura convertida la cual se almacena en una variable y se imprime por pantalla
        */
        temp=celsiusToFahrenheit(celsiTemp1);
        System.out.println(printCelsius(temp,celsiTemp1));
        temp=celsiusToFahrenheit(celsiTemp2);
        System.out.println(printCelsius(temp,celsiTemp2));
        temp=celsiusToFahrenheit(celsiTemp3);
        System.out.println(printCelsius(temp,celsiTemp3));
        
        temp=fahrenheitToCelsius(fahrenTemp1);
        System.out.println(printCelsius(temp,fahrenTemp1));
        temp=fahrenheitToCelsius(fahrenTemp2);
        System.out.println(printCelsius(temp,fahrenTemp2));
        temp=fahrenheitToCelsius(fahrenTemp3);
        System.out.println(printCelsius(temp,fahrenTemp3));
    }
    public double fahrenheitToCelsius(double temp) {
        double fahrenheit;

        fahrenheit = (temp - 32) / 1.8;

        return fahrenheit;
    }

    public double celsiusToFahrenheit(double temp) {
        double celsius;

        celsius = (1.8) * temp + 32;

        return celsius;
    }

    public String printFahrenheit(double fahrenheit, double temp) {
        String str;
        str = temp + " grados Fahrenheit son " + fahrenheit + " Grados Celsius";
        return str;
    }

    public String printCelsius(double fahrenheit, double temp) {
        String str;
        str = temp + " grados Celsius son " + fahrenheit + " Grados Fahrenheit";
        return str;
    }
}
