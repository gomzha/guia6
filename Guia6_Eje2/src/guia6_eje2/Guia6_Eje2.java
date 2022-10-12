/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje2;
import java.util.Scanner;

/**
 *
 * @author A308443
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
public class Guia6_Eje2 {

    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar su nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        


    }
    
}
