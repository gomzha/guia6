/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A308443 18. Realizar un programa que rellene un matriz de 4 x 4 de
 * valores aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta
 * de una matriz A se denota por B y se obtiene cambiando sus filas por columnas
 * (o viceversa).
 */
public class Guia6_Eje18 {

    public static void main(String[] args) {
        int v[][] = new int[4][4];
        int vt[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                v[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Vector = " + Arrays.deepToString(v));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vt[j][i] = v[i][j];
            }
        }
        System.out.println("Vector = " + Arrays.deepToString(vt));
    }
}
