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
public class Ejercicio7 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = averageNotes();
        System.out.print(str);
    }

    public String averageNotes() {

        double note1, note2, note3, avg;
        
        System.out.println("Calcular la media de 3 notas:  ");
        System.out.print("Introduce la nota 1:  ");
        note1 = uts.getDouble();

        System.out.print("Introduce la nota 2: ");
        note2 = uts.getDouble();

        System.out.print("Introduce la nota 3: ");
        note3 = uts.getDouble();

        avg = (note1 + note2 + note3) / 3;
        
        System.out.print("La media de las 3 notas introducidas es la siguiente: "+avg);

        return "\n";
    }
}
