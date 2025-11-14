
package Aula09_ForEach;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula09_Lista01_ForEach_EasyAt02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        ArrayList<String> pala = new ArrayList<>();
        
        for (int i = 1; i < 6; i++) {
            System.out.println("Informe a "+i+"° Palavra ");
            String palavras = tc.nextLine();
            pala.add(palavras);
            
        }
        System.out.println("\nPalavras em maiúsculas: ");
        for (String pls : pala) {
            System.out.println(pls.toUpperCase());
            
            
        }
        
    }
}
