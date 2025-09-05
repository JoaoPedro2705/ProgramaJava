package Aula4_Ex01;

import java.util.Scanner;

public class Aula04_Lista01_Ex5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);       

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                       Média                     ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
    
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
   
//Soma
System.out.println("Digite um valor: ");
        int num = teclado.nextInt();
        soma += num; // soma = soma + v
      
        }
        double med = soma / 5;
            System.out.println("A soma Ficou : "+soma+" e a Média ficou : "+med);
    }
}
      