package java_2025;

import java.util.Scanner;

public class Aula3_LIsta01_Ex04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Informe o Nome do Aluno : ");
        String nm = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe a Primeira nota de " + nm);
        double nt1 = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe a Segunda nota de " + nm);
        double nt2 = teclado.nextDouble();
        System.out.println("");
        double md = nt1 + nt2;
        if (md / 2 <= 4.9) {
            System.out.println("O Aluno(a) " + nm + " está REPROVADO. ");
        } else if (md / 2 > 5 && md / 2 < 6.9) {
            System.out.println("O Aluno(a) " + nm + " está em RECUPERAÇÃO. ");
        } else if (md / 2 >= 7) {
            System.out.println("O Aluno(a) " + nm + " está em APROVAÇÃO. ");
        }

    }
}
