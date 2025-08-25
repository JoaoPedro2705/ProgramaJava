
package ExerciciosDoSlide;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Conversor");
        System.out.println("");
        System.out.println("Informe o Valor em R$ : ");
        double reals = teclado.nextDouble();
        double dola = reals / 5.45;
        System.out.println("");
        System.out.printf("O valor Convertido Ficou : %.2f%n ",dola);
        
      }
    }