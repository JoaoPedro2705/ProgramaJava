
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Aula010_HashSet_Lista01_Ex4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
             Set<String> city = new HashSet<>(); 
        
        
        System.out.println("Digite 5 Nomes de Cidades : ");
         for (int i = 1; i <= 5; i++) {
             String cities = tc.nextLine();
            city.add(cities);
        }
        System.out.println("\nLista de Cidades : ");
        for(String cities : city){
            System.out.println(cities);
            
        }
         
         System.out.println("");
        if (city.isEmpty()) {
            System.out.println("O conjunto De cidades está vazio.");
        } else {
            System.out.println("O conjunto De cidades ainda possui elementos.");
        }
    }
}
    
