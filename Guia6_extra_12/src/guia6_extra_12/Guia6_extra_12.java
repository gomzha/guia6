/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra_12;

/**
 *
 * @author A308443
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 * 
 */
public class Guia6_extra_12 {


    public static void main(String[] args) {
        String numText;


        for(int i = 0 ; i< 1000; i++){
            numText = String.format("%0" + 3 +"d", i).replace("3", "E");
            System.out.println(numText.charAt(0) + "--" + numText.charAt(1) + "--" + numText.charAt(2));
            
            
        }
    }
}