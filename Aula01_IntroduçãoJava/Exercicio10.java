
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Cupincha");
        System.out.println("");
        System.out.println("Informe quantos Dias Você Trabalhou : ");
        int dias = teclado.nextInt();
        System.out.println("");
        int hrs = dias * 8;
        ;
        System.out.printf("O Seu Salario é "+(hrs * 25));
                
    
    }
 
}
