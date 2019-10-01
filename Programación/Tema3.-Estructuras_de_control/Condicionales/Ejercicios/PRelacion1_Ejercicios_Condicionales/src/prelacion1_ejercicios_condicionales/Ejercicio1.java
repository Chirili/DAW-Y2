/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

/**
 *
 * @author Andrés
 */
public class Ejercicio1 implements Iejecicios{
    Utils uts = new Utils();
    public void toExecute(){
        String str = weekDay();
        System.out.print(str);
    }
    public String weekDay(){
        
        int choice;
        
        System.out.print("Escribe un dia de la semana: ");
        choice = uts.getInt();
        if (choice == 1) {
            System.out.println("Programacion ");
        } else if(choice == 2 ) {
            System.out.println("Daw");
        }else if (choice == 3 ) {
               System.out.println("Sistemas");
        }else if(choice == 4 ){
            System.out.println("Lenguaje de marcas ");
        }else if (choice == 5) {
            System.out.println("BADAT ");
         }
        return "\n";
    }
}
