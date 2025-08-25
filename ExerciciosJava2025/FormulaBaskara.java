package ExerciciosDoSlide;

import java.util.Scanner;

public class FormulaBaskara {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado A: ");
        double a = teclado.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        double b = teclado.nextDouble();
        System.out.println("Digite o valor do lado C: ");
        double c = teclado.nextDouble();


        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if(delta < 0){
            System.out.println("Não Existem raizes reais");
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("O Resultado para x1 é :" +x1);
            System.out.println("O Resultado para x1 é :" +x2);
          
        }

    }
}
