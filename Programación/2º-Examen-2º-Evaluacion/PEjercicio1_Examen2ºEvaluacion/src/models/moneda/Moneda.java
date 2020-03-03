/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.moneda;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Moneda {

    private String nombreM;
    private double valor;

    //Constructor por defecto
    public Moneda() {
        this.nombreM = "Euro";
        this.valor = 1;
    }

    //Constructor copia
    public Moneda(Moneda M) {
        this.nombreM = M.getNombreM();
        this.valor = M.getValor();
    }

    //Metodo para capturar el nombre y el valor de la moneda
    public void capturarNombreMoneda() {
        Utils uts = new Utils();
        do {
            System.out.println("Elige el nombre de la moneda: ");
            System.out.println("1. Euro.");
            System.out.println("2. Corona.");
            System.out.println("3. Libra.");
            System.out.print("Eleccion: ");
            establecerValor(uts.getInt());
        } while (this.valor == 0);

    }

    //Metodo para asignar el valor y el nombre de la moneda
    private void establecerValor(int numValor) {
        switch (numValor) {
            case 1:
                this.setNombreM("Euro");
                this.setValor(1);
                break;
            case 2:
                this.setNombreM("Corona");
                this.setValor(7.46);
                break;
            case 3:
                this.setNombreM("Libra");
                this.setValor(0.78);
                break;
        }
    }

    @Override
    public String toString() {
        return "Datos de la moneda: \n"
                + "Nombre de la moneda: " + this.getNombreM()
                + "\nValor de la moneda: " + this.getValor();
    }

    /**
     * Getters y setters de Moneda
     *
     * @return
     */
    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
