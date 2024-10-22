/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
        int valor, posi = -1;
        Scanner cap = new Scanner (System.in);
        System.out.println("VALOR A BUSCAR: ");
        valor = cap.nextInt();
        for (int i = 0; i < datos.length; i++){
            if(valor == datos[i]){
                //Regresar la posición
                posi = i;
                //Detener el ciclo
                break;
            }
        }
        if(posi == -1){
            System.out.println("VALOR NO ENCONTRADO");
            
        }else
            System.out.println("El valor esta en la posición " + posi);
    }
    
}
