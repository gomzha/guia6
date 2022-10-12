package guia6_eje11;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author A308443 Realizar un programa que pida dos números enteros positivos
 * por teclado y muestre por pantalla el siguiente menú:
 *
 * MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
 * se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
 * 5, en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
 * el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
 * vuelve a mostrar el menú.
 */
public class Guia6_eje11 {

    public static void main(String[] args) {
        String preg = "N";
        int num1, num2, opcion;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese num 1: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese num 2: ");
        num2 = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("multi: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("divi: " + (num1 / num2));
                    break;
                case 5:
                    System.out.print("Está seguro que quiere salir? (S/N): ");
                    preg = toUpperCase(leer.next());
                    if (preg.equals("S")){
                        System.out.println("CHAU");
                    }                     
                    break;
                default:
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("opción ingresada incorrecta");
                    }
            }
        } while (!"S".equals(preg));
    }
}
