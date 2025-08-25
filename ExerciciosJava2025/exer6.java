
package ExerciciosDoSlide;
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("");
        System.out.println("Informe a Largura do Quarto em M² : ");
        double larg = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe a Altura do Quarto em M² : ");
        double altu = teclado.nextDouble();
        System.out.println("");
        double tinta = (int) altu + larg;
        System.out.println("");
        System.out.println("O total de Litros Necessá15rios é de : "+tinta);       
        
        
    }
}
