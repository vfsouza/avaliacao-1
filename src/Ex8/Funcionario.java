package Ex8;

public class Funcionario {
    private String nome;
    private double salario;

    /**
    * Verifica qual bonificação o usuário deve receber.
    * @return Retorna o bônus ou o desconto que o usuário vai receber.
    * */
    public double getBonificacao() {
        if (this.salario < 1000) {
            return this.salario * 0.2;
        } else if (this.salario < 2000) {
            return this.salario * 0.1;
        } else {
            return this.salario * -0.1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String bonus = this.getBonificacao() < 0 ? "\nDesconto: " + this.getBonificacao() : "\nBonus: " + this.getBonificacao();
        return "\nFuncionario " + getNome() + "\nSalario: " + getSalario() + bonus + "\nSalario liquido: " + (this.salario + this.getBonificacao());
    }
}
