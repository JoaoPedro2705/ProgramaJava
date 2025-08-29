package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;

public class Pratique {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("                  Calculadora                    ");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Informe um Número Inteiro : ");
        int num1 = teclado.nextInt();
        System.out.println("");
        System.out.println("Informe outro Número Inteiro : ");
        int num2 = teclado.nextInt();
        System.out.println("Qual Operação Deseja Executar ?");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada do " + num1);
        System.out.println("6. Raiz Quadrada do " + num2);
        System.out.println("7. Potência");
        int resp = teclado.nextInt();

        int adc = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        double pot = Math.pow(num1, num2);

        if (resp == 1) {
            System.out.println("A Soma Ficou dos Dois Números Ficou " + adc);
        } else if (resp == 2) {
            System.out.println("A Subtração dos Dois Números Ficou " + sub);
        } else if (resp == 3) {
            System.out.println("A Multiplicação dos Dois Números Ficou " + mult);   
        } else if (resp == 4) {
            System.out.println("A Divisão dos Núrmeros Ficou " + div);
        } else if (resp == 5) {
            System.out.println("A Raiz Quadrada do Primeiro Número Ficou " + raiz1);    
        } else if (resp == 6) { 
            System.out.println("A Raiz Quadrada do Segundo Número Ficou " + raiz2);            
        } else if (resp == 7) {
            System.out.println("A Potência do Primeir Numero pelo Segundo Ficou " + pot);
        } 
            
    }      
}   
        
       

