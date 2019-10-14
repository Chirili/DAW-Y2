/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio30 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {

    }

    public String passedHours() {

        int fDay = 0,
                sDay = 0,
                fHour,
                sHour;
        String fDayString,
                sDayString="",
                nameFDay= "",
                nameSDay="";
        
        boolean checkData = true;


        do {
            System.out.println("\nPor favor, introduzca la primera hora.");
            System.out.print("Día: ");
            fDayString = uts.getString();
            System.out.print("Hora: ");
            fHour = uts.getInt();

            switch (fDayString) {
                case "Lunes":
                case "1":
                    fDay = 1;
                    fDayString = "Lunes";
                    break;
                case "Martes":
                case "2":
                    fDay = 2;
                    fDayString = "Martes";
                    break;
                case "Miercoles":
                case "3":
                    fDay = 3;
                    fDayString = "Miercoles";
                    break;
                case "Jueves":
                case "4":
                    fDay = 4;
                    fDayString = "Jueves";
                    break;
                case "Viernes":
                case "5":
                    fDay = 5;
                    fDayString = "Viernes";
                    break;
                case "Sabado":
                case "6":
                    fDay = 6;
                    fDayString = "Sabado";
                    break;
                case "Domingo":
                case "7":
                    fDay = 7;
                    fDayString = "Domingo";
                    break;
                default:
                    fDay = 0;
            }

            System.out.println("Por favor, introduzca la segunda hora.");
            System.out.print("Día: ");
            fDayString = uts.getString();
            System.out.print("Hora: ");
            sHour = uts.getInt();

            switch (sDayString) {
                case "Lunes":
                case "1":
                    sDay = 1;
                    sDayString = "Lunes";
                    break;
                case "Martes":
                case "2":
                    sDay = 2;
                    sDayString = "Martes";
                    break;
                case "Miercoles":
                case "3":
                    sDay = 3;
                    sDayString = "Miercoles";
                    break;
                case "Jueves":
                case "4":
                    sDay = 4;
                    sDayString = "Jueves";
                    break;
                case "Viernes":
                case "5":
                    sDay = 5;
                    sDayString = "Viernes";
                    break;
                case "Sabado":
                case "6":
                    sDay = 6;
                    sDayString = "Sabado";
                    break;
                case "Domingo":
                case "7":
                    sDay = 7;
                    sDayString = "Domingo";
                    break;
                default:
                    sDay = 0;
            }

            checkData = true;

            if (sDay <= fDay) {
                System.out.println("El segundo día debe ser posterior al primero.");
                checkData = false;
            }

            if ((fDay == 0) || (sDay == 0)) {
                System.out.println("No se ha introducido correctamente el dia de la semana.");
                System.out.println("Los dias validos son: lunes, martes, miercoles, jueves y viernes.");
                checkData = false;
            }

            if ((fHour < 0) || (fHour > 23) || (sHour < 0) || (sHour > 23)) {
                System.out.println("No se ha introducido correctamente la hora del dia.");
                System.out.println("Las horas validas están entre 0 y 23.");
                checkData = false;
            }

        } while (!checkData);

        System.out.print("Entre las " + fHour + ":00h del " + fDayString);
        System.out.print(" y las " + sHour + ":00h del " + sDay);
        System.out.println(" hay " + (((sDay * 24) + sHour) - ((fDay * 24) + fHour)) + " horas.");

        return "\n";
    }
}
