
public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private double quantidade;
    
    public double calcularValorTotal(){
        return (valorUnitario*quantidade);
    }
         public void setNome(String nome){
        this.nome = nome; 
    }
    public String getNome(){
        
        return this.nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        
        return this.descricao;
    }
    
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public double gerValorUnitario(){
       
        return this.valorUnitario;
    }
    
    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    public double getQuantidade(){
        
        return this.quantidade;
    }
    
}
