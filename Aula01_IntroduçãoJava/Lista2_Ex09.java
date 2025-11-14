
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("                 Juros Simples                   ");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Capital : ");
        double cap = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe a Taxa Por Mês em %");
        double taxa = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe o Tempo em Meses : ");
        int tempo = teclado.nextInt();
        System.out.println("");
        double Montante = cap * (1+ taxa/100 * tempo);
        System.out.printf("O Montante do Juros Ficou : %.2f%n ",Montante);
        
        
    }
 
}
