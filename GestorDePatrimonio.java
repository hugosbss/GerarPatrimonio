package gerarpatrimonio;

class GestorDePatrimonio {
    private Gestor gestor;

    // Atributos privados para armazenar dois patrimônios
    private Patrimonio patrimonio1;
    private Patrimonio patrimonio2;

    // Construtor que recebe um gestor e o inicializa
    public GestorDePatrimonio(Gestor gestor) {
    this.gestor = gestor;
    }

    // Método para adicionar o primeiro patrimônio
    public void adicionarPatrimonio1(Patrimonio patrimonio) {
    this.patrimonio1 = patrimonio;
    }

    // Método para adicionar o segundo patrimônio
    public void adicionarPatrimonio2(Patrimonio patrimonio) {
    this.patrimonio2 = patrimonio;
    }

    // Método para obter o gestor
    public Gestor getGestor() {
        return gestor;
        }

    // Método para retornar com os patrimônios
    public Patrimonio[] getPatrimonios() {
        return new Patrimonio[]{patrimonio1, patrimonio2};
        }

    // Lista informações sobre os patrimônios (imprime o gestor)
    public void listarPatrimonios() {
        System.out.println(gestor);
        }
}