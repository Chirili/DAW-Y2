/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author usuario
 */
public class Date {

    private String dayOfWeek;
    private String nameOfMonth;
    private int year;
    private int day;

    //Contructor por defecto
    public Date() {
        this.dayOfWeek = "Lunes";
        this.year = 1900;
        this.nameOfMonth = "Enero";
        this.day = 1;
    }
    // Contructor parametrizado

    public Date(String dayOfWeek, String nameOfMonth, int year, int day) {
        this.dayOfWeek = dayOfWeek;
        this.nameOfMonth = nameOfMonth;
        this.year = year;
        this.day = day;
    }

    //Constructor copia
    public Date(Date f) {
        this.dayOfWeek = f.dayOfWeek;
        this.nameOfMonth = f.nameOfMonth;
        this.year = f.year;
        this.day = f.day;
    }

    public void getDateData() {
        Utils uts = new Utils();

        Calendar fecha = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("EEEEEEEEE dd 'de'   MMMMM 'de' yyyy");
        int id;
        int month;

        System.out.println("Informacion sobre la fecha de edicion del libro: ");

        System.out.print("Año de edicion: ");
        id = uts.getInt();
        setYear(id);

        do {

            System.out.print("Numero del mes: ");
            id = uts.getInt();

        } while (id > 12 || id < 0);

        month = id;
        Month mes = LocalDate.of(this.year, month, 1).getMonth();
        this.nameOfMonth = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        //Cogemos la cantidad de dias del año y el mes elegido por el usuario para despues condicionar la eleccion del dia
        int monthDays = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);

        do {
            System.out.print("Dia del mes: ");
            id = uts.getInt();

        } while (id > monthDays || id < 1);
        setDay(id);

        //Estas dos lineas de codigo devuelven un String con el nombre del dia de la semana, pero lo devuelve en ingles asi que hay que traducirlo a español
        LocalDate dateOfWeek = LocalDate.of(this.year, month, this.day);
        DayOfWeek dayOfWeekName = DayOfWeek.from(dateOfWeek);

        //Para traducir a español creamos el locale para despues pasarlo como parametro al metodo de DayOfWeek
        Locale spanishLocale = new Locale("es", "ES");
        this.dayOfWeek = dayOfWeekName.getDisplayName(TextStyle.FULL, spanishLocale);

    }

    /**
     * Metodo toString para imprimir por pantalla los atributos de la clase
     *
     * @return
     */
    @Override
    public String toString() {
        return this.dayOfWeek + " " + this.day + " de " + this.nameOfMonth + " del " + this.year;
    }

    /**
     * Getters y setters de la clase Fecha
     *
     * @return
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public void setNameOfMonth(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
