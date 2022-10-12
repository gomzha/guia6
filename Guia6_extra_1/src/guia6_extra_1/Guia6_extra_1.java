/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra_1;

import java.util.Scanner;

/**
 *
 * @author A308443
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Guia6_extra_1 {

    public static void main(String[] args) {
        int minutos, dia, horas;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        minutos = pedirMinutos(leer);
        convertirTiempo(minutos);
        
    }

    public static int pedirMinutos(Scanner leer) {
         System.out.println("Ingresar minutos: ");
        return leer.nextInt();
    }

    public static void convertirTiempo(int minutos) {
                int dia, diaResto;
        dia = Math. round(minutos/(1440*1)); 
        diaResto = (minutos%(1440*1))/60; 

        System.out.println("Dias: " + dia + " Horas: " + diaResto);  
    }
    
}
