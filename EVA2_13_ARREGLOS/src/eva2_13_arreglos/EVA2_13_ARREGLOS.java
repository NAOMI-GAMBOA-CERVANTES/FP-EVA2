/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_13_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] --> indica que es un arreglo de enteros
        //new int[10] --> crea el arreglo con 10 espacios para enteros
        int[] arreglo = new int [10];
        arreglo[0] = 100;//ponemos 100 en el entero en la posición cero
        arreglo[9] = 900; //última posición (10 -1)
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        System.out.println(arreglo[6]);
        System.out.println(arreglo[7]);
        System.out.println(arreglo[8]);
        System.out.println(arreglo[9]);
    }
    
}
