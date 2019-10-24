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
public class Ejercicio38 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = factorialNumbers();
        System.out.print(str);
    }

    public String factorialNumbers() {

            for (int i = 1; i<=10;i++){
               int  f = 1;
                for(int j = 2; j <= i;j++){
                    f *= j;
                }
                System.out.println("El factorial del numero "+i+" es: "+f);
            }
            return "\n";
        }
    }
