package Aula011_Matriz;

public class Aula011_SomarMediaExemplo {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}

        };

        int soma = 0;
        int totalElementos = 16;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
                
            }
            
        }
        
        double media = (double)soma / totalElementos;
        System.out.println("A média dos elementos é: "+media);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
