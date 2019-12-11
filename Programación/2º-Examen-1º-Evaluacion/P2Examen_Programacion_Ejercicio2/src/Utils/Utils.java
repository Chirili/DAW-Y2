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

    /**
     * Este metodo limpia la consola, basicamente lo que hace es pulsar las
     * teclas CTRL+L, tengo puesto un delay porque se ejecuta tan rapido que a
     * veces borra las lineas que van despues de este metodo
     *
     * @throws AWTException
     */
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

    /**
     * getDouble se encarga de recoger los datos de tipo double
     *
     * @return
     * @throws InputMismatchException
     */
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

    /**
     * getInt se encarga de recoger los datos de tipo int
     *
     * @return
     */
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

    /**
     * getString se encarga de recoger los datos de tipo String
     *
     * @return
     */
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

    /**
     * getBoolean se encarga de recoger los datos de tipo boolean
     *
     * @return
     */
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

    /**
     * getFloat se encarga de recoger los datos de tipo Float
     *
     * @return
     */
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

    /**
     * getLong se encarga de recoger los datos de tipo Long
     *
     * @return
     */
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

    /**
     * getShort se encarga de recoger los datos de tipo short
     *
     * @return
     */
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

    /**
     * getByte se encarga de recoger los datos de tipo Byte
     *
     * @return
     */
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

    /**
     * Metodo toString para imprimir lo que se le pase por parametro
     *
     * @param msg
     * @return
     */
    public String toString(String msg) {
        return msg;
    }
}
