package Aula4_Ex01;

import java.util.Scanner;

public class Aula04_Lista01_Ex8 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                       Média                     ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");

        double soma = 0;
        for (int i = 1; i <= 5; i++) {

//Soma
            System.out.println("Digite uma Idade : ");
            double num = tec.nextInt();
            soma += num; // soma = soma + v

        }
        double med = soma / 5;
        System.out.println("A soma das Idade Ficou : " + soma + " e a Média delas ficou : " + med);

    }
}
