package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula010_HashSet_Lista01_Ex2{

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Set<String> frutas = new HashSet<>();

        System.out.println("Quantas frutas você deseja adicionar ? ");
        int qtd = tc.nextInt();
        System.out.println();
        tc.nextLine();
        //

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Digite o nome da fruta " + i + " :");
        
            String fruta = tc.nextLine();
            boolean adicionada = frutas.add(fruta);
            if (!adicionada) {
                System.out.println("\nA fruta " + fruta + " já foi adicionada e será ignorada");

            }

        }
        
        System.out.println("Frutas adicionada (sem duplicatas) ");
        for (String fruta : frutas) {
            System.out.println(fruta);
            System.out.println();
        }
         
      
        System.out.println("Qual Fruta Deseja Remover : "+frutas);
        String remover = tc.nextLine();
         System.out.println("Antes de remover: " + frutas);
        frutas.remove(remover);
        System.out.println("Depois de remover: " + frutas);
        
       
    }
}



            
            
            
        
        
