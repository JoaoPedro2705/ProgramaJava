package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;

public class Aula2_Lista1_Ex05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("                   Entre 10 a 20                 ");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe Um Numero : ");
        int num = teclado.nextInt();
        System.out.println("");
        if (num > 10 && num < 20) {
            System.out.println("O Número Informado está entre 10 e 20 ");
            System.out.println("Ele está " + (num - 10) + " De distância acima do número 10 ");
            System.out.println("Ele está " + (20 - num) + " De distância abaixo do número 20 ");
        }else{
            System.out.println("O Número Informado não está entre 10 e 20 ");
        }
            
         
        }
    
       }


