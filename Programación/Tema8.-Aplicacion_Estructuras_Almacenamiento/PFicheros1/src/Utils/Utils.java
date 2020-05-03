package Utils;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.Line;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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

    public static int randomNumberBW12() {
        return (int) (Math.random() * 2);
    }

    public boolean checkDNI(String dni) {
        if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
            return false;
        } else {
            return true;
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

    public static String getString() {
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

    public String toString(String msg) {
        return msg;
    }

    public String selectFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Selecciona un archivo del arbol de directorios");
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().toString();
        } else {
            System.out.println("No se ha realizado ningun seleccion... ");
            return null;
        }
    }

    public void readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }

    public void selectDirectory() throws InterruptedException, InvocationTargetException {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Elige un directorio");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
    }
}
