package guia6_eje21;

import java.util.Scanner;

/**
 *
 * @author A308443 Dadas dos matrices cuadradas de números enteros, la matriz M
 * de 10x10 y la matriz P de 3x3, se solicita escribir un programa en el cual se
 * compruebe si la matriz P está contenida dentro de la matriz M. Para ello se
 * debe verificar si entre todas las submatrices de 3x3 que se pueden formar en
 * la matriz M, desplazándose por filas o columnas, existe al menos una que
 * coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
 * columna de la matriz M en la cual empieza el primer elemento de la submatriz
 * P.
 */
public class Guia6_Eje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandIgual;
        String pos;
        int x, y;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double result = 0;
        // INICIALIZO MATRICES
        int matrizMadre[][]
                = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
                {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
                {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int matrizHija[][]
                = {{36, 5, 67},
                {89, 90, 75},
                {14, 22, 26}};

        for (int i = 0; i < (matrizMadre.length - 2); i++) {
            for (int j = 0; j < matrizMadre.length - 2; j++) {
                //System.out.print(matrizMadre[i][j] + " - ");
                if (matrizMadre[i][j] == matrizHija[0][0]) {  // arranco análisis al vector
                    x = 0;
                    pos = "";
                    bandIgual = true;
                    for (int m = i; m < (i + matrizHija.length); m++) {
                        y = 0;
                        for (int n = j; n < (j + matrizHija.length); n++) {
                            if (matrizMadre[m][n] != matrizHija[x][y]) {
                                bandIgual = false;
                                break; //rompo bucle primer for para que no siga recorriendo de forma innecesaria
                            } else {
                                pos = pos + "(" + m + "," + n + ")";
                                y++;  // incremento la pos horizontal de la matriz a buscar
                            }
                        }
                        if (!bandIgual) {
                            break;       //rompo bucle segundo for
                        } else {
                            x++; // incremento la pos vertical de la matriz a buscar
                        }
                    }
                    if (bandIgual) {
                        System.out.println("La matriz a buscar se encontró en las siguientes posiciones: " + pos);
                    }
                }

            }
        }
    }
}
