package Aula07_CASE;

import java.util.Scanner;

public class Aula07_Lista01CC_Ex3 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("-----------------------------------------------");
        System.out.println("         Classificador de Triangulo            ");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Primeiro Lado : ");
        double ld1 = tc.nextDouble();
        System.out.println("");
        System.out.println("Informe o Segundo Lado : ");
        double ld2 = tc.nextDouble();
        System.out.println("");
        System.out.println("Informe o Terceiro Lado : ");
        double ld3 = tc.nextDouble();
        System.out.println("");

        int opc = 1;
        String ms = null;

        if (ld1 == ld2 && ld2 == ld3) {
            ms = ("O Triangulo Informado é EQUILÁTERO");
            opc += 1;
        }
        if (ld1 == ld2 && ld2 != ld3) {
            ms = ("O Triangulo Informado é ISÓSCELES");
            opc += 2;
        }
        if (ld1 != ld2 && ld1 != ld3) {
            ms = ("O Triangulo Informado é ESCALENO");
            opc += 3;
        }
        if (ld1 != ld2 && ld1 == ld3) {
            ms = ("O Triangulo Informado é ISÓSCELES");
            opc += 2;
        }
        if (ld1 != ld3 && ld2 == ld3) {
            ms = ("O Triangulo Informado é ISÓSCELES");
            opc += 2;
        }

        switch (opc) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        System.out.println(ms);
    }
}
