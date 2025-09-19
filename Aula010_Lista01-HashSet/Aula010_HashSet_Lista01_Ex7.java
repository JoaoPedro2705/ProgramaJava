
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula010_HashSet_Lista01_Ex7 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Set<String> alfabeto = new HashSet<>();
        
        System.out.println("Digite o Alfabeto : ");

        for (int i = 1; i <= 26; i++) {
            System.out.println("Digite a "+i+"° Letra do Alfabeto : ");
            alfabeto.add(tc.nextLine());
                                                
        }
        
        System.out.println("Tamanho do Alfabeto: "+ alfabeto.size());
        
    }
}
        
