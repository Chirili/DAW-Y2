/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

import java.util.Scanner;

/**
 * Añada a la clase coche los siguientesmétodos: 
 * int getVelocidad(). Este método
 * devuelve la velocidad actual 
 * void acelera(int mas). Este método actualiza la
 * velocidad a mas kilómetros más 
 * void frena(int menos). Este método actualiza
 * la velocidad a menos kilómetros menos
 *
 * @author Andres
 */
public class Coche {

    private int velocidad;//Variable que recoge la velocidad del coche

    // Constructor de la clase Coche
    Coche() {
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    /*
    * Metodo que actualiza la velocidad a mas. Para actualizar la velocidad hay que pasarle por parametro
    * cuanto se quiere aumentar la velocidad.
     */
    public void acelera(int mas) {
        this.velocidad += mas;
    }

    /*
    * Metodo que actualiza la velocidad a menos. Para actualizar la velocidad hay que pasarle por parametro
    * cuanto se quiere disminuir la velocidad.
     */
    public void frenar(int menos) {
        this.velocidad -= menos;
    }
}
