
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String r = "";
        String r2 = ""
        
        System.out.print("Informe a quantidade de nomes a ser digitado: ");
        String[] nomes = new String[leia.nextInt()];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i+1)+"° nome: ");
            nomes[i] = leia.next();
            r += (i+1)+"° nome: "+nomes[i]+"\n";
            
            for (int j = 0; j < nomes.length ; j++) {
                
            }
        }
        
        System.out.print("\n\n\n"+nomes.length+" nomes digitados\n"
                + r);
        
    }
    
}












