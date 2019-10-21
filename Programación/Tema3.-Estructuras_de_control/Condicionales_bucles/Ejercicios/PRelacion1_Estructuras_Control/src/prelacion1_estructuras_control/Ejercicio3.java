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
public class Ejercicio3 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = daysOfWeek();
        System.out.print(str);
    }

    public String daysOfWeek() {

        int nchoice;

        System.out.print("Elige un numero del 1 al 7: ");
        nchoice = uts.getInt();

        if (nchoice >= 1 && nchoice <= 7) {

            switch (nchoice) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
            }

        } else {
            System.out.println("Numero introducido no valido.");
        }

        return "\n";
    }

}
