
package Aula010_HashSet_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula010_HashSet_Lista01_Ex5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Set<String> cores = new HashSet<>();
        
        System.out.println("Quantos Elementos deseja digitar? ");
        int qtd = tc.nextInt();
        tc.nextLine();
        
        
         for (int i = 1; i <= qtd; i++) {
             System.out.println("Informe a "+i+ "° Cor: ");
             String cor = tc.nextLine();
            cores.add(cor);
            
         }
            
             ArrayList<String> colors = new ArrayList<>(cores);
             
             System.out.println("ArrayList Convertida : "+colors);
       }
    }

