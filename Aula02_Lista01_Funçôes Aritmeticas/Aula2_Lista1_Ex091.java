
package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;


public class Aula2_Lista1_Ex091 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
               
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("                   Entre 100 a 200                 ");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe Um Numero : ");
        int num = teclado.nextInt();
        System.out.println("");
        if (num > 100 && num < 200) {
            System.out.println("O Número Informado está dentro do Intervalo ");
            System.out.println("Ele está " + (num - 100) + " De distância acima do número 100 ");
            System.out.println("Ele está " + (200 - num) + " De distância abaixo do número 200 ");
        }else{
            System.out.println("O Número Informado está Fora do Intervalo ");
        }
            
    }
}
