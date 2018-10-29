
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        Cliente objCliente3 = new Cliente();
        
        System.out.print("Informe os dados do primeiro cliente \n "
                + "Nome: ");
        objCliente1.nome = leia.next();
        
        System.out.print("Cpf: ");
        objCliente1.cpf = leia.next();
        
        System.out.print("RG: ");
        objCliente1.rg = leia.next();
        
        System.out.print("Endereço: ");
        objCliente1.endereco = leia.next();
        
        System.out.print("Renda Bruta: ");
        objCliente1.rendaBruta = leia.nextDouble();
        
        System.out.print("Limite: ");
        objCliente1.limite = leia.nextDouble();
        
        
        System.out.print("\nInforme os dados do segundo cliente \n "
                + "Nome: ");
        objCliente2.nome = leia.next();
        
        System.out.print("Cpf: ");
        objCliente2.cpf = leia.next();
        
        System.out.print("RG: ");
        objCliente2.rg = leia.next();
        
        System.out.print("Endereço: ");
        objCliente2.endereco = leia.next();
        
        System.out.print("Renda Bruta: ");
        objCliente2.rendaBruta = leia.nextDouble();
        
        System.out.print("Limite: ");
        objCliente2.limite = leia.nextDouble();
        
        System.out.print("\nInforme os dados do terceiro cliente \n "
                + "Nome: ");
        objCliente3.nome = leia.next();
        
        System.out.print("Cpf: ");
        objCliente3.cpf = leia.next();
        
        System.out.print("RG: ");
        objCliente3.rg = leia.next();
        
        System.out.print("Endereço: ");
        objCliente3.endereco = leia.next();
        
        System.out.print("Renda Bruta: ");
        objCliente3.rendaBruta = leia.nextDouble();
        
        System.out.print("Limite: ");
        objCliente3.limite = leia.nextDouble();
        
        System.out.print("\nDados do primeiro cliente:\n"
                +"Nome: "+objCliente1.nome+"\n"
                + "Cpf: "+objCliente1.cpf+"\n"
                + "RG: "+objCliente1.rg+"\n"
                + "Endereço: "+objCliente1.endereco+"\n"
                + "Renda bruta: "+objCliente1.rendaBruta+"\n"
                + "Limite: "+objCliente1.limite);        
        
    

    }
}
