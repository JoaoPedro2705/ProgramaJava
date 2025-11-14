package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("          GoldShoes - Rua Sapiranga,78     ");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Seu Nome : ");
        String nm = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe seu Sexo : ");
        System.out.println("1. Feminino ");
        System.out.println("2. Masculino ");
        int sx = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe o Valor Total Da Compra : ");
        double val = teclado.nextDouble();
        System.out.println("");
        double desc = (val * 13 / 100);
        double desc2 = (val * 5 / 100);
        double vff = (val - desc);
        double vfm = (val - desc2);

        if (sx == 1) {
            System.out.println(" O valor total ficou R$ :" + vff);
        } else if (sx == 2) {
            System.out.println(" O valor total ficou R$ : " + vfm);

        }

    }

}
