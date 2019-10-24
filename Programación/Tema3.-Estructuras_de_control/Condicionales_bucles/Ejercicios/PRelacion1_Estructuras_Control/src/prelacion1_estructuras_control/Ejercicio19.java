/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author Andres
 */
public class Ejercicio19 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
            String str = calcTriangle();
            System.out.print(str);
    }

    public String calcTriangle() {
        
        double leg1,leg2,area,hypotenuse,perimeter;
        
        System.out.println("Introduce el valor de los dos catetos para calcular el area, el perimetro y la hipotenusa de un triangulo: ");
        System.out.print ("Valor del cateto 1: ");
        leg1 = uts.getDouble();
        
        System.out.print("Valor del cateto 2: ");
        leg2 = uts.getDouble();
        
        area = (leg1*leg2)/2;
        hypotenuse = Math.sqrt(Math.pow(leg1, 2)+Math.pow(leg2, 2));
        perimeter = hypotenuse + leg1 + leg2;
        
        System.out.println("El area del triangulo introducido es igual a: "+area);
        System.out.println("La hipotenusa del triangulo introducido es igual a: "+hypotenuse);
        System.out.println("El perimetro del triangulo introducido es igual a: "+perimeter);
        
        return "\n";
    }

}
