
public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String fone;
    private String sexo;
    private String email;
    private int qtdDependentes;
    private int chapa;
    private String cargo;
    private int tempoDeServicoAno;
    private double valorHora;
    private double cargaHorariaBase;
    private double qtdHorasExtras;
    private boolean opcaoVT;
    private double valorTotalDaPassagem;
    private byte grauInsalubridade;

    public Funcionario(String nome, String cpf, String endereco, String fone, int chapa, double valorHora) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
        this.chapa = chapa;
        this.valorHora = valorHora;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTempoDeServicoAno() {
        return tempoDeServicoAno;
    }

    public void setTempoDeServicoAno(int tempoDeServicoAno) {
        this.tempoDeServicoAno = tempoDeServicoAno;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHorariaBase() {
        return cargaHorariaBase;
    }

    public void setCargaHorariaBase(double cargaHorariaBase) {
        this.cargaHorariaBase = cargaHorariaBase;
    }

    public double getQtdHorasExtras() {
        return qtdHorasExtras;
    }

    public void setQtdHorasExtras(double qtdHorasExtras) {
        this.qtdHorasExtras = qtdHorasExtras;
    }

    public double getValorTotalDaPassagem() {
        return valorTotalDaPassagem;
    }

    public void setValorTotalDaPassagem(double valorTotalDaPassagem) {
        this.valorTotalDaPassagem = valorTotalDaPassagem;
    }

    public byte getGrauInsalubridade() {
        return grauInsalubridade;
    }

    public void setGrauInsalubridade(byte grauInsalubridade) {
        this.grauInsalubridade = grauInsalubridade;
    }
    
    public String mostrarLegendaVT(){
        if (opcaoVT) {
            return "Sim, ganha VT";
        }
        return "Não, não ganha VT";
    }
    
    public void receberVT(){
        this.opcaoVT = true;
    }
    
    public void cancelarVT(){
        this.opcaoVT = false;
    }
    
     public Double calcularHoraExtra(){
        if (this.qtdHorasExtras <= 2){
            return (this.qtdHorasExtras * this.valorHora) /2;
        }
        return (this.qtdHorasExtras-1) * this.valorHora;
    }
     
     
        
        
        
       
        
        
    
    
    

  
    
    
    
    
    
    
    
}
