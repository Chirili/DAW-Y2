/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.salario.tipos;

import models.moneda.Moneda;
import models.persona.Persona;
import models.salario.SalariosPaises;

/**
 *
 * @author usuario
 */
public class SalariosInglaterra extends SalariosPaises {

    private static final double IMPUESTO_FIJO = 3.5;

    //Constructor por defecto
    public SalariosInglaterra() {
        super();
    }

    //Constructor parametrizado
    public SalariosInglaterra(String nombrePais, Persona trabajador, Moneda moneda) {
        super(nombrePais, trabajador, moneda);
    }

    //Constructor copia
    public SalariosInglaterra(SalariosPaises sp) {
        super(sp);
    }

    /**
     * Metodo encargado de calcular el sueldo neto
     * @return de un dato de tipo double que es el sueldo neto
     */
    @Override
    public double calcularSueldoNeto() {
        return super.calcularSueldoBruto() - ((super.SALDO_BASE * this.IMPUESTO_FIJO) / 100);
    }

    //Metodo encargado de capturar los datos del padre
    public void capturarSalariosInglaterra(){
        super.capturarSalariosPaises();
    }
    @Override
    public String toString() {
        return "Datos del trabajador de Inglaterra: \n"+
                "Sueldo neto: "+this.calcularSueldoNeto()+
                "\nSueldo bruto: "+this.calcularSueldoBruto()+"\n"+super.trabajador.toString()+
                "\n"+this.moneda.toString();
    }
    
}
