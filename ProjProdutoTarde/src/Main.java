
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();

        System.out.print("Informe os dados do produto 1\n"
                + "Nome: ");
        objProduto1.setNome(leia.next());

        System.out.print("Descrição: ");
        objProduto1.setDescricao(leia.next());

        System.out.print("Valor unitário: ");
        objProduto1.setValorUnitario(leia.nextDouble());

        System.out.print("Quantidade: ");
        objProduto1.setQuantidade(leia.nextDouble());
        
        Tela.limparTela();

        System.out.print("\nInforme os dados do produto 2\n"
                + "Nome: ");
        objProduto2.setNome(leia.next());

        System.out.print("Descrição: ");
        objProduto2.setDescricao(leia.next());

        System.out.print("Valor unitário: ");
        objProduto2.setValorUnitario(leia.nextDouble());

        System.out.print("Quantidade: ");
        objProduto2.setQuantidade(leia.nextDouble());

        Tela.limparTela();
        
        System.out.println("\nDados do produto 1" + objProduto1.mostrarTudo());
        System.out.println("\nDados do produto 2" + objProduto2.mostrarTudo());

    }
}
