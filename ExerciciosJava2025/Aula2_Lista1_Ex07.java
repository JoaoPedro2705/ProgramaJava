package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;

public class Aula2_Lista1_Ex07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("               Pode Ser Um Triângulo             ");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Digite o Primeiro lado: ");
        double lado1 = teclado.nextDouble();
        System.out.println("Digite o Segundo lado: ");
        double lado2 = teclado.nextDouble();
        System.out.println("Digite o Terceiro lado: ");
        double lado3 = teclado.nextDouble();

        boolean tri = (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado2 + lado1);
        System.out.println("Pode Formar um TRIÂNGULO ? " + tri);

    }
}
