/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés
 */
public class Ejercicio10 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = Horoscope();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Horoscope() throws AWTException {
        int day, month;
        String horoscope = "";
        System.out.print("Escribe el dia que naciste: ");
        day = uts.getInt();

        System.out.print("Escribe el mes en le que naciste: ");
        month = uts.getInt();

        switch (month) {
            case 1:
                if (day < 21) {
                    horoscope = "Capricornio";
                } else {
                    horoscope = "Acuario";
                }
                break;
            case 2:
                if (day < 20) {
                    horoscope = "Acuario";
                } else {
                    horoscope = "Piscis";
                }
                break;
            case 3:
                if (day < 21) {
                    horoscope = "Piscis";
                } else {
                    horoscope = "Aries";
                }
                break;
            case 4:
                if (day < 21) {
                    horoscope = "Aries";
                } else {
                    horoscope = "Tauro";
                }
                break;
            case 5:
                if (day < 20) {
                    horoscope = "Tauro";
                } else {
                    horoscope = "Geminis";
                }
                break;
            case 6:
                if (day < 22) {
                    horoscope = "Geminis";
                } else {
                    horoscope = "Cancer";
                }
                break;
            case 7:
                if (day < 22) {
                    horoscope = "Cancer";
                } else {
                    horoscope = "Leo";
                }
                break;
            case 8:
                if (day < 24) {
                    horoscope = "Leo";
                } else {
                    horoscope = "virgo";
                }
                break;
            case 9:
                if (day < 23) {
                    horoscope = "Virgo";
                } else {
                    horoscope = "Libra";
                }
                break;
            case 10:
                if (day < 23) {
                    horoscope = "Libra";
                } else {
                    horoscope = "Escorpio";
                }
                break;
            case 11:
                if (day < 23) {
                    horoscope = "Escorpio";
                } else {
                    horoscope = "Sagitario";
                }
                break;
            case 12:
                if (day < 21) {
                    horoscope = "Sagitario";
                } else {
                    horoscope = "Capricornio";
                }
                break;
            default:
        }
        
        uts.clearScreen();
        
        System.out.println("Tu horoscopo es el siguiente:  " + horoscope);
        return "\n";
    }
}
