package Exemplos__FuncoesAritmeticas;

import java.util.Scanner;

public class Aula2_Lista1_Ex03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("                   Detran RS                     ");
        System.out.println("");
        System.out.println("");
        System.out.println(" Verificar Disponibilidade de Conduzir Veiculo B ");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("Informe Seu Nome : ");
        String nome = teclado.nextLine();
        System.out.println("");
        System.out.println("Informe Sua Idade : ");
        int idd = teclado.nextInt();
        System.out.println("");
        System.out.println("Possui CNH : "
                + "1. Sim "
                + "2. Não ");
        int cnh = teclado.nextInt();
        System.out.println("");
        if (idd >= 18 && cnh == 1) {
            System.out.println(" ________________________________________________");
            System.out.println("| " + nome + " , " + idd + "                     |");
            System.out.println("| Possui CNH                                     |");
            System.out.println("| Tens Disponibilidade Para Conduzir Um veiculo  |");
            System.out.println(" ------------------------------------------------");
        }else{
            System.out.println(" ________________________________________________");
            System.out.println("| " + nome + " , " + idd + "                     |");
            System.out.println("| Não Possui CNH !!! :                           |");
            System.out.println("| !!! Não Pode Conduzir Veiculo !!!               |");
            System.out.println(" ------------------------------------------------");
           
        }

    }
}
