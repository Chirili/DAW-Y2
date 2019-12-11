package zapato;

/**
 *
 * @author Andres
 */
public class Zapato {

    private static final double MODELO_EJECUTIVO = 34.50;
    private static final double MODELO_PREMIER = 29.95;
    private static final double MODELO_EMPERADOR = 24.60;

    private int talla;
    private String color;
    private String modelo;
    private double precio;

    Zapato() {
        this.talla = 0;
        this.color = "";
        this.modelo = "";
        this.precio = 0;
    }

    Zapato(Zapato z) {
        this.talla = z.talla;
        this.color = z.color;
        this.modelo = z.modelo;
        this.precio = z.precio;
    }

    public void calcularPrecio(int talla, int modelo) {
        switch (modelo) {
            case 1:
                this.modelo = "Modelo Ejecutivo";
                this.precio = MODELO_EJECUTIVO;
                break;
            case 2:
                this.modelo = "Modelo Premier";
                this.precio = MODELO_PREMIER;
                break;
            case 3:
                this.modelo = "Modelo Emperador";
                this.precio = MODELO_EMPERADOR;
                break;
        }
        switch(talla){
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

    @Override
    public String toString() {
        return "";
    }

    /*
    *  Getters y setters
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
}
