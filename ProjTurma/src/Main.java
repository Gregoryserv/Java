
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Turma objTurma = new Turma();

        ArrayList<Aluno> a = objTurma.getListaDeALuno();
        byte op;

        System.out.print("Informe os dados da turma\n"
                + "Nome: ");
        objTurma.setNome(leia.next());

        System.out.print("Turno: ");
        objTurma.setTurno(leia.next());

        do {
            System.out.print("::::::::::::::::::SISTEMA ESCOLAR:::::::::::::::::\n"
                    + "::  [1]  -  CADASTRAR ALUNO	                ::\n"
                    + "::  [2]  -  MOSTRAR TODOS OS ALUNOS             ::\n"
                    + "::  [3]  -  MOSTRAR QUANTIDADE DE ALUNOS        ::\n"
                    + "::  [4]  -  PESQUISAR ALUNOS POR SEXO           ::\n"
                    + "::  [5]  -  PESQUISAR ALUNO POR RA              ::\n"
                    + "::  [6]  -  ALTERAR DADOS DO ALUNO              ::\n"
                    + "::  [7]  -  EXCLUIR DADOS DO ALUNO              ::\n"
                    + "::  [0]  -  SAIR DO SISTEMA                     ::\n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO DESEJADA: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    Aluno objAluno = new Aluno();

                    System.out.print("Informe os dados do aluno\n"
                            + "Nome: ");
                    objAluno.setNome(leia.next());

                    System.out.print("RA: ");
                    objAluno.setRa(leia.nextLong());

                    do {
                        System.out.print("\nEscolha o sexo conforme as opções abaixo:\n"
                                + "1 - Masculino\n"
                                + "2 - Feminino\n"
                                + "Digite aqui a opção desejada: ");
                        op = leia.nextByte();
                        switch (op) {
                            case 1:
                                objAluno.setSexo("Masculino");
                                break;
                            case 2:
                                objAluno.setSexo("Feminino");
                                break;
                            default:
                                System.out.println("\nOpção inválida\n"
                                        + "Digite novamente\n");
                        }

                    } while (op != 1 && op != 2);
                    a.add(objAluno);
                    System.out.println("\nAluno cadastrado com sucesso :D\n");

                    break;

                case 2:
                    if (a.isEmpty()) {
                        System.out.println("\nNão existem alunos cadastrados!\n");
                    } else {
                        String r = "";
                        for (int i = 0; i < a.size(); i++) {
                            r += "::::::::::::::::::::::ALUNO " + (i + 1) + "::::::::::::::::::::::"
                                    + a.get(i)
                                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n";
                        }
                        System.out.print("\nLista de alunos\n" + r);
                    }

                    break;

                case 3:
                    if (a.isEmpty()) {
                        System.out.print("\nNão existem alunos cadastrados!!!!\n");
                    } else {
                        System.out.print("\nQuantidade: " + a.size() + "\n");
                    }

                    break;

                case 4:
                    if (a.isEmpty()) {
                        System.out.println("\nNão existem alunos cadastrados!\n");
                    } else {
                        String sexo = "";

                        do {
                            System.out.print("\nEscolha o sexo que quer pesquisar:\n"
                                    + "1 - Masculino\n"
                                    + "2 - Feminino\n"
                                    + "Digite aqui a opção desejada: ");
                            op = leia.nextByte();
                            switch (op) {
                                case 1:
                                    sexo = "Masculino";
                                    break;
                                case 2:
                                    sexo = "Feminino";
                                    break;
                                default:
                                    System.out.println("\nOpção inválida\n"
                                            + "Digite novamente\n");
                            }

                        } while (op != 1 && op != 2);

                        ArrayList<Aluno> achei = objTurma.pesquisarAlunoPorSexo(sexo);

                        if (achei.isEmpty()) {
                            System.out.println("\nNenhum alunos do sexo " + sexo + " foi encontrado!\n");
                        } else {
                            String r = "\n";
                            for (int i = 0; i < achei.size(); i++) {
                                r += "::::::::::::::::::::::ALUNO " + (i + 1) + "::::::::::::::::::::::"
                                        + achei.get(i)
                                        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n";
                            }
                            System.out.println("\nLista de alunos do sexo " + sexo + ": " + r);
                        }
                    }

                    break;

                case 5:
                case 6:
                    if (a.isEmpty()) {
                        System.out.println("\nNão existem alunos cadastrados!\n");
                    } else {
                        System.out.print("\nInforme o RA que deseja pesquisar: ");
                        long ra = leia.nextLong();
                        
                        Aluno e = objTurma.pesquisarAlunoPorRa(ra);
                        if (e ==null) {
                            System.out.print("\nO Aluno de RA "+ra+ "Não foi encontrado ou não existe!!!\n ");
                        }else{
                            System.out.print("\nO Aluno de RA "+ra+  " é o aluno "+e);
                        }
                            if (op == 6) {
                                System.out.print("\nInforme o novo nome: ");
                                e.setNome(leia.next());
                        }
                    }
                        break;
                    
                    case 7:
                            if (a.isEmpty()){
                            System.out.println("Não existem alunos a serem excluidos no momento: ");
                        }else{
                            do {
                                   System.out.print("::::::EXCLUSÃO::::::\n"
                                    + "Deseja REALMENTE excluir TODOS os alunos??\n"
                                    + "1 - Sim\n"
                                    + "2 - Não\n"
                                    + "Digite aqui a opção desejada: ");
                            op = leia.nextByte();
                            
                                switch (op) {
                                    case 1:
                                        a.clear();
                                        System.out.println("Alunos excluidos com sucesso\n");
                                        
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
                    System.out.print("Sistema encerrado com sucesso ");
                    break;
                default:
                    System.out.println("\nOpção inválida \nDigite novamente\n");;
            }
        
        }while (op != 0);

            }
        }
