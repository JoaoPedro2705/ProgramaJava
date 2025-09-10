
import java.util.Scanner;

public class Aula5_Lista01_Ex4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;


        do {
            System.out.print("Digite um número inteiro não negativo: ");
            num = tec.nextInt();

            if (num < 0) {
                System.out.println("Número inválido! Digite novamente.\n");
            }
        } while (num < 0);

   
        long fato = 1;
        int i = 1;

        while (i <= num) {
            fato *= i;  
            i++;
        }

        System.out.println("O fatorial de " + num + " é: " + fato);

        tec.close();
    }
}

    
    

