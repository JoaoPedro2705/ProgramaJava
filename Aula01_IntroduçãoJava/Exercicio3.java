package ExerciciosDoSlide;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("            Dobre e Terça Parte               ");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Informe O Numero : ");
        double num1 = teclado.nextDouble();
        double resu1 = num1 * 2;
        double resu2 = num1 / 3;
        System.out.printf("O Dobro Do Numero Ficou: %.2f%n",resu1);
        System.out.println("");
        System.out.printf("O Terça Parte Ficou : %.4f%n",resu2);

    }

}
