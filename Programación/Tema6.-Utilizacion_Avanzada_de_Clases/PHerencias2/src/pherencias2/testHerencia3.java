/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencias2;
import java.time.LocalDate;
import productos.Productos;
import productos.tipos.*;
import productos.tipos.congelados.*;
/**
 *
 * @author usuario
 */
public class testHerencia3 {
    public static void main(String[] args) {
        System.out.println("Productos frescos");
        System.out.println("------------------------");
        ProductosFrescos pf1 = new ProductosFrescos(LocalDate.of(2020, 1, 28),"España",LocalDate.of(2022, 3, 20),3524);
    }
    
}
