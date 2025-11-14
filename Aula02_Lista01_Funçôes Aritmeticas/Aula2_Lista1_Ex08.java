package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;

public class Aula2_Lista1_Ex08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("             Divisivel Por 7 ou 3                ");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe um Número : ");
        int num = teclado.nextInt();
        System.out.println("");
        boolean divp3 = (num % 3 == 0);
        boolean divp7 = (num % 7 == 0);
        boolean divpd = (num % 3 == 0 && num % 7 == 0);

        System.out.println("O Número é Múltiplo por 3 : " + divp3);
        System.out.println("O Número é Mútilplo por 7 : " + divp7);
        System.out.println("O Número é Múltiplo por Ambos : " + divpd);
    }
}
