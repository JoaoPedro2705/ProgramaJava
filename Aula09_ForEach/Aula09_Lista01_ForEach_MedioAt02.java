
package Aula09_ForEach;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula09_Lista01_ForEach_MedioAt02 {
    public static void main(String[] args) {
        ArrayList<String> palavs = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos Nomes você quer Inserir? ");
        int quant = tc.nextInt();
        tc.nextLine();
        
        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o "+(i+1)+" Nome : ");
            String nome = tc.nextLine();
            palavs.add(nome);
            
        }
         
        
        int contNm = 0;
        for (String nm : palavs){
            if (nm.startsWith("A") ){
                contNm++;
        
        }
    }
        System.out.println("Quantidade de Nomes que começam com 'A' : "+ contNm);
    }
}
    

