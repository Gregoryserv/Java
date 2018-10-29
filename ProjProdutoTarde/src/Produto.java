
public class Produto {

    private String nome;
    private String descricao;
    private double valorUnitario;
    private double quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public double calcularValorTotal() {
        return this.quantidade * this.valorUnitario;
    }

    public String mostrarTudo() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Descrição: " + this.descricao + "\n"
                + "Valor unitário: " + this.valorUnitario + "\n"
                + "Quantidade: " + this.quantidade + "\n"
                + "Valor total: " + this.calcularValorTotal();
    }

}
