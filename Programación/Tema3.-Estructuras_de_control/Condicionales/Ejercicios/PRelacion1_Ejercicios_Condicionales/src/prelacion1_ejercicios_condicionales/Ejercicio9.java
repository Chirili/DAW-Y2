/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

/**
 *
 * @author Andrés
 */
public class Ejercicio9 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = Equations2();
        System.out.print(str);
    }
    
    public String Equations2() {
        double a, b, c;
        double x1, x2, number;
        
        System.out.print("Escribe el valor de a: ");
        a = uts.getDouble();
        
        System.out.print("Escribe el valor de b: ");
        b = uts.getDouble();
        
        System.out.print("Escribe el valor de c: ");
        c = uts.getDouble();
        
        number = (b * b) - (4 * a * c);
        
        if (number > 0) {
            x1 = (-b + Math.sqrt(number)) / 2 * a;
            x2 = (-b - Math.sqrt(number)) / 2 * a;
            
            System.out.println("Los valores introducidos hacen que la ecuacion tenga dos resultado:  ");
            System.out.print("Primer resultado: " + x1);
            System.out.print("Primer resultado: " + x2);
            
        } else if (number == 0) {
            x1 = (-b) / 2 * a;
            System.out.println("La ecuacion solo tiene una solución:  ");
            System.out.print("Resultado: " + x1);
        } else {
            System.out.println("La ecuacion no tiene solución. ");
        }
        return "\n";
    }
}
