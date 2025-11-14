package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("              Rodoviaria Almeida                 ");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Qual A Distância que Deseja Percorrer em Km : ");
        int km = teclado.nextInt();
        System.out.println("");
        if (km <= 200) {
            System.out.printf("O total da Passagem ficou R$ %.2f%n ", (km * 0.50));
        } else if (km > 200) {
            System.out.printf("O total da Passagem ficou R$ %.2f%n ", (km * 0.45));
        }
        System.out.println("");

    }
}
