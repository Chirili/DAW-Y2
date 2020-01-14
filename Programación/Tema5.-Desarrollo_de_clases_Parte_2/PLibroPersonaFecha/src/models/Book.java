package models;

import Utils.Utils;
import java.awt.AWTException;

/**
 *
 * @author Andres
 */
public class Book {

    private String bookTitle;
    private Person publisher;
    private String isbn;
    private int pages;
    private int edicion;
    private Date fechaEdicion;
    private Place place;

    //Constructor por defecto
    public Book() {
        this.bookTitle = "Sin titulo";
        this.publisher = new Person("NombreAutor", "Ape1", "Ape2");
        this.isbn = "";
        this.pages = 1;
        this.edicion = 2;
        this.fechaEdicion = new Date("DiaSemana", "NombreMes", 1990, 1);
        this.place = new Place("NombrePais", "Nombreciudad");
    }

    //Constructor parametrizado
    public Book(String bookTitle, Person publisher, String isbn, int pages, int edicion, Date fechaEdicion, Place place) {
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

    public void getData() throws AWTException {
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
        publisher.getPersonData();

        uts.clearScreen();

        //Recoger informacion de Date en su metodo correspondiente
        fechaEdicion.getDateData();

        uts.clearScreen();

        //Informacion del lugar
        place.getPlaceData();
    }

    /**
     * Metodo toString para pintar todos los datos por pantalla
     *
     * @return
     */
    @Override
    public String toString() {
        return "Titulo: " + this.bookTitle + "\n" + this.edicion + "a. edicion\n" + "Autor: " + this.publisher + "\nISBN: " + this.isbn + "\n" + this.place + ", " + this.fechaEdicion + "\nNumero de paginas: " + this.pages;
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

    public Person getPublisher() {
        return publisher;
    }

    public void setPublisher(Person publisher) {
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

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
