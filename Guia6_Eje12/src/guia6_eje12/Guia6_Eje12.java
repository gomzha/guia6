/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje12;

import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class Guia6_Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int correcto = 0, incorrecto = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.print("Ingrese la cadena: ");
            cadena = leer.nextLine();
            if (cadena.length() == 5) {
                if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                    correcto++;
                } else if (cadena.equals("&&&&&")) {
                } else {
                    incorrecto++;
                }
            } else {
                incorrecto++;
            }
        } while (!cadena.equals("&&&&&"));

        System.out.println("CORRECTO = " + correcto);
        System.out.println("INCORRECTO = " + incorrecto);

    }

}
