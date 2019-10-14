package prelacion1_bucles;

import java.awt.AWTException;
import java.util.ArrayList;

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
        Ejercicio9 ej9 = new Ejercicio9();
        Ejercicio10 ej10 = new Ejercicio10();
        Ejercicio11 ej11 = new Ejercicio11();
        Ejercicio12 ej12 = new Ejercicio12();
        Ejercicio13 ej13 = new Ejercicio13();
        Ejercicio14 ej14 = new Ejercicio14();
        Ejercicio15 ej15 = new Ejercicio15();
        Ejercicio16 ej16 = new Ejercicio16();
        Ejercicio17 ej17 = new Ejercicio17();
        Ejercicio18 ej18 = new Ejercicio18();
        Ejercicio19 ej19 = new Ejercicio19();
        Ejercicio20 ej20 = new Ejercicio20();
        Ejercicio21 ej21 = new Ejercicio21();
        Ejercicio22 ej22 = new Ejercicio22();
        Ejercicio23 ej23 = new Ejercicio23();
        Ejercicio24 ej24 = new Ejercicio24();
        Ejercicio25 ej25 = new Ejercicio25();
        Ejercicio26 ej26 = new Ejercicio26();
        Ejercicio27 ej27 = new Ejercicio27();
        Ejercicio28 ej28 = new Ejercicio28();
        Ejercicio29 ej29 = new Ejercicio29();
        Ejercicio30 ej30 = new Ejercicio30();
        

        ejercicios.put(1, ej1);
        ejercicios.put(2, ej2);
        ejercicios.put(3, ej3);
        ejercicios.put(4, ej4);
        ejercicios.put(5, ej5);
        ejercicios.put(6, ej6);
        ejercicios.put(7, ej7);
        ejercicios.put(8, ej8);
        ejercicios.put(9, ej9);
        ejercicios.put(10, ej10);
        ejercicios.put(11, ej11);
        ejercicios.put(12, ej12);
        ejercicios.put(13, ej13);
        ejercicios.put(14, ej14);
        ejercicios.put(15, ej15);
        ejercicios.put(16, ej16);
        ejercicios.put(17, ej17);
        ejercicios.put(18, ej18);
        ejercicios.put(19, ej19);
        ejercicios.put(20, ej20);
        ejercicios.put(21, ej21);
        ejercicios.put(22, ej22);
        ejercicios.put(23, ej23);
        ejercicios.put(24, ej24);
        ejercicios.put(26, ej26);
        ejercicios.put(25, ej25);
        ejercicios.put(27, ej27);
        ejercicios.put(28, ej28);
        ejercicios.put(29, ej29);
        ejercicios.put(30, ej30);
        
        

        do {

            System.out.print("Elige el numero de ejercicio entre el 1 y el 30 para mostrar o pulsa 0 para salir: ");
            choice = uts.getInt();
            uts.clearScreen();

            if (choice != 0 && choice < 31) {

                ejercicios.get(choice).toExecute();
                String choice2;
                String eb = "0";

                do {

                    System.out.print("Pulsa S para ver el siguiente ejercicio, R para repetir el ejercicios y  A para ver el ejercicio anterior o 0 para volver a la elección de ejercicios: ");
                    choice2 = uts.getString();
                    uts.clearScreen();
                    if (choice2.equalsIgnoreCase("s") && choice < 30) {

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
