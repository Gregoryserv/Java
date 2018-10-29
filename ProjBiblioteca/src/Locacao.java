public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Funcionario func;
    private Usuario user;
    private Livro livro;
    private Data dataLocacao;
    
    public Locacao(){
        func = new Funcionario();
        user = new Usuario();
        livro = new Livro();
        dataLocacao = new Data();
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    
    public double calcularLocacao(){
        return 0;
    }
    
    public void locarLivro(){
        this.livro.status = true;
    }
    
    public void devolverLivro(){
        
    }
    
    public String toString(){
        return "\n"
                +"Valor locação: "+this.valorLocacao+"\n"
                +"Valor multa: "+this.valorMulta;
    }
}
