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
public class Ejercicio3 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = weekDayNames();
        System.out.print(str);
    }

    public String weekDayNames() {

        int choice;

        System.out.print("Elige un dia de la semana entre el 1 y el 7: ");
        choice = uts.getInt();

        switch (choice) {
            case 1:
                System.out.print("Lunes ");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.println("Numero introducido incorrecto ");
        }
        return "\n";
    }
}
