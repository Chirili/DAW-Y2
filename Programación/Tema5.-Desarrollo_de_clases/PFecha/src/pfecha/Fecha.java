/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfecha;

import Utils.Utils;
import java.time.YearMonth;

/**
 *
 * @author Andres
 */
public class Fecha {

    /**
     * Propiedades de la clase
     */
    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor predeterminado
     */
    Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    /**
     * Constructor parametrizado con el dia, el mes y el año
     *
     * @param dia
     * @param mes
     * @param año
     */
    Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Este metodo se encarga de recoger los datos por teclado
     */
    public void leer() {
        Utils uts = new Utils();
        boolean checker;
        do {
            checker = false;
            System.out.println("Introduce un dia del 1 al 31");
            this.dia = uts.getInt();
            if (this.dia >= 1 && this.dia <= 31) {
                checker = true;
            } else {
                System.out.println("Porfavor introduce correctamente un dia del 1 al 31.");
            }
        } while (checker != true);
        do {
            checker = false;
            System.out.println("Introduce un mes del 1 al 12");
            this.mes = uts.getInt();
            if (this.mes >= 1 && this.mes <= 12) {
                checker = true;
            } else {
                System.out.println("Porfavor introduce correctamente un mes del 1 al 12");
            }
        } while (checker != true);
        do {
            checker = false;
            System.out.println("Introduce un año del 1900 al 2050");
            this.año = uts.getInt();
            if (this.año >= 1900 && this.año <= 2050) {
                checker = true;
            } else {
                System.out.println("Introduce correctamente un año entre el 1900 y el 2050.");
            }
        } while (checker != true);
    }

    /**
     * Metodo que comprueba si el año pasado por parametro es bisiesto
     * @param año
     * @return de true o false en funcion si es bisiesto o no el año
     */
    public boolean bisiesto(int año) {
        if ((año % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 
     * @return 
     */
    public int diasMes(){
       YearMonth ym = YearMonth.of(this.año, this.mes);
       return ym.lengthOfMonth();
    }
}
