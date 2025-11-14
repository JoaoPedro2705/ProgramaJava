
package Aula011_Matriz;


public class Aula011_MatrizesExemplos {
    public static void main(String[] args) {
        
        int num = 5;
        
        int[] numeros = {1,2,3,4,5}; //fila
        
        int[][] matriz = new int [3][3];
        
        //[0,0,0]
        //[0,0,0]
        //[0,0,0]
        
       // [linha][coluna]
        
       // valor do índice 0 1 2 3 4 5 ...
       // valor da posição  1 2 3 4 5 6...
        
       // matriz[0][0]; //primeira linha, primeira coluna
       // matriz[1][2];//segunda linha, terceira coluna
        
      // matriz[0][0] = 10;
       // System.out.println(matriz[0][0]);
        
       
       double[][] notas = {
           {7.5,8.0,9.0},
           {5.5,6.0,7.0}
               
       };
       
        for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < notas[i].length; j++) {
            System.out.println(notas[i][j]+"");
            
            
            
        }
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
