/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía6_eje1corr;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class Guía6_eje1Corr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "gonza sanchez";
        char caracter;
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
        
        double suma, resta, multi, div;
        int edad =32;
        suma = 5+5;
        resta = 3-1;
        System.out.println("su nombre es: " + nombre + " y tiene " + edad + " años");
        
        nombre = "gonza 2";
        System.out.println("su nombre es: " + nombre);

        
        Scanner leer = new Scanner(System.in);
        double vardouble = leer.nextDouble();
        boolean varboolean = leer.nextBoolean();
        String  cad = leer.nextLine();
        System.out.println("vardouble: " + varboolean);

        
        int edad2 = leer.nextInt();
        System.out.println("edad2 es: " + edad2);

        
                

        
        
                


    }
    
}
