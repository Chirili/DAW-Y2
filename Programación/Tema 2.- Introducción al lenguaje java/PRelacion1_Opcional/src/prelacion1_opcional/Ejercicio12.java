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
public class Ejercicio12 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = time();
        System.out.print(str);
    }

    public String time() {

        int t, secs, mins, hours;

        System.out.print("Elige la cantidad de segundos a convertir en horas,minutos,segundos: ");
        t = uts.getInt();

        secs = t;
        mins = secs / 60;
        hours = mins / 60;

        System.out.println("La cantidad de segundos en horas son:  " + hours);
        System.out.println("La cantidad de segundos en minutos son:  " + mins);
        System.out.println("La cantidad de segundos en segundos son:  " + secs);

        return "\n";
    }

}
