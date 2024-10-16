/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int califa, sumacali;
        //Inicializar el acumulador
        sumacali = 0;
        for(int i= 1; i <= 10; i++){ //Se repite 10 veces
            System.out.println("Estudiante # " + i);
            System.out.println("¿Cuál es tu calificación?");
            califa = cap.nextInt();
            cap.nextLine();     
            
            //acumular las calificaciones
            sumacali = sumacali + califa;
            System.out.println("sumacalifa = " + sumacali);//sumatoria
            }
            //CALCULAR EL PROMEDIO:
            //DIVISIONES EN JAVA --> SI DIVIDIMOS ENTEROS
            //SI DIVIDIMOS ENTEROS EL RESULTADO SERÁ ENTERO

            int promedio = (int) (sumacali / 10.0);//Punto decimal
            System.out.println("Promedio ="+ promedio);//sumatoria

    }
}
