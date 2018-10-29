
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Endereco objEndereco = new Endereco();
        
        System.out.println("Informe os dados do endereço 1: \n"
                + "Rua:  ");
        objEndereco.setRua(leia.next());
        
        System.out.println("Número: ");
        objEndereco.setNumero(leia.nextInt());
        
        System.out.println("complemento: ");
        objEndereco.setComplemento(leia.next());
        
        System.out.println("bairro: ");
        objEndereco.setComplemento(leia.next());
        
        System.out.println("Email: ");
        objEndereco.setEmail(leia.next());
        
        System.out.print("\nDados do endereço: "+objEndereco.mostrarTudo());
        
        
        
 
    }
    
}
