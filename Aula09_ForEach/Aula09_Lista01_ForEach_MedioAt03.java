
package Aula09_ForEach;

import java.util.Scanner;


public class Aula09_Lista01_ForEach_MedioAt03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
    
    System.out.println("Quantos Números deseja digitar : ");
        int quant = tc.nextInt();
      
       int [] num = new int [quant];
        
        
        for (int i = 0; i < quant; i++) {
            System.out.println("Informe o "+(i+1)+"° Número : ");
            num [i] = tc.nextInt();

            
        }

         
        
        System.out.println("\nNúmeros adicionados a Array : ");
        for (int n : num) {
             if (n % 2 == 1) {
                 n = 0;
            System.out.println(n);
           
            
             }

            }

        }


}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
