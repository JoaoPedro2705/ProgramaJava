
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Aula010_HashSet_Lista01_Ex8 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);   
        
        Set<String> animais = new HashSet<>();
        
        System.out.println("Digite os Animais. ");
        
        for (int i = 1; i <= 8; i++) {
            System.out.println("\nDigite o "+i+"° Nome de animal: ");
            animais.add(tc.nextLine());
            
            
            
        }
        
        System.out.println("\nLista dos animais digitados: ");
        for (String animal : animais){
            System.out.println(animal);
        }
        
        
    }
    
}
