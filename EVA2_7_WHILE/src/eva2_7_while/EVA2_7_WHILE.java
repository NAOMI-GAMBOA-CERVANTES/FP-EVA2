/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_while;

/**
 *
 * @author invitado
 */
public class EVA2_7_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Imprimir los números del 1 al 10
        int val = 1;
        while(val <= 10){ //While --> Mientras (esto sea verdad){repito esto}
            System.out.print(val + " - ");
            val++;
        }
        System.out.println(" ");
        val = 1;
        do{
            System.out.print(val + " - ");
            val++;
        }while(val <= 10); //REPETIR{INSTRUCCIONES}MIENTRAS{ESTO SE CUMPLA}
    }
    
}
