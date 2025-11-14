
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------");
        System.out.println("             Somador Simples                   ");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Primeiro Numero : ");
        int num1 = teclado.nextInt();
        System.out.println("Informe o Segundo Numero : ");
        int num2 = teclado.nextInt();
        System.out.println("");
        System.out.println("A Soma dos Dois Numeros Informados Ficou "+ (num1 + num2));
    }
}
