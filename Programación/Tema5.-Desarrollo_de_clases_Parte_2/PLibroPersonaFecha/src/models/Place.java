/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public class Place {

    private String countryName;
    private String cityName;

    //Constructor por defecto
    public Place() {
        this.countryName = "";
        this.cityName = "";
    }

    //Constructor parametrizado

    public Place(String countryName, String cityName) {
        this.countryName = countryName;
        this.cityName = cityName;
    }


    //Constructor copia
    public Place(Place p) {
        this.countryName = p.countryName;
        this.cityName = p.cityName;
    }

    /**
     * Metodo toString para imprimir por pantalla los atributos de la clase
     *
     * @return
     */
    @Override
    public String toString() {
        return this.cityName + this.countryName;
    }

    /**
     * Getters y setters de la clase Place
     *
     * @return
     */
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
