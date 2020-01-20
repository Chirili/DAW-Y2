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
public class Huevo {

    class Yema {

        Yema() {
            System.out.println("Creando la Yema");
        }
    }

    class Clara {

        public Clara() {
            System.out.println("Creando la Clara");
        }
    }

    public Huevo() {
        System.out.println("Creando el Huevo");
    }

    public Yema hazYema() {
        return new Yema();
    }

    public Clara hazClara() {
        return new Clara();
    }

}
