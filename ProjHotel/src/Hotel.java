
import java.util.ArrayList;


public class Hotel {
    private String nome;
    private long cnpj;
    private ArrayList<Hospede> ListaDeHospedes;

    public Hotel() {
        this.ListaDeHospedes = new ArrayList<>();
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

    public ArrayList<Hospede> getListaDeHospedes() {
        return ListaDeHospedes;
    }

    public void setListaDeHospedes(ArrayList<Hospede> ListaDeHospedes) {
        this.ListaDeHospedes = ListaDeHospedes;
    }
    
    public String mostrarHospedes(){
        String r = "";
        for (int i = 0; i < this.ListaDeHospedes.size(); i++) {
            r += "::::::::::::HOSPEDES" + (i + 1) + "::::::::::\n"
                    + this.ListaDeHospedes.get(i) + "\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::\n\n";
            
        }
        return r;
    }
    
    

    @Override
    public String toString() {
        String r = ""
            + "nome=" + nome + "\n"
                + "cnpj=" + cnpj + "\n";
                if (this.ListaDeHospedes.isEmpty()) {
                    r += "\nNão existem hospedes no hotel!!!\n";
                }else{
                    r += "Lista de hospedes "+this.mostrarHospedes() +"\n";
            
        }
                return r;
    }
    
}
