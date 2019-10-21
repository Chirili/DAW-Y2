/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio11 implements Iejercicios {

    public void toExecute() {
        String str = randomNotesResult();
        System.out.print(str);
    }

    public String randomNotesResult() {

        int csus = 0,
                csuf = 0,
                cbie = 0,
                cnot = 0,
                csob = 0,
                rnumber;

        for (int i = 1; i <= 20; i++) {

            rnumber = (int) (Math.random() * 5) + 1;

            switch (rnumber) {
                case 1:
                    System.out.println("La nota generada es suspenso.");
                    csus++;
                    break;
                case 2:
                    System.out.println("La nota generada es suficiente.");
                    csuf++;
                    break;
                case 3:
                    System.out.println("La nota generada es bien.");
                    cbie++;
                    break;
                case 4:
                    System.out.println("La nota generada es notable.");
                    cnot++;
                    break;
                case 5:
                    System.out.println("La nota generada es sobresaliente");
                    csob++;
                    break;
                default:
            }

        }

        System.out.println("Cantidad de notas generadas con suspenso: " + csus);
        System.out.println("Cantidad de notas generadas con suficiente: " + csuf);
        System.out.println("Cantidad de notas generadas con bien: " + cbie);
        System.out.println("Cantidad de notas generadas con notable: " + cnot);
        System.out.println("Cantidad de notas generadas con sobresaliente: " + csob);

        return "\n";
    }
}
