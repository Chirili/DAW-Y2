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

    double temp;
    final double fahrenTemp1 = 0;
    final double fahrenTemp2 = 40;
    final double fahrenTemp3 = 70;
    final double celsiTemp1 = 0;
    final double celsiTemp2 = 15;
    final double celsiTemp3 = 20;

    public void selectConverter() {

        /*
        * La variable temp es igual al resultado del calculo del valor pasado por parametro al metodo correspondiente
        * Despues se imprime por pantalla
        * 
        * Otra manera de hacerlo seria utilizando un array y rellenando el array con valores
        * luego pasarselo a los metodos con un bucle for:
        * final double [] fahrenTemp1 = {0, 40, 70}
        *  for (int i = 0; i < fahrenTemp.length;i++){
        *   this.temp = celsiusToFahrenheit(fahrenTemp[i]);
        *   System.out.println(printFahrenheit(this.temp, fahrenTemp[i]));
        *   }
         */
        this.temp = celsiusToFahrenheit(this.celsiTemp1);
        System.out.println(printCelsius(this.celsiTemp1, this.temp));
        this.temp = celsiusToFahrenheit(this.celsiTemp2);
        System.out.println(printCelsius(this.celsiTemp2, this.temp));
        this.temp = celsiusToFahrenheit(this.celsiTemp3);
        System.out.println(printCelsius(this.celsiTemp3, this.temp));

        temp = fahrenheitToCelsius(this.fahrenTemp1);
        System.out.println(printFahrenheit(this.fahrenTemp1, this.temp));
        this.temp = fahrenheitToCelsius(this.fahrenTemp2);
        System.out.println(printFahrenheit(this.fahrenTemp2, this.temp));
        this.temp = fahrenheitToCelsius(this.fahrenTemp3);
        System.out.println(printFahrenheit(this.fahrenTemp3, this.temp));

    }

    /*
    *   Metodo que se encarga de convertir los grados Fahrenheit en grados Celsius
     */
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

    /*
    *   Estos metodos pintan por pantalla los resultados
    */
    public String printFahrenheit(double fahrenheit, double temp) {
        String str;
        str = fahrenheit + " grados Fahrenheit son " + this.temp + " Grados Celsius";
        return str;
    }

    public String printCelsius(double celsius, double temp) {
        String str;
        str = celsius + " grados Celsius son " + this.temp + " Grados Fahrenheit";
        return str;
    }
}
