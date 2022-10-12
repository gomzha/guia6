/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A308443 Recorrer un vector de N enteros contabilizando cuántos
 * números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Guia6_Eje17 {

    public static void main(String[] args) {
        int tamV, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        String opcion, numText;
        boolean flag = false;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector:  ");
        tamV = leer.nextInt();
        int v[] = new int[tamV];

        for (int i = 0; i < tamV; i++) {
            v[i] = (int) (Math.random() * 100000);
        }

        System.out.println("Vector = " + Arrays.toString(v));

        for (int i = 0; i < tamV; i++) {
            numText = String.valueOf(v[i]);
            if (numText.length() == 1) {
                cont1++;
            }
            if (numText.length() == 2) {
                cont2++;
            }
            if (numText.length() == 3) {
                cont3++;
            }
            if (numText.length() == 4) {
                cont4++;
            }
            if (numText.length() == 5) {
                cont5++;
            }

        }
        System.out.println("Con 1 posición hay un total de: " + cont1);
        System.out.println("Con 2 posición hay un total de: " + cont2);
        System.out.println("Con 3 posición hay un total de: " + cont3);
        System.out.println("Con 4 posición hay un total de: " + cont4);
        System.out.println("Con 5 posición hay un total de: " + cont5);

    }
}
