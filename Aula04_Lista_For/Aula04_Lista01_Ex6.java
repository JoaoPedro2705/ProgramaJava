package Aula4_Ex01;

import java.util.Scanner;

public class Aula04_Lista01_Ex6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Informe um Caractere : (Nome ou Palavra) ");
        String plv = tec.nextLine();
        System.out.println("");
        System.out.println("Informe um Número : ");
        int num = tec.nextInt();
        System.out.println("");
        
        
        
        for (int i = 1; i <= num; i++) {
            System.out.println(plv);
            System.out.println("");
        }

    }

}
