
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        
        System.out.print("Informe os dados do produto\n"
                + "Nome: ");
        objProduto1.setNome(leia.next());
        
        System.out.print("Descrição: ");
        objProduto1.setDescricao(leia.next());
        
        System.out.print("Valor unitário: ");
        objProduto1.setValorUnitario(leia.nextDouble());
        
        System.out.print("Quantidade: ");
        objProduto1.setQuantidade(leia.nextDouble());
        
        System.out.println("\nDados do produto\n"
                + "nome: "+objProduto1.getNome()
                        + "Descrição: ");
        
    }
    
}
