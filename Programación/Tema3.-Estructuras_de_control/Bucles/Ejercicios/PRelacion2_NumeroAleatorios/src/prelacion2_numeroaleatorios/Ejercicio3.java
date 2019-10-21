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
public class Ejercicio3 implements Iejercicios{
    public void toExecute(){
        String str = spanishCards();
        System.out.print(str);
    }
    
    public String spanishCards(){
        
        String card = "";
        String deck = "";
        int cardNumber, deckNumber;
        
        
         cardNumber = (int) (Math.random()*13)+1;
         deckNumber = (int) (Math.random()*4)+1;
        
        switch(deckNumber){
            case 1:
                deck = "Oros";
                break;
                
            case 2:
                deck = "Copas";
                break;
                
            case 3: 
                deck = "Bastos";
                break;
                
            case 4:
                deck = "Espadas";
                break;
           default:
        }
        
        switch (cardNumber){
            case 1:
                card = "AS";
                break;
            case 11:
                card = "Sota";
                break;
            case 12:
                card = "Caballo";
                break;
            case 13:
                card = "Rey";
                break;
            default:
                card = String.valueOf(cardNumber);
        }
        
        System.out.println("La carta que ha salido aleatoriamente es el: "+card+ " de "+deck);
        
        return "\n";
    }
}
