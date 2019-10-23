/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author usuario
 */
public class Ejercicio22 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = calcBodyMassIndex();
        System.out.print(str);
    }
    
    public String calcBodyMassIndex(){
        
        double weight,height,result;
        
        System.out.println("Pasame un peso en kg y una altura para calcular tu IMC(Indice de Masa Corporal): ");
        
        System.out.print("Introduce tu altura: ");
        height = uts.getDouble();
        
        System.out.print("Introduce tu peso: ");
        weight = uts.getDouble();
        
        if (weight > 0 && height > 0){
            result = weight / Math.pow(height, 2);
            
            if (result < 16){
                System.out.println("Criterio de ingreso en hospital");
            }else if (result >= 16 && result < 17){
                System.out.println("Infrapeso");
            }else if (result >= 17 && result < 18){
                System.out.println("Peso bajo");
            }else if (result >= 18 && result < 25 ){
                System.out.println("Peso normal(Saludable)");
            }else if (result >=25 && result < 30){
                System.out.println("Sobrepeso (Obesidad de grado I)");
            }else if (result >= 30 && result < 35){
                System.out.println("Sobrepeso Crónico(Obesidad de grado II)");
            }else if (result >= 35 && result < 40){
                System.out.println("Obesidad Premorbida (Obesidad de grado III)");
            }else if (result > 40){
                System.out.println("Obesidad Morbida(Obesidad de grado IV)");
            }
        }else {
            System.out.println("Error algun dato que has introducido no es correcto");
        }
        
        
        return "\n";
    }
}
