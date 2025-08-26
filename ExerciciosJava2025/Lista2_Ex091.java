package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex091 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("             Salario Com Bonus                   ");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe o Salario : ");
        double sal = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe o Bônus em % : ");
        int bon = teclado.nextInt();
        System.out.println("");
        double nvsalario = sal + (sal * bon / 100);
        System.out.printf("Seu Novo Salario Ficou R$ : %.2f%n ",nvsalario);
        
    }
    
}
