/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, valores[]; //un solo arreglo --> valores
	int[] datos, x, y, z;//Todas las sig variables son arreglos
	int[] arreglo = new int[100]; //Los objetos no existen hasta que se crean (new)
	//Arreglo de 20 

	//ciclo for para manejar un arreglo
	//La primer posición de un arreglo es 0
	for (int i = 0; i < arreglo.length; i++){//Asignar valores
            arreglo[i] = (int)(Math.random() * 100);
        }
        //System.out.println(arreglo); SOLO IMPRIME LA DIRECCIÓN EN MEMORIA
        for(int i = 0; i < arreglo.length; i++){//Leer todos los valores
            System.out.print(arreglo[i] + " - ");
        }
        //Herramientas de arreglo 
        //Tamaño --> lenght
        //arreglo.length
    }
    
}
