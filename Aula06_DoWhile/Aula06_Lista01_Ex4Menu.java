
package Aula06_DoWhile;

import java.util.Scanner;

public class Aula06_Lista01_Ex4Menu {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
       
 
        
        int opc;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Opção Cadastrar escolhida!");
                    // Aqui você pode implementar o cadastro
                    break;
                case 2:
                    System.out.println("Opção Consultar escolhida!");
                    // Aqui você pode implementar a consulta
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }

        } while (opc != 3);

        tc.close();
    }
}

  

