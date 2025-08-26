package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---------------------------------------------");
        System.out.println("                Idade em Dias                ");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("Informe Sua Idade : ");
        int idade = teclado.nextInt();
        System.out.println("");
        System.out.println("Sua Idade em dias Ficou "+(idade * 365)+" Dias ");
    }
}
