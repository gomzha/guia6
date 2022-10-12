package guia6_eje13;

import java.util.Scanner;

/**
 *
 * @author A308443 Dibujar un cuadrado de N elementos por lado utilizando el
 * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se
 * deberá dibujar lo siguiente: * * * * * * * *
 */
public class Guia6_Eje13 {

    public static void main(String[] args) {
        int cantElem;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        cantElem = leer.nextInt();

        for (int i = 0; i <= cantElem; i++) {
            if (i == 0) {
                for (int j = 0; j <= cantElem; j++) {
                    if (j == cantElem) {
                        System.out.println("*");
                    } else {
                        System.out.print("*  ");
                    }
                }
            } else {
                if (i == cantElem) {
                    for (int j = 0; j <= cantElem; j++) {
                        System.out.print("*  ");
                    }
                } else {
                    for (int j = 0; j <= cantElem; j++) {
                        if (j == 0) {
                            System.out.print("*");
                        } else if (j == cantElem) {
                            System.out.println("  *");
                        } else {
                            System.out.print("   ");
                        }
                    }

                }
            }
            
        }
        System.out.println("");

    }
}
