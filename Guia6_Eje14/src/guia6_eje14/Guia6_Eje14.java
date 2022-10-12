/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_eje14;

import java.util.Scanner;

/**
 *
 * @author A308443 Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € opcion 1 1.28611 $ es un 1 € opcion 2 129.852 yenes
 * es un 1 € opcion 3
 */
public class Guia6_Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantEuros;
        String opcion;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de euros:  ");
        cantEuros = leer.nextDouble();

        System.out.println("Ingrese la conversión que necesita realizar:  ");
        System.out.println("1 - libras  ");
        System.out.println("2 - pesos  ");
        System.out.println("3 - yenes  ");
        opcion = leer.next();
        cotizo(opcion, cantEuros);

    }

    public static void cotizo(String opcion, double cantEuros) {
        if ("1".equals(opcion)) {
            System.out.println("El valor de cambio sería: " + (cantEuros*0.86));
        }
        if ("2".equals(opcion)) {
            System.out.println("El valor de cambio sería: " +(cantEuros*1.28611));
        }
        if ("3".equals(opcion)) {
            System.out.println("El valor de cambio sería: " + (cantEuros*129.852));
        }

    }

}
