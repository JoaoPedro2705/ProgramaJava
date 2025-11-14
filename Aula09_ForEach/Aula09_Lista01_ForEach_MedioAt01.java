
package Aula09_ForEach;

import java.util.Scanner;


public class Aula09_Lista01_ForEach_MedioAt01 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Quantos Números deseja digitar : ");
        int quant = tc.nextInt();
        int[] num = new int[quant];
        int maiorQueDez = 0;
        for (int i = 0; i < quant; i++) {
            System.out.println("Informe o "+(i+1)+"° Número : ");
            num[i] = tc.nextInt();

        }

        for (int n : num) {
            if (10 < n) {
                maiorQueDez++;

            }

        }

        System.out.println("O total de Números Maior que Dez é : " + maiorQueDez);

    }

}
        
        
        
        
        
        
        
        
    

