/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion_repaso;

/**
 *
 * @author usuario
 */
public class CountLetters {

    private char letters[] = new char[20];

    public void countLetters() {
        String uChoice = "Prueba de texto";
        uChoice = uChoice.replace(" ", "");
        
        char[] arrayletters = uChoice.toCharArray();
        char['a'] finalArray;
        char separated;
        
        for(int i = 0;i < arrayletters.length;i++ ){
            separated = arrayletters[i];
            if(arrayletters.equals(" ")){
                letters[i] = arrayletters[i];
            }
        }
        for (char i : arrayletters) {
            System.out.println(i);
        }
    }
}
