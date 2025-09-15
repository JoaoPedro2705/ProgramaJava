
package Aula08_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula08_Lista01_Array_At04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        ArrayList<String> letras = new ArrayList<>();
        
        
        System.out.println("Informe Quatro Letras : ");
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Letra " + (i + 1) + " :");
            letras.add(tc.nextLine());
        
        
        
        }
        
      
        ArrayList<String> letras2 = new ArrayList<>(letras);
        System.out.println("Lista de Letras : "+ letras2);
        int tama = letras.size();
      
        System.out.println("O tamanho da lista de caracteres é "+ tama);
        
    }
}
