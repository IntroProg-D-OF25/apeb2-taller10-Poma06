import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        int matriz[][] = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nElementos de la diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nElementos de la diagonal secundaria: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nElementos ubicados bajo la diagonal principal: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos ubicados sobre la diagonal principal: ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos ubicados bajo la diagonal secundaria: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos ubicados sobre la diagonal secundaria: ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = matriz.length - 1 - i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}

/*
7	7	1	9	8	9	
8	8	3	8	0	4	
5	0	7	9	2	5	
4	7	2	5	6	1	
2	9	3	2	6	7	
9	7	1	6	3	5	

Elementos de la diagonal principal: 
7	8	7	5	6	5	
Elementos de la diagonal secundaria: 
9	0	9	2	9	9	
Elementos ubicados bajo la diagonal principal: 
8	5	0	4	7	2	2	9	3	2	9	7	1	6	3	
Elementos ubicados sobre la diagonal principal: 
7	1	9	8	9	3	8	0	4	9	2	5	6	1	7	
Elementos ubicados bajo la diagonal secundaria: 
8	8	3	8	5	0	7	4	7	2	
Elementos ubicados sobre la diagonal secundaria: 
4	2	5	5	6	1	3	2	6	7	
*/
