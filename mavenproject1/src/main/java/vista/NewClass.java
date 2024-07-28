/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        // Definir un arreglo bidimensional
        int[][] arreglo = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Imprimir el arreglo bidimensional
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println(); // Imprime una nueva línea después de cada fila
        }
    }
}


