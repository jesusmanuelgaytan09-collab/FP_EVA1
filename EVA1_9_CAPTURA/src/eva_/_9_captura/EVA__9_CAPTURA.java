/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_._9_captura;

import java.util.Scanner;

/**
 *
 * @author range
 */
public class EVA__9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        System.out.println("INTRODUCE TU NOMBRE COMPLETO: ");
        //CAPTURA DE DATOS:
        Scanner input = new Scanner(System.in); //CREA EL SCANNER
        nombre = input.nextLine(); //CAPTURA TEXTO (nextline())
        
       
        
        nombre = input.nextLine();
        System.out.println("la edad es: ");
        edad = input.nextInt();
        System.out.println("captura tu promedio de preparatoria: ");
        promedio = input.nextDouble();
    }
    
}
