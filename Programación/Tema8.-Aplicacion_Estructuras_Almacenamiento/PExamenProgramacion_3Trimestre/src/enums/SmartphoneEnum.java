/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.stream.Stream;

/**
 *
 * @author Andres
 */
public enum SmartphoneEnum {

    M9("Mi9_LITE", "Xioami", 319.9),
    P30L("P30_LITE", "Huawei", 119.9),
    IP11("iPHONE_11", "Apple", 859.0),
    GS10L("GALAXY_S10_LITE", "Samsung", 659.0);

    private String modelo;
    private String proveedor;
    private double precio;

    SmartphoneEnum(String modelo, String proveedor, double precio) {
        this.modelo = modelo;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public double getPrecio() {
        return precio;
    }

<<<<<<< HEAD
    public static Stream<SmartphoneEnum> stream() {
        return Stream.of(SmartphoneEnum.values());
=======
    public Stream<Color> Stream() {
        return Stream.of(Color.values());
>>>>>>> 0e7f65b... Added some exercises and  java projects
    }

}
