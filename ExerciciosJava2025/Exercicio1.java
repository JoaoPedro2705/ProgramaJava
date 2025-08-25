
package ExerciciosDoSlide;

import java.util.Scanner;


public class Exercicio1 {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("                Folha Salarial                 ");
        System.out.println("");
        System.out.println("================================================");
        System.out.println("");
        System.out.println("Informe Seu Nome : ");
        String nome = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe Seu Salario : ");
        int salario = teclado.nextInt();
        System.out.println("");
        System.out.println(nome+" Recebe " +salario+ " Por Mês ");
                
    }
}
