
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Aula010_HashSet_Lista01_Ex6 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        
        

             Set<String> city = new HashSet<>(); 
        System.out.println("Informe quantas Cidades deseja Digitar: ");
        int qtd = tc.nextInt();
        tc.nextLine();
        
         for (int i = 1; i <= qtd; i++) {
             System.out.println("Digite a "+ i + "° Cidade : ");
             String cities = tc.nextLine();            
            city.add(cities);
            
        }
        System.out.println("\nLista de Cidades : ");
        for(String cities : city){
            System.out.println(cities);
            
            
            
        }
        city.remove("São Paulo");
   
    System.out.println("\nDepois de remover São Paulo : " + city);
        
    }
    
}