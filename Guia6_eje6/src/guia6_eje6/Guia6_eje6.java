
package guia6_eje6;
import java.util.Scanner;

/**
 *
 * @author A308443
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Guia6_eje6 {

    public static void main(String[] args) {
   int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        
        if(num == 0){
            System.out.println("El cero no es par");
            
        }else if(num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }

    }
    
}
