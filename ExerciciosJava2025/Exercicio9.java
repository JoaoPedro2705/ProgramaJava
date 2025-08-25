
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("        Locador Automotiva Mendes           ");
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("Quantos Km Você Percorreu Com Nosso Veiculo : ");
        int km = teclado.nextInt();
        System.out.println("");
        System.out.println("Por Quantos Dias o Veiculo Foi Alugado : ");
        int dias = teclado.nextInt();
        System.out.println("");
        int diaria = dias * 90;
        double kmr = (int) km * 0.20;
        double valorf = kmr + diaria;
        System.out.printf("O Total do Aluguel Ficou : %.2f%n ",valorf);
        
        
    }
 
}
