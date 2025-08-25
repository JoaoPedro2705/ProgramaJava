
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("                   Detran RS                   ");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Qual A velocidade que o Veiculos Estava : ");
        int vel = teclado.nextInt();
        
        if (vel > 80) {
        int multa = vel - 80;
        System.out.println("Você Foi Multado.O Valor da Multa é de : "+ (multa * 5));
        }else{
            System.out.println("Você Não Possui Nenhuma Multa.");
        }
        
        
    }
    
}
    
                
    
 

