
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        String sexo = null;
        byte op;

        System.out.print("Informe os dados da pessoa\n"
                + "nome: ");
        nome = leia.next();

        System.out.print("\f");

        do {
            System.out.print("Escolha o sexo conforme abaixo: \n"
                    + "1-Masculino\n"
                    + "2-Feminino\n"
                    + "Digite aqui a opção desejada: ");

            op = leia.nextByte();
            System.out.print("\f");

            switch (op) {
                case 1:
                    sexo = "Masculino";
                    break;
                case 2:
                    sexo = "Feminino";
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente");
            }

        } while (op != 1 && op != 2);
        System.out.println("\f");
        System.out.println("Dados da pessoa\n"
                + "nome" + nome + "\n"
                + "Sexo:" + sexo);

    }

}
