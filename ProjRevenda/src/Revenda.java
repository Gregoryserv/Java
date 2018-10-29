
import java.util.ArrayList;

public class Revenda {

    private String nome;
    private long cnpj;
    private ArrayList<Carro> listaDeCarros;

    public Revenda() {
        this.listaDeCarros = new ArrayList<>();
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

    public ArrayList<Carro> getListaDeCarros() {
        return listaDeCarros;
    }

    public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }
    
    public double calcularValor(){
        double valor = 0;
        for (int i = 0; i < getListaDeCarros().size(); i++) {
            valor += this.listaDeCarros.get(i).getValor();
        }
        return valor;
    }

    public String mostrarCarros() {
        String r = "";
        for (int i = 0; i < this.listaDeCarros.size(); i++) {
            r += "::::::::::::CARRO" + (i + 1) + "::::::::::\n"
                    + this.listaDeCarros.get(i) + "\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::\n\n";
        }
        return r;
    }

    @Override
    public String toString() {
                String r =""
                + "nome=" + nome + "\n"
                + "cnpj=" + cnpj + "\n";
        
        if (this.listaDeCarros.isEmpty()) {
            r+= "\nNão existem carros!!\n";
         }else{
            r += "ListaDeCarros" +this.mostrarCarros() + "\n";
    }
        return r;
}

}
