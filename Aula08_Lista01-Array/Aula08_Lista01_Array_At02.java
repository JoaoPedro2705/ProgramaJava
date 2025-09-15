
package Aula08_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula08_Lista01_Array_At02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        
        System.out.println("Informe Cinco Números Decimais Exemplo (1,59) : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero Decimal " + (i + 1) + " :");
            nums.add(tc.nextDouble());
            
            
        }
        
        double tnum = nums.get(2);
       System.out.println("O Terceiro Número Digitado foi : "+ tnum);
       
        
        
    }
}
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
       