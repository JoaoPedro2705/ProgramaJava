
package Aula4_Ex01;

import java.util.Scanner;


public class Aula04_Lista01_Ex9 {
    public static void main(String[] args) {
        
        
        Scanner tec = new Scanner(System.in);
        int cont = 0;
        
         int mai = 0;
            int men = 1;
          
            
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                Maior e Menor                    ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
     
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            
            System.out.println("Informe um Número : ");
            int num = tec.nextInt();
               men = num;   
            if (num > mai){
                mai = num;
            }else if(num < men)
                men = num;
            {
            
       
        }
        
        
        }
         System.out.println("O menor Número informado foi : " + men);  
        System.out.println("O maior Número informado foi : " + mai);
    }
}    

               
        
        
        
        
        
        
        
        
        
        
    

