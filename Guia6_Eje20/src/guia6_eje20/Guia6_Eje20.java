/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A308443
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class Guia6_Eje20 {


    public static void main(String[] args) {
        boolean magic = false, bandIgualitaria = false;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double sumTot = 0 , sumAnt =0;

        int v[][] = new int[3][3];

        int vt[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresar num a cargar: ");
                v[i][j] = (leer.nextInt());
            }
        }
        System.out.println("Vector = " + Arrays.deepToString(v));
        
        //HORIZONTAL
        for (int i = 0; i < 3; i++) {
            sumTot = 0;
            for (int j = 0; j < 3; j++) {
                sumTot = sumTot + v[i][j];
            }
            if (!magic){
                sumAnt = sumTot;
                        bandIgualitaria = true;
                        magic = true;
                   
            }else if((sumAnt != sumTot) &&(bandIgualitaria == true)){
                bandIgualitaria = false;
            }
        }
        
        
        //vertical 
        for (int j = 0; j < 3; j++) {
            sumTot = 0;
            for (int i = 0; i < 3; i++) {
                sumTot = sumTot + v[i][j];
            }
            if (sumAnt != sumTot){
               bandIgualitaria = false;
            }
        }      	
        
        	//diagonal izquierda a derecha

        sumTot = 0;

         for (int j = 0; j < 3; j++) {
            sumTot = sumTot + v[j][j];

            }
            if (sumAnt != sumTot){
               bandIgualitaria = false;
            }
             	
            
            	//diagonal derecha a izquierda

            	sumTot = 0;

                     for (int j = 0; j < 3; j++) {
			sumTot = sumTot + v[3-j-1][j];

            }
                     
            if (sumAnt != sumTot){
               bandIgualitaria = false;
            }
            
            System.out.println("La suma total es: " + sumTot);
            System.out.println("Es una matriz mágica?: " + bandIgualitaria);

        

    }
}