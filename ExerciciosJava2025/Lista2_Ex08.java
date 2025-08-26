
package ExerciciosDoSlide;
import java.util.Scanner;

public class Lista2_Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("            Minutos Para Horas              ");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("Informe quantos Minutos quer Converter : ");
        int mins = teclado.nextInt();
        System.out.println("");
        int hrs = mins / 60;
        int mins2 = mins - (hrs * 60) ;
        System.out.println("Os Minutos Convertidos Ficou : "+hrs+" Horas "+mins2+" Minutos ");
         
    }
    
}
