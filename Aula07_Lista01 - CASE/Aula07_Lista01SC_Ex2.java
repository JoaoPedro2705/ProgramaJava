
package Aula07_CASE;

import java.util.Scanner;

public class Aula07_Lista01SC_Ex2 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("");
        System.out.println("Assistente Virtual Google                      ");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("Como posso Ajudar? ");
        System.out.println("");
        System.out.println("1. Ver Previsão do Tempo");
        System.out.println("-----------------------------");
        System.out.println("2. Ver Notícias");
        System.out.println("-----------------------------");
        System.out.println("3. Abrir Agenda");
        System.out.println("-----------------------------");
        System.out.println("4. Ouvir Música");
        System.out.println("");
        int opc = tc.nextInt();
        System.out.println("");
        switch(opc){
            case 1:
                System.out.println("Previsão Google: ");
                System.out.println("---------------------------------------");
                System.out.println("Hoje em Tramandaí, RS está 22° Graus");
                System.out.println("");
                System.out.println("A Previsão é de Sol entre Nuvens");
                System.out.println("");
                System.out.println("Ventos : 21 km/h ");
                System.out.println("");
                System.out.println("---------------------------------------");
                break;
            case 2:
                System.out.println("Notícias de Hoje: ");
                System.out.println("--------------------------------------");
                System.out.println("UOL | Grêmio Vence o Flamengo e Conquista a 4° Libertadores.");
                System.out.println("");
                System.out.println("GE | Dollar Sobe para R$6,00 reais , Ministro Explica Desvalorização do Real. ");
                System.out.println("");
                System.out.println("ESPN | Chelsea Contrata Joia Brasileira Ricardo Mathias do Internacional. ");
                System.out.println("");
                System.out.println("Metropoles | Advogado é Preso por Envolvimento ao Tráfico em Porto Alegre. ");
                System.out.println("");
                System.out.println("TNT Sports | Bahia e Palmeiras Disputam Contratação de Promessa Argentina. ");
                System.out.println("");
                System.out.println("--------------------------------------");
                break;
            case 3:
                System.out.println("Minha Agenda: ");
                System.out.println("--------------------------------------------------");
                System.out.println("25/08 - Reunião com a Equipe de Marketing. ");
                System.out.println("");
                System.out.println("02/09 - Buscar o Terno pra Formatura da Janaina");
                System.out.println("");
                System.out.println("03/09 - Formatura da Janaina. ");
                System.out.println("");
                System.out.println("12/10 - Pagar a Parcela da BMW. ");
                System.out.println("");
                System.out.println("20/12 - Férias!!!!!!!");
                System.out.println("----------------------------------------------------");
                break;
            case 4:
                System.out.println("Abrindo o Play Music %");
                System.out.println("");
                System.out.println("Sua Playlist: ");
                System.out.println("----------------------------------------------------");
                System.out.println("Don Toliver - No Pole");
                System.out.println("");
                System.out.println("Bruno Mars - 24K");
                System.out.println("");
                System.out.println("Eminem - SlimShady");
                System.out.println("");
                System.out.println("McIG - 400k");
                System.out.println("");
                System.out.println("Travis Scott - Rodeo");
                System.out.println("-----------------------------------------------------");
                System.out.println("");
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
