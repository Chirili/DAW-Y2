public class Ejercicio5 {
    public static void horarioColores() {
        /*
         *
         * Modifica el programa anterior añadiendo colores.
         * Puedes mostrar cada asignatura de un color diferente.
         *
         * */
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";


        System.out.println("\t\t\t\t\t\t\tHorario");
        System.out.println("\tHoras\t\tLunes\tMartes\tMiercoles\tJueves\tViernes");
        System.out.println("16:10-17:10\t\t" + ANSI_RED + "PROG\tPROG" + ANSI_RESET);
        System.out.println("17:10-18:10\t\t" + ANSI_RED + "PROG\tPROG\tPROG" + ANSI_RESET);
        System.out.println("18:10-19:10\t\t\t\t" + ANSI_RED + "PROG\tPROG" + ANSI_RESET);
        System.out.println("19:30-20:30\t\t\t\t" + ANSI_RED + "PROG" + ANSI_RESET);
        System.out.println("20:30-21:30\t\t\t\t" + ANSI_BLUE + "DAW" + ANSI_RESET);
        System.out.println("21:30-22:30\t\t\t\t" + ANSI_BLUE + "DAW" + ANSI_RESET);
    }
}
