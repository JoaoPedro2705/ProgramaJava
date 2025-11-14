
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("         E.M.E.F Julia Cunha           ");
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Informe Seu Nome : ");
        String nome = teclado.nextLine();
        System.out.println("Informe A Primeira Nota : ");
        double nt1 = teclado.nextDouble();
        System.out.println("Informe A Segunda Nota : ");
        double nt2 = teclado.nextDouble(); 
        System.out.println("");
        double media = nt1 + nt2 / 2 ;
        if (media >= 7){
            System.out.printf("Você esta Aprovado , sua Nota ficou : %.1f%n ",media);
        }else{
            System.out.println("Você, está REPROVADO. ");
        }
                
    }
}
