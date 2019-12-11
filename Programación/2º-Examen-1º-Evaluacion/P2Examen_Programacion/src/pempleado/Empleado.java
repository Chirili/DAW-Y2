/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pempleado;

/**
 *
 * @author usuario
 */
public class Empleado implements Cloneable {

    private static final int IRPF = 21;
    //Atributos de la clase empleado
    private String nif;
    private String nombre;
    private String apellidos;
    private double sueldo_base;
    private double pago_horas_extras;
    private int horas_extras;
    private boolean casado;
    private boolean hijos;
    private int num_hijos;

    //Constructor por defecto
    Empleado() {
        this.nif = "";
        this.nombre = "";
        this.apellidos = "";
        this.sueldo_base = 0;
        this.pago_horas_extras = 0;
        this.horas_extras = 0;
        this.casado = false;
        this.hijos = false;
        this.num_hijos = 0;
    }

    //Constructor parametrizado
    Empleado(String nif, String nombre, double sueldo_base, double pago_horas_extras, int horas_extras) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = "";
        this.sueldo_base = sueldo_base;
        this.pago_horas_extras = pago_horas_extras;
        this.horas_extras = horas_extras;
        this.casado = casado;
        this.hijos = hijos;
        this.num_hijos = num_hijos;
    }

    //Constructor copia
    Empleado(Empleado e) {
        this.nif = e.nif;
        this.nombre = e.nombre;
        this.apellidos = e.apellidos;
        this.sueldo_base = e.sueldo_base;
        this.pago_horas_extras = e.pago_horas_extras;
        this.horas_extras = e.horas_extras;
        this.casado = e.casado;
        this.hijos = e.hijos;
        this.num_hijos = e.num_hijos;
    }

    public double calcularComplemento() {
        double complemento = this.horas_extras * this.pago_horas_extras;
        return complemento;
    }

    public double calcularSueldoBruto() {
        double sueldo_bruto = this.sueldo_base + (this.horas_extras * this.pago_horas_extras);
        return sueldo_bruto;
    }

    public double calcularRetenciones() {
        double retenciones = 0;
        if (this.casado == true && this.hijos == true) {
            double airpf = this.IRPF - 2;
            airpf -= this.num_hijos;
            retenciones = (calcularSueldoBruto() * airpf) / 100;
        }
        if (this.casado == true && this.hijos == false) {
            double airpf = this.IRPF - 2;
            retenciones = (calcularSueldoBruto() * airpf) / 100;
        }
        if (this.casado == false && this.hijos == true) {
            double airpf = this.IRPF - this.num_hijos;
            retenciones = (calcularSueldoBruto() * airpf) / 100;
        }
        if (this.casado == false && this.hijos == false) {
            retenciones = (calcularSueldoBruto() * this.IRPF) / 100;
        }
        return retenciones;
    }

    public double calcularSueldoNeto() {
        double sueldoNeto = 0;
        if (this.casado == true && this.hijos == true) {
            double airpf = this.IRPF - 2;
            airpf -= this.num_hijos;
            return sueldoNeto = calcularSueldoBruto() - ((this.sueldo_base + calcularComplemento()) * airpf) / 100;
        }
        if (this.casado == true && this.hijos == false) {
            double airpf = this.IRPF - 2;
            return sueldoNeto = calcularSueldoBruto() - ((this.sueldo_base + calcularComplemento()) * airpf) / 100;
        }
        if (this.casado == false && this.hijos == true) {
            double airpf = this.IRPF - this.num_hijos;
            return sueldoNeto = calcularSueldoBruto() - ((this.sueldo_base + calcularComplemento()) * airpf) / 100;
        }
        if (this.casado == false && this.hijos == false) {
            return sueldoNeto = calcularSueldoBruto() - ((this.sueldo_base + calcularComplemento()) * this.IRPF) / 100;
        }
        return 0;
    }

    public void println() {
        System.out.println("NIF del empleado: " + this.nif);
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Apellidos del empleado: " + this.apellidos);
        if (this.casado == true) {
            System.out.println("Esta casado.");
        } else {
            System.out.println("No esta casado.");
        }
        if (this.hijos == true) {
            System.out.println("Tiene " + num_hijos + " de hijos");
        } else {
            System.out.println("No tiene hijos");
        }
    }

    public void printAll() {
        System.out.println("NIF del empleado: " + this.nif);
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Apellidos del empleado: " + this.apellidos);
        if (this.casado == true) {
            System.out.println("Esta casado.");
        } else {
            System.out.println("No esta casado.");
        }
        if (this.hijos == true) {
            System.out.println("Tiene numero de hijos");
        } else {
            System.out.println("No tiene hijos");
        }
        System.out.println("Sueldo bruto: " + this.calcularSueldoBruto());
        System.out.println("Sueldo neto: " + this.calcularSueldoNeto());
        System.out.println("Complemento por horas extra trabajadas: " + this.calcularComplemento());
        System.out.println("Retencion del IRPF: " + this.calcularRetenciones());
    }

    /**
     *  Metodo clonnable de Empleado
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
    public void setNum_Hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public int getNum_Hijos() {
        return num_hijos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isHijos() {
        return hijos;
    }

    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }

    /**
     * Metodo cloneable
     *
     * @return
     */
//    Libro l3 = (Libro) l2.clone();
}
