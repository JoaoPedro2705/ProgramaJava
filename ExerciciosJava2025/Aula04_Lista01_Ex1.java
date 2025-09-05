
package Aula4_Ex01;

import java.util.Scanner;

public class Aula04_Lista01_Ex1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                      Tabuadas                    ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        
        
        //Tabuada COMUM
        //System.out.println("Informe um número : ");
        //int num = teclado.nextInt();
        //for (int i = 1; i < 10; i++) {
        // System.out.println(num + " x " + i + " = " + (num * i));
           
         //Tabuada DECRESCENTE
        // System.out.println("Informe um número : ");
        // int num = teclado.nextInt();
        //for (int i = 10; i >= 1; i--) {
          //   System.out.println(num + " x " + i + " = " + (num * i));
             
          
          //Tabuada com SOMA
          System.out.println("Informe um número : ");
          int num = teclado.nextInt();
          for (int i = 1; i < 10; i++) {
             int soma = i + num;
            System.out.println(num + " x " + i + " = " + (num * i) + " | Soma = " + soma );  
        }
          
          
          
        }
        
         
         
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
