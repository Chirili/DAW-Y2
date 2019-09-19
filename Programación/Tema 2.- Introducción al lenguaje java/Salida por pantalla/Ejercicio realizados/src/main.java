import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        System.out.println("Ejercicio1:");
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.nombre();
        System.out.println("");


        System.out.println("Ejercicio2:");
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.Direccion();
        System.out.println("");

        System.out.println("Ejercicio3:");
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.palabrasIngles();
        System.out.println("");

        System.out.println("Ejercicio4:");
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.horario();
        System.out.println("");

        System.out.println("Ejercicio5:");
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.horarioColores();
        System.out.println("");

        System.out.println("Ejercicio6:");
        Ejercicio6 ej6 = new Ejercicio6();
        ej6.Piramide();
        System.out.println("");

        System.out.println("Ejercicio7:");
        Ejercicio7 ej7 = new Ejercicio7();
        ej7.piramideHueca();
    }
}
