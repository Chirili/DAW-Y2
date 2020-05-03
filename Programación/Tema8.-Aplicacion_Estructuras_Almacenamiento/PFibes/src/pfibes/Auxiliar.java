/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfibes;

import Utils.AnularException;
import Utils.NoHayEntradasDisponibles;
import Utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import models.Entrada;
import models.EntradaEnum;

/**
 *
 * @author Andres
 */
public class Auxiliar {

    //HashMap que contiene el dni y su correspondiente ArrayList de entradas
    HashMap<String, ArrayList<Entrada>> usuarios;
    //HashMap que contiene el codigo como key y el maximo como valor
    HashMap maximoEntradas;

    //Constructor por defecto de Auxiliar
    public Auxiliar() {
        this.usuarios = new HashMap<String, ArrayList<Entrada>>();
        this.maximoEntradas = addEnumValues();
    }

    //Este metodo se encarga de añadir los valores del enum al hashmap de entradas
    private HashMap addEnumValues() {
        HashMap emptyEntradas = new HashMap();
        for (int i = 0; i < EntradaEnum.values().length; i++) {
            emptyEntradas.put(EntradaEnum.values()[i].getCodEntrada(), EntradaEnum.values()[i].getMaximoEntradas());
        }
        return emptyEntradas;
    }

    //Metodo encargado de anular la entrada
    public void anularEntrada() throws AnularException{
        Utils uts = new Utils();
        int dniChoice, removeEntrada;

        //Si no hay usuarios con entradas  salta una excepcion
        if (this.usuarios.isEmpty()) {
            throw new AnularException("Vende entradas para poder anularlas...");
        }

        Set<String> nifUsers = new TreeSet<String>();
        nifUsers = this.usuarios.keySet();

        for (int i = 0; i < this.usuarios.size(); i++) {
            System.out.println(i + 1 + " Nif: " + nifUsers.toArray()[i]);
        }

        do {
            System.out.print("Selecciona el dni: ");
            dniChoice = uts.getInt();
        } while (dniChoice > nifUsers.toArray().length);

        for (int i = 0; i < this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).size(); i++) {
            System.out.println("Entrada " + i + 1 + ":\n" + this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).get(i).toString());
        }

        do {
            System.out.print("Selecciona la entrada que deseas borrar: ");
            removeEntrada = uts.getInt();
        } while (removeEntrada > this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).size() || removeEntrada < 0);

        int codRemoved = this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).get(dniChoice - 1).getCodigo();

        //Si se borra una entrada y no tiene ninguna el usuario, se borra el usuario, sino solo se borra la entrada
        if ((this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).size() - 1) == 0) {
            this.usuarios.remove(nifUsers.toArray()[dniChoice - 1]);
        } else {
            this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).remove(removeEntrada - 1);
        }

        //Despues de anular la entrada, se suma +1 a la cantidad de entradas de ese tipo que se ha borrado
        removeEntrada += (int) this.maximoEntradas.get(codRemoved);
        this.maximoEntradas.replace(codRemoved, removeEntrada);
        System.out.println("Operacion realizada con exito.");
    }

    public void mostrarEntradasPersona() throws AnularException {
        Utils uts = new Utils();
        int dniChoice;
        if (this.usuarios.isEmpty()) {
            throw new AnularException("Vende entradas para poder anularlas...");
        }

        Set<String> nifUsers = new TreeSet<String>(this.usuarios.keySet());
        

        for (int i = 0; i < this.usuarios.size(); i++) {
            System.out.println(i + 1 + " Nif: " + nifUsers.toArray()[i]);
        }

        do {
            System.out.print("Selecciona el dni: ");
            dniChoice = uts.getInt();
        } while (dniChoice > nifUsers.toArray().length);

        for (int i = 0; i < this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).size(); i++) {
            System.out.println("Entrada " + (i + 1) + ":\n" + this.usuarios.get(nifUsers.toArray()[dniChoice - 1]).get(i).toString());
        }
    }

    //Metodo encargado de vender entradas
    public void venderEntrada() throws NoHayEntradasDisponibles {
        Utils uts = new Utils();
        Entrada ent = getCodEntrada();
        String nif;

        int numEntradas = (int) this.maximoEntradas.get(ent.getCodigo());

        //Si no hay entradas salta una excepcion
        if (numEntradas <= 0) {
            throw new NoHayEntradasDisponibles("No hay entradas disponibles");
        }

        System.out.println("Codigo de entrada: " + ent.getCodigo());
        System.out.println("Numero de entrada: " + ent.getNumeroEntrada());

        do {
            System.out.print("Introduce tu nif: ");
            nif = uts.getString();
        } while (validarDNI(nif) != true);

        ent.setNif(nif);

        //Si existe un usuario con ese DNI se añade una entrada a su ArrayList, sino se crea un ArrayList y se le asigna a su DNI
        if (this.usuarios.containsKey(nif)) {
            ArrayList<Entrada> entradasUsuario = this.usuarios.get(nif);
            entradasUsuario.add(ent);
            this.usuarios.replace(nif, entradasUsuario, entradasUsuario);
        } else {
            ArrayList<Entrada> entradasUsuario = new ArrayList<Entrada>();
            entradasUsuario.add(ent);
            this.usuarios.put(nif, entradasUsuario);
        }

        this.maximoEntradas.replace(ent.getCodigo(), numEntradas, numEntradas - 1);
    }

    private Entrada getCodEntrada() {
        Utils uts = new Utils();
        int choice;
        System.out.println("Elige el tipo de entrada que quieres comprar: ");
        for (int i = 0; i < EntradaEnum.values().length; i++) {
            System.out.println(i + 1 + ". " + EntradaEnum.values()[i].getTipoEntrada());
        };
        System.out.print("Eleccion: ");
        choice = uts.getInt();
        Entrada ent = new Entrada(EntradaEnum.values()[choice - 1].getCodEntrada(), EntradaEnum.values()[choice - 1].getTipoEntrada());
        return ent;
    }

    public void contarEntradas() {
        System.out.println("Cantidad de entradas por tipo: ");
        for (int i = 0; i < EntradaEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + EntradaEnum.values()[i].getTipoEntrada() + "(" + this.maximoEntradas.get(i + 1) + ")");
        }
    }

    public boolean validarDNI(String nif) {
        if (nif.length() != 9 || Character.isLetter(nif.charAt(8)) == false) {
            return false;
        } else {
            return true;
        }
    }
}
