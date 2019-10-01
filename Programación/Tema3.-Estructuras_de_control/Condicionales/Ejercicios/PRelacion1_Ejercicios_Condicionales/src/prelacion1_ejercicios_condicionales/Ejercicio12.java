/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

import java.awt.AWTException;

/**
 *
 * @author usuario
 */
public class Ejercicio12 {
    Utils uts = new Utils();
    public String Questionary() throws AWTException{
        
        int points = 0;
        String choice;
        
        System.out.println("Minicuestionario de programacion");
        System.out.println("1. Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente.");
        System.out.println("a) System.out.prinln\t"+"b)System.out.println"+"c)Ninguna es correcta");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        if(choice.equalsIgnoreCase("b")){
            points ++;
        }
        
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        System.out.println("a) int;\t"+"b) int = 2;\t" + "c) a y b son correctas" );
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        if (choice.equalsIgnoreCase("c")){
            points ++;
        }
        
        System.out.println("3. ¿Con que se puede hacer un bucle en java?");
        System.out.println("a)if\t"+"b)for\t"+"c)System.out");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("4. ¿Con que se puede hacer una condicion?");
        System.out.println("a)switch\t"+"b)if\t"+"c)Todas son correctas");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("5. ¿Como se inicializa una variable?");
        System.out.println("a)boolean;\t"+"b)int = 30;\t"+"c)if");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("6. ¿Como se declara un metodo?");
        System.out.println("a) public void\t"+"b)switch int\t"+"c)public void nombredelMetodo(){}");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("7. ¿Como se instancia una clase?");
        System.out.println("a)nombreclase nombrePersonalizado = new nombreclase();\t"+"b)public void\t"+"c)string");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("8. ¿Como se muestra el valor de una variable por pantalla?");
        System.out.println("a)System.out.println('hola');\t"+"b)System.out.println(nombrevariable);\t"+"c)System.out(nombrevariable);");
        System.out.print(">");
        
        choice = uts.getString();
        uts.clearScreen();
        
        System.out.println("9. ¿?");
        return "";
    }
}
