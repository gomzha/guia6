/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A308443 Realizar un algoritmo que rellene un vector de tamaño N con
 * valores aleatorios y le pida al usuario un numero a buscar en el vector. El
 * programa mostrará donde se encuentra el numero y si se encuentra repetido
 */
public class Guia6_Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamV, numABusc;
        String opcion;
        boolean flag = false;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector:  ");
        tamV = leer.nextInt();
        int v[] = new int[tamV];

        for (int i = 0; i < tamV; i++) {
            v[i] = (int) (Math.random() * 100);
        }

        System.out.println("Vector = " + Arrays.toString(v));
        System.out.println("Ingrese el num a buscar en el vector: ");
        numABusc = leer.nextInt();

        for (int i = 0; i < tamV; i++) {
            if (numABusc == v[i]) {
                System.out.println("Se econtró el numero en la posición del vector:: " + i);
                flag = true;

            }

        }
            if (!flag) {
                System.out.println("NO SE ENCONTRÓ NINGUN REGISTRO");
            }

    }
}
