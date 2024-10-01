package gerarpatrimonio;

class Patrimonio {

    private String nome;
    private double valor;
    public Patrimonio(String nome, double valor) {
    this.nome = nome;
    this.valor = valor;
    }

    public String getNome() {
    return nome;
    }

    public double getValor() {
    return valor;
    }

    // Retorna informações da classe gestor
    @Override
    public String toString() {
        return "Nome: " + nome + ", Valor: R$ " + valor;
    }
}