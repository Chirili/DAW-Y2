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
public class Ejercicio32 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numbersPlusTwenty();
        System.out.print(str);
    }

    public String numbersPlusTwenty() {
        int i=0, numbers = 20, maxNumbers = 1000, count = 0;
        String choice = "";

        do {

            if (count == 0) {
                System.out.println("Se van a mostrar los numeros del 1 al 20:");

                for (i = 1; i <= 20; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                count++;
            } else if (count >= 1) {
                do {

                    System.out.println("¿Quieres ver los 20 siguientes numeros?");
                    System.out.print("Escribe si o no: ");
                    choice = uts.getString();
                    
                    if (choice.equalsIgnoreCase("si")) {
                        numbers = numbers + 20;
                        
                        for (i = i; i <= numbers; i++) {
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }

                } while (!"no".equalsIgnoreCase(choice));
            }

        } while (!"no".equalsIgnoreCase(choice));

        return "\n";
    }
}
