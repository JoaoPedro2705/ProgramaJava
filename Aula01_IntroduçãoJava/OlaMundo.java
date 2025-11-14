package ExerciciosDoSlide;

import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o Seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual a Sua Idade?");
        int idade = teclado.nextInt();
        System.out.println("Legal, Seu nome é " + nome + " e Você tem " + idade + " Anos");

    }
}
