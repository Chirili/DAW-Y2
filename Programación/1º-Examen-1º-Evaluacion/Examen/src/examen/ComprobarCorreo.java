/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author usuario
 */
public class ComprobarCorreo {

    private boolean isValid;

    public void checkEmail(String email) {
        boolean aroba = false, point = false, domain = false;
        char takeArroba = 0, takePoint = 0;
        String checker = "";
        String domainName;
        int emailLength, pchecker;
        String arroba = "";
        int counter = 0;
        emailLength = email.length();//Recoge la longitud del email
        /*
        * Mientras que la longitud del email sea mayor a cero se ira
        * ejecutando lo que esta dentro del while
        */
        while (emailLength > 0) {
            /*
            * checker coge el email y los va desmontando 1 a 1,
            * despues arroba coge y desmonta a su ves a checker
            *  esto lo he hecho por si se encuentra el arroba que se verifique
            */
            checker = email.substring(counter);
            arroba = checker.substring(1);
            /**
            * Si la longitud de arroba es mayor a cero se ejecuta lo que esta dentro del if
            * lo unico que hace el if es coger el char de la primera posicion y comprobar que es
            * el arroba o el punto si no hay nada para que vamos a seguir extrayendo caracteres
            */
            if(arroba.length() > 0){
            takeArroba = arroba.charAt(0);
            takePoint = arroba.charAt(0);
            }
            /*
            * Si el caracter que coge takeArroba es el @ pues tenemos el arroba
            */
            if (takeArroba == '@') {
                aroba = true;
            }
            /*
            * Si el caracter que coge takePoint es el @ pues tenemos el punto
            */
            if (takePoint == '.') {
                point = true;
                domainName = arroba.substring(1, arroba.length());//Esta variable se encarga de recoger lo que esta despues del punto
                /*
                *   Si lo que esta detras del punto es com o es, el email es correcto sino es incorrecto
                */
                if (domainName.equals("com") || domainName.equals("es")) {
                    domain = true;
                    if (aroba == true && point == true && domain == true) {
                        isValid = true;
                    }
                    break;
                }
            }
            /*
            * Contadores para que acabe el bucle while
            */
            emailLength--;
            counter++;
        }
    }

    public void checkIfValid() {
        if (isValid == true) {
            System.out.println("El email introducido es correcto");
        }else {
            System.out.println("El email introducido no es correcto");
        }
    }
}
