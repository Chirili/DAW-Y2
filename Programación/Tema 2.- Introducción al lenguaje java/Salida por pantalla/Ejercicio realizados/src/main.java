import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Ejercicio1:");
        Ejercicio1.nombre();
        System.out.println("");
        
        System.out.println("Ejercicio2:");
        Ejercicio2.Direccion();
        System.out.println("");

        System.out.println("Ejercicio3:");
        Ejercicio3.palabrasIngles();
        System.out.println("");

        System.out.println("Ejercicio4:");
        Ejercicio4.horario();
        System.out.println("");

        System.out.println("Ejercicio5:");
        Ejercicio5.horarioColores();
        System.out.println("");

        System.out.println("Ejercicio6:");
        Ejercicio6.Piramide();
        System.out.println("");

        System.out.println("Ejercicio7:");
        Ejercicio7.piramideHueca();
    }
}
