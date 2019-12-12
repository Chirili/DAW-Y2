package pfecha;

import Utils.Utils;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Calendar;
import java.util.Locale;

/**
 * Existe una biblioteca llamada joda-time para java que es super util:
 * https://www.joda.org/joda-time/ habria estado bien verla en clase o que menos
 * haberla podido utilizar no la he usado ya que necesitas descargar el .jar e
 * importarlo, esta bilioteca nos habria ahorrado muchos quebraderos de cabeza
 * con las fechas
 *
 * @author Andres Carmona Lozano
 */
public class Fecha implements Cloneable {

    private static final String first_date = "1/1/1900";
    private static final String last_date = "31/12/2050";
    /**
     * Propiedades de la clase
     */
    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor predeterminado
     */
    Fecha() {
        this.dia = 31;
        this.mes = 1;
        this.año = 1900;
    }

    /**
     * Constructor parametrizado con el dia, el mes y el año
     *
     * @param dia
     * @param mes
     * @param año
     */
    Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /**
     * Este metodo se encarga de recoger los datos por teclado
     */
    public void leer() {
        Utils uts = new Utils();
        System.out.println("Aviso:");
        System.out.println("Si introduces un numero de dia, mes o año que no correspondan con los siguientes se establecerán sus numeros por defecto: 1 para mes y dia y 1900 para año");
        System.out.print("Introduce un dia del 1 al 31: ");
        this.dia = uts.getInt();

        System.out.print("Introduce un mes del 1 al 12: ");
        this.mes = uts.getInt();
        System.out.print("Introduce un año del 1900 al 2050: ");
        this.año = uts.getInt();
        valida();
    }

    /**
     * Metodo que comprueba si el año pasado por parametro es bisiesto
     *
     * @param año
     * @return de true o false en funcion si es bisiesto o no el año
     */
    public boolean bisiesto() {
        if ((this.año % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public int diasMes() {
        YearMonth ym = YearMonth.of(this.año, this.mes);
        return ym.lengthOfMonth();
    }

    /**
     * Metodo encargado de validar si la fecha se ha escrito correctamente: -
     * Primero se comprueba si el año es correcto sino se pone a 1900. - Segundo
     * se comprueba si el mes es correcto sino se pone a 1. - Tercero se
     * comprueba si el dia introducido es correcto con el mes introducido
     * incluso si es bisiesto el año y sino lo establece a 1
     */
    public void valida() {

        if (this.año < 1900 || this.año > 2050) {
            this.año = 1900;
        }
        if (this.mes < 1 || this.mes > 12) {
            this.mes = 1;
        }
        YearMonth ym = YearMonth.of(this.año, this.mes);
        System.out.println(ym.isValidDay(dia));
        if (ym.isValidDay(dia) == false) {
            this.dia = 1;
        }
    }

    /**
     * Pinta por pantalla la forma corta de la fecha de la clase
     *
     * @return devuelve un String con la forma corta de la clase
     */
    public String corta() {
        String fecha = this.dia + "-" + this.mes + "-" + this.año;
        return fecha;
    }

    /**
     * Metodo encargado de calcular los dias transcurridos entre la fecha
     * 1900/1/1 y la introducida por el usaurio
     *
     * @return devuelve un int con los dias transcurridos
     */
    public int diasTranscurridos() {
        LocalDate fDate = LocalDate.of(1900, 1, 1);
        LocalDate sDate = LocalDate.of(this.año, this.mes, this.dia);
        int dias = (int) DAYS.between(fDate, sDate);
        return dias;
    }

    /**
     * Devuelve el nombre del dia de la fecha de la clase
     *
     * @return devuelve un String con el nombre del dia
     */
    public String diaSemana() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, this.mes);
        c.set(Calendar.YEAR, this.año);
        c.set(Calendar.DAY_OF_WEEK, this.dia);
        Locale lc = new Locale("es", "ES");
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, lc);
    }

    /**
     * Pinta por pantalla la forma larga de la fecha
     *
     * @return devuelve un String con la fecha larga
     */
    public String larga() {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, this.mes - 1);
        c.set(Calendar.YEAR, this.año);
        c.set(Calendar.DAY_OF_WEEK, this.dia);
        Locale lc = new Locale("es", "ES");

        String mes = c.getDisplayName(Calendar.MONTH, Calendar.LONG, lc);

        String lFecha = diaSemana() + " " + this.dia + " de " + mes + " de " + this.año;

        return lFecha;
    }

    /**
     * Metodo encargado de calcular la cantidad de dias que pasan a la fecha por
     * defecto 1/1/1900, en funciona de la cantidad de dias que se le pasa por
     * teclado
     *
     * @param dias
     * @return devuelve la fecha con la cantidad de dias que han pasado
     */
    public Date fechaTras(int dias) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.YEAR, 1900);
        c.set(Calendar.DAY_OF_YEAR, 1);
        System.out.println("Fecha actual: " + new SimpleDateFormat("dd/M/yyyy").format(c.getTime()));
        c.add(c.DAY_OF_YEAR, dias);

        return c.getTime();
    }

    /**
     * Metodo encargado de comparar las dos fechas: la de la clase y la
     * introducida por el usuario
     *
     * @param fecha
     * @return devuelve true si son iguales o false si no lo son
     */
    public boolean igualQue(String fecha) {
        LocalDate fDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate sDate = LocalDate.parse(fecha);
        if (fDate.equals(sDate) == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo encargado de calcular los dias transcurridos entre la de la clase
     * y la fecha que se introduce por teclado
     *
     * @param fecha
     * @return devuelve un int con los numeros de dias transcurridos
     */
    public int diasEntre(String fecha) {
        LocalDate fDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate sDate = LocalDate.parse(fecha);
        int dias = (int) DAYS.between(fDate, sDate);
        return dias;
    }

    /**
     * Metodo que se encarga de recoger por teclado una nueva fecha que
     * introduce le usuario para usarla en comparaciones por otros metodos
     *
     * @return devuelve un String con la fecha ya formada
     */
    public String getUserDate() {
        Utils uts = new Utils();
        int day, month, year;
        System.out.println("Vas a introducir una nueva fecha para comparar: ");
        do {
            System.out.print("Introduce el dia entre 1 y 31: ");
            day = uts.getInt();
            if (day < 1 || day > 31) {
                System.out.println("Numero incorrecto: por favor introduce un numero entre el 1 y el 31");
            }
        } while (day < 1 || day > 31);
        do {
            System.out.print("Introduce un mes entre 1 y 12: ");
            month = uts.getInt();
            if (month < 1 || month > 12) {
                System.out.println("Numero incorrecto: por favor introduce un numero entre el 1 y el 12");
            }
        } while (month < 1 || month > 12);
        do {
            System.out.print("Introduce un año entre 1900 y 2050: ");
            year = uts.getInt();
            if (year < 1900 || year > 2050) {
                System.out.println("Numero incorrecto: por favor introduce un numero entre el 1900 y el 2050");
            }
        } while (year < 1900 || year > 2050);
        String createDate = year + "-" + month + "-" + day;
        return createDate;
    }

    /**
     * Metodo anterior que lo unico que hace es aumentar en 1 dia la fecha de la
     * clase
     */
    public void siguiente() {
        LocalDate actualDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate nextDay = actualDate.plusDays(1);

        this.mes = nextDay.getMonthValue();
        this.dia = nextDay.getDayOfMonth();
        this.año = nextDay.getYear();
    }

    /**
     * Metodo anterior que lo unico que hace es reducir en 1 dia la fecha de la
     * clase
     */
    public void anterior() {
        LocalDate actualDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate nextDay = actualDate.plusDays(-1);

        this.mes = nextDay.getMonthValue();
        this.dia = nextDay.getDayOfMonth();
        this.año = nextDay.getYear();
    }

    /**
     * Metodo encargado de comprobar si la fecha que se le pasa por parametro es
     * anterior a la de la clase
     *
     * @param fecha
     * @return devuele true si es anterior o false si no lo es
     */
    public boolean menorQue(String fecha) {
        LocalDate fDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate sDate = LocalDate.parse(fecha);
        if (fDate.isAfter(sDate) == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo encargado de comprobar si la fecha que se le pasa por parametro es
     * posterior a la de la clase
     *
     * @param fecha
     * @return devuelve true si es posterior o false si no lo es
     */
    public boolean mayorQue(String fecha) {
        LocalDate fDate = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate sDate = LocalDate.parse(fecha);
        if (fDate.isBefore(sDate) == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo cloneable
     *
     * @return del objeto Fecha clonado
     */
    public Object clone() {
        Object obj = null;
        try {
            obj = (Fecha) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    /**
     * Metodo toString para devolver la fecha en formato String
     *
     * @return de un String con la fecha de la clase
     */
    public String toString() {
        String fecha = String.valueOf(this.dia) + "/" + String.valueOf(this.mes) + "/" + String.valueOf(this.año);
        return fecha;
    }

    /*
    *   Getters y setters de los atributos de la clase
     */
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
