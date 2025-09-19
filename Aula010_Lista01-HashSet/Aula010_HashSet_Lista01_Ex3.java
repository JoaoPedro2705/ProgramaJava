
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Set;


public class Aula010_HashSet_Lista01_Ex3 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(); 
        
        
        
         for (int i = 1; i <= 5; i++) {
            nums.add(i);
        }

        System.out.println("Conjunto antes de limpar: " + nums);

       
        nums.clear();

        
        if (nums.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto ainda possui elementos.");
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

