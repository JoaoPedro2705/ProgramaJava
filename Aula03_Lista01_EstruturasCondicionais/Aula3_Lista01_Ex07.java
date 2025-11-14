package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                  Banco do BR                    ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Informe o Valor da Residencia : ");
        double vdc = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe o Seu Salário : ");
        double sal = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe em Quantos Anos Você irá Pagar : ");
        int tmp = teclado.nextInt();
        System.out.println("");
        int tmp2 = tmp * 12;
        double emp = vdc / tmp2;
        double lmt = sal * 0.3;
        if (emp > lmt) {
            System.out.println("Empréstimo não autorizado. ");
        } else if (emp < lmt) {
            System.out.printf("Empréstimo Autorizado, o valor Da Parcela Mensal Ficou : R$ %.2f%n ", emp, " Por Mês .");
        }

    }
}
