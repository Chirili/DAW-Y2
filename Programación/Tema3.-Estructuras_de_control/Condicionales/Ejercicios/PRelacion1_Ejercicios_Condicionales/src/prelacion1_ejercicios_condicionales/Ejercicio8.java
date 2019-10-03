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
public class Ejercicio8 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = averageNotes2();
        System.out.print(str);
    }

    public String averageNotes2() {

        double note1, note2, note3, avg;

        System.out.print("Introduce la nota 1:  ");
        note1 = uts.getDouble();

        System.out.print("Introduce la nota 2: ");
        note2 = uts.getDouble();

        System.out.print("Introduce la nota 3: ");
        note3 = uts.getDouble();

        avg = (note1 + note2 + note3) / 3;

        if (avg < 5) {
            System.out.println("La media es: " + avg + " Suspenso ");
        } else if (avg >= 5 && avg <= 6) {
            System.out.println("La media es: " + avg + " Suficiente ");
        } else if (avg >= 6 && avg <= 7) {
            System.out.println("La media es: " + avg + " Bien ");
        } else if (avg >= 7 && avg <= 8) {
            System.out.println("La media es: " + avg + " Notable ");
        } else if (avg >= 9 && avg <= 10) {
            System.out.println("La media es: " + avg + " Sobresaliente ");
        }

        return "\n";
    }
}
