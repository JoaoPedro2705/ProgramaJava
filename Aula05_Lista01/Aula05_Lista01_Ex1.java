package Aula05_Ex01;

import java.util.Scanner;

public class Aula05_Lista01_Ex1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int cont = 0;
        double med = 0;
        int idd = 0;
        double soma = 0;

        System.out.println("==================================================");
        System.out.println("                   Media de Idade                 ");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("==================================================");
        System.out.println("  Informe um Valor Negativo para encerrar a Soma  ");
        System.out.println("==================================================");
        System.out.println("");
        System.out.println("");

        while (cont <= 100) {
            System.out.println("Informe uma Idade :");
            idd = tec.nextInt();
            soma = soma + idd;
            cont++;

            if (idd < 0) {
                break;
            }

            med = soma / cont;

        }

        System.out.println("A Média de idade da Turma é " + med);

    }

}
