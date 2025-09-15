
package Aula08_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula08_Lista01_Array_At03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();
        
        System.out.println("Informe Três Cores : ");
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Cor " + (i + 1) + " :");
            cores.add(tc.nextLine());
        
        
        
        }
        
        boolean contAmarelo = cores.contains("Amarelo");
        ArrayList<String> cpc = new ArrayList<>(cores);
        System.out.println("ArrayList de Cores "+ cpc);
        System.out.println("A Cor Amarela está presente na lista ? "+ contAmarelo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
    }
}
