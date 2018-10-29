
import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private long cnpj;
    private ArrayList<Livro> listaDeLivros;

    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getListaDLivros() {
        return listaDeLivros;
    }

    public void setListaDLivros(ArrayList<Livro> listaDLivros) {
        this.listaDeLivros = listaDLivros;
    }

    public String mostrarLivros() {
        String r = "";

        for (int i = 0; i < this.listaDeLivros.size(); i++) {
            r += "::::::::::::LIVRO" + (i + 1) + "::::::::::\n"
                    + this.listaDeLivros.get(i) + "\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::\n\n";
        }
        return r;
    }

    @Override
    public String toString() {
        String r = "\n"
                + "Nome=" + nome + "\n"
                + "Cnpj=" + cnpj + "\n";

        if (this.listaDeLivros.isEmpty()) {
            r += "\nNão existem livros cadastrados!!\n";
        } else {
            r += "ListaDeLivros=" + this.mostrarLivros() + "\n";
        }
        return r;
    }

}
