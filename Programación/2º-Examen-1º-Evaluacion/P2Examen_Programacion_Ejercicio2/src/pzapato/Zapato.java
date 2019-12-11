package pzapato;

/**
 *
 * @author Andres Carmona Lozano
 */
public class Zapato {

    //Constantes de la clase zapato
    private static final double MODELO_EJECUTIVO = 34.50;
    private static final double MODELO_PREMIER = 29.95;
    private static final double MODELO_EMPERADOR = 24.60;

    //Atributos de la clase zapato
    private int talla;
    private String color;
    private String modelo;
    private double precio;

    //Contructor por defecto
    Zapato() {
        this.talla = 0;
        this.modelo = "";
        this.color = "";
        this.precio = 0;
    }

    //Constructor parametrizado
    Zapato(int talla, String color, String modelo, double precio) {
        this.talla = talla;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    //Constructor copia
    Zapato(Zapato z) {
        this.talla = z.talla;
        this.modelo = z.modelo;
        this.color = z.color;
        this.precio = z.precio;
    }

    /**
     * Metodo calcular precio que en funcion del modelo que se le pase por
     * parametro y el precio, calcula el precio correspondiente al zapato
     *
     * @param modelo
     * @param talla
     */
    public void calcularPrecio(String modelo, int talla) {
        switch (modelo.toUpperCase()) {
            case "A":
                this.modelo = "Modelo ejecutivo";
                this.precio = this.MODELO_EJECUTIVO;
                break;
            case "B":
                this.modelo = "Modelo Premier";
                this.precio = this.MODELO_PREMIER;
                break;
            case "C":
                this.modelo = "Modelo Emperador";
                this.precio = this.MODELO_EMPERADOR;
                break;
        }
        switch (talla) {
            case 1:
                this.talla = 39;
                this.precio += 0;
                break;
            case 2:
                this.talla = 40;
                this.precio += 10;
                break;
            case 3:
                this.talla = 41;
                this.precio += 20;
                break;
        }
    }

    /**
     * Metodo toString para imprimir por pantalla los datos correspondientes al
     * zapato
     *
     * @return del precio de venta del zapato
     */
    @Override
    public String toString() {
        System.out.println("El modelo de zapato elegido es: " + this.modelo);
        System.out.println("La talla del zapato elegido es: " + this.talla);
        return "El precio de venta final es de: " + this.precio;
    }

    /*
    *   Getters y setters de los atributos de la clase zapato
     */
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
