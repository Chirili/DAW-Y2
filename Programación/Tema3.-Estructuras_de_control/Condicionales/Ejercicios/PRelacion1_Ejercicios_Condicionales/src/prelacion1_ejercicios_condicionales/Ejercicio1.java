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
public class Ejercicio1 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = weekDay();
        System.out.print(str);
    }

    public String weekDay() {

        String choice;

        System.out.print("Escribe un dia de la semana: ");
        choice = uts.getString();
        switch (choice.toLowerCase()) {
            case "lunes":
                System.out.println("Programacion ");
                break;
            case "martes":
                System.out.println("Daw");
                break;
            case "miercoles":
                System.out.println("Sistemas");
                break;
            case "jueves":
                System.out.println("Lenguaje de marcas ");
                break;
            case "viernes":
                System.out.println("BADAT ");
                break;
            case "sabado":

            case "domingo":
                System.out.println("Sin clases ");
            default:
                System.out.println("Dia no valido ");
                return "\n";
        }
        return "\n";
    }
}
