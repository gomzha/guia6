/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_eje19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A308443 Realice un programa que compruebe si una matriz dada es anti
 * simétrica. Se dice que una matriz A es anti simétrica cuando ésta es igual a
 * su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica
 * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Guia_Eje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean antiS = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double result = 0;

        int v[][] = new int[3][3];

        int vt[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresar num a cargar: ");
                v[i][j] = (leer.nextInt());
            }
        }
        System.out.println("Vector = " + Arrays.deepToString(v));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vt[j][i] = v[i][j];
            }
        }
        System.out.println("Vector = " + Arrays.deepToString(vt));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if ((vt[i][j] + v[i][j]) != 0) {
                    System.out.println("No es anti simétrica");
                    antiS = false;
                }
            }
        }
        if (antiS) {
            System.out.println("es anti simétrica");

        }
    }
}
