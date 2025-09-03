
package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("                Qual O Maior ?                   ");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe Um Número inteiro : ");
        int num1 = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe Outro Número inteiro : ");
        int num2 = teclado.nextInt();
        System.out.println("");
        if (num1 > num2){
            System.out.println("O Primeiro Número é maior. ");
        }else if (num2 > num1)
            System.out.println("O Segundo Número é maior. ");
        
        if (num1 == num2){
            System.out.println("Não existe valor maior, os dois iguais. ");
        }
    }
}
