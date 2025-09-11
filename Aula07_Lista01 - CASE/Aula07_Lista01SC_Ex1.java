
package Aula07_CASE;

import java.util.Scanner;


public class Aula07_Lista01SC_Ex1 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("                     Login                     ");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("Escolha o tipo de Usuário que deseja Criar, e veja suas Permissões : ");
        System.out.println("");
        System.out.println("1. Administrador ");
        System.out.println("");
        System.out.println("2. Editor ");
        System.out.println("");
        System.out.println("3. Visitante ");
        System.out.println("");
        int opc = tc.nextInt();
        System.out.println("");
        switch(opc){
            case 1:
                System.out.println("Administrador : Pode Criar, editar e excluir. ");
                break;
            case 2:
                System.out.println("Editor : Pode Criar e editar. ");
                break;
            case 3:
                System.out.println("Visitante : Apenas Visualizar. ");
                break;
                
        }      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
