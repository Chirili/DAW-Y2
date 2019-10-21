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
public class Ejercicio10 implements Iejercicios {

    public void toExecute() {
        String str = specialCharacters();
        System.out.print(str);
    }

    public String specialCharacters() {
        int length, rnumber;
        String fill = "";

        for (int i = 1; i <= 10; i++) {

            length = (int) (Math.random() * 40 + 1);
            rnumber = (int) (Math.random() * 6 + 1);

            switch (rnumber) {
                case 1:
                    fill = "*";
                    break;
                case 2:
                    fill = "-";
                    break;
                case 3:
                    fill = "=";
                    break;
                case 4:
                    fill = ".";
                    break;
                case 5:
                    fill = "|";
                    break;
                case 6:
                    fill = "@";
                    break;
                default:
            }

            for (int j = 1; j <= length; j++) {
                System.out.print(fill);
            }
            System.out.print("\n");
        }

        return "\n";
    }
}
