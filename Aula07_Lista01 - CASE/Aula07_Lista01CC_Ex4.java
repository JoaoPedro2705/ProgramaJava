
package Aula07_CASE;

import java.util.Scanner;


public class Aula07_Lista01CC_Ex4 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("         MENU DE BEBIDAS - BAR DO YAGO         ");
        System.out.println("");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("1. Refrigerante ");
        System.out.println("---------------------");
        System.out.println("2. Suco");
        System.out.println("---------------------");
        System.out.println("3. Cerveja");
        System.out.println("---------------------");
        System.out.println("4. Água");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Escolha uma Opção : ");
        int opc = tc.nextInt();
        switch(opc){
            case 1:
                System.out.println("");
                System.out.println("Você Escolheu um Refrigerante, Prossiga ao Caixa para Retirar seu Pedido.");
                break;
            case 2:
                System.out.println("");
                System.out.println("Você Escolheu um Suco, Prossiga ao Caixa para Retirar seu Pedido.");
                break;
            case 3:
                System.out.println("");
                System.out.println("Você Escolheu uma Cerveja, Prossiga ao Caixa para Retirar seu Pedido.");
                break;
            case 4:
                System.out.println("");
                System.out.println("Você Escolheu uma Água, Prossiga ao Caixa para Retirar seu Pedido.");
            break;
            default:
                System.out.println("Opção Invalida, Tente Novamente ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
