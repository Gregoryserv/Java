
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        System.out.print("Informe os dados do cachorro 1: \n"
                + "Nome: ");
        objCao1.setNome(leia.next());
        
        System.out.print("Raça: ");
        objCao1.setRaca(leia.next());
        
        System.out.print("Cor: ");
        objCao1.setCor(leia.next());
        
        System.out.print("Idade: ");
        objCao1.setIdade(leia.nextInt());
        
        System.out.print("Porte: ");
        objCao1.setPorte(leia.next());
        
        System.out.print("Dono: ");
        objCao1.setDono(leia.next());
        
        System.out.print("\nInforme os dados do cachorro 2: \n"
                + "Nome: ");
        objCao2.setNome(leia.next());
        
        System.out.print("Raça: ");
        objCao2.setRaca(leia.next());
        
        System.out.print("Cor: ");
        objCao2.setCor(leia.next());
        
        System.out.print("Idade: ");
        objCao2.setIdade(leia.nextInt());
        
        System.out.print("Porte: ");
        objCao2.setPorte(leia.next());
        
        System.out.print("Dono: ");
        objCao2.setDono(leia.next());
        
        System.out.println("\nDados do cachorro 1" + objCao1.mostrarTudo());
        System.out.println("\nDados do cachorro 2"+objCao2.mostrarTudo());
        
        
    }
    
}
