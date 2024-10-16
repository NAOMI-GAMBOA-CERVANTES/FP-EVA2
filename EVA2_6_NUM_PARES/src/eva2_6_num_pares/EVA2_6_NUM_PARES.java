/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_num_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_NUM_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner cap= new Scanner(System.in);
        System.out.println("Inicio: ");
        num1 = cap.nextInt();
        cap.nextLine();
        System.out.println("Fin: ");
        num2 = cap.nextInt();
        cap.nextLine();
        for (int i = num1; i <= num2; i++){
            int modulo = i % 2; //Residuo de la division
            if (modulo !=0)//Verdad = sea impar para detener la
                continue;
            System.out.print(i +" - ");
        }
        System.out.println("");
        for (int i = num1; i <= num2; i++){
            int modulo = i % 2; //Residuo de la division
            if (modulo ==0)
                continue;
            System.out.print(i +" - ");
        }
        
        
    }
    
}
