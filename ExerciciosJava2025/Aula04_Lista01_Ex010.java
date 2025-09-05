package Aula4_Ex01;

import java.util.Random;
import java.util.Scanner;

public class Aula04_Lista01_Ex010 {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner tec = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("              Adivinhe o Número                 ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        for (int i = 1; i <= 7; i++) {
            System.out.println("");
            System.out.println("Informe o " + i + "° Número : ");
            int num = tec.nextInt();
            System.out.println("");

            int sorteado = ran.nextInt(100) + 1; 
            if (num == sorteado) {
                System.out.println("Parabéns! Você acertou!");
            } else if (num < sorteado) {
                System.out.println("O número sorteado é maior!");
            } else {
                System.out.println("O número sorteado é menor!");
            }
        
            
    }
        
        }
            
    }
    




