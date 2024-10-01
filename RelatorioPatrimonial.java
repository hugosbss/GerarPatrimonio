class RelatorioPatrimonial {

    private GestorDePatrimonio gestorDePatrimonio; // Atributo privado que representa o gestor de patrimônio
    public RelatorioPatrimonial(GestorDePatrimonio gestorDePatrimonio) {
    this.gestorDePatrimonio = gestorDePatrimonio;
    }

// Método responsável por gerar o relatório patrimonial
    public void gerarRelatorio() {
        System.out.println("Relatório Patrimonial:");
        System.out.println("----------------------");

// Obtém e exibe o nome e idade do gestor
        System.out.println("Gestor: " + gestorDePatrimonio.getGestor().getNome());
        System.out.println("Idade: " + gestorDePatrimonio.getGestor().getIdade());

// Acessa os dois primeiros patrimônios
        Patrimonio patrimonio1 = gestorDePatrimonio.getPatrimonios()[0];
        Patrimonio patrimonio2 = gestorDePatrimonio.getPatrimonios()[1];
        double totalValor = 0; // Inicia contagem do valor referente aos patrimonios

// exibe informações.
        {
            System.out.println("Nome: " + patrimonio1.getNome() + ", Valor: R$ " + patrimonio1.getValor());
            totalValor += patrimonio1.getValor(); // Soma ao total
        }

// exibe informações.
        {
            System.out.println("Nome: " + patrimonio2.getNome() + ", Valor: R$ " + patrimonio2.getValor());
            totalValor += patrimonio2.getValor(); // Soma ao total
        }

// exibe total dos patrimonios
        System.out.println("----------------------");
        System.out.println("Valor total dos patrimônios: R$ " + totalValor);
        System.out.println("----------------------");
    }
}