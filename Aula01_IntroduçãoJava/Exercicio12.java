
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("               Camara de Voto              ");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Quantos Anos Você tem : ");
        int idade = teclado.nextInt();
        if (idade >= 16) {
            System.out.println("Você Tem Direito ao Voto : ");
        }else{
            System.out.println("Você Não tem Direito ao Voto Devido a Idade.[Min 16 anos]");
        }
        
    }
}
