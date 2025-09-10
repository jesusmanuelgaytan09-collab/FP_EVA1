/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_calificacion;

import java.util.Scanner;


 
public class EVA1_12_CALIFICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la calificacion");
        califa = input.nextInt();
        if(califa >=70){
            System.out.println("Acreditado");
        }else{
            System.out.println("NO ACREDITADO");}
            
            
         
        
    }
    
}
