/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio12 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
    String str = Fibonacci();
    System.out.print(str);
}
    
    public String Fibonacci(){
        
        int fib1=0,fib2=1,aux,choice;
        
        System.out.print("Elige un numero para mostrar la serie Fibonacci:  ");
        choice = uts.getInt();
        
        switch(choice){
            case 1:
                System.out.println("0 ");
                break;
            case 2:
                System.out.println("0 1 ");
                break;
            default:
                while (choice> 2){
                    aux = fib1;
                    fib1= fib2;
                    fib2 = fib2 + aux;
                    System.out.print(fib2+", ");
                    choice--;
                }
               
        }
        return "\n";
    }
}
