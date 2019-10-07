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
public class Ejercicio2 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = sum();
        System.out.print(str);
    }
    static int n1 = 50;

    public String sum() {

        int n2 = 30, suma = 0;

        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);

        return "\n";
    }
    //Para arreglar este codigo se ha borrado el codigo innecesario y no funcional como la variable n3 que no estaba inicializada.
}
