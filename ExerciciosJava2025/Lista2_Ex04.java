
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("            Conversor Celsius                   ");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("Informe A Temperatura em Celsius : ");
        int cls = teclado.nextInt();
        System.out.println("");
        int far = (cls * 9/5 + 32);
        System.out.println("");
        System.out.println("A Converão de Celsius para Fahrenheit : "+far+"° Graus Fahrenheit");
        
    }
    
}
