/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int califas[];
        String nombres [];
	Scanner cap = new Scanner (System.in);
        
	System.out.println("Cantidad de calificaciones a capturar:");
	cantidad = cap.nextInt();
        califas = new int [cantidad];
        nombres = new String [cantidad];
        cap.nextLine();
	califas = new int [cantidad]; //Arreglo de tamaño de lo que se capturó
	for (int i = 0; i < califas.length; i++){
            System.out.println("Nombre estudiante #" + i ); 
            nombres[i] = cap.nextLine();
            
            System.out.println("Calificación estudiante #" + i ); 
            califas[i] = cap.nextInt();
            cap.nextLine();
    }
        //IMPRIMIR CALIFICACIONES
        for (int i = 0; i < califas.length; i++){
            System.out.print(nombres[i] + ": " + califas[i] + " - ");
        }
    
}
}