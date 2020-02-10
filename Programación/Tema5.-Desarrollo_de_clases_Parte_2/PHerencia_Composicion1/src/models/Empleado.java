/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

import java.time.LocalTime;

/**
 *
 * @author Andres
 */
public class Empleado {

    LocalTime horaEntrada;
    LocalTime horaSalida;

    public Empleado() {
        this.horaEntrada = LocalTime.of(0, 0, 0);
        this.horaSalida = LocalTime.of(0, 0, 0);
    }

    public LocalTime getHora() {
        int hora = 0, segundo = 0, minuto = 0;
        boolean valida = false;
        Utils uts = new Utils();

        do {
            System.out.print("Dime la hora: ");
            hora = uts.getInt();
            System.out.print("Dime los minutos: ");
            minuto = uts.getInt();
            System.out.print("Dime los segundos: ");
            hora = uts.getInt();

            valida = (hora < 24 && hora >= 0) ? true
                    : (minuto < 60 && minuto >= 0) ? true
                            : (segundo < 60 && segundo <= 0) ? true : false;
        } while (valida != true);
        return LocalTime.of(hora, minuto,segundo);
    }

    public void capturarEmpleado(){
        System.out.println("Datos de la hora de entrada: ");
        setHoraEntrada(getHora());
        
        System.out.println("Datos de la hora de salida: ");
        setHoraEntrada(getHora());
    }
    /**
     * Getters y setters de empleado.
     * @return 
     */
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}
