package prelacion2_numeroaleatorios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.Line;

/**
 *
 * @author Andrés
 */
public class Utils {
    public void clearScreen() throws AWTException {

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException a) {
            a.printStackTrace();
        }

    }

    public double getDouble() throws InputMismatchException {
        do {
            try {
                Scanner gd = new Scanner(System.in);
                return gd.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Double, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public int getInt() {
        do {
            try {
                Scanner gi = new Scanner(System.in);
                return gi.nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Int, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public String getString() {
        do {
            try {
                Scanner gs = new Scanner(System.in);
                return gs.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable String, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public boolean getBoolean() {
        do {
            try {
                Scanner gb = new Scanner(System.in);
                return gb.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Boolean, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public float getFloat() {
        do {
            try {
                Scanner gf = new Scanner(System.in);
                return gf.nextFloat();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Float, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public long getLong() {
        do {
            try {
                Scanner gl = new Scanner(System.in);
                return gl.nextLong();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Long, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public short getShort() {
        do {
            try {
                Scanner gs = new Scanner(System.in);
                return gs.nextShort();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Short, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public byte getByte() {
        do {
            try {
                Scanner gby = new Scanner(System.in);
                return gby.nextByte();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Byte, vuelve a intentarlo: ");
            }
        } while (true);
    }
    
 /*
    * Menu de ejercicios
    
     do{
                
                System.out.print("Elige el numero de ejercicio entre el 1 y el 7 para mostrar o pulsa 0 para salir: ");
                choice = uts.getInt();
                uts.clearScreen();
                
                if (choice != 0 && choice < 8){
                    
                    ejercicios.get(choice).toExecute();
                    String choice2;
                    String eb = "0";
                    
                    do{
                        
                    System.out.print("Pulsa s para ver el siguiente ejercicio, a para ver el ejercicio anterior o 0 para volver a la elección de ejercicios: ");
                    choice2 = uts.getString();
                    uts.clearScreen();
                        if(choice2.equalsIgnoreCase("s") && choice < 8){
                            
                            choice ++;
                            ejercicios.get(choice).toExecute();
                            
                        }else if(choice2.equalsIgnoreCase("a") && choice > 1){
                            
                            choice --;
                            ejercicios.get(choice).toExecute();
                            
                        }else {
                            
                            System.out.println("Numero elegido incorrecto intentalo de nuevo.");
                            
                        }
                    }while(!choice2.equals(eb));
                    
                }
            }while(choice != 0);
            
            System.exit(0);
    */
}
