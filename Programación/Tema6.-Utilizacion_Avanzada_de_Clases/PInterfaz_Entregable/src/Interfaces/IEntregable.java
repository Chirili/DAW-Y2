/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Andres
 */
public interface IEntregable {
    public void entregar();
    public void devolver();
    public boolean getIsEntregado();
    public void compareTo(Object o);
}
