/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_opcional;

/**
 *
 * @author Andrés
 */
public class Ejercicio4 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Cuadrado();
        System.out.print(str);
    }

    public String Cuadrado() {
        System.out.println("Averiguar el cuadrado:  ");
        
        int numero = 2, cuad = numero * numero;
        System.out.println("EL CUADRADO DE " + numero + " ES: " + cuad);

        return "";
    }
    /*
    *Fallo 1 = numero no puede llevar tilde ya que es una variable y aunque la lleve es como si fuera una variable nueva y sin declarar
    *Fallo 2= las comillas del system.out.print estan mal escritas
    *Fallo 3 = la variable numero dentro del system.out.print esta en mayuscula y deberia de ir en minuscula
     */
}
