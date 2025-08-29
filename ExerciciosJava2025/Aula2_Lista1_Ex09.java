
package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;


public class Aula2_Lista1_Ex09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("                 E.M.E.F Ruy Santos              ");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe O Nome Do Aluno : ");
        String nm = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe A Nota Final Do Aluno : ");
        int nota = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe A Presença Do Aluno : ");
        int pre = teclado.nextInt();
        System.out.println("");
        boolean apvd = (pre >= 75 && nota >= 60);
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Nome : "+nm);
        System.out.println("Nota Final : "+nota);
        System.out.println("Presença : "+pre);
        System.out.println("Situação = |False = REPROVADO | True = APROVADO : ");
        System.out.println("Situação Final : "+apvd);
        
        
        
        
        
        
        
        
        
        
    }
}
