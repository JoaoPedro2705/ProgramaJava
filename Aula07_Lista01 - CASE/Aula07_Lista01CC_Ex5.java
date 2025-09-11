
package Aula07_CASE;

import java.util.Scanner;


public class Aula07_Lista01CC_Ex5 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
       

        System.out.println("===============================================");
        System.out.println("-----------------------------------------------");
        System.out.println("               Calculo de IMC                   ");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Informe Seu Peso : ");
        double pes = tc.nextDouble();
        System.out.println("");
        System.out.println("Informe a Altura em Metros : ");
        double alt = tc.nextDouble();
        System.out.println("");
        
        int opc = 0;
       double imc = pes / (alt * alt);
        String ms = null;

       if(imc < 17){
            ms = ("Muito Abaixo do peso ");
            opc += 1;
        }else if(imc < 18.50){
            ms = ("Abaixo do peso ");
            opc += 2;
        }else if(imc < 25){
            ms = ("Peso ideal ");
            opc += 3;
        }else if(imc < 30){
            ms = ("Sobrepeso ");
            opc += 4;
        }else if(imc < 35){
            ms = ("Obesidade ");
            opc += 5;
        }else if(imc < 40){
            opc += 6;
            ms = ("Obesidade severa ");
            opc += 7;
        }else{
            opc += 8;
            ms = ("Obesidade mórbida ");
        }


        switch (opc) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
                
        }
        System.out.println(ms);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        


    

