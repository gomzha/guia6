package guia6_eje5;
import java.util.Scanner;


/**
 *
 * @author A308443
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Guia6_eje5 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        
        System.out.println("Su raíz cuadrada es: " + Math.sqrt(num));
        System.out.println("Su doble es: " + (num*2));
        System.out.println("Su doble es: " + (num*3));

        
        
    }
    
}
