
package Aula011_Matriz;

import java.util.Scanner;

public class Aula011_Lista01_Ex5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
    int[][]matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
                
        };
        
        System.out.println("Matriz 3x3 Original : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
             
        }
        System.out.println("Informe um Número para multiplicar a Matriz : ");
        int num = tc.nextInt();
        System.out.println("Matriz 3x3 Multiplicada pelo Numero escalonado : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]*num + " ");
                
            }
            System.out.println();
             
        }

            
            
    }
    }
    
    

