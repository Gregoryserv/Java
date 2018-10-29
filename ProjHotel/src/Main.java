
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Hotel objHotel = new Hotel();
        ArrayList<Hospede> lista = objHotel.getListaDeHospedes();

        System.out.print("\nInforme os dados do Hotel\n"
                + "Nome ");
        objHotel.setNome(leia.next());

        System.out.print("\nInforme o CNPJ: ");
        objHotel.setCnpj(leia.nextLong());

        byte op;

        do {
            System.out.println("::::::::::::::::::::SISTEMA DE HOTELARIA::::::::::::::::::::\n"
                    + "::   [1]- Cadastrar Hospede    ::\n"
                    + "::   [2]- Mostrar todos os hospedes    ::\n"
                    + "::   [3]- Mostrar a quantidade de hospedes     ::\n"
                    + "::   [4]- Pesquisar hospedes por sexo  ::\n"
                    + "::   [5]- Pesquisar hospedes por cpf ::\n"
                    + "::   [6]- Alterar nome do hospede procurando por cpf   ::\n"
                    + "::   [7]- Remover hospede procurando por cpf ::\n"
                    + "::   [8]- Excluir todos os hospedes   ::\n"
                    + "::   [0] - Sair  ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    Hospede objHospede = new Hospede();

                    System.out.print("Informe os dados do Hospede\n"
                            + "Nome: ");
                    objHospede.setNome(leia.next());

                    System.out.print("CPF: ");
                    objHospede.setCpf(leia.nextLong());

                    System.out.print("Sexo: ");
                    objHospede.setSexo(leia.next());

                    lista.add(objHospede);
                    System.out.print("Hospede cadastrado com sucesso :D \n");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes cadastrados no momento!!!!!!\n");
                    } else {
                        System.out.println("\nLista de hospedes\n" + objHotel.mostrarHospedes());

                    }

                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes cadastrados no momento!!!!!!\n");
                    } else {
                        System.out.println("\nQuantidade de hospedes\n" + lista.size() + "\n");

                    }

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes a serem excluidos: ");
                    } else {
                        do {
                            System.out.print("::::::EXCLUSÃO::::::\n"
                                    + "Deseja REALMENTE excluir TODOS os hospedes??\n"
                                    + "1 - Sim\n"
                                    + "2 - Não\n"
                                    + "Digite aqui a opção desejada: ");
                            op = leia.nextByte();

                            switch (op) {
                                case 1:
                                    lista.clear();
                                    System.out.println("Hospedes excluidos com sucesso\n");

                                    break;

                                case 2:
                                    System.out.println("\nExclusão cancelada\n");

                                    break;
                                default:
                                    System.out.println("\nOpção inválida\nDigite novamente\n");
                                    ;
                            }

                        } while (op < 1 || op > 2);
                    }

                    break;

                case 0:
                    System.out.println("\nSistema encerrado!!!!!");

                    break;
                default:
                    System.out.println("\nOpção inválida\nDigite novamente\n\n");
                    ;
            }

        } while (op != 0);

    }

}
