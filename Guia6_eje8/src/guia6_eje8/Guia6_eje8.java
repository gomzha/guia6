package guia6_eje8;

import java.util.Scanner;

/**
 *
 * @author A308443 Realizar un programa que solo permita introducir solo frases
 * o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de
 * largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
 * caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
 * Lenght() en Java.
 */
public class Guia6_eje8 {

    public static void main(String[] args) {
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cadena: ");
        cadena = leer.nextLine();
        if (cadena.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
