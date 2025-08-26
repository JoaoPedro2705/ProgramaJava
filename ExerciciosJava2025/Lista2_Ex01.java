
package ExerciciosDoSlide;
import java.util.Scanner;
public class Lista2_Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("                 Login                      ");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Nome do Usuario : ");
        String nome = teclado.nextLine();
        System.out.println("");
        System.out.println("Seja Bem Vindo ,"+nome);
    }
}
