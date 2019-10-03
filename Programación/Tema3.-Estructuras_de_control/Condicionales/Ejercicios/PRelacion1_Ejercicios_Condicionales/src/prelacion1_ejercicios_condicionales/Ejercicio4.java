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
public class Ejercicio4 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = weeklySalary();
        System.out.print(str);
    }

    public String weeklySalary() {

        int choice, fsalary, ssalary, result;

        System.out.print("Escribe el numero de horas semanales: ");
        choice = uts.getInt();

        if (choice <= 40) {
            fsalary = choice;
            result = fsalary * 12;
            System.out.println("El salario total semanal es igual a :  " + result);
        } else if (choice > 40) {

            fsalary = 40;
            ssalary = choice % - 40;
            result = (fsalary * 12) + (ssalary * 16);
            System.out.print("El salario total semanas es igual a: " + result);
        }

        return "\n";
    }
}
