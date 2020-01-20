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
public class Empleado implements Cloneable {

    private static final int IRPF = 21;
    //Atributos de la clase empleado
    private double sueldo_base;
    private double pago_horas_extras;
    private int horas_extras;
    private Persona empleado;

    //Constructor por defecto
    public Empleado() {
        this.sueldo_base = 0;
        this.pago_horas_extras = 0;
        this.horas_extras = 0;
        this.empleado = new Persona();
    }

    //Constructor parametrizado
    public Empleado(double sueldo_base, double pago_horas_extras, int horas_extras, Persona p) {
        this.sueldo_base = sueldo_base;
        this.pago_horas_extras = pago_horas_extras;
        this.horas_extras = horas_extras;
        this.empleado = p;
    }

    //Constructor copia
    public Empleado(Empleado e) {
        this.sueldo_base = e.getSueldo_base();
        this.pago_horas_extras = e.getPago_horas_extras();
        this.horas_extras = e.getHoras_extras();
        this.empleado = e.empleado;
    }

    //Calcula el pago por las horas extras del empleado
    public double calcularComplemento() {
        double complemento = this.horas_extras * this.pago_horas_extras;
        return complemento;
    }
    

    //Calcula el sueldo bruto de un empleado
    public double calcularSueldoBruto() {
        double sueldo_bruto = this.sueldo_base + (this.horas_extras * this.pago_horas_extras);
        return sueldo_bruto;
    }

    //Calcula las retenciones del empleado
    public double calcularRetenciones() {
        double retenciones = 0;
        int airpf = this.IRPF;
        if (this.empleado.isCasado() == true) {
            airpf -= 2;
            if (this.empleado.isHijos()) {
                airpf -= this.empleado.getNum_hijos();
                retenciones = (calcularSueldoBruto() * airpf) / 100;
            } else {
                retenciones = (calcularSueldoBruto() * airpf) / 100;
            }
        } else {
            if (this.empleado.isHijos()) {
                airpf -= this.empleado.getNum_hijos();
                retenciones = (calcularSueldoBruto() * airpf) / 100;
            } else {
                retenciones = (calcularSueldoBruto() * airpf) / 100;
            }
        }
        return retenciones;
    }

    //Calcula el sueldo neto a partir del sueldo bruto y las retenciones
    public double calcularSueldoNeto() {
        return calcularSueldoBruto()- this.calcularRetenciones();
    }

    //Pinta por pantalla la informacion basica del empleado
    public void println() {
        this.empleado.toString();
    }

    //Pinta por pantalla toda la informacion del empleado
    public void printAll() {
        this.empleado.toString();
        System.out.println("Sueldo bruto: " + this.calcularSueldoBruto());
        System.out.println("Sueldo neto: " + this.calcularSueldoNeto());
        System.out.println("Complemento por horas extra trabajadas: " + this.calcularComplemento());
        System.out.println("Retencion del IRPF: " + this.calcularRetenciones());
    }

    /**
     * Metodo clonnable de Empleado
     *
     * @return devuelve un objeto de tipo empleado
     */
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = (Empleado) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    /*
    *   Getters y setters de los atributos
     */
    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getPago_horas_extras() {
        return pago_horas_extras;
    }

    public void setPago_horas_extras(double pago_horas_extras) {
        this.pago_horas_extras = pago_horas_extras;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }
}
