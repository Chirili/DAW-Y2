/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Fecha {

    private String dayOfWeek;
    private String nameOfMonth;
    private int year;
    private int day;

    //Contructor por defecto
    public Fecha() {
        this.dayOfWeek = "Lunes";
        this.year = 1900;
        this.nameOfMonth = "Enero";
        this.day = 1;
    }
    // Contructor parametrizado

    public Fecha(String dayOfWeek, String nameOfMonth, int year, int day) {
        this.dayOfWeek = dayOfWeek;
        this.nameOfMonth = nameOfMonth;
        this.year = year;
        this.day = day;
    }
    

    //Constructor copia
    public Fecha(Fecha f) {
        this.dayOfWeek = f.dayOfWeek;
        this.nameOfMonth = f.nameOfMonth;
        this.year = f.year;
        this.day = f.day;
    }

    /**
     * Metodo toString para imprimir por pantalla los atributos de la clase
     * @return 
     */
    @Override
    public String toString() {
        return this.dayOfWeek + " " + this.dayOfWeek + " de " + this.nameOfMonth + " de " + this.year;
    }

    /**
     * Getters y setters de la clase Fecha
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
