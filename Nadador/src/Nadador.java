public class Nadador {
    private String nome;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String classificarNadador(){
        if(this.idade < 8 || this.idade > 60){
            return "Não elegível para natação.";
        }else if(this.idade > 8 && this.idade <= 10){
            return "Nadador classificado como infantil.";
        }else if(this.idade > 10 && this.idade <= 17){
            return "Nadador classificado como juvenil.";
        }else if(this.idade > 17 && this.idade <= 49){
            return "Nadador classificado como adulto.";
        }else{
            return "Nadador classificado como de terceira idade.";
        }
    }
    
    public String mostrarTudo(){
        return "\n"
                + "Nome: "+this.nome+"\n"
                + "Classificação: "+this.classificarNadador()+"\n";
    }
}
