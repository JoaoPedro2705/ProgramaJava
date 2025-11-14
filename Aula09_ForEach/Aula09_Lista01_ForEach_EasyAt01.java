
package Aula09_ForEach;


import java.util.Scanner;


public class Aula09_Lista01_ForEach_EasyAt01 {
    public static void main(String[] args) {
        
           int[] nums = {12, 50, 56, 61, 75};
        int soma = 0;

        
        for (int n : nums) {
            soma += n; 
        }

        
        System.out.println("Soma dos elementos = " + soma);
    }
}