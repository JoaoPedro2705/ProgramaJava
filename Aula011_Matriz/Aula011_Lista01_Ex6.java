
package Aula011_Matriz;

public class Aula011_Lista01_Ex6 {
    public static void main(String[] args) {
        int sub = 0;
        int[][]matriz = {
            {23,42,31},
            {45,58,67},
            {70,80,92}
                
        };
        
        int[][]matriz2 = {
            {11,10,17},
            {25,18,34},
            {59,25,76}
                
        };
        
        System.out.println("Primeira Matriz : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
             
        }

        System.out.println("Segunda Matriz : ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
                
            }
            System.out.println();
             
        }

        System.out.println("Resultado da Subtração de ambas matrizes : ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz[i][j] - matriz2[i][j] + " ");
                
            }
            System.out.println();
             
        }
    }
 
}
