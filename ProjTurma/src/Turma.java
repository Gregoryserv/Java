
import java.util.ArrayList;


public class Turma {
    private String nome;
    private String turno;
    private ArrayList<Aluno> listaDeAluno;

    public Turma() {
        this.listaDeAluno = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getListaDeALuno() {
        return listaDeAluno;
    }

    public void setListaDeALuno(ArrayList<Aluno> listaDeALuno) {
        this.listaDeAluno = listaDeALuno;
    }
    public ArrayList<Aluno> pesquisarAlunoPorSexo(String sexo) {
        ArrayList<Aluno> aqui = new ArrayList<>();
        for (int i = 0; i < this.listaDeAluno.size(); i++) {
            if (this.listaDeAluno.get(i).getSexo().equalsIgnoreCase(sexo)) {
                aqui.add(this.listaDeAluno.get(i));
            }
        }
        return aqui;
    }

    public Aluno pesquisarAlunoPorRa(long ra) {
        for (int i = 0; i < this.listaDeAluno.size(); i++) {
            if (this.listaDeAluno.get(i).getRa() == ra) {
                return this.listaDeAluno.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String r = "\n"
               + "nome=" + nome + "\n"
                + "turno=" + turno + "\n\n";
       
        if (this.listaDeAluno.isEmpty()) {
            r += "\nNão existem alunos cadastrados\n";
        } else {
            for (int i = 0; i < this.listaDeAluno.size(); i++) {
                r += "::::::::::::::::::::::ALUNO " + (i + 1) + "::::::::::::::::::::::"
                        + this.listaDeAluno.get(i)
                        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n";
            }
        }
        return r;
    }
}
