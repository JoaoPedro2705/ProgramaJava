
package Aula011_Matriz;


public class Aula011_Lista01_Ex4 {
    public static void main(String[] args) {
        int somaSecundaria = 0;
        int somaPrimaria = 0;
        int[][]matriz = {
            {3,2,1},
            {9,5,6},
            {6,3,9}
                
        };
        
        System.out.println("Matriz 3x3 : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
             somaPrimaria += matriz[i][i];
                somaSecundaria += matriz[i][2-i];
             
        }
           
            System.out.println("Resultado da Soma da diagonal primaria : "+ somaPrimaria);
            System.out.println("Resultado da Soma da diagonal secundaria : "+ somaSecundaria);
            
    }
    }
    