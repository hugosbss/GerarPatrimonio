package gerarpatrimonio;

class Gestor {
    private String nome;
    private int idade;
    public Gestor(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
    return idade;
    }

    // Retorna informações da classe gestor
    @Override
    public String toString() {
        return "Gestor: " + nome + ", Idade: " + idade;
    }
}