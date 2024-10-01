package gerarpatrimonio;

import java.util.Scanner;
    public class GerarPatrimonio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Coletando informações do gestor
            System.out.print("Digite o nome do gestor: ");

            String nomeGestor = scanner.nextLine();
                System.out.print("Digite a idade do gestor: ");

            int idadeGestor = scanner.nextInt(); // Pega o número como inteiro.
                scanner.nextLine();

            Gestor gestor = new Gestor(nomeGestor, idadeGestor);
            GestorDePatrimonio gestorDePatrimonio = new GestorDePatrimonio(gestor);

            // Coletando informações do primeiro patrimônio
             System.out.print("Digite o nome do primeiro patrimônio: ");

            String nomePatrimonio1 = scanner.nextLine();
                System.out.print("Digite o valor do primeiro patrimônio: ");

            double valorPatrimonio1 = scanner.nextDouble(); // Pega o número como decimal.
                scanner.nextLine(); // Consome a nova linha

            Patrimonio patrimonio1 = new Patrimonio(nomePatrimonio1, valorPatrimonio1);
            gestorDePatrimonio.adicionarPatrimonio1(patrimonio1);

            // Coletando informações do segundo patrimônio
            System.out.print("Digite o nome do segundo patrimônio: ");
                String nomePatrimonio2 = scanner.nextLine();

            System.out.print("Digite o valor do segundo patrimônio: ");
                double valorPatrimonio2 = scanner.nextDouble();

            scanner.nextLine();
                Patrimonio patrimonio2 = new Patrimonio(nomePatrimonio2, valorPatrimonio2);

            gestorDePatrimonio.adicionarPatrimonio2(patrimonio2);

            // Exibindo os patrimônios
            gestorDePatrimonio.listarPatrimonios();

            // Gerando relatório
            RelatorioPatrimonial relatorio = new RelatorioPatrimonial(gestorDePatrimonio);
            relatorio.gerarRelatorio();
            scanner.close();
 }
}