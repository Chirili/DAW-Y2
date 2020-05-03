/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exepciones.NoDisponibleException;
import java.util.ArrayList;
import exepciones.NoExisteException;
import java.util.Arrays;

/**
 *
 * @author Andres
 */
public class Tienda {

    private String nombre;
    private ArrayList<Articulo> articulos;

    //Constructor parametrizado de tienda
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList();
    }

    //Metodo encargado de insertar articulos en la tienda
    public void insertArticulo(Articulo art) {
        articulos.add(art);
    }

    //Metodo encargado de devolver un valor booleano si se encuentra X articulo o no
    public boolean existArticle(String nombre) {
        return ((articulos.stream().anyMatch(art -> art.getNombre().equalsIgnoreCase(nombre))) ? true : false);
    }

    //Metodo encargado de encontrar articulos en el array list, si no los encuentra devuelve una excepcion
    public Articulo findArticulo(String nombre) throws NoExisteException {
        if (articulos.stream().anyMatch(art -> art.getNombre().equalsIgnoreCase(nombre))) {
            return articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get();
        } else {
            throw new NoExisteException("No existe el articulo que esta buscando.");
        }
    }

    //Metodo encargado de vender articulos de la tienda
    public double vende(String nombre, int num) throws NoExisteException, NoDisponibleException {
        //Busca en el array list cualquier articulo que tenga el nombre que se le pasa por parametro
        //Si no encuentra el articulo lanza una excepcion de NoExisteException
        if (articulos.stream().anyMatch(art -> art.getNombre().equalsIgnoreCase(nombre))) {
            //Filtra en el array buscando el objeto con dicho nombre, coge la cantidad y la compara con el numero introducido por parametro
            //Si el numero es mayor que la cantidad del articulo se borra ese articulo
            //Sino se procede a borrar el articulo el cual esta controlando la excepcion correspondiente
            if (articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().getCantidad() < num) {
                double precio = articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().getPrecio();
                int cantidad = articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().getCantidad();
                articulos.removeIf(art -> art.getNombre().equalsIgnoreCase(nombre));
                return cantidad * precio;
            } else {
                //Capturo la excepcion 
                try {
                    articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().vende(num);
                } catch (NoDisponibleException e) {
                    double precio = articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().getPrecio();
                    int cantidad = articulos.stream().filter(art -> art.getNombre().equalsIgnoreCase(nombre)).findFirst().get().getCantidad();
                    System.out.println("El articulo no está disponible");
                    articulos.removeIf(art -> art.getNombre().equalsIgnoreCase(nombre));
                    return cantidad*precio;
                }
                return num;
            }
        } else {
            throw new NoExisteException("No existe el articulo que esta buscando.");
        }
    }

    //Metodo encargado de mostrar por pantalla todos articulos cuya cantidad sea menor que min
    public void escribePedido(int min) {
        ArrayList<Articulo> arts = new ArrayList(Arrays.asList(articulos.stream().filter(art -> art.getCantidad() < min).toArray()));
        for (Articulo art : arts) {
            System.out.println("Nombre del producto: " + art.getNombre() + " Cantidad de unidades del producto: " + art.getCantidad() + " Precio del producto: " + art.getPrecio());
        }
    }

    /**
     * Getters y setter de Tienda
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

}
