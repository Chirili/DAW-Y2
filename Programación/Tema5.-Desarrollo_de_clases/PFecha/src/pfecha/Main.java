/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfecha;

import java.text.SimpleDateFormat;
import Utils.Utils;
import java.awt.AWTException;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        Utils uts = new Utils();
        int mainMenu;
        Fecha f = new Fecha();
        f.leer();
        do {
            uts.clearScreen();
            System.out.println("Fecha introducida: " + f.toString());
            System.out.println("Bienvenido al menu del programa fecha, elige una de las siguientes opciones: ");
            System.out.println("1.- Cambiar la fecha introducida.");
            System.out.println("2.- Ver en formato corto la fecha.");
            System.out.println("3.- Ver el nombre del dia elegido.");
            System.out.println("4.- Ver en formato largo la fecha introducida.");
            System.out.println("5.- Comprobar si el anio introducido es bisiesto.");
            System.out.println("6.- Ver los dias transcurridos entre el 1/1/1900 y la fecha introducida.");
            System.out.println("7.- Ver los dias del mes introducido");
            System.out.println("8.- Introduce un numero de dias y mira como la fecha avanza desde el 1/1/1900.");
            System.out.println("9.- Ver los dias que hay entre la fecha introducida y una nueva que tu pongas.");
            System.out.println("10.- Avanzar un dia en tu fecha introducida.");
            System.out.println("11.- Retrasar un dia en tu fecha introducida.");
            System.out.println("12.- Comprobar si la fecha que introduzcas ahora es igual que la introducida anteriormente.");
            System.out.println("13.- Comprobar si la fecha que introduzcas ahora es anterior que la introducida anteriormente.");
            System.out.println("14.- Comprobar si la fecha que introduzcas ahora es posterior que la introducida anteriormente.");
            System.out.println("15.- Clonar fecha.");
            System.out.println("0.- Salir.");
            System.out.print("Eleccion: ");
            mainMenu = uts.getInt();

            switch (mainMenu) {
                case 0:
                    break;
                case 1:
                    uts.clearScreen();
                    f.leer();
                    break;
                case 2:
                    uts.clearScreen();
                    System.out.println("Formato corto de la fecha introducida: " + f.corta());
                    break;
                case 3:
                    System.out.println("El nombre del dia de la fecha actual es: "+f.diaSemana());
                    System.out.println("No te asustes en unos segundos te mando al menu principal.");
                    Thread.sleep(4000);
                case 4:
                    System.out.println("Formato largo de la fecha introducida: " + f.larga());
                    break;
                case 5:
                    uts.clearScreen();
                    if (f.bisiesto() == true) {
                        System.out.println("El anio que has introducido es bisiesto.");
                    } else {
                        System.out.println("El anio que has introducido no es bisiesto");
                    }
                case 6:
                    System.out.println("La cantidad de dias transcurridos entre el 1/1/199 y" + " el " + f.toString() + " son de: " + f.diasTranscurridos() + " dias");
                    break;
                case 7:
                    //Esto solo se usa para mostrar el nombre del mes, se quita y funciona perfecto solo que no te muestra el nombre del mes
                    Calendar c = Calendar.getInstance();
                    c.set(f.getAnio(), f.getMes() - 1, f.getDia());
                    Locale lc = new Locale("es", "ES");

                    String mes = c.getDisplayName(Calendar.MONTH, Calendar.LONG, lc);

                    System.out.println("La cantidad de dias del mes de " + mes + " es de: " + f.diasMes());
                    break;
                case 8:
                    int days;
                    String choice;
                    do {
                        System.out.print("Introduce la cantidad de dias que quieres que pasen: ");
                        days = uts.getInt();
                        System.out.println("Al introducir " + days + " dias la fecha ha cambiado: " + new SimpleDateFormat("dd/M/yyyy").format(f.fechaTras(days)));
                        System.out.print("¿Quieres intentarlo de nuevo? Escribe no para salir y cualquier letra para repetir: ");
                        choice = uts.getString();
                    } while (!choice.equalsIgnoreCase("no"));
                    break;
                case 9:
                    String Fecha = f.getUserDate();
                    System.out.println("Los dias transcurridos entre la fecha introducida anteriormente " + f.toString() + " y la de ahorason de: " + f.diasEntre(Fecha) + " dias");
                    break;
                case 10:
                    f.siguiente();
                    break;
                case 11:
                    f.anterior();
                    break;
                case 12:
                    String dateForCompare = f.getUserDate();
                    if (f.igualQue(dateForCompare) == true) {
                        System.out.println("La fecha que acabas de introducir es exactamente igual que la anterior");
                    } else {
                        System.out.println("La fecha que acabas de introducir no es igual que la anterior.");
                    }
                    System.out.println("No te asustes en unos segundos te mando al menu principal.");
                    Thread.sleep(4000);
                    break;
                case 13:
                    String sdateForCompare = f.getUserDate();
                    if (f.menorQue(sdateForCompare) == true) {
                        System.out.println("La fecha que has introducido es anterior a la proporcionada.");
                    } else {
                        System.out.println("La fecha que has introducido no es anterior a la proporcionada.");
                    }
                    System.out.println("No te asustes en unos segundos te mando al menu principal.");
                    Thread.sleep(4000);
                    break;
                case 14:
                    String tdateForCompare = f.getUserDate();
                    if (f.mayorQue(tdateForCompare) == true) {
                        System.out.println("La fecha que has introducido es posterior a la proporcionada.");
                    } else {
                        System.out.println("La fecha que has introducido no es posterior a la proporcionada.");
                    }
                    System.out.println("No te asustes en unos segundos te mando al menu principal.");
                    Thread.sleep(4000);
                    break;
                case 15:
                        System.out.println("Fecha clonada con exito");
                        Fecha f1 = (Fecha) f.clone();
                    break;
            }
        } while (mainMenu != 0);
    }
}
