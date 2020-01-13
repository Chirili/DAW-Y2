package models;

import Utils.Utils;
import java.awt.AWTException;
/**
 *
 * @author Andres
 */
public class Book {

    private String bookTitle;
    private Persona publisher;
    private String isbn;
    private int pages;
    private int edicion;
    private Fecha fechaEdicion;
    private Place place;

    //Constructor por defecto
    public Book() {
        this.bookTitle = "Sin titulo";
        this.publisher = new Persona("NombreAutor","Ape1","Ape2");
        this.isbn = "";
        this.pages = 1;
        this.edicion = 2;
        this.fechaEdicion = new Fecha("DiaSemana","NombreMes",1990,1);
        this.place = new Place("NombrePais","Nombreciudad");
    }

    //Constructor parametrizado
    public Book(String bookTitle, Persona publisher, String isbn, int pages, int edicion, Fecha fechaEdicion, Place place) {
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
        this.edicion = edicion;
        this.fechaEdicion = fechaEdicion;
        this.place = place;
    }
    
    //Constructor copia
    Book(Book b) {
        this.bookTitle = b.bookTitle;
        this.publisher = b.publisher;
        this.isbn = b.isbn;
        this.pages = b.pages;
        this.edicion = b.edicion;
        this.fechaEdicion = b.fechaEdicion;
        this.place = b.place;
    }

    
    public void getData() throws AWTException{
        Utils uts = new Utils();
        
        // Informacion de Book
        System.out.print("¿Cual es el titulo del libro?: ");
        String bt = uts.getString();
        this.bookTitle = bt;
        
        System.out.print("¿En que edicion se encuentra el libro?: ");
        int eb = uts.getInt();
        this.edicion = eb;
        
        System.out.print("¿De cuantas paginas se compone el libro?: ");
        int pb = uts.getInt();
        this.pages = pb;
        
        System.out.print("¿Cual es el ISBN del libro?: ");
        String ib = uts.getString();
        this.isbn = ib;
        
         uts.clearScreen();

        //Informacion de Persona
        System.out.println("Informacion del autor del libro: ");
        System.out.print("Nombre del autor: ");
        String an = uts.getString();
        publisher.setName(an);
        
        System.out.print("Primer apellido del autor: ");
        String afn = uts.getString();
        publisher.setFirstName(afn);
        
        System.out.print("Segundo apellido del autor: ");
        String asn = uts.getString();
        publisher.setLastName(asn);
        
        uts.clearScreen();
        
        //Informacion de la Fecha
        System.out.println("Informacion sobre la fecha de edicion del libro: ");
        System.out.println("Dia de la semana(EJ: Lunes): ");
        String dw = uts.getString();
        fechaEdicion.setDayOfWeek(dw);
        
        System.out.print("Nombre del mes: ");
        String nm = uts.getString();
        fechaEdicion.setNameOfMonth(nm);
        
        System.out.print("Dia del mes: ");
        int d = uts.getInt();
        fechaEdicion.setDay(d);
        
        System.out.print("Año de edicion: ");
        int y = uts.getInt();
        fechaEdicion.setYear(y);
        
    }
    /**
     * Metodo toString para pintar todos los datos por pantalla
     *
     * @return
     */
    @Override
    public String toString() {
        return "Titulo: " + this.bookTitle + "\n" + this.edicion + "a. edicion\n" + "Autor: " + this.publisher + "\n ISBN: " + this.isbn + "\n" + this.place + ", " + this.fechaEdicion + "\n Numero de paginas: " + this.pages;
    }

    /**
     * Getters y setters de la clase Book
     *
     * @return
     */
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Persona getPublisher() {
        return publisher;
    }

    public void setPublisher(Persona publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
