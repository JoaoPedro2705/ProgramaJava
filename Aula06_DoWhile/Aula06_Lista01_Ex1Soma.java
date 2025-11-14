
package Aula06_DoWhile;

import java.util.Scanner;


public class Aula06_Lista01_Ex1Soma {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("              Soma com DO-WHILE                ");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");
      
       
       int soma = 0;
       int n = 0;
        do {
           
            System.out.println("Informe o Número (0 para Sair): ");
            n = tc.nextInt();
            System.out.println("");
            soma += n;
            
          
            
        }while (n != 0);
           
            System.out.println("O Resultado da Soma de todos os Números ficou : " + soma);
   
    }
}
   
    
        

