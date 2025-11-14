
package Aula011_Matriz;

public class Aula011_Lista01_Ex3 {
    public static void main(String[] args) {
        
        int[][]matriz = {
            {1,1,1},
            {2,2,2},
            {3,3,3}
                
        };
        
        System.out.println("Matriz Original :");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
    }
        
        System.out.println("Matriz Transposta : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
}
}
}