/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

/**
 *
 * @author usuario
 */
public class minumero {

    public void esVampiro(int nChoice) {

        int result1,number,finalResult;
        String n1,n2,n3,result;
        
        for (int i = 10; i <= 99; i++) {
            for (int j = 99; j >= 10; j--) {
                result1 = i * j;
                
                if (nChoice == result1) {
                    
                    n2 = String.valueOf(i);
                    n3 = String.valueOf(j);
                    result = n2 + n3;
                    finalResult = Integer.parseInt(result);
                    number = compareNumbers(nChoice,finalResult);
                    System.out.println("Vampiro");
                }
            }
        }
    }

    public int compareNumbers(int nChoice,int finalResult) {
        int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, number,digits,part1,part2,d1,d2;
        
        for (int n = 0; n <= 3; n++) {
            part1 = nChoice % 10;
            nChoice = nChoice / 10;
            switch (part1) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
                case 7:
                    c7++;
                    break;
                case 8:
                    c8++;
                    break;
                case 9:
                    c9++;
                    break;

            }
        }
        return 0;
    }
}
