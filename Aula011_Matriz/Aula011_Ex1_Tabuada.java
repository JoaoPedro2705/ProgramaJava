
package Aula011_Matriz;

public class Aula011_Ex1_Tabuada {
    public static void main(String[] args) {
        
  int[][] tabuada = new int[11][11];
  
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 1; coluna < 11; coluna++) {
                tabuada[linha][coluna] = (linha)*(coluna);                                
            }
            
        }
        
        //Imprimir a tabuada formatada
        
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 1; coluna < 11; coluna++) {
                System.out.println(linha+ " x "+coluna+ " = "+ tabuada[linha][coluna] + "\t");                                 
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
