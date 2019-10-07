package prelacion1_bucles;

import java.awt.AWTException;
import java.util.HashMap;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Andrés
 */
public class Main extends Application {

    Utils uts = new Utils();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage PrimaryStage) throws AWTException {

        int choice;

        HashMap<Integer, Iejercicios> ejercicios = new HashMap<>();

        Ejercicio1 ej1 = new Ejercicio1();
        Ejercicio2 ej2 = new Ejercicio2();
        Ejercicio3 ej3 = new Ejercicio3();
        Ejercicio4 ej4 = new Ejercicio4();
        Ejercicio5 ej5 = new Ejercicio5();
        Ejercicio6 ej6 = new Ejercicio6();
        Ejercicio7 ej7 = new Ejercicio7();
        Ejercicio8 ej8 = new Ejercicio8();
        // Ejercicio9 ej9 = new Ejercicio9();
        // Ejercicio10 ej10 = new Ejercicio10();
        // Ejercicio11 ej11 = new Ejercicio11();
        //  Ejercicio12 ej12 = new Ejercicio12();

        ejercicios.put(1, ej1);
        ejercicios.put(2, ej2);
        ejercicios.put(3, ej3);
        ejercicios.put(4, ej4);
        ejercicios.put(5, ej5);
        ejercicios.put(6, ej6);
        ejercicios.put(7, ej7);
        ejercicios.put(8, ej8);
        //   ejercicios.put(9, ej9);
        //   ejercicios.put(10, ej10);
        // ejercicios.put(11, ej11);
        // ejercicios.put(12, ej12);
        do {

            System.out.print("Elige el numero de ejercicio entre el 1 y el 12 para mostrar o pulsa 0 para salir: ");
            choice = uts.getInt();
            uts.clearScreen();

            if (choice != 0 && choice < 13) {

                ejercicios.get(choice).toExecute();
                String choice2;
                String eb = "0";

                do {

                    System.out.print("Pulsa S para ver el siguiente ejercicio, R para repetir el ejercicios y  A para ver el ejercicio anterior o 0 para volver a la elección de ejercicios: ");
                    choice2 = uts.getString();
                    uts.clearScreen();
                    if (choice2.equalsIgnoreCase("s") && choice < 12) {

                        choice++;
                        ejercicios.get(choice).toExecute();

                    } else if (choice2.equalsIgnoreCase("a") && choice > 1) {

                        choice--;
                        ejercicios.get(choice).toExecute();

                    } else if (choice2.equalsIgnoreCase("r") && choice > 1) {
                        ejercicios.get(choice).toExecute();
                    } else if (choice2 != "0") {
                        System.out.println("Eleccion incorrecta intentalo de nuevo.");
                    }
                } while (!choice2.equals(eb));

            }
        } while (choice != 0);

        System.exit(0);
    }

}
