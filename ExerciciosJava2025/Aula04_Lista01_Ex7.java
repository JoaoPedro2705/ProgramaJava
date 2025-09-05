package Aula4_Ex01;

import java.util.Scanner;

public class Aula04_Lista01_Ex7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Informe um número incial : ");
        int num = tec.nextInt();
        System.out.println("");
        System.out.println("Informe um número final : ");
        int num2 = tec.nextInt();
        System.out.println("");
        System.out.println("Informe um número incremento : ");
        int inc = tec.nextInt();
        System.out.println("");   
        for (int i = num; i <=num2 ; i+= inc) {
            System.out.println(i);   
        }
     
        }
            
            
        }
        
        
        
        
        
        
    

