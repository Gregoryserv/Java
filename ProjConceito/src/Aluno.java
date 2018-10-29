
public class Aluno {

    public String nome;
    public long ra;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarConceito() {
        if (this.calcularMedia() >= 9) {
            return "a";
        } else if (this.calcularMedia() >= 8) {
            return "b";
        } else if (this.calcularMedia() >= 6) {
            return "c";
        } else {
            return "d";
        }

    }

}

