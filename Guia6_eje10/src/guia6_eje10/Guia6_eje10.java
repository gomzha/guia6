package guia6_eje10;
import java.util.Scanner;

/**
 *
 * @author A308443
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Guia6_eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena;
    int limite , num, total = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el limite: ");
        limite  = leer.nextInt();
        
        while(limite >= total){
                    System.out.print("Ingrese un numero: ");
        total  = leer.nextInt() + total;
            System.out.println("Total hasta ahora: " + total);
        }
        
        System.out.println("Ya se superó el limite, total = " + total );
    }
}
