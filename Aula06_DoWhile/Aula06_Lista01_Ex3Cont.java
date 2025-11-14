package Aula06_DoWhile;

public class Aula06_Lista01_Ex3Cont {
    public static void main(String[] args) {
        
        int cont = 10;

        do {
            System.out.println(cont);
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cont--;
        } while (cont >= 1);

        System.out.println("Fim da contagem!");
    }
}
   
        


            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
   



    
