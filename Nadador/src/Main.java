
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Nadador objNadador = new Nadador();
        
        System.out.print("Forneça os dados do nadador: \n"
                + "Nome: ");
        objNadador.setNome(leia.next());
        System.out.print("Idade: ");
        objNadador.setIdade(leia.nextInt());
        
        System.out.print("Dados do nadador: "+objNadador.mostrarTudo());
    }
}