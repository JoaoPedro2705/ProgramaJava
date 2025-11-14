package Aula09_ForEach;

import java.util.Scanner;

public class Aula09_Lista01_ForEach_EasyAt03 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Quantos Números deseja digitar : ");
        int quant = tc.nextInt();
        int[] num = new int[quant];
        int maiorNum = 0;
        for (int i = 0; i < quant; i++) {
            System.out.println("Informe um Número : ");
            num[i] = tc.nextInt();

        }

        for (int n : num) {
            if (maiorNum < n) {
                maiorNum = n;

            }

        }

        System.out.println("O maior Número é : " + maiorNum);

    }

}
