
package Aula010_HashSet_;

import java.util.HashSet;
import java.util.Set;

public class Aula010_HashSet_Lista01_Ex1 {
    public static void main(String[] args) {
        
              Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(9);
        nums.add(10);
        

        
        
        
        System.out.println(nums); //Laranja, Maçã, Banana [ordem aleatoria]

        for (int nume : nums) {
            System.out.println(nume);
        }

        //verificandp  se um elemento existe        
        if (nums.contains(5)) {
            System.out.println(" Número '5' , Encontrado.");
        } else {
            System.out.println(" Número '5' não encontrado. ");
        }
    }
}
