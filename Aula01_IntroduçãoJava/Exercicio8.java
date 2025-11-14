
package ExerciciosDoSlide;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("             NIKE Revendora               ");
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Qual o Valor do Produto ");
        int produto = teclado.nextInt();
        System.out.println("");
        double desconto = (int) produto * 0.05;
        double valorf = (int) produto - desconto;
        System.out.printf("O valor Total da Compra com desconto ficou : %.2f%n ",valorf);
      
        
                
    }
}
