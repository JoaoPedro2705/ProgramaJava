package Aula4_Ex01;

import java.util.Random;
import java.util.Scanner;

public class Aula04_Lista01_Ex010 {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner tec = new Scanner(System.in);
        int alea = ran.nextInt(101); 
        int tnt = 0;
        int palp = 0;
        
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("              Adivinhe o Número                 ");
        System.out.println("                Entre 1 e 100                   ");        
        System.out.println("=================================================");
        System.out.println("");
        for (tnt = 1; tnt <= 7; tnt++) {
            System.out.println("");
            System.out.println("Tentativa " + tnt + " : ")
            int num = tec.nextInt();
            System.out.println("");

            
            if (num == alea) {
                System.out.println("Parabéns! Você acertou em " + tnt + " tentativas !");
                break;
            } else if (num < alea) {
                System.out.println("O número sorteado é MAIOR!");
            } else {
                System.out.println("O número sorteado é MENOR!");
            }      
    }
        if(num != alea){
             System.out.println("Você não conseguiu adivinhar o número \nO número era " + alea);
          
        }
            
    }
    




