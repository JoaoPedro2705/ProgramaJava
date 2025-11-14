
package Aula09_ForEach;

import java.util.Scanner;


public class Aula09_ForEach_Exemplo1 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite uma Frase: ");
        String frase = tc.nextLine().toLowerCase();
        
        int contVogais = 0;
        for(char letra : frase.toCharArray()){
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contVogais++;
        
        }
    }
        System.out.println("A frase contém "+ contVogais+ " vogais ");
    }
}

