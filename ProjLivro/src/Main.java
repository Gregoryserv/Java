
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Livro objLivro = new Livro();
        
        System.out.print("Informe os dados do livro: '\n"
                + "Título: ");
        
        objLivro.setTitulo(leia.next());
        
        System.out.print("Autor: ");
        objLivro.setAutor(leia.next());
        
        System.out.print("Genero: ");
        objLivro.setGenero(leia.next());
        
        System.out.println("ISBN: ");
        objLivro.setIsbn(leia.next());
        
        System.out.print("\nINforme os dados da editora\n"
                + "Nome: ");
        objLivro.getObjEditora().setNome(leia.next());
        
        System.out.print("CNPJ: ");
        objLivro.getObjEditora().setCnpj(leia.nextLong());
        
        System.out.print("Telefone: ");
        objLivro.getObjEditora().setFone(leia.next());
        
        System.out.println("\nInforme o endereço: \n"
                + "Rua");
        objLivro.getObjEditora().getObjEndereco().setRua(leia.next());
        
        System.out.print("Número: ");
        objLivro.getObjEditora().getObjEndereco().setNumero(leia.nextInt());
        
        System.out.println("Bairro: ");
        objLivro.getObjEditora().getObjEndereco().setBairro(leia.next());
        
        System.out.print("Cep: ");
        objLivro.getObjEditora().getObjEndereco().setCep(leia.nextInt());
        
        System.out.print("Cidade: ");
        objLivro.getObjEditora().getObjEndereco().setCidade(leia.next());
        
        System.out.println("\nDados do livro"+objLivro);
        
        
        
        
                
                
                
                
    }
    
}
