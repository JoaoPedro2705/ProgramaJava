package Aula09_ForEach;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula09_Lista01_ForEach_EasyAt05 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Set<String> verbos = new HashSet<>();
        System.out.println("Quantos Verbos deseja adicionar ? ");
        int qtd = tc.nextInt();
        System.out.println();
        tc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o " + (i + 1) + "° Verbo :");
            String verbo = tc.nextLine();
            verbos.add(verbo);
        }

        System.out.println("\nVerbos Adicionados ao HashSet : ");
        for (String verbo : verbos) {
            System.out.println(verbo);

        }

    }
}
