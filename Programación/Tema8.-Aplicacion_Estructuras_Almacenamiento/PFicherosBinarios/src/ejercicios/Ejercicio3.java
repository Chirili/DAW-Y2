/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import Utils.Utils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class Ejercicio3 {

    public void ejecutar() {
        final String RUTA = System.getProperty("user.dir") + "\\" + "vehiculos.ddr";
        String matricula, marca, modelo;
        double deposito;

        System.out.println("Introduce la matricula del vehiculo: ");
        matricula = Utils.getString();
        System.out.println("Introduce la marca del vehiculo: ");
        marca = Utils.getString();
        System.out.println("Introduce el modelo del vehiculo: ");
        modelo = Utils.getString();
        System.out.println("Introduce la cantidad del desposito del vehiculo: ");
        deposito = Utils.getInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(RUTA, true));
                DataInputStream dis = new DataInputStream(new FileInputStream(RUTA))) {

            introduceDatos(dos, matricula, marca, deposito, modelo);

            muestraDatos(dis);
        } catch (IOException e) {

        }

    }

    private void introduceDatos(DataOutputStream dos, String matricula, String marca, double tamañoDeposito, String modelo) throws IOException {
        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeDouble(tamañoDeposito);
        dos.writeUTF(modelo);
    }

    private void muestraDatos(DataInputStream dis) throws IOException {

        //Cuando se acabe el fichero saltara la excepcion
        while (true) {
            System.out.println("El vehiculo tiene una matricula" + dis.readUTF() + ", su marca es: " + dis.readUTF() + ", el tamaño del desposito es de " + dis.readDouble() + " y su modelo " + dis.readUTF());
        }
    }
}
