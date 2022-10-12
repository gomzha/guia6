package guia6_eje7;
import java.util.Scanner;

/**
 *
 * @author A308443
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
public class Guia6_eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String cadena;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cadena: ");
        cadena = leer.nextLine();
        if(cadena.equals("eureka")){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        } 
    }
}
