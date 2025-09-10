package javasenac2025;

import java.util.Scanner;

public class Aula5_Lista01_Ex3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner tec = new Scanner(System.in);
        int num = 0;
        int res = 0;
        int cont = 0;

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                Tabuada                          ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");

        System.out.println("Informe o Número para tabuada : ");
        num = tec.nextInt();

        if (num <= 0) {
            System.out.println("Número Invalido");
        }else{
            
        
        
        
                while (cont <= 10) {
                res = num * cont;
                System.out.println(num + " x " + cont + " = " + res);
                cont++;
                
                if (num <= 0)
                    break;
                
                }
                }
    }
        
    }

