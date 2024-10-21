/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] diasSemana = new String[7];
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miércoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sábado";
        //IMPRIMIR
        
        for (int i = 0; i < diasSemana.length; i++){//Leer todos los valores
            System.out.println(diasSemana[i]);
        }
    }
    
}
