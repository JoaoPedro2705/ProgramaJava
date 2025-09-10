
package Aula05_Ex01;

import java.util.Scanner;


public class Aula05_Lista01_Ex2 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int cont = 0;

        System.out.println("=================================================");
        System.out.println();
        System.out.println();
        System.out.println("                     Login                       ");
        System.out.println();
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        System.out.println();
        System.out.println("Informe O Nome do Usuário : ");
        String usr = tec.nextLine();
        System.out.println("");
        while (cont < 5) {
            System.out.println("Informe a Senha : ");
           int sen = tec.nextInt();
            cont++;
        
            
           if(sen == 1234){
               break;
           }else{
               System.out.println();
           }
     
            
        }
        
        System.out.println("Bem Vindo, " + usr);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

