
package Aula09_ForEach;

import java.util.Scanner;


public class Aula09_Lista01_ForEach_EasyAt04 {
    public static void main(String[] args) {
        
        double media = 0;
        double soma = 0;
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantas Notas Desejar Calcular a Média :");
        int quant = tc.nextInt();
        double[] num = new double[quant];
        for (int i = 0; i < quant; i++) {
            System.out.println("Informe o "+(i+1)+"° Número: ");
            num[i] = tc.nextInt();
            
        }
    
        for(double n : num) {
            soma = soma + n;
            media = soma / quant;
            
            
           
       }       
    
        System.out.println("A média das Notas Ficou : "+media);
        
    }
}
