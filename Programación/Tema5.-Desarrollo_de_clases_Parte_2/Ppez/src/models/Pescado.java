package models;

/**
 *
 * @author Andres
 */
public class Pescado extends Pez {
    
    public Pescado(){
        super();
    }
    
    public Pescado(String nombre){
        super(nombre);
    }
    
    public Pescado(Pescado p){
        super(p);
    }
}