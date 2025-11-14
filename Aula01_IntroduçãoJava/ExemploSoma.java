package ExerciciosDoSlide;

import java.util.Scanner;

public class ExemploSoma {

    public static void main(String[] args) {
        
        double result;

        Scanner teclado = new Scanner(System.in);
        System.out.println("## SOMANDO NUMEROS ##");
        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite Outro número: ");
        int num2 = teclado.nextInt();
        result = num1 + num2;
        System.out.println("O Primeiro número é "+num1+" e o segundo é "+num2);
        System.out.println("A Soma Dos Dois números é "+ result);
    }

}
