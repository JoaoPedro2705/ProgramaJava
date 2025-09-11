
package Aula07_CASE;

import java.util.Scanner;

public class Aula07_Lista01CC_Ex2 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("Informe um Número entre 1 e 7: ");
        int num = tc.nextInt();
        System.out.println("");
        String msn = null;
        switch(num){
            case 1:
                msn = "O Dia da Semana Correspondente é Domigo";
                break;
            case 2:
                msn = "O Dia da Semana Correspondente é Segunda-feira";
                break;
            case 3:
                msn = "O Dia da Semana Correspondente é Terça-feira";
                break;
            case 4:
                msn = "O Dia da Semana Correspondente é Quarta-feira";
                break;
            case 5:
                msn = "O Dia da Semana Correspondente é Quinta-feira";
                break;
            case 6:
                msn = "O Dia da Semana Correspondente é Sexta-feira";
                break;
            case 7:
                msn = "O Dia da Semana Correspondete é Sabado";
                break;
        }
        
        System.out.println("==============================================");
        System.out.println(msn);
        System.out.println("==============================================");
        
        
        
        
        
        
    }
}
