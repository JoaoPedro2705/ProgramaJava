
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("               Media Aritmetica                 ");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("Infomre o Primeiro Numero : ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe o Segundo Numero : ");
        double num2 = teclado.nextDouble();
        System.out.println("Informe O Terceira Numero : ");
        double num3 = teclado.nextDouble();
        double media = (num1 + num2 + num3)/3;
        System.out.println("");
        System.out.printf("A Media Aritmetica Ficou : %.2f%n ",media);
    }
}
