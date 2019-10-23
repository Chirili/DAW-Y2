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
public class Ejercicio18 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = calcSalary();
        System.out.print(str);
    }

    public String calcSalary() {

        double fsalary, ssalary, hoursPrice;
        int hours;

        System.out.println("Introduce la cantidad de horas trabajadas y el precio por hora para calcular el salario bruto y neto: ");
        System.out.print("Cantidad de horas trabajadas: ");
        hours = uts.getInt();
        System.out.print("Precio por hora: ");
        hoursPrice = uts.getDouble();

        if (hours > 0 && hoursPrice > 0) {
            fsalary = hours * hoursPrice;
            ssalary = fsalary * 0.80;
            System.out.println("El salario bruto con los datos recibidos es igual a: " + fsalary);
            System.out.println("El salario neto con los datos recibidos es igual a: " + ssalary);
        } else {
            System.out.println("Introduce al menos alguna hora y precio por hora.");
        }

        return "\n";
    }

}
