
package Aula08_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula08_Lista01_Array_At01 {
    public static void main(String[] args) {


        Scanner tc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();

        System.out.println("Digite 5 nomes de cidades: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cidade " + (i + 1) + " :");
           // String cities = tc.nextLine();
            city.add(tc.nextLine());
        }
        
   
        
       
   
         System.out.println("Lista de Cidades Escritas : "+ city);
    }
    
}
