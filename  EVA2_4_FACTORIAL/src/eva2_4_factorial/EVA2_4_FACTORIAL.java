/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base;
         Scanner cap = new Scanner(System.in);
        
        System.out.println("Base:");
        base = cap.nextInt();
        cap.nextLine();
        int resu = 1;
        for(int i= 1; i <= base; i++){int facto= base * i;
            resu = facto * i;
        
        System.out.println("i = "+ i);
        }
        System.out.println("El resultado es: " + resu);
    }
    
}
