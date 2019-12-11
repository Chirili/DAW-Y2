package pzapato;

import Utils.Utils;
import java.awt.AWTException;

/**
 *
 * @author Andres Carmona Lozano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        String modelo;
        int talla = 0;
        Utils uts = new Utils();
        Zapato zapa1 = new Zapato();
        String checkData;
        do {
            do {
                System.out.println("Programa de compra de zapatos, a continuacion se mostrarán los distintos modelos de zapatos:");
                System.out.println("a.- Modelo Ejecutivo");
                System.out.println("b.- Modelo Premier");
                System.out.println("c.- Modelo Emperador");
                System.out.print("Eleccion: ");
                modelo = uts.getString();

            } while (!modelo.equalsIgnoreCase("a") && !modelo.equalsIgnoreCase("b") && !modelo.equalsIgnoreCase("c"));

            do {
                System.out.println("Ahora vamos a elegir la talla, elige una de las siguientes:");
                System.out.println("1.- Talla 39");
                System.out.println("2.- Talla 40");
                System.out.println("3.- Talla 41");
                System.out.print("Eleccion: ");
                talla = uts.getInt();
            } while (talla < 1 || talla > 3);
            zapa1.calcularPrecio(modelo, talla);
            uts.clearScreen();
            System.out.println("Modelo de zapato elegido: " + zapa1.getModelo());
            System.out.println("Talla de zapato elegida: " + zapa1.getTalla());
            do {
                System.out.print("¿Es correcta esta informacion? Escribe si o no: ");
                checkData = uts.getString();
            } while (!checkData.equalsIgnoreCase("si") && !checkData.equalsIgnoreCase("no"));
        } while (checkData.equalsIgnoreCase("no"));

        System.out.println(zapa1.toString());
    }

}
