
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Revenda objRevenda = new Revenda();
        
        ArrayList <Carro> lista = objRevenda.getListaDeCarros();
        
        System.out.print("Informe os dados da Revenda \n"
                + "Nome: ");
        objRevenda.setNome(leia.next());
        
        System.out.print("CNPJ: ");
        objRevenda.setCnpj(leia.nextLong());
        
        byte op;
        
        do {
            System.out.println("::::::::::::::::::::SISTEMA REVENDA::::::::::::::::::::\n"
                    + "::   [1]- Cadastrar Carro    ::\n"
                    + "::   [2]- Mostrar todos os carros    ::\n"
                    + "::   [3]- Mostrar a quantidade de carros     ::\n"
                    + "::   [4]- Calcular o valor total de carros no pátio  ::\n"
                    + "::   [5]- Excluir Todos os dados ::\n"
                    + "::   [0]- Sair   ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
                    + "Digite aqui a opção desejada: ");
            
            op = leia.nextByte();
            switch (op) {
                case 1:
                    Carro objCarro = new Carro();
                    System.out.println("Informe os dados do Carro\n"
                            + "Marca: ");
                    objCarro.setMarca(leia.next());
                    
                    System.out.println("Ano: ");
                    objCarro.setAno(leia.nextInt());
                    
                    System.out.println("Placa: ");
                    objCarro.setPlaca(leia.next());
                    
                    System.out.println("Valor: ");
                    objCarro.setValor(leia.nextDouble());
                    
                    lista.add(objCarro);
                    System.out.println("Carro cadastrado com sucesso :D");
                    
                    
                    break;
                    
                    case 2:
                        if (lista.isEmpty()) {
                            System.out.println("Não existem carros cadastrados!!!!!!!\n ");
                        }else{
                                System.out.println("\nLista de carros\n" +objRevenda.mostrarCarros());
                            
                        }
                    
                    break;
                    
                    case 3:
                        if (lista.isEmpty()) {
                            System.out.println("Não existem carros cadastrados!!!!!\n ");
                        }else{
                            System.out.println("\nQuantidade de carros\n"+lista.size()+"\n");
                            
                        }
                    
                    break;
                    
                    case 4:
                        if (lista.isEmpty()) {
                            System.out.println("\nNão  existem carros para serem calculados\n");
                        }else{
                            System.out.println("\nValor dos carros no pátio: "+objRevenda.calcularValor()+"\n");
                            
                        }
                    break;
                    
                    case 5:
                        if (lista.isEmpty()){
                            System.out.println("Não existem carros a serem excluidos: ");
                        }else{
                            do {
                                   System.out.print("::::::EXCLUSÃO::::::\n"
                                    + "Deseja REALMENTE excluir TODOS os carros??\n"
                                    + "1 - Sim\n"
                                    + "2 - Não\n"
                                    + "Digite aqui a opção desejada: ");
                            op = leia.nextByte();
                            
                                switch (op) {
                                    case 1:
                                        lista.clear();
                                        System.out.println("Carros excluidos com sucesso\n");
                                        
                                        break;
                                        
                                        case 2:
                                            System.out.println("\nExclusão cancelada\n");
                                        
                                        break;
                                    default:
                                        System.out.println("\nOpção inválida\nDigite novamente\n");;
                                }
                                
                            } while (op <1 || op> 2);
                            
                            
                        }
                    
                    break;
                    
                    case 0:
                        System.out.println("\nSistema encerrado!!!!!");
                    
                    break;
                default:
                    System.out.println("\nOpção inválida\nDigite novamente\n ");;
            }
            
        } while (op != 0);
        
    
    }
    
}
