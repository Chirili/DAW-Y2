/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio2 implements Iejercicios{
    public void toExecute(){
        String str = cards();
        System.out.print(str);
    }
    
    public String cards(){
        
        String card = "";
        String deck = "";
        int cardNumber, deckNumber;
        
        
         cardNumber = (int) (Math.random()*13)+1;
         deckNumber = (int) (Math.random()*4)+1;
        
        switch(deckNumber){
            case 1:
                deck = "Corazores";
                break;
                
            case 2:
                deck = "Treboles";
                break;
                
            case 3: 
                deck = "Diamantes";
                break;
                
            case 4:
                deck = "Picas";
                break;
           default:
        }
        
        switch (cardNumber){
            case 1:
                card = "AS";
                break;
            case 11:
                card = "J";
                break;
            case 12:
                card = "Q";
                break;
            case 13:
                card = "K";
                break;
            default:
                card = String.valueOf(cardNumber);
        }
        
        System.out.println("La carta que ha salido aleatoriamente es el: "+card+ " de "+deck);
        
        return "\n";
    }
}
