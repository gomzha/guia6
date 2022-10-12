/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje1;
import java.util.Scanner;


/**
 *
 * @author A308443
 * /*
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
public class Guia6_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese num: ");
        num  = leer.nextInt();
        
        System.out.println("Ingrese num2: ");
        num2 = leer.nextInt();
        
        System.out.println("El total es: " + (num + num2));
        // TODO code application logic here
    }
    
}
