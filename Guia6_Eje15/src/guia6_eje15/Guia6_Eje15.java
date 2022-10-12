/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje15;

/**
 *
 * @author A308443
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Guia6_Eje15 {

    public static void main(String[] args) {

        int[] arregloV  = new int[99]; //declaro arreglo de 100 posiciones con contenido de enteros
        

        for(int i = 1; i<100;i++){
            arregloV[i-1]=i;
                                System.out.println("A");      

            
        }
                                        System.out.println("B");      

        for(int i = 99; i>0;i--){
            System.out.println("Posicion del arreglo " + (i-1) + "= "  + arregloV[(i-1)]);            
        }
        
    }
    
}
