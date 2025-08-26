
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("               Area Do Circulo                 ");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Infomre O Raio do Circulo : ");
        double raio = teclado.nextDouble();
        System.out.println("");
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A area Do Circulo Ficou : %.2f%n ",area);
        
        
        
    }
}
