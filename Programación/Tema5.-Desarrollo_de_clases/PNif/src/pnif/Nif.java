/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnif;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Nif {

    /**
     * Propiedades de la clase
     */
    private static int dni;
    private static String letter;

    /**
     * Constructor por defecto de Nif
     */
    Nif() {
        this.dni = 0;
        this.letter = " ";
    }

    /**
     * Constructor con un parametro de Nif
     *
     * @param dni
     */
    Nif(int dni) {
        this.dni = dni;
        calcNifLetter(dni);
    }

    /**
     * Setter de dni
     *
     * @param dni
     */
    public static void setDni(int dni) {
        Nif.dni = dni;
    }

    /**
     * Getter del dni
     *
     * @return
     */
    public int getDni() {
        return this.dni;
    }

    /**
     * Metodo para calcular la letra del DNI, recibe por parametro los digitos
     * del dni y realiza los calculos correspondientes
     *
     * @param nif
     */
    private static void calcNifLetter(int nif) {
        int calcNif = nif % 23;
        switch (calcNif) {
            case 0:
                letter = "T";
                break;
            case 1:
                letter = "R";
                break;
            case 2:
                letter = "W";
                break;
            case 3:
                letter = "A";
                break;
            case 4:
                letter = "G";
                break;
            case 5:
                letter = "M";
                break;
            case 6:
                letter = "Y";
                break;
            case 7:
                letter = "F";
                break;
            case 8:
                letter = "P";
                break;
            case 9:
                letter = "D";
                break;
            case 10:
                letter = "X";
                break;
            case 11:
                letter = "B";
                break;
            case 12:
                letter = "N";
                break;
            case 13:
                letter = "J";
                break;
            case 14:
                letter = "Z";
                break;
            case 15:
                letter = "S";
                break;
            case 16:
                letter = "Q";
                break;
            case 17:
                letter = "V";
                break;
            case 18:
                letter = "H";
                break;
            case 19:
                letter = "L";
                break;
            case 20:
                letter = "C";
                break;
            case 21:
                letter = "K";
                break;
            case 22:
                letter = "E";
                break;
        }
    }

    /**
     * Metodo toString para pintar el Nif bien formado
     */
    public String toString() {
        String DNI = ("DNI: " + String.format("%08d", Integer.parseInt(String.valueOf(dni))) + "-" + Nif.letter);
        return DNI;
    }

    /**
     * Metodo que lee por teclado los digitos del dni, llama al metodo para
     * calcular la letra y al que se encarga de mostrar el dni
     */
    public void leer() {
        Utils uts = new Utils();
        int dni;
        String dniConverted;
        do {
            System.out.println("Introduce los 8 digitos de tu DNI para calcular su letra: ");
            System.out.print("DNI: ");
            dniConverted = String.valueOf(dni = uts.getInt());
            dniConverted = String.format("%08d", Integer.parseInt(dniConverted));
            if (dniConverted.length() != 8) {
                System.out.println("Numero de digitos introducidos incorrecto, por favor intenta introducir los 8 digitos del dni.");
            }
            Nif.setDni(Integer.parseInt(dniConverted));
            calcNifLetter(Integer.parseInt(dniConverted));

        } while (dniConverted.length() != 8);
    }

}
