package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("            Mercado Lagoa Verde - 1980           ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Informe o nome do Funcionário : ");
        String nm = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe o salario atual dele(a) : ");
        double sal = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe a Quanto tempo ele(a) está na Empresa em Anos : ");
        int tmp = teclado.nextInt();
        System.out.println("");
        if (tmp <= 3) {
            double bnf = sal * 3 / 100;
            System.out.println("O novo Salário de " + nm + " é R$ " + (sal + bnf));
        } else if (tmp >= 4 && tmp <= 9) {
            double bnf = sal * 12.5 / 100;
            System.out.println("O novo Salário de " + nm + " é R$ " + (sal + bnf));
        }

        if (tmp >= 10) {
            double bnf = sal * 20 / 100;
            System.out.println("O novo Salário de " + nm + " é R$ " + (sal + bnf));
            
        }

    }
}
