
package Aula011_Matriz;

import java.util.Scanner;


public class Aula011_ExemploTicTacToe {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        char[][]jogo = new char [3][3];
        
        //Inicializa vazio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j]= '-';
                
            }
            
        }
                
                
        for (int k = 0; k < 3; k++) {
            System.out.println("Digite a linha (0-2): ");
            int linha = tc.nextInt();
            System.out.println("Digite a coluna (0-2): ");
            int coluna = tc.nextInt();
            System.out.println("Digite X ou O: ");
            char simbolo = tc.next().charAt(0);
            
            
        jogo[linha][coluna] = simbolo;
        
        //Mostrar o tabuleiro
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogo[i][j]+ "");
                    
                }
                System.out.println();
            }

        
            
        }
        
        
        
        
    }
}
