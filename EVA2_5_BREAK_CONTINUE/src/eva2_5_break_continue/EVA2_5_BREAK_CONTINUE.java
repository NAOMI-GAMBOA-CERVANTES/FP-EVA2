/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_break_continue;

/**
 *
 * @author invitado
 */
public class EVA2_5_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BREAK --> Termina el ciclo completamente
        //CONTINUE --> Interrumpe la repetición sctual
        for(int i = 1; i <= 10; i++){
            if(i == 8)
                break;
            System.out.print(i+ " - "); 
        }
        System.out.println("");
        for(int i = 1; i <= 10; i++){
            if(i == 8)
                continue;
            System.out.print(i+ " - "); 
        }
    }
    
}
