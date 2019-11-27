/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author Andres
 */
public class Peso {

    private double objectWeight;
    
    /*
    * Constructor de peso, necesita que le pasemos un peso y la medida para convertirlo
    */
    Peso(double peso, String medida) {
        this.objectWeight = peso / calcConversionFactor(medida);
    }

    /*
    *   Este metodo recoge el valor medida y lo mete en un switch para aplicar un factor de conversion u otro
    */
    private double calcConversionFactor(String medida) {
        double conversionFactor = 0;

        switch (medida.toUpperCase()) {
            case "LB":
                conversionFactor = 2.205;
                break;
            case "LI":
                conversionFactor = 14.59;
                break;
            case "OZ":
                conversionFactor = 35.274;
                break;
            case "P":
                conversionFactor = 14.59;
                break;
            case "K":
                conversionFactor = 14.59;
                break;
            case "G":
                conversionFactor = 14.59;
                break;
            case "Q":
                conversionFactor = 43.3;
                break;
        }
        return conversionFactor;
    }

    public static void main(String[] args) {
        Peso p = new Peso(500, "LB");

        System.out.println("1 libra = " + p.objectWeight + " kg");
        
        Peso p2 = new Peso(10, "OZ");
        System.out.println("5 onzas son: "+p2.getPeso("OZ")+" kg");
    }

    /*
    *    Getters para recoger los valores
    */
    public double getLibras() {
        return this.objectWeight / this.calcConversionFactor("LB");
    }
    
    public double getLingotes() {
        return this.objectWeight * this.calcConversionFactor("LI");
    }
    
    public double getOnzas() {
        return this.objectWeight / this.calcConversionFactor("OZ");
    }
    
    public double getQuintales() {
        return this.objectWeight * this.calcConversionFactor("Q");
    }
    public double getPeso(String medida){
        return this.objectWeight / this.calcConversionFactor(medida);
    }
}
