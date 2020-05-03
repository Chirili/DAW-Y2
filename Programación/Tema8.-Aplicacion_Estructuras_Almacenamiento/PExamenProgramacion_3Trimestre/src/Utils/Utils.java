package Utils;

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

<<<<<<< HEAD
    public static void clearScreen() throws AWTException {
=======
    public void clearScreen() throws AWTException {
>>>>>>> 0e7f65b... Added some exercises and  java projects

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

<<<<<<< HEAD
    public static int randomNumberBW12() {
        return (int) (Math.random() * 2);
    }

    public static boolean checkDNI(String dni) {
=======
    public static int randomNumberBW12(){
        return (int) (Math.random() * 2);
    }
    public boolean checkDNI(String dni) {
>>>>>>> 0e7f65b... Added some exercises and  java projects
        if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
            return false;
        } else {
            return true;
        }
    }

<<<<<<< HEAD
    public static double getDouble() throws InputMismatchException {
=======
    public double getDouble() throws InputMismatchException {
>>>>>>> 0e7f65b... Added some exercises and  java projects
        do {
            try {
                Scanner gd = new Scanner(System.in);
                return gd.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Double, vuelve a intentarlo: ");
            }
        } while (true);
    }

<<<<<<< HEAD
    public static int getInt() {
=======
    public int getInt() {
>>>>>>> 0e7f65b... Added some exercises and  java projects
        do {
            try {
                Scanner gi = new Scanner(System.in);
                return gi.nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Int, vuelve a intentarlo: ");
            }
        } while (true);

    }

<<<<<<< HEAD
    public static String getString() {
=======
    public String getString() {
>>>>>>> 0e7f65b... Added some exercises and  java projects
        do {
            try {
                Scanner gs = new Scanner(System.in);
                return gs.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable String, vuelve a intentarlo: ");
            }
        } while (true);
    }

<<<<<<< HEAD
=======
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

    public String toString(String msg) {
        return msg;
    }
>>>>>>> 0e7f65b... Added some exercises and  java projects
}
