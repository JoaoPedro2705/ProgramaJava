package java_2025;

import java.util.Scanner;

public class Aula3_Lista01_Ex08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("");
        System.out.println("                     IMC                         ");
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Informe sua Altura ");
        double alt = teclado.nextDouble();
        System.out.println("");
        System.out.println("Informe seu Peso ");
        double pes = teclado.nextDouble();
        System.out.println("");
        double imc = pes / (alt * alt);
        System.out.println("");
        if (imc < 18.50){
            System.out.println("Você está Abaixo do Peso. ");
        }else if(imc >= 18.50 && imc < 25 )
            System.out.println("Você está no Peso ideal. ");
     
        if (imc >= 25 && imc < 30 ){
            System.out.println("Você está no Sobrepeso. ");
        }else if(imc >= 30 && imc < 40)
            System.out.println("Você está na Obesidade. ");
    
        if (imc > 40){
            System.out.println("Você está no Obesidade mórbida. ");
            
        }
             
        
        
    
               

        
            }
}
