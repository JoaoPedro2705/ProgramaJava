
package java_2025;

import java.util.Scanner;


public class Aula3_Lista01_Ex05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("          Classificação de Terreno               ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Informe a Largura em (m²) : ");
        double lar = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe a Comprimento em (m²) : ");
        double com = teclado.nextDouble();
        System.out.println("");
        double ret = lar * com;
        if (ret < 100){
            System.out.println("O Seu terreno é um Terreno POPULAR com uma área de " + ret + " m² " );
        }else if (ret > 100 && ret < 500)
            System.out.println("O Seu terreno é um Terreno MASTER com uma área de " + ret + " m² " );
        if (ret > 500){
            System.out.println("O seu Terreno é um Terreno VIP com uma área de " + ret + " m²" );
            
        }
        
           
              
        }
    }

