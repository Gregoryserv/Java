
public class Endereco {
    public String rua;
    public int numero;
    public String complemento;
    public String bairro;
    public String email;
    
    public void setRua (String rua){
        this.rua =rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setEmail(String email){
        this.email = email;
        
    }
       
        public String mostrarTudo(){
            return "Rua: "+this.rua+"\n"
                    + "número: "+this.numero+"\n"
                    + "Complemento: "+this.complemento+"\n"
                    + "Bairro: "+this.bairro+"\n"
                    + "Email: "+this.email;
        }
}
