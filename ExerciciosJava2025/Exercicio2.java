
package ExerciciosDoSlide;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("               Sucessor e Antecessor         ");
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("Informe O Numero : ");
        int num1 = teclado.nextInt();
        System.out.println("");
        System.out.println("O numero Sucessor é : "+(num1 + 1));
        System.out.println("O numero Antecessor é : "+(num1 - 1));
                
                
                
    }
  
}
