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
public class Persona implements Cloneable {

    private String nombre;
    private int edad;
    private String DNI;
    private final char hombre = 'H';
    private final char mujer = 'M';
    private char sexo;
    private int peso;
    private double altura;

    //Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaNumeroDNI();
        this.sexo = this.hombre;
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor parametrizado
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaNumeroDNI();
        this.altura = 0;
        this.peso = 0;
    }

    //Segundo constructor parametrizado
    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaNumeroDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Constructor copia
     * @param p 
     */
    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.DNI = p.generaNumeroDNI();
        this.sexo = p.sexo;
        this.peso = p.peso;
        this.altura = p.altura;
    }

    /**
     * Calcula el IMC de la persona, en base a su altura y peso, devuelve dato
     * numero de tipo int
     *
     * @return
     */
    public int calcularImc() {
        double calculoImc;
        calculoImc = this.peso / (Math.pow(this.altura, 2));
        if (calculoImc < 20) {
            return -1;
        }
        if (calculoImc >= 20 && calculoImc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Metodo clonnable de Persona
     *
     * @return devuelve un objeto de tipo persona
     */
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = (Persona) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    /**
     * Metodo encargado de comprobar si la persona es mayor o no de edad
     *
     * @return
     */
    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Se encarga de comprobar el sexo de la persona, recibiendo por parametros
     * el sexo introducido por el usuario y devolviendo la correcion si es
     * necesaria
     *
     * @param sexo
     * @return
     */
    private char comprobarSexo(char sexo) {
        if (sexo != this.hombre && sexo != this.mujer) {
            return hombre;
        } else {
            if (this.sexo == hombre) {
                return hombre;
            } else {
                return mujer;
            }
        }
    }

    /**
     * Metodo toString que pinta por pantalla toda la informacion relevante de
     * la persona
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre de la persona: " + this.nombre
                + "\nEdad de la persona: " + this.edad
                + "\nDNI de la persona: " + this.DNI
                + "\nSexo de la persona: " + this.sexo
                + "\nPeso de la persona: " + this.peso
                + "\nAltura de la persona: " + this.altura;
    }

    /**
     * Metodo encargado de generar un numero aleatorio y de llamar al metodo
     * correspondiente para que asigne la letra
     *
     * @return
     */
    private String generaNumeroDNI() {
        String checker;
        int numeroDNI, generado;
        do {
            numeroDNI = (int) (Math.random() * 100000000);
            generado = numeroDNI;
            checker = String.valueOf(numeroDNI);
        } while (checker.length() != 8);
        int sumaNumeros = 0;
        for (int i = 0; i < numeroDNI; i++) {
            sumaNumeros += numeroDNI % 10;
            numeroDNI /= 10;
        }
        String dni = asignarLetraDNI(sumaNumeros, generado);
        return dni;
    }

    /**
     * Metodo encargado de generar el DNI, recibe por parametros un numero
     * decimal de 8 cifras generado aleatoriamente y la suma de los numeros del
     * DNI generado para despues devolver un String con el dni ya formado
     *
     * @param numeroLetra
     * @param numeroGenerado
     * @return
     */
    private String asignarLetraDNI(int numeroLetra, int numeroGenerado) {
        int resultado = (int) numeroLetra % 23;
        String dniFormado = String.valueOf(numeroGenerado);
        switch (resultado) {
            case 0:
                dniFormado += "T";
                break;
            case 1:
                dniFormado += "R";
                break;
            case 2:
                dniFormado += "W";
                break;
            case 3:
                dniFormado += "A";
                break;
            case 4:
                dniFormado += "G";
                break;
            case 5:
                dniFormado += "M";
                break;
            case 6:
                dniFormado += "Y";
                break;
            case 7:
                dniFormado += "F";
                break;
            case 8:
                dniFormado += "P";
                break;
            case 9:
                dniFormado += "D";
                break;
            case 10:
                dniFormado += "X";
                break;
            case 11:
                dniFormado += "B";
                break;
            case 12:
                dniFormado += "N";
                break;
            case 13:
                dniFormado += "J";
                break;
            case 14:
                dniFormado += "z";
                break;
            case 15:
                dniFormado += "S";
                break;
            case 16:
                dniFormado += "Q";
                break;
            case 17:
                dniFormado += "V";
                break;
            case 18:
                dniFormado += "H";
                break;
            case 19:
                dniFormado += "L";
                break;
            case 20:
                dniFormado += "C";
                break;
            case 21:
                dniFormado += "K";
                break;
            case 22:
                dniFormado += "E";
                break;
        }
        return dniFormado;
    }

    /**
     * Getters y setters de la clase Persona
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
