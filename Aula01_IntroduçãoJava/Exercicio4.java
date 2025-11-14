
package ExerciciosDoSlide;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Conversor De Metros Para Centimetros e Km        ");
        System.out.println("");
        System.out.println("Informe A Distancia em M² :");
        double metros = teclado.nextDouble();
        System.out.println("");  
        double km = metros / 1000;
        double cm = metros * 100;
        System.out.printf("O Valor Convertido de M² Para Km² ficou : %.2f%n",km);
        System.out.printf("O Valor Convertido de M² Para Cm² Ficou : %.2f%n",cm);
    
    
    }
}
