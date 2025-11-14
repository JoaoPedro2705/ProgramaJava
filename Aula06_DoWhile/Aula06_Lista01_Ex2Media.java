package Aula06_DoWhile;

import java.util.Scanner;

public class Aula06_Lista01_Ex2Media {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("");
        System.out.println("              Média de Notas                   ");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");

        double soma = 0;
       double med;
        String nme;
        int cont = 1;
          System.out.println("Informe o Nome do Aluno : ");
nme = tc.nextLine();


        do{            
            System.out.println("Informe a "+ cont+ "° Nota : ");
            double nt = tc.nextInt();
            soma = soma + nt;
            med = soma / 4;
            cont ++;
        }while (cont <= 4);
         
        System.out.println("A Media do Aluno(a) "+ nme + " , ficou : "+ med);

    }
}    

        
        
        
        
            
            
        
        


            
            
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
    


