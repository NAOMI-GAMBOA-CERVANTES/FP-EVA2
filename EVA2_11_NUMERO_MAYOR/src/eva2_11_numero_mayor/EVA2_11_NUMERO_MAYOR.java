/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner cap = new Scanner(System.in);
        //Solicitar un número entero

        while(true){
            System.out.println("Escriba número entero: ");
            num = cap.nextInt();
            //Dejar de preguntar cuando se introduzca un -1
            if(num == -1)
                break;
        }
        
        System.out.println("El número más grande fue: ");
        
    }
    
}
