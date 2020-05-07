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
public enum TabletEnum {
    GTS5E("GALAXY_TAB_S5E", "Samsung", 509.9),
    GTS6("GALAXY_TAB_S6", "Samsung", 719.9),
    MPM5("MEDIA_PAD_M5", "Huawei", 219),
    AM10("AQUARIS_M10", "BQ", 204.9),
    IPM("IPAD_MINI", "Apple", 513.63);

    private String modelo;
    private String proveedor;
    private double precio;

    TabletEnum(String modelo, String proveedor, double precio) {
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

    public static Stream<TabletEnum> stream() {
        return Stream.of(TabletEnum.values());
    }
}
