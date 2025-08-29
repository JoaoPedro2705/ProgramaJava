
package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;


public class Aula2_Lista1_Ex02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("             **    Ano Bissexto  **              ");
        System.out.println("");
        System.out.println("  ** True = Ano Bissexto , False = Ano não Bissexto **  ");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe Um Ano :");
        int ano = teclado.nextInt();
        System.out.println("");
        System.out.println(ano % 4 == 0 && ano % 100 != 0 && ano % 400 == 0);
        
    
       boolean bissext;
        
        
        
    }
}
