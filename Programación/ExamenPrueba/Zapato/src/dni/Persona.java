/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

/**
 *
 * @author Andres
 */
public class Persona {

    private static final char hombre = 'H';
    private static final char mujer = 'M';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    Persona() {
        this.sexo = hombre;
        this.nombre = "";
        this.dni = "";
        this.peso = 0;
        this.altura = 0;
    }

    Persona(String nombre, int edad, char sexo) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
        this.sexo = hombre;
        this.peso = 0;
        this.altura = 0;
    }

    Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.dni = p.dni;
        this.sexo = p.sexo;
        this.peso = p.peso;
        this.altura = p.altura;
    }

    public int calcularIMC(double peso, double altura) {
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 25 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public String generarDni(){
        String letter = null;
        int nif = (int) (Math.random()*100000000);
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
        String dniConverted;
        dniConverted = String.valueOf(nif);
        dniConverted = String.format("%08d", Integer.parseInt(dniConverted));
        String DNI = ("DNI: " + String.format("%08d", Integer.parseInt(String.valueOf(nif))) + "-" + letter);
        return DNI;
    }
    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo() {
        if (this.sexo != hombre || this.sexo != mujer) {
            this.sexo = hombre;
        }
    }
}
