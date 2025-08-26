
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("            Perímetro Do Retangulo              ");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("Informe a Altura : ");
        double alt = teclado.nextDouble();
        System.out.println("Informe a Base : ");
        double base = teclado.nextDouble();
        System.out.println("");
        double area = alt * base;
        System.out.printf("O Calculo Do Perimetro ficou : %.2f%n ", area);
        
        
    }
}
