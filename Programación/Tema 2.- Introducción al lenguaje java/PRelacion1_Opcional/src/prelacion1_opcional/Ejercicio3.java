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
public class Ejercicio3 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = suma();
        System.out.print(str);
    }

    public String suma() {

        int n1 = 50, n2 = 30;
        int suma = 0;

        suma = n1 + n2;

        System.out.println("LA SUMA ES:" + suma);

        return "\n";
    }
    //Se han arreglado las dobles comillas que estan mal escritas y la declaracion de suma que era de tipo booleana y debe de ser int
}
