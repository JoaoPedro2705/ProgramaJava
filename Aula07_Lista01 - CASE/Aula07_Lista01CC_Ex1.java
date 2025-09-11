package Aula07_CASE;

import java.util.Scanner;

public class Aula07_Lista01CC_Ex1 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("");
        System.out.println("             Calculadora                       ");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("Informe o 1° Número : ");
        int num1 = tc.nextInt();
        System.out.println("");
        System.out.println("Informe o 2° Número : ");
        int num2 = tc.nextInt();
        System.out.println("");
        System.out.println("Escolha Uma Opção : ");
        System.out.println("1. Adição ");
        System.out.println("2. Subtração ");
        System.out.println("3. Multiplicação ");
        System.out.println("4. Divisão ");
        System.out.println("");
        int opc = tc.nextInt();
        String msn = null;
        switch (opc) {
            case 1:
                msn = "O resultado ficou : " + (num1 + num2);
                break;
            case 2:
                msn = ("O resultado ficou : " + (num1 - num2));
                break;
            case 3:
                msn = "O resultado ficou : " + (double) num1 * (double) num2;
                break;
            case 4:
                msn = "O resultado ficou : " + (double) num1 / (double) num2;
                break;
            default:
                msn = ("Operação Invalida. ");

        }

        System.out.println("-----------------------------------");
        System.out.println(msn);
        System.out.println("-----------------------------------");

    }
}
