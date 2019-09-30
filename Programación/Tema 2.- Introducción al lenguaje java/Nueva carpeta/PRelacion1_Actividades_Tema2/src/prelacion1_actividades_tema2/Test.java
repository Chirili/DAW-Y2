/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Andrés
 */
public class Test implements  KeyListener{
    public static void main(String[] args) {
   
}
     // Set of currently pressed keys
    private final Set<Character> pressed = new HashSet<Character>();

    @Override
    public synchronized void keyPressed(KeyEvent e) {
        pressed.add(e.getKeyChar());
        if (pressed.size() > 1) {
            // More than one key is currently pressed.
            // Iterate over pressed to get the keys.
            System.out.print("asdf");
        }
    }

    @Override
    public synchronized void keyReleased(KeyEvent e) {
        pressed.remove(e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {/* Not used */ }
    
}
