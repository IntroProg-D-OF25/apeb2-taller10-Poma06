import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random random = new Random();
        int filas1 = 4, columnas1 = 4;
        int filas2 = 4, columnas2 = 4;

        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = random.nextInt(10); 
            }
        }

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = random.nextInt(10); 
            }
        }

        System.out.println("Matriz 1:");
        for (int[] fila : matriz1) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");
        for (int[] fila : matriz2) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        if (filas1 == filas2 && columnas1 == columnas2) {
            System.out.println("\nSuma de matrices:");
            int[][] suma = new int[filas1][columnas1];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            for (int[] fila : suma) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se pueden sumar las matrices porque tienen dimensiones diferentes");
        }

        if (columnas1 == filas2) {
            System.out.println("\nProducto de matrices:");
            int[][] producto = new int[filas1][columnas2];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    for (int k = 0; k < columnas1; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            for (int[] fila : producto) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se pueden multiplicar las matrices porque sus dimensiones no son compatibles");
        }
    }
}

/*
Matriz 1:
9 6 8 3 
9 3 1 9 
4 4 0 5 
0 9 0 9 

Matriz 2:
2 8 1 7 
6 3 5 2 
2 3 3 1 
0 8 5 6 

Suma de matrices:
11 14 9 10 
15 6 6 11 
6 7 3 6 
0 17 5 15 

Producto de matrices:
70 138 78 101 
38 156 72 124 
32 84 49 66 
54 99 90 72 
*/