
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno objAluno1 = new Aluno();
        
        System.out.print("Informe os dados do aluno: \n"
                + "nome: ");
        objAluno1.nome = leia.next();
        
        System.out.print("RA: ");
        objAluno1.ra = leia.nextLong();
        
        System.out.print("Nota 1: ");
        objAluno1.nota1 = leia.nextDouble();
        
        System.out.println("Nota 2: ");
        objAluno1.nota2 = leia.nextDouble();
        
        System.out.println("\nDados do aluno \n"
                + "nome: "+objAluno1.nome+"\n"
                + "RA: "+objAluno1.ra+"\n"
                + "Nota 1: "+objAluno1.nota1"\n"
                + "");
        
        
        
        
    }
    
}
